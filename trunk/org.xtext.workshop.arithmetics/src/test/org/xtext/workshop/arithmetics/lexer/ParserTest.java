package org.xtext.workshop.arithmetics.lexer;

import junit.framework.Assert;

import org.junit.Test;
import org.xtext.workshop.arithmetics.ParserWithLeftAssociativity;
import org.xtext.workshop.arithmetics.ParserWithSomeNonAssociativity;
import org.xtext.workshop.arithmetics.ParserWithSomeRightAssociativity;
import org.xtext.workshop.arithmetics.lexer.tokens.KeywordToken;
import org.xtext.workshop.arithmetics.lexer.tokens.Token;
import org.xtext.workshop.arithmetics.metamodel.Expression;

public class ParserTest {

	private Lexer lexer = new Lexer();
	private ParserWithLeftAssociativity leftAssocParser = new ParserWithLeftAssociativity();
	private ParserWithSomeRightAssociativity rightAssocParser = new ParserWithSomeRightAssociativity();
	private ParserWithSomeNonAssociativity nonAssocParser = new ParserWithSomeNonAssociativity();

	@Test
	public void test_expr_with_parentheses() {
		TokenStream tokenStream = lexer.lexe("5*(7/denom)");
		Expression expr = leftAssocParser.parse(tokenStream);
		Assert.assertEquals("(5*(7/denom))", expr.toString());
	}

	@Test
	public void test_expr_with_left_associativity() {
		TokenStream tokenStream = lexer.lexe("self + 37 + 2*3 + 5*(7 / denom)");
		Expression expr = leftAssocParser.parse(tokenStream);
		Assert.assertEquals("(((self+37)+(2*3))+(5*(7/denom)))", expr.toString());
	}

	@Test
	public void test_expr_with_right_associativity() {
		TokenStream tokenStream = lexer.lexe("1 + 5*7/denom + 3");
		Expression expr = rightAssocParser.parse(tokenStream);
		Assert.assertEquals("((1+(5*(7/denom)))+3)", expr.toString());
	}

	@Test
	public void test_expr_with_non_associativity() {
		TokenStream tokenStream = lexer.lexe("5*7/denom");
		Expression expr = nonAssocParser.parse(tokenStream);
		Assert.assertEquals("(5*7)", expr.toString());
		Assert.assertFalse(nonAssocParser.isNoTokenLeft());
		Token nextToken = tokenStream.next();
		Assert.assertTrue(nextToken instanceof KeywordToken);
		Assert.assertEquals("/", ((KeywordToken) nextToken).getKeyword().getWord());
	}

	@Test
	public void test_some_errors() {
		TokenStream tokenStream = lexer.lexe("(((1 + self)");
		Expression expr = leftAssocParser.parse(tokenStream);
		Assert.assertEquals(2, leftAssocParser.getParseErrors().size());
		Assert.assertEquals("(1+self)", expr.toString());
	}

}
