package org.xtext.workshop.arithmetics.lexer.tokens;


public class IdentifierToken extends Token {

	private String identifier;

	public IdentifierToken(String identifier) {
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
