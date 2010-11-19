package org.xtext.workshop.arithmetics.metamodel;

public class NumberLiteral implements Expression {

	private int literal;

	public NumberLiteral(int literal) {
		this.literal = literal;
	}

	public int getLiteral() {
		return literal;
	}

	@Override
	public String toString() {
		return Integer.toString(literal);
	}

}
