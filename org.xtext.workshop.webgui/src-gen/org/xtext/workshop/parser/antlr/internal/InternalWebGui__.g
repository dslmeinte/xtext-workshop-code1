lexer grammar InternalWebGui;
@header {
package org.xtext.workshop.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'model' ;
T12 : 'domain:' ;
T13 : 'entity' ;
T14 : '{' ;
T15 : '}' ;
T16 : ':' ;
T17 : '(s)' ;
T18 : '(es)' ;
T19 : '=' ;
T20 : 'type' ;
T21 : 'web:' ;
T22 : 'page' ;
T23 : 'title' ;
T24 : 'context' ;
T25 : 'action' ;
T26 : 'show' ;
T27 : '.' ;
T28 : '+' ;
T29 : '-' ;
T30 : '*' ;
T31 : '/' ;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1342
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1344
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1346
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1348
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1350
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1352
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g" 1354
RULE_ANY_OTHER : .;


