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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'domain:'", "'entity'", "'{'", "'}'", "':'", "'(s)'", "'(es)'", "'type'", "'web:'", "'page'", "'title'", "'='", "'context'", "'action'", "'show'", "'repeat for'"
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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:185:1: ruleDomainModel returns [EObject current=null] : ( 'domain:' ( (lv_types_1_0= ruleType ) )+ ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:190:6: ( ( 'domain:' ( (lv_types_1_0= ruleType ) )+ ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:191:1: ( 'domain:' ( (lv_types_1_0= ruleType ) )+ )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:191:1: ( 'domain:' ( (lv_types_1_0= ruleType ) )+ )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:191:3: 'domain:' ( (lv_types_1_0= ruleType ) )+
            {
            match(input,12,FOLLOW_12_in_ruleDomainModel265); 

                    createLeafNode(grammarAccess.getDomainModelAccess().getDomainKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:195:1: ( (lv_types_1_0= ruleType ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:196:1: (lv_types_1_0= ruleType )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:196:1: (lv_types_1_0= ruleType )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:197:3: lv_types_1_0= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getTypesTypeParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleDomainModel286);
            	    lv_types_1_0=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"types",
            	    	        		lv_types_1_0, 
            	    	        		"Type", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:227:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:228:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:229:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity323);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity333); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:236:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_features_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:241:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:242:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:242:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:242:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}'
            {
            match(input,13,FOLLOW_13_in_ruleEntity368); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:246:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:247:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:247:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:248:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity385); 

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

            match(input,14,FOLLOW_14_in_ruleEntity400); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:274:1: ( (lv_features_3_0= ruleFeature ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:275:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:275:1: (lv_features_3_0= ruleFeature )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:276:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity421);
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
            	    break loop2;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleEntity432); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:310:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:311:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:312:2: iv_ruleFeature= ruleFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature468);
            iv_ruleFeature=ruleFeature();
            _fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature478); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:319:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_multivalued_3_1=null;
        Token lv_multivalued_3_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:324:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )? ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:325:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )? )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:325:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )? )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:325:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )?
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:325:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:326:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:326:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:327:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature520); 

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

            match(input,16,FOLLOW_16_in_ruleFeature535); 

                    createLeafNode(grammarAccess.getFeatureAccess().getColonKeyword_1(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:353:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:354:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:354:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:355:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature553); 

            		createLeafNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0(), "type"); 
            	

            }


            }

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:367:2: ( ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=17 && LA4_0<=18)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:368:1: ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) )
                    {
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:368:1: ( (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' ) )
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:369:1: (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' )
                    {
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:369:1: (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==17) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==18) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("369:1: (lv_multivalued_3_1= '(s)' | lv_multivalued_3_2= '(es)' )", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:370:3: lv_multivalued_3_1= '(s)'
                            {
                            lv_multivalued_3_1=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleFeature573); 

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
                            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:388:8: lv_multivalued_3_2= '(es)'
                            {
                            lv_multivalued_3_2=(Token)input.LT(1);
                            match(input,18,FOLLOW_18_in_ruleFeature602); 

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


    // $ANTLR start entryRuleType
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:417:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:418:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:419:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType655);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType665); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:426:1: ruleType returns [EObject current=null] : (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_DataType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:431:6: ( (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:432:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:432:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("432:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:433:5: this_Entity_0= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType712);
                    this_Entity_0=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:443:5: this_DataType_1= ruleDataType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType739);
                    this_DataType_1=ruleDataType();
                    _fsp--;

                     
                            current = this_DataType_1; 
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
    // $ANTLR end ruleType


    // $ANTLR start entryRuleDataType
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:459:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:460:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:461:2: iv_ruleDataType= ruleDataType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType774);
            iv_ruleDataType=ruleDataType();
            _fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType784); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:468:1: ruleDataType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:473:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:474:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:474:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:474:3: 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,19,FOLLOW_19_in_ruleDataType819); 

                    createLeafNode(grammarAccess.getDataTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:478:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:479:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:479:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:480:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType836); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:510:1: entryRuleWebModel returns [EObject current=null] : iv_ruleWebModel= ruleWebModel EOF ;
    public final EObject entryRuleWebModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebModel = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:511:2: (iv_ruleWebModel= ruleWebModel EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:512:2: iv_ruleWebModel= ruleWebModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWebModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleWebModel_in_entryRuleWebModel877);
            iv_ruleWebModel=ruleWebModel();
            _fsp--;

             current =iv_ruleWebModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebModel887); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:519:1: ruleWebModel returns [EObject current=null] : ( 'web:' ( (lv_pages_1_0= rulePage ) )+ ) ;
    public final EObject ruleWebModel() throws RecognitionException {
        EObject current = null;

        EObject lv_pages_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:524:6: ( ( 'web:' ( (lv_pages_1_0= rulePage ) )+ ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:525:1: ( 'web:' ( (lv_pages_1_0= rulePage ) )+ )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:525:1: ( 'web:' ( (lv_pages_1_0= rulePage ) )+ )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:525:3: 'web:' ( (lv_pages_1_0= rulePage ) )+
            {
            match(input,20,FOLLOW_20_in_ruleWebModel922); 

                    createLeafNode(grammarAccess.getWebModelAccess().getWebKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:529:1: ( (lv_pages_1_0= rulePage ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:530:1: (lv_pages_1_0= rulePage )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:530:1: (lv_pages_1_0= rulePage )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:531:3: lv_pages_1_0= rulePage
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWebModelAccess().getPagesPageParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePage_in_ruleWebModel943);
            	    lv_pages_1_0=rulePage();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWebModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"pages",
            	    	        		lv_pages_1_0, 
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:561:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:562:2: (iv_rulePage= rulePage EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:563:2: iv_rulePage= rulePage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPageRule(), currentNode); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage980);
            iv_rulePage=rulePage();
            _fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage990); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:570:1: rulePage returns [EObject current=null] : ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'context' '=' ( ( RULE_ID ) ) ( (lv_contents_9_0= rulePageElement ) )* '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_title_5_0=null;
        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:575:6: ( ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'context' '=' ( ( RULE_ID ) ) ( (lv_contents_9_0= rulePageElement ) )* '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:576:1: ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'context' '=' ( ( RULE_ID ) ) ( (lv_contents_9_0= rulePageElement ) )* '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:576:1: ( 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'context' '=' ( ( RULE_ID ) ) ( (lv_contents_9_0= rulePageElement ) )* '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:576:3: 'page' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= RULE_STRING ) ) 'context' '=' ( ( RULE_ID ) ) ( (lv_contents_9_0= rulePageElement ) )* '}'
            {
            match(input,21,FOLLOW_21_in_rulePage1025); 

                    createLeafNode(grammarAccess.getPageAccess().getPageKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:580:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:581:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:581:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:582:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1042); 

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

            match(input,14,FOLLOW_14_in_rulePage1057); 

                    createLeafNode(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,22,FOLLOW_22_in_rulePage1067); 

                    createLeafNode(grammarAccess.getPageAccess().getTitleKeyword_3(), null); 
                
            match(input,23,FOLLOW_23_in_rulePage1077); 

                    createLeafNode(grammarAccess.getPageAccess().getEqualsSignKeyword_4(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:616:1: ( (lv_title_5_0= RULE_STRING ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:617:1: (lv_title_5_0= RULE_STRING )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:617:1: (lv_title_5_0= RULE_STRING )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:618:3: lv_title_5_0= RULE_STRING
            {
            lv_title_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1094); 

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

            match(input,24,FOLLOW_24_in_rulePage1109); 

                    createLeafNode(grammarAccess.getPageAccess().getContextKeyword_6(), null); 
                
            match(input,23,FOLLOW_23_in_rulePage1119); 

                    createLeafNode(grammarAccess.getPageAccess().getEqualsSignKeyword_7(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:648:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:649:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:649:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:650:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1137); 

            		createLeafNode(grammarAccess.getPageAccess().getEntityEntityCrossReference_8_0(), "entity"); 
            	

            }


            }

            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:662:2: ( (lv_contents_9_0= rulePageElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=25 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:663:1: (lv_contents_9_0= rulePageElement )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:663:1: (lv_contents_9_0= rulePageElement )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:664:3: lv_contents_9_0= rulePageElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPageAccess().getContentsPageElementParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePageElement_in_rulePage1158);
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

            match(input,15,FOLLOW_15_in_rulePage1169); 

                    createLeafNode(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10(), null); 
                

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:698:1: entryRulePageElement returns [EObject current=null] : iv_rulePageElement= rulePageElement EOF ;
    public final EObject entryRulePageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:699:2: (iv_rulePageElement= rulePageElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:700:2: iv_rulePageElement= rulePageElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPageElementRule(), currentNode); 
            pushFollow(FOLLOW_rulePageElement_in_entryRulePageElement1205);
            iv_rulePageElement=rulePageElement();
            _fsp--;

             current =iv_rulePageElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageElement1215); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:707:1: rulePageElement returns [EObject current=null] : (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement ) ;
    public final EObject rulePageElement() throws RecognitionException {
        EObject current = null;

        EObject this_SingleElement_0 = null;

        EObject this_RepeatElement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:712:6: ( (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:713:1: (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:713:1: (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=25 && LA8_0<=26)) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("713:1: (this_SingleElement_0= ruleSingleElement | this_RepeatElement_1= ruleRepeatElement )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:714:5: this_SingleElement_0= ruleSingleElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPageElementAccess().getSingleElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSingleElement_in_rulePageElement1262);
                    this_SingleElement_0=ruleSingleElement();
                    _fsp--;

                     
                            current = this_SingleElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:724:5: this_RepeatElement_1= ruleRepeatElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPageElementAccess().getRepeatElementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRepeatElement_in_rulePageElement1289);
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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:740:1: entryRuleSingleElement returns [EObject current=null] : iv_ruleSingleElement= ruleSingleElement EOF ;
    public final EObject entryRuleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:741:2: (iv_ruleSingleElement= ruleSingleElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:742:2: iv_ruleSingleElement= ruleSingleElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleElement_in_entryRuleSingleElement1324);
            iv_ruleSingleElement=ruleSingleElement();
            _fsp--;

             current =iv_ruleSingleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleElement1334); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:749:1: ruleSingleElement returns [EObject current=null] : (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement ) ;
    public final EObject ruleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ActionElement_0 = null;

        EObject this_DisplayElement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:754:6: ( (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:755:1: (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:755:1: (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("755:1: (this_ActionElement_0= ruleActionElement | this_DisplayElement_1= ruleDisplayElement )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:756:5: this_ActionElement_0= ruleActionElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getActionElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActionElement_in_ruleSingleElement1381);
                    this_ActionElement_0=ruleActionElement();
                    _fsp--;

                     
                            current = this_ActionElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:766:5: this_DisplayElement_1= ruleDisplayElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSingleElementAccess().getDisplayElementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDisplayElement_in_ruleSingleElement1408);
                    this_DisplayElement_1=ruleDisplayElement();
                    _fsp--;

                     
                            current = this_DisplayElement_1; 
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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:782:1: entryRuleActionElement returns [EObject current=null] : iv_ruleActionElement= ruleActionElement EOF ;
    public final EObject entryRuleActionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:783:2: (iv_ruleActionElement= ruleActionElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:784:2: iv_ruleActionElement= ruleActionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleActionElement_in_entryRuleActionElement1443);
            iv_ruleActionElement=ruleActionElement();
            _fsp--;

             current =iv_ruleActionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionElement1453); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:791:1: ruleActionElement returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleActionElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:796:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:797:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:797:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:797:3: 'action' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleActionElement1488); 

                    createLeafNode(grammarAccess.getActionElementAccess().getActionKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:801:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:802:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:802:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:803:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionElement1505); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:833:1: entryRuleDisplayElement returns [EObject current=null] : iv_ruleDisplayElement= ruleDisplayElement EOF ;
    public final EObject entryRuleDisplayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:834:2: (iv_ruleDisplayElement= ruleDisplayElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:835:2: iv_ruleDisplayElement= ruleDisplayElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDisplayElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement1546);
            iv_ruleDisplayElement=ruleDisplayElement();
            _fsp--;

             current =iv_ruleDisplayElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayElement1556); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:842:1: ruleDisplayElement returns [EObject current=null] : ( 'show' ( ( RULE_ID ) ) ) ;
    public final EObject ruleDisplayElement() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:847:6: ( ( 'show' ( ( RULE_ID ) ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:848:1: ( 'show' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:848:1: ( 'show' ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:848:3: 'show' ( ( RULE_ID ) )
            {
            match(input,26,FOLLOW_26_in_ruleDisplayElement1591); 

                    createLeafNode(grammarAccess.getDisplayElementAccess().getShowKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:852:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:853:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:853:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:854:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDisplayElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisplayElement1609); 

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


    // $ANTLR start entryRuleRepeatElement
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:874:1: entryRuleRepeatElement returns [EObject current=null] : iv_ruleRepeatElement= ruleRepeatElement EOF ;
    public final EObject entryRuleRepeatElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatElement = null;


        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:875:2: (iv_ruleRepeatElement= ruleRepeatElement EOF )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:876:2: iv_ruleRepeatElement= ruleRepeatElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRepeatElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleRepeatElement_in_entryRuleRepeatElement1645);
            iv_ruleRepeatElement=ruleRepeatElement();
            _fsp--;

             current =iv_ruleRepeatElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeatElement1655); 

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
    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:883:1: ruleRepeatElement returns [EObject current=null] : ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' ) ;
    public final EObject ruleRepeatElement() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:888:6: ( ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:889:1: ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:889:1: ( 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}' )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:889:3: 'repeat for' ( ( RULE_ID ) ) '{' ( (lv_contents_3_0= ruleSingleElement ) )* '}'
            {
            match(input,27,FOLLOW_27_in_ruleRepeatElement1690); 

                    createLeafNode(grammarAccess.getRepeatElementAccess().getRepeatForKeyword_0(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:893:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:894:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:894:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:895:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRepeatElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepeatElement1708); 

            		createLeafNode(grammarAccess.getRepeatElementAccess().getReferenceFeatureCrossReference_1_0(), "reference"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleRepeatElement1718); 

                    createLeafNode(grammarAccess.getRepeatElementAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:911:1: ( (lv_contents_3_0= ruleSingleElement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:912:1: (lv_contents_3_0= ruleSingleElement )
            	    {
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:912:1: (lv_contents_3_0= ruleSingleElement )
            	    // ../org.xtext.workshop.webgui/src-gen/org/xtext/workshop/parser/antlr/internal/InternalWebGui.g:913:3: lv_contents_3_0= ruleSingleElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRepeatElementAccess().getContentsSingleElementParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSingleElement_in_ruleRepeatElement1739);
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

            match(input,15,FOLLOW_15_in_ruleRepeatElement1750); 

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
    public static final BitSet FOLLOW_12_in_ruleDomainModel265 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_ruleType_in_ruleDomainModel286 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEntity368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity385 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity400 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity421 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEntity432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature520 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeature535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature553 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleFeature573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFeature602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDataType819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebModel_in_entryRuleWebModel877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebModel887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleWebModel922 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rulePage_in_ruleWebModel943 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePage1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1042 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePage1057 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePage1067 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePage1077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1094 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage1109 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePage1119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1137 = new BitSet(new long[]{0x000000000E008000L});
    public static final BitSet FOLLOW_rulePageElement_in_rulePage1158 = new BitSet(new long[]{0x000000000E008000L});
    public static final BitSet FOLLOW_15_in_rulePage1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageElement_in_entryRulePageElement1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageElement1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_rulePageElement1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatElement_in_rulePageElement1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_entryRuleSingleElement1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleElement1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionElement_in_ruleSingleElement1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_ruleSingleElement1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionElement_in_entryRuleActionElement1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionElement1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleActionElement1488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionElement1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayElement1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDisplayElement1591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisplayElement1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatElement_in_entryRuleRepeatElement1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeatElement1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRepeatElement1690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepeatElement1708 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRepeatElement1718 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_ruleSingleElement_in_ruleRepeatElement1739 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_15_in_ruleRepeatElement1750 = new BitSet(new long[]{0x0000000000000002L});

}