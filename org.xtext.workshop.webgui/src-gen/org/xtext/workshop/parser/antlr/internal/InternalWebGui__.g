lexer grammar InternalWebGui;
@header {
package org.xtext.workshop.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'model' ;
T12 : '{' ;
T13 : '}' ;
T14 : 'domain' ;
T15 : 'entity' ;
T16 : ':' ;
T17 : '(s)' ;
T18 : 'type' ;
T19 : 'web' ;
T20 : 'page' ;
T21 : 'title' ;
T22 : '=' ;
T23 : 'content for' ;
T24 : 'action' ;
T25 : 'show' ;
T26 : 'input for' ;
T27 : 'repeat for' ;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1036
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1038
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1040
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1042
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1044
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1046
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1048
RULE_ANY_OTHER : .;


