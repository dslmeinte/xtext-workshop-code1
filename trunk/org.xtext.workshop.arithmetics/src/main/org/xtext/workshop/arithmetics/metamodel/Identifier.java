package org.xtext.workshop.arithmetics.metamodel;

public class Identifier implements Expression {

	private String identifier;

	public Identifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	@Override
	public String toString() {
		return identifier;
	}

}
