/*
* generated by Xtext
*/
grammar InternalWebGui;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.workshop.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.workshop.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xtext.workshop.services.WebGuiGrammarAccess;

}

@parser::members {

 	private WebGuiGrammarAccess grammarAccess;
 	
    public InternalWebGuiParser(TokenStream input, IAstFactory factory, WebGuiGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/workshop/parser/antlr/internal/InternalWebGui.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected WebGuiGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'model' 
    {
        createLeafNode(grammarAccess.getModelAccess().getModelKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDomainDomainModelParserRuleCall_2_0(), currentNode); 
	    }
		lv_domain_2_0=ruleDomainModel		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"domain",
	        		lv_domain_2_0, 
	        		"DomainModel", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getWebWebModelParserRuleCall_3_0(), currentNode); 
	    }
		lv_web_3_0=ruleWebModel		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"web",
	        		lv_web_3_0, 
	        		"WebModel", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleDomainModel
entryRuleDomainModel returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getDomainModelRule(), currentNode); }
	 iv_ruleDomainModel=ruleDomainModel 
	 { $current=$iv_ruleDomainModel.current; } 
	 EOF 
;

// Rule DomainModel
ruleDomainModel returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getDomainModelAccess().getDomainModelAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getDomainModelAccess().getDomainModelAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)	'domain:' 
    {
        createLeafNode(grammarAccess.getDomainModelAccess().getDomainKeyword_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_2_0(), currentNode); 
	    }
		lv_entities_2_0=ruleEntity		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"entities",
	        		lv_entities_2_0, 
	        		"Entity", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getDataTypesDataTypeParserRuleCall_3_0(), currentNode); 
	    }
		lv_dataTypes_3_0=ruleDataType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"dataTypes",
	        		lv_dataTypes_3_0, 
	        		"DataType", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'entity' 
    {
        createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'{' 
    {
        createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0(), currentNode); 
	    }
		lv_features_3_0=ruleFeature		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"features",
	        		lv_features_3_0, 
	        		"Feature", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*	'}' 
    {
        createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4(), null); 
    }
)
;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	':' 
    {
        createLeafNode(grammarAccess.getFeatureAccess().getColonKeyword_1(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0(), "type"); 
	}

)
)(
(
(
		lv_multivalued_3_1=	'(s)' 
    {
        createLeafNode(grammarAccess.getFeatureAccess().getMultivaluedSKeyword_3_0_0(), "multivalued"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "multivalued", true, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_multivalued_3_2=	'(es)' 
    {
        createLeafNode(grammarAccess.getFeatureAccess().getMultivaluedEsKeyword_3_0_1(), "multivalued"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "multivalued", true, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)

)
)?)
;







// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getDataTypeRule(), currentNode); }
	 iv_ruleDataType=ruleDataType 
	 { $current=$iv_ruleDataType.current; } 
	 EOF 
;

// Rule DataType
ruleDataType returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'type' 
    {
        createLeafNode(grammarAccess.getDataTypeAccess().getTypeKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleWebModel
entryRuleWebModel returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getWebModelRule(), currentNode); }
	 iv_ruleWebModel=ruleWebModel 
	 { $current=$iv_ruleWebModel.current; } 
	 EOF 
;

// Rule WebModel
ruleWebModel returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getWebModelAccess().getWebModelAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getWebModelAccess().getWebModelAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)	'web:' 
    {
        createLeafNode(grammarAccess.getWebModelAccess().getWebKeyword_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getWebModelAccess().getPagesPageParserRuleCall_2_0(), currentNode); 
	    }
		lv_pages_2_0=rulePage		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getWebModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"pages",
	        		lv_pages_2_0, 
	        		"Page", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*)
;





// Entry rule entryRulePage
entryRulePage returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPageRule(), currentNode); }
	 iv_rulePage=rulePage 
	 { $current=$iv_rulePage.current; } 
	 EOF 
;

// Rule Page
rulePage returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'page' 
    {
        createLeafNode(grammarAccess.getPageAccess().getPageKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'{' 
    {
        createLeafNode(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2(), null); 
    }
	'title' 
    {
        createLeafNode(grammarAccess.getPageAccess().getTitleKeyword_3(), null); 
    }
	'=' 
    {
        createLeafNode(grammarAccess.getPageAccess().getEqualsSignKeyword_4(), null); 
    }
(
(
		lv_title_5_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_5_0(), "title"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"title",
	        		lv_title_5_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'content for' 
    {
        createLeafNode(grammarAccess.getPageAccess().getContentForKeyword_6(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getPageAccess().getEntityEntityCrossReference_7_0(), "entity"); 
	}

)
)	'{' 
    {
        createLeafNode(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_8(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getPageAccess().getContentsPageElementParserRuleCall_9_0(), currentNode); 
	    }
		lv_contents_9_0=rulePageElement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"contents",
	        		lv_contents_9_0, 
	        		"PageElement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*	'}' 
    {
        createLeafNode(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10(), null); 
    }
	'}' 
    {
        createLeafNode(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11(), null); 
    }
)
;





// Entry rule entryRulePageElement
entryRulePageElement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPageElementRule(), currentNode); }
	 iv_rulePageElement=rulePageElement 
	 { $current=$iv_rulePageElement.current; } 
	 EOF 
;

// Rule PageElement
rulePageElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getPageElementAccess().getSingleElementParserRuleCall_0(), currentNode); 
    }
    this_SingleElement_0=ruleSingleElement
    { 
        $current = $this_SingleElement_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getPageElementAccess().getRepeatElementParserRuleCall_1(), currentNode); 
    }
    this_RepeatElement_1=ruleRepeatElement
    { 
        $current = $this_RepeatElement_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleSingleElement
entryRuleSingleElement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSingleElementRule(), currentNode); }
	 iv_ruleSingleElement=ruleSingleElement 
	 { $current=$iv_ruleSingleElement.current; } 
	 EOF 
;

// Rule SingleElement
ruleSingleElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getActionElementParserRuleCall_0(), currentNode); 
    }
    this_ActionElement_0=ruleActionElement
    { 
        $current = $this_ActionElement_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getDisplayElementParserRuleCall_1(), currentNode); 
    }
    this_DisplayElement_1=ruleDisplayElement
    { 
        $current = $this_DisplayElement_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleActionElement
entryRuleActionElement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getActionElementRule(), currentNode); }
	 iv_ruleActionElement=ruleActionElement 
	 { $current=$iv_ruleActionElement.current; } 
	 EOF 
;

// Rule ActionElement
ruleActionElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'action' 
    {
        createLeafNode(grammarAccess.getActionElementAccess().getActionKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getActionElementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getActionElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleDisplayElement
entryRuleDisplayElement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getDisplayElementRule(), currentNode); }
	 iv_ruleDisplayElement=ruleDisplayElement 
	 { $current=$iv_ruleDisplayElement.current; } 
	 EOF 
;

// Rule DisplayElement
ruleDisplayElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'show' 
    {
        createLeafNode(grammarAccess.getDisplayElementAccess().getShowKeyword_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getDisplayElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getDisplayElementAccess().getReferenceFeatureCrossReference_1_0(), "reference"); 
	}

)
))
;





// Entry rule entryRuleRepeatElement
entryRuleRepeatElement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getRepeatElementRule(), currentNode); }
	 iv_ruleRepeatElement=ruleRepeatElement 
	 { $current=$iv_ruleRepeatElement.current; } 
	 EOF 
;

// Rule RepeatElement
ruleRepeatElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'repeat for' 
    {
        createLeafNode(grammarAccess.getRepeatElementAccess().getRepeatForKeyword_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getRepeatElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getRepeatElementAccess().getReferenceFeatureCrossReference_1_0(), "reference"); 
	}

)
)	'{' 
    {
        createLeafNode(grammarAccess.getRepeatElementAccess().getLeftCurlyBracketKeyword_2(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getRepeatElementAccess().getContentsSingleElementParserRuleCall_3_0(), currentNode); 
	    }
		lv_contents_3_0=ruleSingleElement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRepeatElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"contents",
	        		lv_contents_3_0, 
	        		"SingleElement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*	'}' 
    {
        createLeafNode(grammarAccess.getRepeatElementAccess().getRightCurlyBracketKeyword_4(), null); 
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


