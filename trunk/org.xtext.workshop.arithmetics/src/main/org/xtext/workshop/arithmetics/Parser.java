package org.xtext.workshop.arithmetics;

import java.util.ArrayList;
import java.util.List;

import org.xtext.workshop.arithmetics.lexer.Keywords;
import org.xtext.workshop.arithmetics.lexer.TokenStream;
import org.xtext.workshop.arithmetics.lexer.tokens.IdentifierToken;
import org.xtext.workshop.arithmetics.lexer.tokens.KeywordToken;
import org.xtext.workshop.arithmetics.lexer.tokens.NumberLiteralToken;
import org.xtext.workshop.arithmetics.lexer.tokens.Token;
import org.xtext.workshop.arithmetics.metamodel.Addition;
import org.xtext.workshop.arithmetics.metamodel.BinaryOperation;
import org.xtext.workshop.arithmetics.metamodel.Division;
import org.xtext.workshop.arithmetics.metamodel.Expression;
import org.xtext.workshop.arithmetics.metamodel.Identifier;
import org.xtext.workshop.arithmetics.metamodel.Multiplication;
import org.xtext.workshop.arithmetics.metamodel.NumberLiteral;
import org.xtext.workshop.arithmetics.metamodel.SelfReference;
import org.xtext.workshop.arithmetics.metamodel.Subtraction;

/**
 * A hand-built implementation of a parser for a simple arithmetics language
 * which actually is a sub language of the larger workshop example language,
 * except that no references to features can be lexed/parsed.
 * <p>
 * It is intended to clarify the workings of such a parser in the same style
 * as Sven Efftinge's blog (http://blog.efftinge.de/2010/08/parsing-expressions-with-xtext.html)
 * including the movie.
 * 
 * Corresponding Xtext grammar:
 * <pre>
 * Expression:
 * 		Additive;
 * 
 * Additive:
 * 		Multiplicative
 * 		( ({Addition.left=current} '+' | {Subtraction.left=current} '-' ) right=Multiplicative )*;
 * 
 * Multiplicative:
 * 		Primary
 * 		( ({Multiplication.left=current} '*' | {Division.left=current} '/' ) right=Primary )*;
 * 
 * Primary:
 * 		NumberLiteral | Identifier | SelfReference | '(' Expression ')';
 * 
 * NumberLiteral:
 * 		literal=INT;
 * 
 * Identifier:
 * 		identifier=[...|ID];
 * 
 * SelfReference:
 * 		'self';
 * </pre>
 * 
 * Note that the Identifier rule as implemented below actually corresponds to
 * <pre>Identifier: identifier=ID;</pre>
 * and that the cross-reference is not resolved.
 * This is simply a shortcut which declutters the exposé without detracting
 * from the lexer/parser side.
 * 
 * TODO  add _aspects_ to provide a readable stack representation without cluttering this code
 * 
 * @author Meinte Boersma
 */
public class Parser {

	private TokenStream tokenStream;

	public Expression parse(TokenStream tokenStream) {
		this.tokenStream = tokenStream;
		parseErrors = new ArrayList<ParseError>();
		return ruleExpression();
	}

	private List<ParseError> parseErrors;

	public List<ParseError> getParseErrors() {
		return parseErrors;
	}

	/**
	 * <pre>
	 * Expression: Additive;
	 * </pre>
	 */
	public Expression ruleExpression() {
		return ruleAdditive();
	}

	/**
	 * <pre>
	 * Additive:
	 * 		Multiplicative
	 * 		( ({Addition.left=current} '+' | {Subtraction.left=current} '-' ) right=Multiplicative )*;
	 * </pre>
	 */
	protected Expression ruleAdditive() {
		// call to Multiplicative:
		Expression current = ruleMultiplicative();

		// ( ... )*
		while( tokenStream.hasNext() ) {

			Token nextToken = tokenStream.peek();
			if( nextToken instanceof KeywordToken ) {
				BinaryOperation operation = handleAdditiveSubgroup((KeywordToken) nextToken, current);
				if( operation == null ) {
					break;	// no match of optional group
				} else {
					current = operation;
				}
			} else {
				break;	// no match of optional group
			}

		}

		return current;
	}

	protected BinaryOperation handleAdditiveSubgroup(KeywordToken nextToken, Expression current) {
		switch(nextToken.getKeyword()) {
			case plus : {
				// {Addition.left=current} '+' right=Multiplicative
				tokenStream.next();		// (consume peeked token)
				BinaryOperation addition = new Addition();
				addition.setLeft(current);
				addition.setRight(ruleMultiplicative());
				return addition;
			}
			case minus : {
				// {Subtraction.left=current} '-' right=Multiplicative
				tokenStream.next();		// (consume peeked token)
				BinaryOperation subtraction = new Subtraction();
				subtraction.setLeft(current);
				subtraction.setRight(ruleMultiplicative());
				return subtraction;
			}
			default : {
				return null;
			}
		}
	}

	/**
	 * <pre>
	 * Multiplicative:
	 * 		Primary
	 * 		( ({Multiplication.left=current} '*' | {Division.left=current} '/' ) right=Primary )*;
	 * </pre>
	 */
	protected Expression ruleMultiplicative() {
		// call to Primary:
		Expression current = rulePrimary();

		// ( ... )*
		while( tokenStream.hasNext() ) {

			Token nextToken = tokenStream.peek();
			if( nextToken instanceof KeywordToken ) {
				BinaryOperation operation = handleMultiplicativeGroup((KeywordToken) nextToken, current);
				if( operation == null ) {
					break;	// no match of optional group
				} else {
					current = operation;
				}
			} else {
				break;	// no match of optional group
			}

		}

		return current;
	}

	protected BinaryOperation handleMultiplicativeGroup (KeywordToken nextToken, Expression current) {
		switch(nextToken.getKeyword()) {
			case times : {
				// {Multiplication.left=current} '*' right=Primary
				tokenStream.next();		// (consume peeked token)
				BinaryOperation multiplication = new Multiplication();
				multiplication.setLeft(current);
				multiplication.setRight(rulePrimary());
				return multiplication;
			}
			case divide : {
				// {Division.left=current} '*' right=Primary
				tokenStream.next();		// (consume peeked token)
				BinaryOperation division = new Division();
				division.setLeft(current);
				division.setRight(rulePrimary());
				return division;
			}
			default : {
				return null;
			}
		}
	}

	/**
	 * <pre>
	 * Primary: NumberLiteral | Identifier | SelfReference | '(' Expression ')';
	 * </pre>
	 */
	protected Expression rulePrimary() {
		Expression current;

		current = ruleNumberLiteral();
		if( current != null ) {
			return current;
		}

		current = ruleIdentifier();
		if( current != null ) {
			return current;
		}

		current = ruleSelfReference();
		if( current != null ) {
			return current;
		}

		if( expectKeyword(Keywords.leftParens) ) {
			current = ruleExpression();
			expectKeyword(Keywords.rightParens);
		}

		return current;
	}

	private boolean expectKeyword(Keywords keyword) {
		Token token = tokenStream.peek();
		if( token == null ) {
			unexpectedEof(tokenStream.currentOrLast(), keyword.getWord());
			return false;
		} else {
			if( !(token instanceof KeywordToken && ((KeywordToken) token).getKeyword() == keyword ) ) {
				error(token, keyword.getWord());
				return false;
			}
		}
		tokenStream.next();
		return true;
	}

	private void unexpectedEof(Token previous, String expected) {
		parseErrors.add(ParseError.errorEOFAfter(previous.getLocation(), expected));
//		System.err.printf( "parse error after %s: expected '%s' but encountered EOF\n", previous.getLocation().toString(), expected );
	}

	private void error(Token actual, String expected) {
		parseErrors.add(ParseError.errorAt(actual.getLocation(), expected, actual.toString()));
//		System.err.printf( "parse error at %s: expected '%s' but encountered '%s'\n", actual.getLocation(), expected, actual.toString() );
	}

	/**
	 * <pre>
	 * NumberLiteral: literal=INT;
	 * </pre>
	 * @return {@link NumberLiteral} or <b>null</b> in case of a non-match
	 */
	protected NumberLiteral ruleNumberLiteral() {
		Token nextToken = tokenStream.peek();
		if( nextToken instanceof NumberLiteralToken ) {
			tokenStream.next();
			return new NumberLiteral( ((NumberLiteralToken) nextToken).getLiteral() );
		}
		return null;
	}

	/**
	 * <pre>
	 * Identifier: identifier=[...|ID];
	 * </pre>
	 * @return {@link Identifier} or <b>null</b> in case of a non-match
	 */
	protected Identifier ruleIdentifier() {
		Token nextToken = tokenStream.peek();
		if( nextToken instanceof IdentifierToken ) {
			tokenStream.next();
			return new Identifier( ((IdentifierToken) nextToken).getIdentifier() );
		}
		return null;
	}

	/**
	 * <pre>
	 * SelfReference: 'self';
	 * </pre>
	 * @return {@link SelfReference} or <b>null</b> in case of a non-match
	 */
	protected SelfReference ruleSelfReference() {
		Token nextToken = tokenStream.peek();
		if( nextToken instanceof KeywordToken ) {
			if( ((KeywordToken) nextToken).getKeyword() == Keywords.self ) {
				tokenStream.next();
				return new SelfReference();
			}
		}
		return null;
	}

}