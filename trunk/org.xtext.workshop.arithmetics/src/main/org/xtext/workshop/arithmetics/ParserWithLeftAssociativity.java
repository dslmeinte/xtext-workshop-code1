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
public class ParserWithLeftAssociativity {

	protected TokenStream tokenStream;

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
		Expression expr = ruleAdditive();
		// TODO  report error if not every token was consumed in parsing?
		return expr;
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
			// ( ... )
			BinaryOperation operation = ruleAdditiveSubgroup(current);
			if( operation == null ) {
				break;	// no match of optional group
			} else {
				current = operation;
			}
		}

		return current;
	}

	protected BinaryOperation ruleAdditiveSubgroup(Expression current) {
		Token nextToken = tokenStream.peek();
		if( nextToken instanceof KeywordToken ) {
			switch(((KeywordToken) nextToken).getKeyword()) {
				case plus : {
					tokenStream.next();		// (consume peeked token)
					// {Addition.left=current} '+' right=Multiplicative
					return new Addition().left(current).right(ruleMultiplicative());
				}
				case minus : {
					tokenStream.next();		// (consume peeked token)
					// {Subtraction.left=current} '-' right=Multiplicative
					return new Subtraction().left(current).right(ruleMultiplicative());
				}
				default : {
					return null;	// no match of optional group
				}
			}
		} else {
			return null;	// no match of optional group
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
			// ( ... )
			BinaryOperation operation = ruleMultiplicativeSubgroup(current);
			if( operation == null ) {
				break;	// no match of optional group
			} else {
				current = operation;
			}
		}

		return current;
	}

	/**
	 * Handles a multiplicative subgroup or returns {@code null} in case of a
	 * non-match.
	 */
	protected BinaryOperation ruleMultiplicativeSubgroup(Expression current) {
		Token nextToken = tokenStream.peek();
		if( nextToken instanceof KeywordToken ) {
			switch(((KeywordToken) nextToken).getKeyword()) {
				case times : {
					tokenStream.next();		// (consume peeked token)
					// {Multiplication.left=current} '*' right=Primary
					return new Multiplication().left(current).right(rulePrimary());
				}
				case divide : {
					tokenStream.next();		// (consume peeked token)
					// {Division.left=current} '/' right=Primary
					return new Division().left(current).right(rulePrimary());
				}
				default : {
					return null;	// no match of optional group
				}
			}
		} else {
			return null;	// no match of optional group
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
