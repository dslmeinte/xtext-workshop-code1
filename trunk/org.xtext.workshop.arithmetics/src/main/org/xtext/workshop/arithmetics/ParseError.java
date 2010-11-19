package org.xtext.workshop.arithmetics;

import org.xtext.workshop.arithmetics.lexer.tokens.Location;

/**
 * Encapsulates parse errors.
 * 
 * @author Meinte Boersma
 */
public class ParseError {

	private Location location;
	private String expected;
	private String encountered;
	private Relative relative;

	private enum Relative {
		after, at;
	}

	private ParseError(Location location, String expected, String encountered, Relative relative) {
		this.location = location;
		this.expected = expected;
		this.encountered = encountered;
		this.relative = relative;
	}

	public String toString() {
		return String.format(
				"parse error %s %s: expected '%s' but encountered %s",
				relative.name(), location.toString(), expected, encountered
			);
	}

	public static ParseError errorAt(Location location, String expected, String encountered) {
		return new ParseError(location, expected, encountered, Relative.at);
	}

	public static ParseError errorEOFAfter(Location location, String expected) {
		return new ParseError(location, expected, "EOF", Relative.after);
	}

}
