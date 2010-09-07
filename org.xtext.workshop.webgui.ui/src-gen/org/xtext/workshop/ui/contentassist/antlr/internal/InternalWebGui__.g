lexer grammar InternalWebGui;
@header {
package org.xtext.workshop.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '(s)' ;
T12 : '(es)' ;
T13 : 'model' ;
T14 : 'domain:' ;
T15 : 'entity' ;
T16 : '{' ;
T17 : '}' ;
T18 : ':' ;
T19 : 'type' ;
T20 : 'web:' ;
T21 : 'page' ;
T22 : 'title' ;
T23 : '=' ;
T24 : 'content for' ;
T25 : 'action' ;
T26 : 'show' ;
T27 : 'repeat for' ;

// $ANTLR src "../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g" 2109
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g" 2111
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g" 2113
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g" 2115
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g" 2117
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g" 2119
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g" 2121
RULE_ANY_OTHER : .;


