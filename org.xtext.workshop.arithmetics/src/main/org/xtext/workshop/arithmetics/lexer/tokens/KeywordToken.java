package org.xtext.workshop.arithmetics.lexer.tokens;

import org.xtext.workshop.arithmetics.lexer.Keywords;

public class KeywordToken extends Token {

	private Keywords keyword;

	public KeywordToken(Keywords keyword) {
		this.keyword = keyword;
	}

	public Keywords getKeyword() {
		return keyword;
	}

	@Override
	public String toString() {
		return keyword.getWord();
	}

}
