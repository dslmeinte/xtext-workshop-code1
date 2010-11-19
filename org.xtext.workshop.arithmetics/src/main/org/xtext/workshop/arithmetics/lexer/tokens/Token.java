package org.xtext.workshop.arithmetics.lexer.tokens;

/**
 * Represents a token in the text to parse.
 * 
 * @author Meinte Boersma
 */
public abstract class Token {

	private Location location;

	public void setLocation(int lineNumber, int position) {
		location = new Location(lineNumber, position);
	}

	public Location getLocation() {
		return location;
	}

}
