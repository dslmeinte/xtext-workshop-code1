package org.xtext.workshop.arithmetics.lexer;

import java.util.ArrayList;
import java.util.List;

import org.xtext.workshop.arithmetics.lexer.tokens.IdentifierToken;
import org.xtext.workshop.arithmetics.lexer.tokens.KeywordToken;
import org.xtext.workshop.arithmetics.lexer.tokens.NumberLiteralToken;
import org.xtext.workshop.arithmetics.lexer.tokens.Token;

/**
 * A hand-crafter lexer for the example DSL. Its {@link #lexe(String)} performs
 * all the fireworks.
 * <p>
 * The lexer is somewhat extendable by means of the {@link Keywords} type.
 * 
 * @author Meinte Boersma
 */
public class Lexer {

	private String text;
	private int index;
	private State state;
	private int lexemeStart;
	private List<Token> tokens;
	private int lineStart;
	private int lineNumber;

	private void reset() {
		index = 0;
		state = State.whitespace;
		lexemeStart = 0;
		tokens = new ArrayList<Token>();
		lineStart = 0;
		lineNumber = 1;
	}

	private String getLexeme() {
		return text.substring(lexemeStart, index);
	}

	/**
	 * Lexes the given {@link String}, treating it as a complete language
	 * fragment, and returns the associated {@link TokenStream}.
	 */
	public TokenStream lexe(String text) {
		this.text = text;
		reset();

		while( index < text.length() ) {
			char ch = text.charAt(index);
			boolean matched = false;
			String lexeme = getLexeme();
			for( State newState : State.values() ) {
				if( newState.matches(ch, lexeme) ) {
					matched = true;
					if( state != newState || state.terminated(lexeme) ) {
						finish(state);
						state = newState;
						lexemeStart = index;
						break;
					}
				}
			}
			if( !matched ) {
				System.err.printf( "unexpected content '%c' @%d.%d\n: state=", ch, lineNumber, (index - lineStart + 1), state.toString() );
			}

			index++;
			if( ch == '\n' ) {
				lineNumber++;
				lineStart = index;
			}
		}
		finish(state);

		return new TokenStream(tokens);
	}

	private void finish(State state) {
		Token token = state.finish(getLexeme());
		if( token != null ) {
			token.setLocation(lineNumber, lexemeStart - lineStart + 1);
			tokens.add(token);
		}
	}

	/**
	 * Enumeration of states of the state machine underlying this lexer.
	 * <p>
	 * Its abstract methods provide a degree of extensibility.
	 */
	private enum State {
		whitespace {
			@Override	boolean matches(char ch, String lexeme) { return( " \t\n\r".indexOf(ch) != -1 ); }
			@Override	boolean terminated(String lexeme) 		{ return false; }
			@Override	Token finish(String lexeme)				{ return null; }
		},
		numberLiteral {
			@Override	boolean matches(char ch, String lexeme) { return Character.isDigit(ch); }
			@Override	boolean terminated(String lexeme)		{ return false; }
			@Override	Token finish(String lexeme)				{ return new NumberLiteralToken(lexeme); }
		},
		nonSeparatingKeyword {
			@Override	boolean matches(char ch, String lexeme) { return( "+-*/()".indexOf(ch) != -1 ); }
			@Override	boolean terminated(String lexeme)		{ return( Keywords.match(lexeme) != null ); }
			@Override	Token finish(String lexeme)				{ return new KeywordToken(Keywords.match(lexeme)); }
		},
		identifierOrSeparatingKeyword {
			@Override	boolean matches(char ch, String lexeme)	{ return Character.isLetter(ch); }
			@Override	boolean terminated(String lexeme)		{ return false; }

			@Override
			Token finish(String lexeme) {
				Keywords keyword = Keywords.match(lexeme);
				if( keyword == null ) {
					return new IdentifierToken(lexeme);
				} else {
					return new KeywordToken(keyword);
				}
			}
		}
		;

		/**
		 * Indicates whether the current lexeme can be considered terminated for
		 * this state. (Shortest match wins.)
		 */
		abstract boolean terminated(String lexeme);

		/**
		 * Indicates whether the current character is a valid continuation of
		 * the current lexeme for this state.
		 */
		abstract boolean matches(char ch, String lexeme);

		/**
		 * This method is invoked with the current lexeme, as soon as a
		 * transition to a different state is occurring.
		 */
		abstract Token finish(String lexeme);
	}

}
