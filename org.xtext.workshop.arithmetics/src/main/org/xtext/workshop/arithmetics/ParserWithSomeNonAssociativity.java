package org.xtext.workshop.arithmetics;

import org.xtext.workshop.arithmetics.lexer.tokens.KeywordToken;
import org.xtext.workshop.arithmetics.lexer.tokens.Token;
import org.xtext.workshop.arithmetics.metamodel.BinaryOperation;
import org.xtext.workshop.arithmetics.metamodel.Division;
import org.xtext.workshop.arithmetics.metamodel.Expression;
import org.xtext.workshop.arithmetics.metamodel.Multiplication;

/**
 * Same as {@link ParserWithLeftAssociativity}, but with the following version of the Multiplicative
 * rule which make the associated binary operators <em>non associative</em>.
 * <p>
 * The implementation re-uses {@link ParserWithLeftAssociativity} but overrides the
 * {@link ParserWithLeftAssociativity#ruleMultiplicative()} method.
 * 
 * <pre>
 * Multiplicative:
 * 		Primary
 * 		( ({Multiplication.left=current} '*' | {Division.left=current} '/' ) right=Primary )?;
 * </pre>
 * 
 * <p>
 * (Note the question mark after the group, instead of the asterisk.)
 * 
 * @author Meinte Boersma
 */
public class ParserWithSomeNonAssociativity extends ParserWithLeftAssociativity {

	@Override
	protected Expression ruleMultiplicative() {
		// call to Primary:
		Expression current = rulePrimary();

		// ( ... )?
		if( tokenStream.hasNext() ) {
			// ( ... )
			BinaryOperation operation = ruleMultiplicativeSubgroup(current);
			if( operation != null ) {
				current = operation;
			} // else: no match of optional group
		}

		return current;
	}

	@Override
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

}
