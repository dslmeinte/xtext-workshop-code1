package org.xtext.workshop.arithmetics.lexer;

import java.util.List;

import org.xtext.workshop.arithmetics.lexer.tokens.Token;

/**
 * Encapsulates a stream of Token-s.
 * 
 * @author Meinte Boersma
 */
public class TokenStream {

	private List<Token> tokens;
	private int nTokens;

	public TokenStream(List<Token> tokens) {
		this.tokens = tokens;
		this.nTokens = tokens.size();
	}

	private int position = 0;

	/**
	 * @return {@code true} iff there are still {@link Token}s to be read.
	 */
	public boolean hasNext() {
		return( position < nTokens );
	}

	/**
	 * @return the next {@link Token} without advancing the stream pointer.
	 */
	public Token peek() {
		if( position < nTokens ) {
			return tokens.get(position);
		} else {
			return null;
		}
	}

	/**
	 * @return the <em>next</em> {@link Token} or <b>null</b> if none are left.
	 */
	public Token next() {
		if( position < nTokens ) {
			return tokens.get(position++);
		} else {
			return null;
		}
	}

	/**
	 * @return the <em>current or last</em> {@link Token} (whichever comes earlier).
	 * (This is mainly useful for error reporting on unexpected content.)
	 */
	public Token currentOrLast() {
		if( position < nTokens ) {
			return tokens.get(position);
		} else {
			return tokens.get(nTokens-1);
		}
	}

	@Override
	public String toString() {
		return tokens.toString();
	}

}
