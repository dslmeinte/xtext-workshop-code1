package org.xtext.workshop.arithmetics.lexer;

import org.junit.Test;

/**
 * TODO  make these _real_ unit tests...
 * 
 * @author Meinte Boersma
 */
public class LexerTest {

	@Test
	public void test_some_expressions() {
		Lexer lexer = new Lexer();
		System.out.println( lexer.lexe("(1)") );
		System.out.println( lexer.lexe(" 37 + 2*3 + 5*(7 / 11)") );
		System.out.println( lexer.lexe("a+b") );
		System.out.println( lexer.lexe("37*self") );
		System.out.println( lexer.lexe("sel") );
	}

}
