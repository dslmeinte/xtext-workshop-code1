package org.xtext.workshop.arithmetics.lexer;

/**
 * Enumerates the keywords present in this DSL, with a static
 * {@link #match(String)} method.
 * 
 * @author Meinte Boersma
 */
public enum Keywords {

	plus("+"), minus("-"), times("*"), divide("/"), leftParens("("), rightParens(")"), self("self");

	private String word;

	private Keywords(String word) {
		this.word = word;
	}

	public static Keywords match(String str) {
		for( Keywords keyword : values() ) {
			if( keyword.word.equals(str) ) {
				return keyword;
			}
		}

		return null;
	}

	public String getWord() {
		return word;
	}

}
