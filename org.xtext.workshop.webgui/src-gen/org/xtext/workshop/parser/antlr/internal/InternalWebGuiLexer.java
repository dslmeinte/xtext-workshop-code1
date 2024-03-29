package org.xtext.workshop.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebGuiLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=32;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T31=31;
    public InternalWebGuiLexer() {;} 
    public InternalWebGuiLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:10:5: ( 'model' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:10:7: 'model'
            {
            match("model"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:11:5: ( 'domain:' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:11:7: 'domain:'
            {
            match("domain:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:12:5: ( 'entity' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:12:7: 'entity'
            {
            match("entity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:13:5: ( '{' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:13:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:14:5: ( '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:14:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:15:5: ( ':' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:15:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:16:5: ( '(s)' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:16:7: '(s)'
            {
            match("(s)"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:17:5: ( '(es)' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:17:7: '(es)'
            {
            match("(es)"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:18:5: ( '=' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:18:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:19:5: ( 'type' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:19:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:20:5: ( 'web:' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:20:7: 'web:'
            {
            match("web:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:21:5: ( 'page' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:21:7: 'page'
            {
            match("page"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:22:5: ( 'title' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:22:7: 'title'
            {
            match("title"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:23:5: ( 'context' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:23:7: 'context'
            {
            match("context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:24:5: ( 'action' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:24:7: 'action'
            {
            match("action"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:25:5: ( 'show' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:25:7: 'show'
            {
            match("show"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:26:5: ( '.' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:26:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:27:5: ( '+' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:27:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:28:5: ( '-' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:28:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:29:5: ( '*' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:29:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:30:5: ( '/' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:30:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1310:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1310:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1310:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1310:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1310:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1312:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1312:12: ( '0' .. '9' )+
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1312:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1312:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1314:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1314:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1316:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1316:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1316:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1316:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1318:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1318:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1318:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1318:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1318:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1318:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1318:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1318:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1320:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1320:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1320:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1322:16: ( . )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1322:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=28;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='m') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='o') ) {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='d') ) {
                    int LA12_54 = input.LA(4);

                    if ( (LA12_54=='e') ) {
                        int LA12_64 = input.LA(5);

                        if ( (LA12_64=='l') ) {
                            int LA12_74 = input.LA(6);

                            if ( ((LA12_74>='0' && LA12_74<='9')||(LA12_74>='A' && LA12_74<='Z')||LA12_74=='_'||(LA12_74>='a' && LA12_74<='z')) ) {
                                alt12=22;
                            }
                            else {
                                alt12=1;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='d') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='o') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='m') ) {
                    int LA12_55 = input.LA(4);

                    if ( (LA12_55=='a') ) {
                        int LA12_65 = input.LA(5);

                        if ( (LA12_65=='i') ) {
                            int LA12_75 = input.LA(6);

                            if ( (LA12_75=='n') ) {
                                int LA12_84 = input.LA(7);

                                if ( (LA12_84==':') ) {
                                    alt12=2;
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='e') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='n') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='t') ) {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='i') ) {
                        int LA12_66 = input.LA(5);

                        if ( (LA12_66=='t') ) {
                            int LA12_76 = input.LA(6);

                            if ( (LA12_76=='y') ) {
                                int LA12_85 = input.LA(7);

                                if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                                    alt12=22;
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=4;
        }
        else if ( (LA12_0=='}') ) {
            alt12=5;
        }
        else if ( (LA12_0==':') ) {
            alt12=6;
        }
        else if ( (LA12_0=='(') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                alt12=8;
                }
                break;
            case 's':
                {
                alt12=7;
                }
                break;
            default:
                alt12=28;}

        }
        else if ( (LA12_0=='=') ) {
            alt12=9;
        }
        else if ( (LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='p') ) {
                    int LA12_57 = input.LA(4);

                    if ( (LA12_57=='e') ) {
                        int LA12_67 = input.LA(5);

                        if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                            alt12=22;
                        }
                        else {
                            alt12=10;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
                }
                break;
            case 'i':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='t') ) {
                    int LA12_58 = input.LA(4);

                    if ( (LA12_58=='l') ) {
                        int LA12_68 = input.LA(5);

                        if ( (LA12_68=='e') ) {
                            int LA12_78 = input.LA(6);

                            if ( ((LA12_78>='0' && LA12_78<='9')||(LA12_78>='A' && LA12_78<='Z')||LA12_78=='_'||(LA12_78>='a' && LA12_78<='z')) ) {
                                alt12=22;
                            }
                            else {
                                alt12=13;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
                }
                break;
            default:
                alt12=22;}

        }
        else if ( (LA12_0=='w') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='e') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='b') ) {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59==':') ) {
                        alt12=11;
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='p') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='a') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='g') ) {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='e') ) {
                        int LA12_70 = input.LA(5);

                        if ( ((LA12_70>='0' && LA12_70<='9')||(LA12_70>='A' && LA12_70<='Z')||LA12_70=='_'||(LA12_70>='a' && LA12_70<='z')) ) {
                            alt12=22;
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='o') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='n') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='t') ) {
                        int LA12_71 = input.LA(5);

                        if ( (LA12_71=='e') ) {
                            int LA12_80 = input.LA(6);

                            if ( (LA12_80=='x') ) {
                                int LA12_87 = input.LA(7);

                                if ( (LA12_87=='t') ) {
                                    int LA12_91 = input.LA(8);

                                    if ( ((LA12_91>='0' && LA12_91<='9')||(LA12_91>='A' && LA12_91<='Z')||LA12_91=='_'||(LA12_91>='a' && LA12_91<='z')) ) {
                                        alt12=22;
                                    }
                                    else {
                                        alt12=14;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='a') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='c') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='t') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='i') ) {
                        int LA12_72 = input.LA(5);

                        if ( (LA12_72=='o') ) {
                            int LA12_81 = input.LA(6);

                            if ( (LA12_81=='n') ) {
                                int LA12_88 = input.LA(7);

                                if ( ((LA12_88>='0' && LA12_88<='9')||(LA12_88>='A' && LA12_88<='Z')||LA12_88=='_'||(LA12_88>='a' && LA12_88<='z')) ) {
                                    alt12=22;
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='h') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='o') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='w') ) {
                        int LA12_73 = input.LA(5);

                        if ( ((LA12_73>='0' && LA12_73<='9')||(LA12_73>='A' && LA12_73<='Z')||LA12_73=='_'||(LA12_73>='a' && LA12_73<='z')) ) {
                            alt12=22;
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=17;
        }
        else if ( (LA12_0=='+') ) {
            alt12=18;
        }
        else if ( (LA12_0=='-') ) {
            alt12=19;
        }
        else if ( (LA12_0=='*') ) {
            alt12=20;
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=25;
                }
                break;
            case '/':
                {
                alt12=26;
                }
                break;
            default:
                alt12=21;}

        }
        else if ( (LA12_0=='^') ) {
            int LA12_20 = input.LA(2);

            if ( ((LA12_20>='A' && LA12_20<='Z')||LA12_20=='_'||(LA12_20>='a' && LA12_20<='z')) ) {
                alt12=22;
            }
            else {
                alt12=28;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='f' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=22;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=23;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_23 = input.LA(2);

            if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFE')) ) {
                alt12=24;
            }
            else {
                alt12=28;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_24 = input.LA(2);

            if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFE')) ) {
                alt12=24;
            }
            else {
                alt12=28;}
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=27;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0==')'||LA12_0==','||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=28;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:94: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:102: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:111: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:123: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:139: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:155: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1:163: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}