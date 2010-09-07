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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebGuiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'domain:'", "'entity'", "'{'", "'}'", "':'", "'(s)'", "'(es)'", "'type'", "'web:'", "'page'", "'title'", "'='", "'content for'", "'action'", "'show'", "'input for'", "'repeat for'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalWebGuiParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g"; }



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



    // $ANTLR start entryRuleModel
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:86:1: ruleModel returns [EObject current=null] : ( 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_domain_2_0= ruleDomainModel ) ) ( (lv_web_3_0= ruleWebModel ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_domain_2_0 = null;

        EObject lv_web_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:91:6: ( ( 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_domain_2_0= ruleDomainModel ) ) ( (lv_web_3_0= ruleWebModel ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:92:1: ( 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_domain_2_0= ruleDomainModel ) ) ( (lv_web_3_0= ruleWebModel ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:92:1: ( 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_domain_2_0= ruleDomainModel ) ) ( (lv_web_3_0= ruleWebModel ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:92:3: 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_domain_2_0= ruleDomainModel ) ) ( (lv_web_3_0= ruleWebModel ) )
            {
            match(input,11,FOLLOW_11_in_ruleModel120); 

                    createLeafNode(grammarAccess.getModelAccess().getModelKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:96:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:97:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:97:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:98:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel137); 

            			createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:120:2: ( (lv_domain_2_0= ruleDomainModel ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:121:1: (lv_domain_2_0= ruleDomainModel )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:121:1: (lv_domain_2_0= ruleDomainModel )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:122:3: lv_domain_2_0= ruleDomainModel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDomainDomainModelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDomainModel_in_ruleModel163);
            lv_domain_2_0=ruleDomainModel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"domain",
            	        		lv_domain_2_0, 
            	        		"DomainModel", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:144:2: ( (lv_web_3_0= ruleWebModel ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:145:1: (lv_web_3_0= ruleWebModel )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:145:1: (lv_web_3_0= ruleWebModel )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:146:3: lv_web_3_0= ruleWebModel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getWebWebModelParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWebModel_in_ruleModel184);
            lv_web_3_0=ruleWebModel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"web",
            	        		lv_web_3_0, 
            	        		"WebModel", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleDomainModel
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:176:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:177:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:178:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel220);
            iv_ruleDomainModel=ruleDomainModel();
            _fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel230); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDomainModel


    // $ANTLR start ruleDomainModel
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:185:1: ruleDomainModel returns [EObject current=null] : ( () 'domain:' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_dataTypes_3_0= ruleDataType ) )* ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_2_0 = null;

        EObject lv_dataTypes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:190:6: ( ( () 'domain:' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_dataTypes_3_0= ruleDataType ) )* ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:191:1: ( () 'domain:' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_dataTypes_3_0= ruleDataType ) )* )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:191:1: ( () 'domain:' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_dataTypes_3_0= ruleDataType ) )* )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:191:2: () 'domain:' ( (lv_entities_2_0= ruleEntity ) )* ( (lv_dataTypes_3_0= ruleDataType ) )*
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:191:2: ()
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:192:5: 
            {
             
                    temp=factory.create(grammarAccess.getDomainModelAccess().getDomainModelAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDomainModelAccess().getDomainModelAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,12,FOLLOW_12_in_ruleDomainModel274); 

                    createLeafNode(grammarAccess.getDomainModelAccess().getDomainKeyword_1(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:206:1: ( (lv_entities_2_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:207:1: (lv_entities_2_0= ruleEntity )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:207:1: (lv_entities_2_0= ruleEntity )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:208:3: lv_entities_2_0= ruleEntity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomainModel295);
            	    lv_entities_2_0=ruleEntity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"entities",
            	    	        		lv_entities_2_0, 
            	    	        		"Entity", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:230:3: ( (lv_dataTypes_3_0= ruleDataType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:231:1: (lv_dataTypes_3_0= ruleDataType )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:231:1: (lv_dataTypes_3_0= ruleDataType )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:232:3: lv_dataTypes_3_0= ruleDataType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getDataTypesDataTypeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataType_in_ruleDomainModel317);
            	    lv_dataTypes_3_0=ruleDataType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"dataTypes",
            	    	        		lv_dataTypes_3_0, 
            	    	        		"DataType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDomainModel


    // $ANTLR start entryRuleEntity
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:262:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:263:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:264:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity354);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity364); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:271:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_features_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:276:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:277:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:277:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:277:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}'
            {
            match(input,13,FOLLOW_13_in_ruleEntity399); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:281:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:282:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:282:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:283:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity416); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleEntity431); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:309:1: ( (lv_features_3_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:310:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:310:1: (lv_features_3_0= ruleFeature )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:311:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity452);
            	    lv_features_3_0=ruleFeature();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"features",
            	    	        		lv_features_3_0, 
            	    	        		"Feature", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleEntity463); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:345:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:346:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:347:2: iv_ruleFeature= ruleFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature499);
            iv_ruleFeature=ruleFeature();
            _fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature509); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:354:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_multivalued_3_1=null;
        Token lv_multivalued_3_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:359:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )? ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:360:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )? )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:360:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )? )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:360:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )?
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:360:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:361:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:361:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:362:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature551); 

            			createLeafNode(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleFeature566); 

                    createLeafNode(grammarAccess.getFeatureAccess().getColonKeyword_1(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:388:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:389:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:389:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:390:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature584); 

            		createLeafNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0(), "type"); 
            	

            }


            }

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:402:2: ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=17 && LA5_0<=18)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:403:1: ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) )
                    {
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:403:1: ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) )
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:404:1: (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' )
                    {
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:404:1: (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==17) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==18) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("404:1: (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' )", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:405:3: lv_multivalued_3_1= '(s)'
                            {
                            lv_multivalued_3_1=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleFeature604); 

                                    createLeafNode(grammarAccess.getFeatureAccess().getMultivaluedSKeyword_3_0_0(), "multivalued"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "multivalued", true, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:423:8: lv_multivalued_3_2= '(es)'
                            {
                            lv_multivalued_3_2=(Token)input.LT(1);
                            match(input,18,FOLLOW_18_in_ruleFeature633); 

                                    createLeafNode(grammarAccess.getFeatureAccess().getMultivaluedEsKeyword_3_0_1(), "multivalued"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "multivalued", true, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFeature


    // $ANTLR start entryRuleDataType
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:454:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:455:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:456:2: iv_ruleDataType= ruleDataType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType688);
            iv_ruleDataType=ruleDataType();
            _fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType698); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataType


    // $ANTLR start ruleDataType
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:463:1: ruleDataType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:468:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:469:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:469:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:469:3: 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,19,FOLLOW_19_in_ruleDataType733); 

                    createLeafNode(grammarAccess.getDataTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:473:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:474:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:474:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:475:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType750); 

            			createLeafNode(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataType


    // $ANTLR start entryRuleWebModel
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:505:1: entryRuleWebModel returns [EObject current=null] : iv_ruleWebModel= ruleWebModel EOF ;
    public final EObject entryRuleWebModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebModel = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:506:2: (iv_ruleWebModel= ruleWebModel EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:507:2: iv_ruleWebModel= ruleWebModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWebModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleWebModel_in_entryRuleWebModel791);
            iv_ruleWebModel=ruleWebModel();
            _fsp--;

             current =iv_ruleWebModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebModel801); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWebModel


    // $ANTLR start ruleWebModel
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:514:1: ruleWebModel returns [EObject current=null] : ( () 'web:' ( (lv_pages_2_0= rulePage ) )* ) ;
    public final EObject ruleWebModel() throws RecognitionException {
        EObject current = null;

        EObject lv_pages_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:519:6: ( ( () 'web:' ( (lv_pages_2_0= rulePage ) )* ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:520:1: ( () 'web:' ( (lv_pages_2_0= rulePage ) )* )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:520:1: ( () 'web:' ( (lv_pages_2_0= rulePage ) )* )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:520:2: () 'web:' ( (lv_pages_2_0= rulePage ) )*
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:520:2: ()
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:521:5: 
            {
             
                    temp=factory.create(grammarAccess.getWebModelAccess().getWebModelAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getWebModelAccess().getWebModelAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,20,FOLLOW_20_in_ruleWebModel845); 

                    createLeafNode(grammarAccess.getWebModelAccess().getWebKeyword_1(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:535:1: ( (lv_pages_2_0= rulePage ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:536:1: (lv_pages_2_0= rulePage )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:536:1: (lv_pages_2_0= rulePage )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:537:3: lv_pages_2_0= rulePage
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWebModelAccess().getPagesPageParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePage_in_ruleWebModel866);
            	    lv_pages_2_0=rulePage();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWebModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"pages",
            	    	        		lv_pages_2_0, 
            	    	        		"Page", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWebModel


    // $ANTLR start entryRulePage
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:567:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:568:2: (iv_rulePage= rulePage EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:569:2: iv_rulePage= rulePage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPageRule(), currentNode); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage903);
            iv_rulePage=rulePage();
            _fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage913); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePage


    // $ANTLR start rulePage
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:576:1: rulePage returns [EObject current=null] : ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_title_5_0=null;
        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:581:6: ( ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:582:1: ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:582:1: ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:582:3: 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}'
            {
            match(input,21,FOLLOW_21_in_rulePage948); 

                    createLeafNode(grammarAccess.getPageAccess().getPageKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:586:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:587:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:587:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:588:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage965); 

            			createLeafNode(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_rulePage980); 

                    createLeafNode(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,22,FOLLOW_22_in_rulePage990); 

                    createLeafNode(grammarAccess.getPageAccess().getTitleKeyword_3(), null); 
                
            match(input,23,FOLLOW_23_in_rulePage1000); 

                    createLeafNode(grammarAccess.getPageAccess().getEqualsSignKeyword_4(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:622:1: ( (lv_title_5_0= RULE_STRING ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:623:1: (lv_title_5_0= RULE_STRING )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:623:1: (lv_title_5_0= RULE_STRING )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:624:3: lv_title_5_0= RULE_STRING
            {
            lv_title_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1017); 

            			createLeafNode(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_5_0(), "title"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_5_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,24,FOLLOW_24_in_rulePage1032); 

                    createLeafNode(grammarAccess.getPageAccess().getContentForKeyword_6(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:650:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:651:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:651:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:652:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1050); 

            		createLeafNode(grammarAccess.getPageAccess().getEntityEntityCrossReference_7_0(), "entity"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_rulePage1060); 

                    createLeafNode(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_8(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:668:1: ( (lv_contents_9_0= rulePageElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=25 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:669:1: (lv_contents_9_0= rulePageElement )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:669:1: (lv_contents_9_0= rulePageElement )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:670:3: lv_contents_9_0= rulePageElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPageAccess().getContentsPageElementParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePageElement_in_rulePage1081);
            	    lv_contents_9_0=rulePageElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_9_0, 
            	    	        		"PageElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_rulePage1092); 

                    createLeafNode(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10(), null); 
                
            match(input,15,FOLLOW_15_in_rulePage1102); 

                    createLeafNode(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePage


    // $ANTLR start entryRulePageElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:708:1: entryRulePageElement returns [EObject current=null] : iv_rulePageElement= rulePageElement EOF ;
    public final EObject entryRulePageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:709:2: (iv_rulePageElement= rulePageElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:710:2: iv_rulePageElement= rulePageElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPageElementRule(), currentNode); 
            pushFollow(FOLLOW_rulePageElement_in_entryRulePageElement1138);
            iv_rulePageElement=rulePageElement();
            _fsp--;

             current =iv_rulePageElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageElement1148); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePageElement


    // $ANTLR start rulePageElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:717:1: rulePageElement returns [EObject current=null] : (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement ) ;
    public final EObject rulePageElement() throws RecognitionException {
        EObject current = null;

        EObject this_SingleElement_0 = null;

        EObject this_RepeatElement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:722:6: ( (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:723:1: (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:723:1: (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=25 && LA8_0<=27)) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("723:1: (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:724:5: this_SingleElement_0= ruleSingleElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPageElementAccess().getSingleElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSingleElement_in_rulePageElement1195);
                    this_SingleElement_0=ruleSingleElement();
                    _fsp--;

                     
                            current = this_SingleElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:734:5: this_RepeatElement_1= ruleRepeatElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPageElementAccess().getRepeatElementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRepeatElement_in_rulePageElement1222);
                    this_RepeatElement_1=ruleRepeatElement();
                    _fsp--;

                     
                            current = this_RepeatElement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePageElement


    // $ANTLR start entryRuleSingleElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:750:1: entryRuleSingleElement returns [EObject current=null] : iv_ruleSingleElement= ruleSingleElement EOF ;
    public final EObject entryRuleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:751:2: (iv_ruleSingleElement= ruleSingleElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:752:2: iv_ruleSingleElement= ruleSingleElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleElement_in_entryRuleSingleElement1257);
            iv_ruleSingleElement=ruleSingleElement();
            _fsp--;

             current =iv_ruleSingleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleElement1267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSingleElement


    // $ANTLR start ruleSingleElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:759:1: ruleSingleElement returns [EObject current=null] : (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement ) ;
    public final EObject ruleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ActionElement_0 = null;

        EObject this_DisplayElement_1 = null;

        EObject this_InputElement_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:764:6: ( (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:765:1: (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:765:1: (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("765:1: (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:766:5: this_ActionElement_0= ruleActionElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getActionElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActionElement_in_ruleSingleElement1314);
                    this_ActionElement_0=ruleActionElement();
                    _fsp--;

                     
                            current = this_ActionElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:776:5: this_DisplayElement_1= ruleDisplayElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getDisplayElementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDisplayElement_in_ruleSingleElement1341);
                    this_DisplayElement_1=ruleDisplayElement();
                    _fsp--;

                     
                            current = this_DisplayElement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:786:5: this_InputElement_2= ruleInputElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getInputElementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInputElement_in_ruleSingleElement1368);
                    this_InputElement_2=ruleInputElement();
                    _fsp--;

                     
                            current = this_InputElement_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSingleElement


    // $ANTLR start entryRuleActionElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:802:1: entryRuleActionElement returns [EObject current=null] : iv_ruleActionElement= ruleActionElement EOF ;
    public final EObject entryRuleActionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:803:2: (iv_ruleActionElement= ruleActionElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:804:2: iv_ruleActionElement= ruleActionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleActionElement_in_entryRuleActionElement1403);
            iv_ruleActionElement=ruleActionElement();
            _fsp--;

             current =iv_ruleActionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionElement1413); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleActionElement


    // $ANTLR start ruleActionElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:811:1: ruleActionElement returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleActionElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:816:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:817:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:817:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:817:3: 'action' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleActionElement1448); 

                    createLeafNode(grammarAccess.getActionElementAccess().getActionKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:821:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:822:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:822:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:823:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionElement1465); 

            			createLeafNode(grammarAccess.getActionElementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleActionElement


    // $ANTLR start entryRuleDisplayElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:853:1: entryRuleDisplayElement returns [EObject current=null] : iv_ruleDisplayElement= ruleDisplayElement EOF ;
    public final EObject entryRuleDisplayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:854:2: (iv_ruleDisplayElement= ruleDisplayElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:855:2: iv_ruleDisplayElement= ruleDisplayElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDisplayElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement1506);
            iv_ruleDisplayElement=ruleDisplayElement();
            _fsp--;

             current =iv_ruleDisplayElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayElement1516); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDisplayElement


    // $ANTLR start ruleDisplayElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:862:1: ruleDisplayElement returns [EObject current=null] : ( 'show' ( ( RULE_ID ) ) ) ;
    public final EObject ruleDisplayElement() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:867:6: ( ( 'show' ( ( RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:868:1: ( 'show' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:868:1: ( 'show' ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:868:3: 'show' ( ( RULE_ID ) )
            {
            match(input,26,FOLLOW_26_in_ruleDisplayElement1551); 

                    createLeafNode(grammarAccess.getDisplayElementAccess().getShowKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:872:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:873:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:873:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:874:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDisplayElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisplayElement1569); 

            		createLeafNode(grammarAccess.getDisplayElementAccess().getReferenceFeatureCrossReference_1_0(), "reference"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDisplayElement


    // $ANTLR start entryRuleInputElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:894:1: entryRuleInputElement returns [EObject current=null] : iv_ruleInputElement= ruleInputElement EOF ;
    public final EObject entryRuleInputElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:895:2: (iv_ruleInputElement= ruleInputElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:896:2: iv_ruleInputElement= ruleInputElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputElement_in_entryRuleInputElement1605);
            iv_ruleInputElement=ruleInputElement();
            _fsp--;

             current =iv_ruleInputElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputElement1615); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInputElement


    // $ANTLR start ruleInputElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:903:1: ruleInputElement returns [EObject current=null] : ( 'input for' ( ( RULE_ID ) ) ) ;
    public final EObject ruleInputElement() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:908:6: ( ( 'input for' ( ( RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:909:1: ( 'input for' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:909:1: ( 'input for' ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:909:3: 'input for' ( ( RULE_ID ) )
            {
            match(input,27,FOLLOW_27_in_ruleInputElement1650); 

                    createLeafNode(grammarAccess.getInputElementAccess().getInputForKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:913:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:914:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:914:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:915:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInputElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputElement1668); 

            		createLeafNode(grammarAccess.getInputElementAccess().getReferenceFeatureCrossReference_1_0(), "reference"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInputElement


    // $ANTLR start entryRuleRepeatElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:935:1: entryRuleRepeatElement returns [EObject current=null] : iv_ruleRepeatElement= ruleRepeatElement EOF ;
    public final EObject entryRuleRepeatElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:936:2: (iv_ruleRepeatElement= ruleRepeatElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:937:2: iv_ruleRepeatElement= ruleRepeatElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRepeatElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleRepeatElement_in_entryRuleRepeatElement1704);
            iv_ruleRepeatElement=ruleRepeatElement();
            _fsp--;

             current =iv_ruleRepeatElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeatElement1714); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRepeatElement


    // $ANTLR start ruleRepeatElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:944:1: ruleRepeatElement returns [EObject current=null] : ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' ) ;
    public final EObject ruleRepeatElement() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:949:6: ( ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:950:1: ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:950:1: ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:950:3: 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}'
            {
            match(input,28,FOLLOW_28_in_ruleRepeatElement1749); 

                    createLeafNode(grammarAccess.getRepeatElementAccess().getRepeatForKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:954:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:955:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:955:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:956:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRepeatElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepeatElement1767); 

            		createLeafNode(grammarAccess.getRepeatElementAccess().getReferenceFeatureCrossReference_1_0(), "reference"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleRepeatElement1777); 

                    createLeafNode(grammarAccess.getRepeatElementAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:972:1: ( (lv_contents_3_0= ruleSingleElement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:973:1: (lv_contents_3_0= ruleSingleElement )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:973:1: (lv_contents_3_0= ruleSingleElement )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:974:3: lv_contents_3_0= ruleSingleElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRepeatElementAccess().getContentsSingleElementParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSingleElement_in_ruleRepeatElement1798);
            	    lv_contents_3_0=ruleSingleElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRepeatElementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_3_0, 
            	    	        		"SingleElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleRepeatElement1809); 

                    createLeafNode(grammarAccess.getRepeatElementAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRepeatElement


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDomainModel_in_ruleModel163 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleWebModel_in_ruleModel184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDomainModel274 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomainModel295 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDomainModel317 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEntity399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity416 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity431 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity452 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEntity463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature551 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeature566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature584 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleFeature604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFeature633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDataType733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebModel_in_entryRuleWebModel791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebModel801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleWebModel845 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rulePage_in_ruleWebModel866 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePage948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage965 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePage980 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePage990 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePage1000 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1017 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage1032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1050 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePage1060 = new BitSet(new long[]{0x000000001E008000L});
    public static final BitSet FOLLOW_rulePageElement_in_rulePage1081 = new BitSet(new long[]{0x000000001E008000L});
    public static final BitSet FOLLOW_15_in_rulePage1092 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageElement_in_entryRulePageElement1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageElement1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_rulePageElement1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatElement_in_rulePageElement1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_entryRuleSingleElement1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleElement1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionElement_in_ruleSingleElement1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_ruleSingleElement1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputElement_in_ruleSingleElement1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionElement_in_entryRuleActionElement1403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionElement1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleActionElement1448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionElement1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayElement1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDisplayElement1551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisplayElement1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputElement_in_entryRuleInputElement1605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputElement1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInputElement1650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputElement1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatElement_in_entryRuleRepeatElement1704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeatElement1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRepeatElement1749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepeatElement1767 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRepeatElement1777 = new BitSet(new long[]{0x000000000E008000L});
    public static final BitSet FOLLOW_ruleSingleElement_in_ruleRepeatElement1798 = new BitSet(new long[]{0x000000000E008000L});
    public static final BitSet FOLLOW_15_in_ruleRepeatElement1809 = new BitSet(new long[]{0x0000000000000002L});

}