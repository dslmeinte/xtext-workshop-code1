package org.xtext.workshop.arithmetics.lexer;

import junit.framework.Assert;

import org.junit.Test;
import org.xtext.workshop.arithmetics.Parser;
import org.xtext.workshop.arithmetics.metamodel.Expression;

public class ParserTest {

	private Lexer lexer = new Lexer();
	private Parser parser = new Parser();

	@Test
	public void test_expr_with_parentheses() {
		TokenStream tokenStream = lexer.lexe("5*(7/denom)");
		Expression expr = parser.parse(tokenStream);
		Assert.assertEquals("(5*(7/denom))", expr.toString());
	}

	@Test
	public void test_expr_with_left_associativity() {
		TokenStream tokenStream = lexer.lexe("self + 37 + 2*3 + 5*(7 / denom)");
		Expression expr = parser.parse(tokenStream);
		Assert.assertEquals("(((self+37)+(2*3))+(5*(7/denom)))", expr.toString());
	}

	@Test
	public void test_some_errors() {
		TokenStream tokenStream = lexer.lexe("(((1 + self)");
		Expression expr = parser.parse(tokenStream);
		Assert.assertEquals(2, parser.getParseErrors().size());
		Assert.assertEquals("(1+self)", expr.toString());
	}

}
