package org.xtext.workshop.arithmetics.lexer.tokens;


public class NumberLiteralToken extends Token {

	private int literal;

	public NumberLiteralToken(String literal) {
		this.literal = Integer.parseInt(literal);
	}

	public int getLiteral() {
		return literal;
	}

	public String toString() {
		return Integer.toString(literal);
	}

}