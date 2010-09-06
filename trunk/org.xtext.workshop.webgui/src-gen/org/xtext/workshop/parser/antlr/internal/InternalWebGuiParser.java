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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'domain'", "'entity'", "':'", "'(s)'", "'type'", "'web'", "'page'", "'title'", "'='", "'content for'", "'action'", "'show'", "'input for'", "'repeat for'"
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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:86:1: ruleModel returns [EObject current=null] : ( 'model' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_domain_3_0= ruleDomainModel ) ) ( (lv_web_4_0= ruleWebModel ) ) '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_domain_3_0 = null;

        EObject lv_web_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:91:6: ( ( 'model' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_domain_3_0= ruleDomainModel ) ) ( (lv_web_4_0= ruleWebModel ) ) '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:92:1: ( 'model' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_domain_3_0= ruleDomainModel ) ) ( (lv_web_4_0= ruleWebModel ) ) '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:92:1: ( 'model' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_domain_3_0= ruleDomainModel ) ) ( (lv_web_4_0= ruleWebModel ) ) '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:92:3: 'model' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_domain_3_0= ruleDomainModel ) ) ( (lv_web_4_0= ruleWebModel ) ) '}'
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

            match(input,12,FOLLOW_12_in_ruleModel152); 

                    createLeafNode(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:124:1: ( (lv_domain_3_0= ruleDomainModel ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:125:1: (lv_domain_3_0= ruleDomainModel )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:125:1: (lv_domain_3_0= ruleDomainModel )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:126:3: lv_domain_3_0= ruleDomainModel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDomainDomainModelParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDomainModel_in_ruleModel173);
            lv_domain_3_0=ruleDomainModel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"domain",
            	        		lv_domain_3_0, 
            	        		"DomainModel", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:148:2: ( (lv_web_4_0= ruleWebModel ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:149:1: (lv_web_4_0= ruleWebModel )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:149:1: (lv_web_4_0= ruleWebModel )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:150:3: lv_web_4_0= ruleWebModel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getWebWebModelParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWebModel_in_ruleModel194);
            lv_web_4_0=ruleWebModel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"web",
            	        		lv_web_4_0, 
            	        		"WebModel", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleModel204); 

                    createLeafNode(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:184:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:185:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:186:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel240);
            iv_ruleDomainModel=ruleDomainModel();
            _fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel250); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:193:1: ruleDomainModel returns [EObject current=null] : ( 'domain' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_dataTypes_4_0= ruleDataType ) )* '}' ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_entities_3_0 = null;

        EObject lv_dataTypes_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:198:6: ( ( 'domain' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_dataTypes_4_0= ruleDataType ) )* '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:199:1: ( 'domain' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_dataTypes_4_0= ruleDataType ) )* '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:199:1: ( 'domain' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_dataTypes_4_0= ruleDataType ) )* '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:199:3: 'domain' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_dataTypes_4_0= ruleDataType ) )* '}'
            {
            match(input,14,FOLLOW_14_in_ruleDomainModel285); 

                    createLeafNode(grammarAccess.getDomainModelAccess().getDomainKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:203:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:204:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:204:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:205:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainModel302); 

            			createLeafNode(grammarAccess.getDomainModelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleDomainModel317); 

                    createLeafNode(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:231:1: ( (lv_entities_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:232:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:232:1: (lv_entities_3_0= ruleEntity )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:233:3: lv_entities_3_0= ruleEntity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomainModel338);
            	    lv_entities_3_0=ruleEntity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"entities",
            	    	        		lv_entities_3_0, 
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

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:255:3: ( (lv_dataTypes_4_0= ruleDataType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:256:1: (lv_dataTypes_4_0= ruleDataType )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:256:1: (lv_dataTypes_4_0= ruleDataType )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:257:3: lv_dataTypes_4_0= ruleDataType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getDataTypesDataTypeParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataType_in_ruleDomainModel360);
            	    lv_dataTypes_4_0=ruleDataType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"dataTypes",
            	    	        		lv_dataTypes_4_0, 
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

            match(input,13,FOLLOW_13_in_ruleDomainModel371); 

                    createLeafNode(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:291:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:292:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:293:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity407);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity417); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:300:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_features_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:305:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:306:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:306:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:306:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleEntity452); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:310:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:311:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:311:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:312:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity469); 

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

            match(input,12,FOLLOW_12_in_ruleEntity484); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:338:1: ( (lv_features_3_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:339:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:339:1: (lv_features_3_0= ruleFeature )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:340:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity505);
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

            match(input,13,FOLLOW_13_in_ruleEntity516); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:374:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:375:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:376:2: iv_ruleFeature= ruleFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature552);
            iv_ruleFeature=ruleFeature();
            _fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature562); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:383:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multivalued_3_0= '(s)' ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_multivalued_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:388:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multivalued_3_0= '(s)' ) )? ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:389:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multivalued_3_0= '(s)' ) )? )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:389:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multivalued_3_0= '(s)' ) )? )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:389:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multivalued_3_0= '(s)' ) )?
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:389:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:390:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:390:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:391:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature604); 

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

            match(input,16,FOLLOW_16_in_ruleFeature619); 

                    createLeafNode(grammarAccess.getFeatureAccess().getColonKeyword_1(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:417:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:418:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:418:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:419:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature637); 

            		createLeafNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0(), "type"); 
            	

            }


            }

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:431:2: ( (lv_multivalued_3_0= '(s)' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:432:1: (lv_multivalued_3_0= '(s)' )
                    {
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:432:1: (lv_multivalued_3_0= '(s)' )
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:433:3: lv_multivalued_3_0= '(s)'
                    {
                    lv_multivalued_3_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleFeature655); 

                            createLeafNode(grammarAccess.getFeatureAccess().getMultivaluedSKeyword_3_0(), "multivalued"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "multivalued", true, "(s)", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:462:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:463:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:464:2: iv_ruleDataType= ruleDataType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType707);
            iv_ruleDataType=ruleDataType();
            _fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType717); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:471:1: ruleDataType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:476:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:477:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:477:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:477:3: 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,18,FOLLOW_18_in_ruleDataType752); 

                    createLeafNode(grammarAccess.getDataTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:481:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:482:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:482:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:483:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType769); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:513:1: entryRuleWebModel returns [EObject current=null] : iv_ruleWebModel= ruleWebModel EOF ;
    public final EObject entryRuleWebModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebModel = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:514:2: (iv_ruleWebModel= ruleWebModel EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:515:2: iv_ruleWebModel= ruleWebModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWebModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleWebModel_in_entryRuleWebModel810);
            iv_ruleWebModel=ruleWebModel();
            _fsp--;

             current =iv_ruleWebModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebModel820); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:522:1: ruleWebModel returns [EObject current=null] : ( 'web' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_pages_3_0= rulePage ) )* '}' ) ;
    public final EObject ruleWebModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_pages_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:527:6: ( ( 'web' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_pages_3_0= rulePage ) )* '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:528:1: ( 'web' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_pages_3_0= rulePage ) )* '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:528:1: ( 'web' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_pages_3_0= rulePage ) )* '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:528:3: 'web' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_pages_3_0= rulePage ) )* '}'
            {
            match(input,19,FOLLOW_19_in_ruleWebModel855); 

                    createLeafNode(grammarAccess.getWebModelAccess().getWebKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:532:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:533:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:533:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:534:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWebModel872); 

            			createLeafNode(grammarAccess.getWebModelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWebModelRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleWebModel887); 

                    createLeafNode(grammarAccess.getWebModelAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:560:1: ( (lv_pages_3_0= rulePage ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:561:1: (lv_pages_3_0= rulePage )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:561:1: (lv_pages_3_0= rulePage )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:562:3: lv_pages_3_0= rulePage
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWebModelAccess().getPagesPageParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePage_in_ruleWebModel908);
            	    lv_pages_3_0=rulePage();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWebModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"pages",
            	    	        		lv_pages_3_0, 
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
            	    break loop5;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleWebModel919); 

                    createLeafNode(grammarAccess.getWebModelAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:596:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:597:2: (iv_rulePage= rulePage EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:598:2: iv_rulePage= rulePage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPageRule(), currentNode); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage955);
            iv_rulePage=rulePage();
            _fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage965); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:605:1: rulePage returns [EObject current=null] : ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_title_5_0=null;
        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:610:6: ( ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:611:1: ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:611:1: ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:611:3: 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'content for' ( ( RULE_ID ) ) '{' ( (lv_contents_9_0= rulePageElement ) )* '}' '}'
            {
            match(input,20,FOLLOW_20_in_rulePage1000); 

                    createLeafNode(grammarAccess.getPageAccess().getPageKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:615:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:616:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:616:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:617:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1017); 

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

            match(input,12,FOLLOW_12_in_rulePage1032); 

                    createLeafNode(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,21,FOLLOW_21_in_rulePage1042); 

                    createLeafNode(grammarAccess.getPageAccess().getTitleKeyword_3(), null); 
                
            match(input,22,FOLLOW_22_in_rulePage1052); 

                    createLeafNode(grammarAccess.getPageAccess().getEqualsSignKeyword_4(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:651:1: ( (lv_title_5_0= RULE_STRING ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:652:1: (lv_title_5_0= RULE_STRING )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:652:1: (lv_title_5_0= RULE_STRING )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:653:3: lv_title_5_0= RULE_STRING
            {
            lv_title_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1069); 

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

            match(input,23,FOLLOW_23_in_rulePage1084); 

                    createLeafNode(grammarAccess.getPageAccess().getContentForKeyword_6(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:679:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:680:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:680:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:681:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1102); 

            		createLeafNode(grammarAccess.getPageAccess().getEntityEntityCrossReference_7_0(), "entity"); 
            	

            }


            }

            match(input,12,FOLLOW_12_in_rulePage1112); 

                    createLeafNode(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_8(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:697:1: ( (lv_contents_9_0= rulePageElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=24 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:698:1: (lv_contents_9_0= rulePageElement )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:698:1: (lv_contents_9_0= rulePageElement )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:699:3: lv_contents_9_0= rulePageElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPageAccess().getContentsPageElementParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePageElement_in_rulePage1133);
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
            	    break loop6;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_rulePage1144); 

                    createLeafNode(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10(), null); 
                
            match(input,13,FOLLOW_13_in_rulePage1154); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:737:1: entryRulePageElement returns [EObject current=null] : iv_rulePageElement= rulePageElement EOF ;
    public final EObject entryRulePageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:738:2: (iv_rulePageElement= rulePageElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:739:2: iv_rulePageElement= rulePageElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPageElementRule(), currentNode); 
            pushFollow(FOLLOW_rulePageElement_in_entryRulePageElement1190);
            iv_rulePageElement=rulePageElement();
            _fsp--;

             current =iv_rulePageElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageElement1200); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:746:1: rulePageElement returns [EObject current=null] : (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement ) ;
    public final EObject rulePageElement() throws RecognitionException {
        EObject current = null;

        EObject this_SingleElement_0 = null;

        EObject this_RepeatElement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:751:6: ( (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:752:1: (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:752:1: (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=24 && LA7_0<=26)) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("752:1: (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:753:5: this_SingleElement_0= ruleSingleElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPageElementAccess().getSingleElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSingleElement_in_rulePageElement1247);
                    this_SingleElement_0=ruleSingleElement();
                    _fsp--;

                     
                            current = this_SingleElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:763:5: this_RepeatElement_1= ruleRepeatElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPageElementAccess().getRepeatElementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRepeatElement_in_rulePageElement1274);
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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:779:1: entryRuleSingleElement returns [EObject current=null] : iv_ruleSingleElement= ruleSingleElement EOF ;
    public final EObject entryRuleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:780:2: (iv_ruleSingleElement= ruleSingleElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:781:2: iv_ruleSingleElement= ruleSingleElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleElement_in_entryRuleSingleElement1309);
            iv_ruleSingleElement=ruleSingleElement();
            _fsp--;

             current =iv_ruleSingleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleElement1319); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:788:1: ruleSingleElement returns [EObject current=null] : (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement ) ;
    public final EObject ruleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ActionElement_0 = null;

        EObject this_DisplayElement_1 = null;

        EObject this_InputElement_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:793:6: ( (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:794:1: (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:794:1: (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("794:1: (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement | this_InputElement_2= ruleInputElement )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:795:5: this_ActionElement_0= ruleActionElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getActionElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActionElement_in_ruleSingleElement1366);
                    this_ActionElement_0=ruleActionElement();
                    _fsp--;

                     
                            current = this_ActionElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:805:5: this_DisplayElement_1= ruleDisplayElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getDisplayElementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDisplayElement_in_ruleSingleElement1393);
                    this_DisplayElement_1=ruleDisplayElement();
                    _fsp--;

                     
                            current = this_DisplayElement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:815:5: this_InputElement_2= ruleInputElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getInputElementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInputElement_in_ruleSingleElement1420);
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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:831:1: entryRuleActionElement returns [EObject current=null] : iv_ruleActionElement= ruleActionElement EOF ;
    public final EObject entryRuleActionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:832:2: (iv_ruleActionElement= ruleActionElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:833:2: iv_ruleActionElement= ruleActionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleActionElement_in_entryRuleActionElement1455);
            iv_ruleActionElement=ruleActionElement();
            _fsp--;

             current =iv_ruleActionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionElement1465); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:840:1: ruleActionElement returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleActionElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:845:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:846:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:846:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:846:3: 'action' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,24,FOLLOW_24_in_ruleActionElement1500); 

                    createLeafNode(grammarAccess.getActionElementAccess().getActionKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:850:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:851:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:851:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:852:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionElement1517); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:882:1: entryRuleDisplayElement returns [EObject current=null] : iv_ruleDisplayElement= ruleDisplayElement EOF ;
    public final EObject entryRuleDisplayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:883:2: (iv_ruleDisplayElement= ruleDisplayElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:884:2: iv_ruleDisplayElement= ruleDisplayElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDisplayElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement1558);
            iv_ruleDisplayElement=ruleDisplayElement();
            _fsp--;

             current =iv_ruleDisplayElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayElement1568); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:891:1: ruleDisplayElement returns [EObject current=null] : ( 'show' ( ( RULE_ID ) ) ) ;
    public final EObject ruleDisplayElement() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:896:6: ( ( 'show' ( ( RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:897:1: ( 'show' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:897:1: ( 'show' ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:897:3: 'show' ( ( RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleDisplayElement1603); 

                    createLeafNode(grammarAccess.getDisplayElementAccess().getShowKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:901:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:902:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:902:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:903:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDisplayElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisplayElement1621); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:923:1: entryRuleInputElement returns [EObject current=null] : iv_ruleInputElement= ruleInputElement EOF ;
    public final EObject entryRuleInputElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:924:2: (iv_ruleInputElement= ruleInputElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:925:2: iv_ruleInputElement= ruleInputElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputElement_in_entryRuleInputElement1657);
            iv_ruleInputElement=ruleInputElement();
            _fsp--;

             current =iv_ruleInputElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputElement1667); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:932:1: ruleInputElement returns [EObject current=null] : ( 'input for' ( ( RULE_ID ) ) ) ;
    public final EObject ruleInputElement() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:937:6: ( ( 'input for' ( ( RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:938:1: ( 'input for' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:938:1: ( 'input for' ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:938:3: 'input for' ( ( RULE_ID ) )
            {
            match(input,26,FOLLOW_26_in_ruleInputElement1702); 

                    createLeafNode(grammarAccess.getInputElementAccess().getInputForKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:942:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:943:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:943:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:944:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInputElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputElement1720); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:964:1: entryRuleRepeatElement returns [EObject current=null] : iv_ruleRepeatElement= ruleRepeatElement EOF ;
    public final EObject entryRuleRepeatElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:965:2: (iv_ruleRepeatElement= ruleRepeatElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:966:2: iv_ruleRepeatElement= ruleRepeatElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRepeatElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleRepeatElement_in_entryRuleRepeatElement1756);
            iv_ruleRepeatElement=ruleRepeatElement();
            _fsp--;

             current =iv_ruleRepeatElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeatElement1766); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:973:1: ruleRepeatElement returns [EObject current=null] : ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' ) ;
    public final EObject ruleRepeatElement() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:978:6: ( ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:979:1: ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:979:1: ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:979:3: 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}'
            {
            match(input,27,FOLLOW_27_in_ruleRepeatElement1801); 

                    createLeafNode(grammarAccess.getRepeatElementAccess().getRepeatForKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:983:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:984:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:984:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:985:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRepeatElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepeatElement1819); 

            		createLeafNode(grammarAccess.getRepeatElementAccess().getReferenceFeatureCrossReference_1_0(), "reference"); 
            	

            }


            }

            match(input,12,FOLLOW_12_in_ruleRepeatElement1829); 

                    createLeafNode(grammarAccess.getRepeatElementAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1001:1: ( (lv_contents_3_0= ruleSingleElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=24 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1002:1: (lv_contents_3_0= ruleSingleElement )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1002:1: (lv_contents_3_0= ruleSingleElement )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:1003:3: lv_contents_3_0= ruleSingleElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRepeatElementAccess().getContentsSingleElementParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSingleElement_in_ruleRepeatElement1850);
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
            	    break loop9;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleRepeatElement1861); 

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
    public static final BitSet FOLLOW_12_in_ruleModel152 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDomainModel_in_ruleModel173 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleWebModel_in_ruleModel194 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDomainModel285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainModel302 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainModel317 = new BitSet(new long[]{0x000000000004A000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomainModel338 = new BitSet(new long[]{0x000000000004A000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDomainModel360 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleDomainModel371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEntity452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity469 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity484 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity505 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleEntity516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature604 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeature619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature637 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleFeature655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDataType752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebModel_in_entryRuleWebModel810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebModel820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWebModel855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWebModel872 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWebModel887 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_rulePage_in_ruleWebModel908 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleWebModel919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePage1000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1017 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePage1032 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePage1042 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePage1052 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1069 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePage1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1102 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePage1112 = new BitSet(new long[]{0x000000000F002000L});
    public static final BitSet FOLLOW_rulePageElement_in_rulePage1133 = new BitSet(new long[]{0x000000000F002000L});
    public static final BitSet FOLLOW_13_in_rulePage1144 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageElement_in_entryRulePageElement1190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageElement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_rulePageElement1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatElement_in_rulePageElement1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_entryRuleSingleElement1309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleElement1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionElement_in_ruleSingleElement1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_ruleSingleElement1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputElement_in_ruleSingleElement1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionElement_in_entryRuleActionElement1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionElement1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleActionElement1500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionElement1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement1558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayElement1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDisplayElement1603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisplayElement1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputElement_in_entryRuleInputElement1657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputElement1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInputElement1702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputElement1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatElement_in_entryRuleRepeatElement1756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeatElement1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRepeatElement1801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepeatElement1819 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRepeatElement1829 = new BitSet(new long[]{0x0000000007002000L});
    public static final BitSet FOLLOW_ruleSingleElement_in_ruleRepeatElement1850 = new BitSet(new long[]{0x0000000007002000L});
    public static final BitSet FOLLOW_13_in_ruleRepeatElement1861 = new BitSet(new long[]{0x0000000000000002L});

}