package org.xtext.workshop.arithmetics.lexer.tokens;

public class Location {

	private int lineNumber;
	private int position;

	public Location(int lineNumber, int position) {
		this.lineNumber = lineNumber;
		this.position = position;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public int getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return "L" + lineNumber + "." + position;
	}
}