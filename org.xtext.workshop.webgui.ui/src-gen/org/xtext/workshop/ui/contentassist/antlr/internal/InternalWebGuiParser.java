package org.xtext.workshop.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.workshop.services.WebGuiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebGuiParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'(s)'", "'(es)'", "'model'", "'domain:'", "'entity'", "'{'", "'}'", "':'", "'type'", "'web:'", "'page'", "'title'", "'='", "'content for'", "'action'", "'show'", "'repeat for'"
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
    public String getGrammarFileName() { return "../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g"; }


     
     	private WebGuiGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WebGuiGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleModel
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:62:1: ( ruleModel EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:77:1: ( rule__Model__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleDomainModel
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:89:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:90:1: ( ruleDomainModel EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:91:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel121);
            ruleDomainModel();
            _fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDomainModel


    // $ANTLR start ruleDomainModel
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:98:1: ruleDomainModel : ( ( rule__DomainModel__Group__0 ) ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:102:2: ( ( ( rule__DomainModel__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:103:1: ( ( rule__DomainModel__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:103:1: ( ( rule__DomainModel__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:104:1: ( rule__DomainModel__Group__0 )
            {
             before(grammarAccess.getDomainModelAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:105:1: ( rule__DomainModel__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:105:2: rule__DomainModel__Group__0
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__0_in_ruleDomainModel154);
            rule__DomainModel__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDomainModel


    // $ANTLR start entryRuleEntity
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:117:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:118:1: ( ruleEntity EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:119:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity181);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:126:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:130:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:131:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:131:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:132:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:133:1: ( rule__Entity__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:133:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity214);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:145:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:146:1: ( ruleFeature EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:147:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature241);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:154:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:158:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:159:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:159:1: ( ( rule__Feature__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:160:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:161:1: ( rule__Feature__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:161:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature274);
            rule__Feature__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFeature


    // $ANTLR start entryRuleType
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:173:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:174:1: ( ruleType EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:175:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType301);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:182:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:186:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:187:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:187:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:188:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:189:1: ( rule__Type__Alternatives )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:189:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType334);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleDataType
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:201:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:202:1: ( ruleDataType EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:203:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType361);
            ruleDataType();
            _fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDataType


    // $ANTLR start ruleDataType
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:210:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:214:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:215:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:215:1: ( ( rule__DataType__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:216:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:217:1: ( rule__DataType__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:217:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType394);
            rule__DataType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDataType


    // $ANTLR start entryRuleWebModel
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:229:1: entryRuleWebModel : ruleWebModel EOF ;
    public final void entryRuleWebModel() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:230:1: ( ruleWebModel EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:231:1: ruleWebModel EOF
            {
             before(grammarAccess.getWebModelRule()); 
            pushFollow(FOLLOW_ruleWebModel_in_entryRuleWebModel421);
            ruleWebModel();
            _fsp--;

             after(grammarAccess.getWebModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebModel428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleWebModel


    // $ANTLR start ruleWebModel
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:238:1: ruleWebModel : ( ( rule__WebModel__Group__0 ) ) ;
    public final void ruleWebModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:242:2: ( ( ( rule__WebModel__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:243:1: ( ( rule__WebModel__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:243:1: ( ( rule__WebModel__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:244:1: ( rule__WebModel__Group__0 )
            {
             before(grammarAccess.getWebModelAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:245:1: ( rule__WebModel__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:245:2: rule__WebModel__Group__0
            {
            pushFollow(FOLLOW_rule__WebModel__Group__0_in_ruleWebModel454);
            rule__WebModel__Group__0();
            _fsp--;


            }

             after(grammarAccess.getWebModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleWebModel


    // $ANTLR start entryRulePage
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:257:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:258:1: ( rulePage EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:259:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage481);
            rulePage();
            _fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePage


    // $ANTLR start rulePage
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:266:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:270:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:271:1: ( ( rule__Page__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:271:1: ( ( rule__Page__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:272:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:273:1: ( rule__Page__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:273:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage514);
            rule__Page__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePage


    // $ANTLR start entryRulePageElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:285:1: entryRulePageElement : rulePageElement EOF ;
    public final void entryRulePageElement() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:286:1: ( rulePageElement EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:287:1: rulePageElement EOF
            {
             before(grammarAccess.getPageElementRule()); 
            pushFollow(FOLLOW_rulePageElement_in_entryRulePageElement541);
            rulePageElement();
            _fsp--;

             after(grammarAccess.getPageElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageElement548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePageElement


    // $ANTLR start rulePageElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:294:1: rulePageElement : ( ( rule__PageElement__Alternatives ) ) ;
    public final void rulePageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:298:2: ( ( ( rule__PageElement__Alternatives ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:299:1: ( ( rule__PageElement__Alternatives ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:299:1: ( ( rule__PageElement__Alternatives ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:300:1: ( rule__PageElement__Alternatives )
            {
             before(grammarAccess.getPageElementAccess().getAlternatives()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:301:1: ( rule__PageElement__Alternatives )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:301:2: rule__PageElement__Alternatives
            {
            pushFollow(FOLLOW_rule__PageElement__Alternatives_in_rulePageElement574);
            rule__PageElement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPageElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePageElement


    // $ANTLR start entryRuleSingleElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:313:1: entryRuleSingleElement : ruleSingleElement EOF ;
    public final void entryRuleSingleElement() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:314:1: ( ruleSingleElement EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:315:1: ruleSingleElement EOF
            {
             before(grammarAccess.getSingleElementRule()); 
            pushFollow(FOLLOW_ruleSingleElement_in_entryRuleSingleElement601);
            ruleSingleElement();
            _fsp--;

             after(grammarAccess.getSingleElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleElement608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSingleElement


    // $ANTLR start ruleSingleElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:322:1: ruleSingleElement : ( ( rule__SingleElement__Alternatives ) ) ;
    public final void ruleSingleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:326:2: ( ( ( rule__SingleElement__Alternatives ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:327:1: ( ( rule__SingleElement__Alternatives ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:327:1: ( ( rule__SingleElement__Alternatives ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:328:1: ( rule__SingleElement__Alternatives )
            {
             before(grammarAccess.getSingleElementAccess().getAlternatives()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:329:1: ( rule__SingleElement__Alternatives )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:329:2: rule__SingleElement__Alternatives
            {
            pushFollow(FOLLOW_rule__SingleElement__Alternatives_in_ruleSingleElement634);
            rule__SingleElement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSingleElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSingleElement


    // $ANTLR start entryRuleActionElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:341:1: entryRuleActionElement : ruleActionElement EOF ;
    public final void entryRuleActionElement() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:342:1: ( ruleActionElement EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:343:1: ruleActionElement EOF
            {
             before(grammarAccess.getActionElementRule()); 
            pushFollow(FOLLOW_ruleActionElement_in_entryRuleActionElement661);
            ruleActionElement();
            _fsp--;

             after(grammarAccess.getActionElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionElement668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleActionElement


    // $ANTLR start ruleActionElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:350:1: ruleActionElement : ( ( rule__ActionElement__Group__0 ) ) ;
    public final void ruleActionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:354:2: ( ( ( rule__ActionElement__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:355:1: ( ( rule__ActionElement__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:355:1: ( ( rule__ActionElement__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:356:1: ( rule__ActionElement__Group__0 )
            {
             before(grammarAccess.getActionElementAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:357:1: ( rule__ActionElement__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:357:2: rule__ActionElement__Group__0
            {
            pushFollow(FOLLOW_rule__ActionElement__Group__0_in_ruleActionElement694);
            rule__ActionElement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActionElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleActionElement


    // $ANTLR start entryRuleDisplayElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:369:1: entryRuleDisplayElement : ruleDisplayElement EOF ;
    public final void entryRuleDisplayElement() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:370:1: ( ruleDisplayElement EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:371:1: ruleDisplayElement EOF
            {
             before(grammarAccess.getDisplayElementRule()); 
            pushFollow(FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement721);
            ruleDisplayElement();
            _fsp--;

             after(grammarAccess.getDisplayElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayElement728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDisplayElement


    // $ANTLR start ruleDisplayElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:378:1: ruleDisplayElement : ( ( rule__DisplayElement__Group__0 ) ) ;
    public final void ruleDisplayElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:382:2: ( ( ( rule__DisplayElement__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:383:1: ( ( rule__DisplayElement__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:383:1: ( ( rule__DisplayElement__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:384:1: ( rule__DisplayElement__Group__0 )
            {
             before(grammarAccess.getDisplayElementAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:385:1: ( rule__DisplayElement__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:385:2: rule__DisplayElement__Group__0
            {
            pushFollow(FOLLOW_rule__DisplayElement__Group__0_in_ruleDisplayElement754);
            rule__DisplayElement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDisplayElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDisplayElement


    // $ANTLR start entryRuleRepeatElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:397:1: entryRuleRepeatElement : ruleRepeatElement EOF ;
    public final void entryRuleRepeatElement() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:398:1: ( ruleRepeatElement EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:399:1: ruleRepeatElement EOF
            {
             before(grammarAccess.getRepeatElementRule()); 
            pushFollow(FOLLOW_ruleRepeatElement_in_entryRuleRepeatElement781);
            ruleRepeatElement();
            _fsp--;

             after(grammarAccess.getRepeatElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeatElement788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRepeatElement


    // $ANTLR start ruleRepeatElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:406:1: ruleRepeatElement : ( ( rule__RepeatElement__Group__0 ) ) ;
    public final void ruleRepeatElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:410:2: ( ( ( rule__RepeatElement__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:411:1: ( ( rule__RepeatElement__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:411:1: ( ( rule__RepeatElement__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:412:1: ( rule__RepeatElement__Group__0 )
            {
             before(grammarAccess.getRepeatElementAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:413:1: ( rule__RepeatElement__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:413:2: rule__RepeatElement__Group__0
            {
            pushFollow(FOLLOW_rule__RepeatElement__Group__0_in_ruleRepeatElement814);
            rule__RepeatElement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRepeatElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRepeatElement


    // $ANTLR start rule__Feature__MultivaluedAlternatives_3_0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:425:1: rule__Feature__MultivaluedAlternatives_3_0 : ( ( '(s)' ) | ( '(es)' ) );
    public final void rule__Feature__MultivaluedAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:429:1: ( ( '(s)' ) | ( '(es)' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("425:1: rule__Feature__MultivaluedAlternatives_3_0 : ( ( '(s)' ) | ( '(es)' ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:430:1: ( '(s)' )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:430:1: ( '(s)' )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:431:1: '(s)'
                    {
                     before(grammarAccess.getFeatureAccess().getMultivaluedSKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Feature__MultivaluedAlternatives_3_0851); 
                     after(grammarAccess.getFeatureAccess().getMultivaluedSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:438:6: ( '(es)' )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:438:6: ( '(es)' )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:439:1: '(es)'
                    {
                     before(grammarAccess.getFeatureAccess().getMultivaluedEsKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Feature__MultivaluedAlternatives_3_0871); 
                     after(grammarAccess.getFeatureAccess().getMultivaluedEsKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__MultivaluedAlternatives_3_0


    // $ANTLR start rule__Type__Alternatives
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:451:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:455:1: ( ( ruleEntity ) | ( ruleDataType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("451:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:456:1: ( ruleEntity )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:456:1: ( ruleEntity )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:457:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives905);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:462:6: ( ruleDataType )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:462:6: ( ruleDataType )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:463:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives922);
                    ruleDataType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__PageElement__Alternatives
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:473:1: rule__PageElement__Alternatives : ( ( ruleSingleElement ) | ( ruleRepeatElement ) );
    public final void rule__PageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:477:1: ( ( ruleSingleElement ) | ( ruleRepeatElement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=25 && LA3_0<=26)) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("473:1: rule__PageElement__Alternatives : ( ( ruleSingleElement ) | ( ruleRepeatElement ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:478:1: ( ruleSingleElement )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:478:1: ( ruleSingleElement )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:479:1: ruleSingleElement
                    {
                     before(grammarAccess.getPageElementAccess().getSingleElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleElement_in_rule__PageElement__Alternatives954);
                    ruleSingleElement();
                    _fsp--;

                     after(grammarAccess.getPageElementAccess().getSingleElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:484:6: ( ruleRepeatElement )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:484:6: ( ruleRepeatElement )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:485:1: ruleRepeatElement
                    {
                     before(grammarAccess.getPageElementAccess().getRepeatElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRepeatElement_in_rule__PageElement__Alternatives971);
                    ruleRepeatElement();
                    _fsp--;

                     after(grammarAccess.getPageElementAccess().getRepeatElementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PageElement__Alternatives


    // $ANTLR start rule__SingleElement__Alternatives
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:495:1: rule__SingleElement__Alternatives : ( ( ruleActionElement ) | ( ruleDisplayElement ) );
    public final void rule__SingleElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:499:1: ( ( ruleActionElement ) | ( ruleDisplayElement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("495:1: rule__SingleElement__Alternatives : ( ( ruleActionElement ) | ( ruleDisplayElement ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:500:1: ( ruleActionElement )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:500:1: ( ruleActionElement )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:501:1: ruleActionElement
                    {
                     before(grammarAccess.getSingleElementAccess().getActionElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionElement_in_rule__SingleElement__Alternatives1003);
                    ruleActionElement();
                    _fsp--;

                     after(grammarAccess.getSingleElementAccess().getActionElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:506:6: ( ruleDisplayElement )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:506:6: ( ruleDisplayElement )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:507:1: ruleDisplayElement
                    {
                     before(grammarAccess.getSingleElementAccess().getDisplayElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDisplayElement_in_rule__SingleElement__Alternatives1020);
                    ruleDisplayElement();
                    _fsp--;

                     after(grammarAccess.getSingleElementAccess().getDisplayElementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SingleElement__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:519:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:523:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:524:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01050);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01053);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:531:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:535:1: ( ( 'model' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:536:1: ( 'model' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:536:1: ( 'model' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:537:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__0__Impl1081); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:550:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:554:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:555:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11112);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11115);
            rule__Model__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:562:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:566:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:567:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:567:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:568:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:569:1: ( rule__Model__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:569:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1142);
            rule__Model__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__Model__Group__2
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:579:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:583:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:584:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21172);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21175);
            rule__Model__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__2


    // $ANTLR start rule__Model__Group__2__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:591:1: rule__Model__Group__2__Impl : ( ( rule__Model__DomainAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:595:1: ( ( ( rule__Model__DomainAssignment_2 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:596:1: ( ( rule__Model__DomainAssignment_2 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:596:1: ( ( rule__Model__DomainAssignment_2 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:597:1: ( rule__Model__DomainAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getDomainAssignment_2()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:598:1: ( rule__Model__DomainAssignment_2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:598:2: rule__Model__DomainAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__DomainAssignment_2_in_rule__Model__Group__2__Impl1202);
            rule__Model__DomainAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getDomainAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__2__Impl


    // $ANTLR start rule__Model__Group__3
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:608:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:612:1: ( rule__Model__Group__3__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:613:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31232);
            rule__Model__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__3


    // $ANTLR start rule__Model__Group__3__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:619:1: rule__Model__Group__3__Impl : ( ( rule__Model__WebAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:623:1: ( ( ( rule__Model__WebAssignment_3 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:624:1: ( ( rule__Model__WebAssignment_3 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:624:1: ( ( rule__Model__WebAssignment_3 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:625:1: ( rule__Model__WebAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getWebAssignment_3()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:626:1: ( rule__Model__WebAssignment_3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:626:2: rule__Model__WebAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__WebAssignment_3_in_rule__Model__Group__3__Impl1259);
            rule__Model__WebAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getWebAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__3__Impl


    // $ANTLR start rule__DomainModel__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:644:1: rule__DomainModel__Group__0 : rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 ;
    public final void rule__DomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:648:1: ( rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:649:2: rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__01297);
            rule__DomainModel__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__01300);
            rule__DomainModel__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModel__Group__0


    // $ANTLR start rule__DomainModel__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:656:1: rule__DomainModel__Group__0__Impl : ( 'domain:' ) ;
    public final void rule__DomainModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:660:1: ( ( 'domain:' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:661:1: ( 'domain:' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:661:1: ( 'domain:' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:662:1: 'domain:'
            {
             before(grammarAccess.getDomainModelAccess().getDomainKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__DomainModel__Group__0__Impl1328); 
             after(grammarAccess.getDomainModelAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModel__Group__0__Impl


    // $ANTLR start rule__DomainModel__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:675:1: rule__DomainModel__Group__1 : rule__DomainModel__Group__1__Impl ;
    public final void rule__DomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:679:1: ( rule__DomainModel__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:680:2: rule__DomainModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__11359);
            rule__DomainModel__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModel__Group__1


    // $ANTLR start rule__DomainModel__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:686:1: rule__DomainModel__Group__1__Impl : ( ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* ) ) ;
    public final void rule__DomainModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:690:1: ( ( ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:691:1: ( ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:691:1: ( ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:692:1: ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:692:1: ( ( rule__DomainModel__TypesAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:693:1: ( rule__DomainModel__TypesAssignment_1 )
            {
             before(grammarAccess.getDomainModelAccess().getTypesAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:694:1: ( rule__DomainModel__TypesAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:694:2: rule__DomainModel__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__DomainModel__TypesAssignment_1_in_rule__DomainModel__Group__1__Impl1388);
            rule__DomainModel__TypesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getTypesAssignment_1()); 

            }

            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:697:1: ( ( rule__DomainModel__TypesAssignment_1 )* )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:698:1: ( rule__DomainModel__TypesAssignment_1 )*
            {
             before(grammarAccess.getDomainModelAccess().getTypesAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:699:1: ( rule__DomainModel__TypesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:699:2: rule__DomainModel__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__TypesAssignment_1_in_rule__DomainModel__Group__1__Impl1400);
            	    rule__DomainModel__TypesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getTypesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModel__Group__1__Impl


    // $ANTLR start rule__Entity__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:714:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:718:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:719:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01437);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01440);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:726:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:730:1: ( ( 'entity' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:731:1: ( 'entity' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:731:1: ( 'entity' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:732:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__0__Impl1468); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:745:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:749:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:750:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11499);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11502);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:757:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:761:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:762:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:762:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:763:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:764:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:764:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1529);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:774:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:778:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:779:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21559);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21562);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:786:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:790:1: ( ( '{' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:791:1: ( '{' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:791:1: ( '{' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:792:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__2__Impl1590); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Entity__Group__3
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:805:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:809:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:810:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31621);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31624);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__3__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:817:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__FeaturesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:821:1: ( ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:822:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:822:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:823:1: ( rule__Entity__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:824:1: ( rule__Entity__FeaturesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:824:2: rule__Entity__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl1651);
            	    rule__Entity__FeaturesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3__Impl


    // $ANTLR start rule__Entity__Group__4
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:834:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:838:1: ( rule__Entity__Group__4__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:839:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41682);
            rule__Entity__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__4__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:845:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:849:1: ( ( '}' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:850:1: ( '}' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:850:1: ( '}' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:851:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__4__Impl1710); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4__Impl


    // $ANTLR start rule__Feature__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:874:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:878:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:879:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01751);
            rule__Feature__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01754);
            rule__Feature__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__0


    // $ANTLR start rule__Feature__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:886:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__NameAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:890:1: ( ( ( rule__Feature__NameAssignment_0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:891:1: ( ( rule__Feature__NameAssignment_0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:891:1: ( ( rule__Feature__NameAssignment_0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:892:1: ( rule__Feature__NameAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:893:1: ( rule__Feature__NameAssignment_0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:893:2: rule__Feature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1781);
            rule__Feature__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__0__Impl


    // $ANTLR start rule__Feature__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:903:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:907:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:908:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11811);
            rule__Feature__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11814);
            rule__Feature__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__1


    // $ANTLR start rule__Feature__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:915:1: rule__Feature__Group__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:919:1: ( ( ':' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:920:1: ( ':' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:920:1: ( ':' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:921:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Feature__Group__1__Impl1842); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__1__Impl


    // $ANTLR start rule__Feature__Group__2
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:934:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:938:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:939:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21873);
            rule__Feature__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21876);
            rule__Feature__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__2


    // $ANTLR start rule__Feature__Group__2__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:946:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TypeAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:950:1: ( ( ( rule__Feature__TypeAssignment_2 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:951:1: ( ( rule__Feature__TypeAssignment_2 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:951:1: ( ( rule__Feature__TypeAssignment_2 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:952:1: ( rule__Feature__TypeAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_2()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:953:1: ( rule__Feature__TypeAssignment_2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:953:2: rule__Feature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl1903);
            rule__Feature__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__2__Impl


    // $ANTLR start rule__Feature__Group__3
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:963:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:967:1: ( rule__Feature__Group__3__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:968:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31933);
            rule__Feature__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__3


    // $ANTLR start rule__Feature__Group__3__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:974:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__MultivaluedAssignment_3 )? ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:978:1: ( ( ( rule__Feature__MultivaluedAssignment_3 )? ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:979:1: ( ( rule__Feature__MultivaluedAssignment_3 )? )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:979:1: ( ( rule__Feature__MultivaluedAssignment_3 )? )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:980:1: ( rule__Feature__MultivaluedAssignment_3 )?
            {
             before(grammarAccess.getFeatureAccess().getMultivaluedAssignment_3()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:981:1: ( rule__Feature__MultivaluedAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:981:2: rule__Feature__MultivaluedAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Feature__MultivaluedAssignment_3_in_rule__Feature__Group__3__Impl1960);
                    rule__Feature__MultivaluedAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getMultivaluedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__3__Impl


    // $ANTLR start rule__DataType__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:999:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1003:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1004:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01999);
            rule__DataType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02002);
            rule__DataType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__0


    // $ANTLR start rule__DataType__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1011:1: rule__DataType__Group__0__Impl : ( 'type' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1015:1: ( ( 'type' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1016:1: ( 'type' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1016:1: ( 'type' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1017:1: 'type'
            {
             before(grammarAccess.getDataTypeAccess().getTypeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__DataType__Group__0__Impl2030); 
             after(grammarAccess.getDataTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__0__Impl


    // $ANTLR start rule__DataType__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1030:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1034:1: ( rule__DataType__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1035:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12061);
            rule__DataType__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__1


    // $ANTLR start rule__DataType__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1041:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1045:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1046:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1046:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1047:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1048:1: ( rule__DataType__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1048:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2088);
            rule__DataType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__1__Impl


    // $ANTLR start rule__WebModel__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1062:1: rule__WebModel__Group__0 : rule__WebModel__Group__0__Impl rule__WebModel__Group__1 ;
    public final void rule__WebModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1066:1: ( rule__WebModel__Group__0__Impl rule__WebModel__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1067:2: rule__WebModel__Group__0__Impl rule__WebModel__Group__1
            {
            pushFollow(FOLLOW_rule__WebModel__Group__0__Impl_in_rule__WebModel__Group__02122);
            rule__WebModel__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WebModel__Group__1_in_rule__WebModel__Group__02125);
            rule__WebModel__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WebModel__Group__0


    // $ANTLR start rule__WebModel__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1074:1: rule__WebModel__Group__0__Impl : ( 'web:' ) ;
    public final void rule__WebModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1078:1: ( ( 'web:' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1079:1: ( 'web:' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1079:1: ( 'web:' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1080:1: 'web:'
            {
             before(grammarAccess.getWebModelAccess().getWebKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__WebModel__Group__0__Impl2153); 
             after(grammarAccess.getWebModelAccess().getWebKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WebModel__Group__0__Impl


    // $ANTLR start rule__WebModel__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1093:1: rule__WebModel__Group__1 : rule__WebModel__Group__1__Impl ;
    public final void rule__WebModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1097:1: ( rule__WebModel__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1098:2: rule__WebModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WebModel__Group__1__Impl_in_rule__WebModel__Group__12184);
            rule__WebModel__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WebModel__Group__1


    // $ANTLR start rule__WebModel__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1104:1: rule__WebModel__Group__1__Impl : ( ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* ) ) ;
    public final void rule__WebModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1108:1: ( ( ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1109:1: ( ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1109:1: ( ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1110:1: ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1110:1: ( ( rule__WebModel__PagesAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1111:1: ( rule__WebModel__PagesAssignment_1 )
            {
             before(grammarAccess.getWebModelAccess().getPagesAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1112:1: ( rule__WebModel__PagesAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1112:2: rule__WebModel__PagesAssignment_1
            {
            pushFollow(FOLLOW_rule__WebModel__PagesAssignment_1_in_rule__WebModel__Group__1__Impl2213);
            rule__WebModel__PagesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getWebModelAccess().getPagesAssignment_1()); 

            }

            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1115:1: ( ( rule__WebModel__PagesAssignment_1 )* )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1116:1: ( rule__WebModel__PagesAssignment_1 )*
            {
             before(grammarAccess.getWebModelAccess().getPagesAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1117:1: ( rule__WebModel__PagesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1117:2: rule__WebModel__PagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__WebModel__PagesAssignment_1_in_rule__WebModel__Group__1__Impl2225);
            	    rule__WebModel__PagesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWebModelAccess().getPagesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WebModel__Group__1__Impl


    // $ANTLR start rule__Page__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1132:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1136:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1137:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02262);
            rule__Page__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02265);
            rule__Page__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__0


    // $ANTLR start rule__Page__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1144:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1148:1: ( ( 'page' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1149:1: ( 'page' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1149:1: ( 'page' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1150:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Page__Group__0__Impl2293); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__0__Impl


    // $ANTLR start rule__Page__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1163:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1167:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1168:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12324);
            rule__Page__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12327);
            rule__Page__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__1


    // $ANTLR start rule__Page__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1175:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1179:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1180:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1180:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1181:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1182:1: ( rule__Page__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1182:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl2354);
            rule__Page__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__1__Impl


    // $ANTLR start rule__Page__Group__2
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1192:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1196:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1197:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22384);
            rule__Page__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22387);
            rule__Page__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__2


    // $ANTLR start rule__Page__Group__2__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1204:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1208:1: ( ( '{' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1209:1: ( '{' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1209:1: ( '{' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1210:1: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Page__Group__2__Impl2415); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__2__Impl


    // $ANTLR start rule__Page__Group__3
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1223:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1227:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1228:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32446);
            rule__Page__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32449);
            rule__Page__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__3


    // $ANTLR start rule__Page__Group__3__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1235:1: rule__Page__Group__3__Impl : ( 'title' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1239:1: ( ( 'title' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1240:1: ( 'title' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1240:1: ( 'title' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1241:1: 'title'
            {
             before(grammarAccess.getPageAccess().getTitleKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Page__Group__3__Impl2477); 
             after(grammarAccess.getPageAccess().getTitleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__3__Impl


    // $ANTLR start rule__Page__Group__4
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1254:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1258:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1259:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42508);
            rule__Page__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42511);
            rule__Page__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__4


    // $ANTLR start rule__Page__Group__4__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1266:1: rule__Page__Group__4__Impl : ( '=' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1270:1: ( ( '=' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1271:1: ( '=' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1271:1: ( '=' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1272:1: '='
            {
             before(grammarAccess.getPageAccess().getEqualsSignKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Page__Group__4__Impl2539); 
             after(grammarAccess.getPageAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__4__Impl


    // $ANTLR start rule__Page__Group__5
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1285:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1289:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1290:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52570);
            rule__Page__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__6_in_rule__Page__Group__52573);
            rule__Page__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__5


    // $ANTLR start rule__Page__Group__5__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1297:1: rule__Page__Group__5__Impl : ( ( rule__Page__TitleAssignment_5 ) ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1301:1: ( ( ( rule__Page__TitleAssignment_5 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1302:1: ( ( rule__Page__TitleAssignment_5 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1302:1: ( ( rule__Page__TitleAssignment_5 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1303:1: ( rule__Page__TitleAssignment_5 )
            {
             before(grammarAccess.getPageAccess().getTitleAssignment_5()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1304:1: ( rule__Page__TitleAssignment_5 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1304:2: rule__Page__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__Page__TitleAssignment_5_in_rule__Page__Group__5__Impl2600);
            rule__Page__TitleAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPageAccess().getTitleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__5__Impl


    // $ANTLR start rule__Page__Group__6
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1314:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1318:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1319:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__62630);
            rule__Page__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__7_in_rule__Page__Group__62633);
            rule__Page__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__6


    // $ANTLR start rule__Page__Group__6__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1326:1: rule__Page__Group__6__Impl : ( 'content for' ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1330:1: ( ( 'content for' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1331:1: ( 'content for' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1331:1: ( 'content for' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1332:1: 'content for'
            {
             before(grammarAccess.getPageAccess().getContentForKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__Page__Group__6__Impl2661); 
             after(grammarAccess.getPageAccess().getContentForKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__6__Impl


    // $ANTLR start rule__Page__Group__7
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1345:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1349:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1350:2: rule__Page__Group__7__Impl rule__Page__Group__8
            {
            pushFollow(FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__72692);
            rule__Page__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__8_in_rule__Page__Group__72695);
            rule__Page__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__7


    // $ANTLR start rule__Page__Group__7__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1357:1: rule__Page__Group__7__Impl : ( ( rule__Page__EntityAssignment_7 ) ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1361:1: ( ( ( rule__Page__EntityAssignment_7 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1362:1: ( ( rule__Page__EntityAssignment_7 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1362:1: ( ( rule__Page__EntityAssignment_7 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1363:1: ( rule__Page__EntityAssignment_7 )
            {
             before(grammarAccess.getPageAccess().getEntityAssignment_7()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1364:1: ( rule__Page__EntityAssignment_7 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1364:2: rule__Page__EntityAssignment_7
            {
            pushFollow(FOLLOW_rule__Page__EntityAssignment_7_in_rule__Page__Group__7__Impl2722);
            rule__Page__EntityAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getPageAccess().getEntityAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__7__Impl


    // $ANTLR start rule__Page__Group__8
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1374:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1378:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1379:2: rule__Page__Group__8__Impl rule__Page__Group__9
            {
            pushFollow(FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82752);
            rule__Page__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82755);
            rule__Page__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__8


    // $ANTLR start rule__Page__Group__8__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1386:1: rule__Page__Group__8__Impl : ( '{' ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1390:1: ( ( '{' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1391:1: ( '{' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1391:1: ( '{' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1392:1: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__Page__Group__8__Impl2783); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__8__Impl


    // $ANTLR start rule__Page__Group__9
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1405:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1409:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1410:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92814);
            rule__Page__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92817);
            rule__Page__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__9


    // $ANTLR start rule__Page__Group__9__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1417:1: rule__Page__Group__9__Impl : ( ( rule__Page__ContentsAssignment_9 )* ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1421:1: ( ( ( rule__Page__ContentsAssignment_9 )* ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1422:1: ( ( rule__Page__ContentsAssignment_9 )* )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1422:1: ( ( rule__Page__ContentsAssignment_9 )* )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1423:1: ( rule__Page__ContentsAssignment_9 )*
            {
             before(grammarAccess.getPageAccess().getContentsAssignment_9()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1424:1: ( rule__Page__ContentsAssignment_9 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=25 && LA9_0<=27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1424:2: rule__Page__ContentsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Page__ContentsAssignment_9_in_rule__Page__Group__9__Impl2844);
            	    rule__Page__ContentsAssignment_9();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getContentsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__9__Impl


    // $ANTLR start rule__Page__Group__10
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1434:1: rule__Page__Group__10 : rule__Page__Group__10__Impl rule__Page__Group__11 ;
    public final void rule__Page__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1438:1: ( rule__Page__Group__10__Impl rule__Page__Group__11 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1439:2: rule__Page__Group__10__Impl rule__Page__Group__11
            {
            pushFollow(FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102875);
            rule__Page__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__11_in_rule__Page__Group__102878);
            rule__Page__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__10


    // $ANTLR start rule__Page__Group__10__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1446:1: rule__Page__Group__10__Impl : ( '}' ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1450:1: ( ( '}' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1451:1: ( '}' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1451:1: ( '}' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1452:1: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_17_in_rule__Page__Group__10__Impl2906); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__10__Impl


    // $ANTLR start rule__Page__Group__11
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1465:1: rule__Page__Group__11 : rule__Page__Group__11__Impl ;
    public final void rule__Page__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1469:1: ( rule__Page__Group__11__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1470:2: rule__Page__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__11__Impl_in_rule__Page__Group__112937);
            rule__Page__Group__11__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__11


    // $ANTLR start rule__Page__Group__11__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1476:1: rule__Page__Group__11__Impl : ( '}' ) ;
    public final void rule__Page__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1480:1: ( ( '}' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1481:1: ( '}' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1481:1: ( '}' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1482:1: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_17_in_rule__Page__Group__11__Impl2965); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__11__Impl


    // $ANTLR start rule__ActionElement__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1519:1: rule__ActionElement__Group__0 : rule__ActionElement__Group__0__Impl rule__ActionElement__Group__1 ;
    public final void rule__ActionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1523:1: ( rule__ActionElement__Group__0__Impl rule__ActionElement__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1524:2: rule__ActionElement__Group__0__Impl rule__ActionElement__Group__1
            {
            pushFollow(FOLLOW_rule__ActionElement__Group__0__Impl_in_rule__ActionElement__Group__03020);
            rule__ActionElement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ActionElement__Group__1_in_rule__ActionElement__Group__03023);
            rule__ActionElement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionElement__Group__0


    // $ANTLR start rule__ActionElement__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1531:1: rule__ActionElement__Group__0__Impl : ( 'action' ) ;
    public final void rule__ActionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1535:1: ( ( 'action' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1536:1: ( 'action' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1536:1: ( 'action' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1537:1: 'action'
            {
             before(grammarAccess.getActionElementAccess().getActionKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ActionElement__Group__0__Impl3051); 
             after(grammarAccess.getActionElementAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionElement__Group__0__Impl


    // $ANTLR start rule__ActionElement__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1550:1: rule__ActionElement__Group__1 : rule__ActionElement__Group__1__Impl ;
    public final void rule__ActionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1554:1: ( rule__ActionElement__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1555:2: rule__ActionElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionElement__Group__1__Impl_in_rule__ActionElement__Group__13082);
            rule__ActionElement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionElement__Group__1


    // $ANTLR start rule__ActionElement__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1561:1: rule__ActionElement__Group__1__Impl : ( ( rule__ActionElement__NameAssignment_1 ) ) ;
    public final void rule__ActionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1565:1: ( ( ( rule__ActionElement__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1566:1: ( ( rule__ActionElement__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1566:1: ( ( rule__ActionElement__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1567:1: ( rule__ActionElement__NameAssignment_1 )
            {
             before(grammarAccess.getActionElementAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1568:1: ( rule__ActionElement__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1568:2: rule__ActionElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionElement__NameAssignment_1_in_rule__ActionElement__Group__1__Impl3109);
            rule__ActionElement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActionElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionElement__Group__1__Impl


    // $ANTLR start rule__DisplayElement__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1582:1: rule__DisplayElement__Group__0 : rule__DisplayElement__Group__0__Impl rule__DisplayElement__Group__1 ;
    public final void rule__DisplayElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1586:1: ( rule__DisplayElement__Group__0__Impl rule__DisplayElement__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1587:2: rule__DisplayElement__Group__0__Impl rule__DisplayElement__Group__1
            {
            pushFollow(FOLLOW_rule__DisplayElement__Group__0__Impl_in_rule__DisplayElement__Group__03143);
            rule__DisplayElement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DisplayElement__Group__1_in_rule__DisplayElement__Group__03146);
            rule__DisplayElement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DisplayElement__Group__0


    // $ANTLR start rule__DisplayElement__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1594:1: rule__DisplayElement__Group__0__Impl : ( 'show' ) ;
    public final void rule__DisplayElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1598:1: ( ( 'show' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1599:1: ( 'show' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1599:1: ( 'show' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1600:1: 'show'
            {
             before(grammarAccess.getDisplayElementAccess().getShowKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__DisplayElement__Group__0__Impl3174); 
             after(grammarAccess.getDisplayElementAccess().getShowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DisplayElement__Group__0__Impl


    // $ANTLR start rule__DisplayElement__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1613:1: rule__DisplayElement__Group__1 : rule__DisplayElement__Group__1__Impl ;
    public final void rule__DisplayElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1617:1: ( rule__DisplayElement__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1618:2: rule__DisplayElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DisplayElement__Group__1__Impl_in_rule__DisplayElement__Group__13205);
            rule__DisplayElement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DisplayElement__Group__1


    // $ANTLR start rule__DisplayElement__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1624:1: rule__DisplayElement__Group__1__Impl : ( ( rule__DisplayElement__ReferenceAssignment_1 ) ) ;
    public final void rule__DisplayElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1628:1: ( ( ( rule__DisplayElement__ReferenceAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1629:1: ( ( rule__DisplayElement__ReferenceAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1629:1: ( ( rule__DisplayElement__ReferenceAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1630:1: ( rule__DisplayElement__ReferenceAssignment_1 )
            {
             before(grammarAccess.getDisplayElementAccess().getReferenceAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1631:1: ( rule__DisplayElement__ReferenceAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1631:2: rule__DisplayElement__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__DisplayElement__ReferenceAssignment_1_in_rule__DisplayElement__Group__1__Impl3232);
            rule__DisplayElement__ReferenceAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDisplayElementAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DisplayElement__Group__1__Impl


    // $ANTLR start rule__RepeatElement__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1645:1: rule__RepeatElement__Group__0 : rule__RepeatElement__Group__0__Impl rule__RepeatElement__Group__1 ;
    public final void rule__RepeatElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1649:1: ( rule__RepeatElement__Group__0__Impl rule__RepeatElement__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1650:2: rule__RepeatElement__Group__0__Impl rule__RepeatElement__Group__1
            {
            pushFollow(FOLLOW_rule__RepeatElement__Group__0__Impl_in_rule__RepeatElement__Group__03266);
            rule__RepeatElement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RepeatElement__Group__1_in_rule__RepeatElement__Group__03269);
            rule__RepeatElement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__0


    // $ANTLR start rule__RepeatElement__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1657:1: rule__RepeatElement__Group__0__Impl : ( 'repeat for' ) ;
    public final void rule__RepeatElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1661:1: ( ( 'repeat for' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1662:1: ( 'repeat for' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1662:1: ( 'repeat for' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1663:1: 'repeat for'
            {
             before(grammarAccess.getRepeatElementAccess().getRepeatForKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__RepeatElement__Group__0__Impl3297); 
             after(grammarAccess.getRepeatElementAccess().getRepeatForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__0__Impl


    // $ANTLR start rule__RepeatElement__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1676:1: rule__RepeatElement__Group__1 : rule__RepeatElement__Group__1__Impl rule__RepeatElement__Group__2 ;
    public final void rule__RepeatElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1680:1: ( rule__RepeatElement__Group__1__Impl rule__RepeatElement__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1681:2: rule__RepeatElement__Group__1__Impl rule__RepeatElement__Group__2
            {
            pushFollow(FOLLOW_rule__RepeatElement__Group__1__Impl_in_rule__RepeatElement__Group__13328);
            rule__RepeatElement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RepeatElement__Group__2_in_rule__RepeatElement__Group__13331);
            rule__RepeatElement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__1


    // $ANTLR start rule__RepeatElement__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1688:1: rule__RepeatElement__Group__1__Impl : ( ( rule__RepeatElement__ReferenceAssignment_1 ) ) ;
    public final void rule__RepeatElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1692:1: ( ( ( rule__RepeatElement__ReferenceAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1693:1: ( ( rule__RepeatElement__ReferenceAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1693:1: ( ( rule__RepeatElement__ReferenceAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1694:1: ( rule__RepeatElement__ReferenceAssignment_1 )
            {
             before(grammarAccess.getRepeatElementAccess().getReferenceAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1695:1: ( rule__RepeatElement__ReferenceAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1695:2: rule__RepeatElement__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__RepeatElement__ReferenceAssignment_1_in_rule__RepeatElement__Group__1__Impl3358);
            rule__RepeatElement__ReferenceAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRepeatElementAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__1__Impl


    // $ANTLR start rule__RepeatElement__Group__2
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1705:1: rule__RepeatElement__Group__2 : rule__RepeatElement__Group__2__Impl rule__RepeatElement__Group__3 ;
    public final void rule__RepeatElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1709:1: ( rule__RepeatElement__Group__2__Impl rule__RepeatElement__Group__3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1710:2: rule__RepeatElement__Group__2__Impl rule__RepeatElement__Group__3
            {
            pushFollow(FOLLOW_rule__RepeatElement__Group__2__Impl_in_rule__RepeatElement__Group__23388);
            rule__RepeatElement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RepeatElement__Group__3_in_rule__RepeatElement__Group__23391);
            rule__RepeatElement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__2


    // $ANTLR start rule__RepeatElement__Group__2__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1717:1: rule__RepeatElement__Group__2__Impl : ( '{' ) ;
    public final void rule__RepeatElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1721:1: ( ( '{' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1722:1: ( '{' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1722:1: ( '{' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1723:1: '{'
            {
             before(grammarAccess.getRepeatElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__RepeatElement__Group__2__Impl3419); 
             after(grammarAccess.getRepeatElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__2__Impl


    // $ANTLR start rule__RepeatElement__Group__3
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1736:1: rule__RepeatElement__Group__3 : rule__RepeatElement__Group__3__Impl rule__RepeatElement__Group__4 ;
    public final void rule__RepeatElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1740:1: ( rule__RepeatElement__Group__3__Impl rule__RepeatElement__Group__4 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1741:2: rule__RepeatElement__Group__3__Impl rule__RepeatElement__Group__4
            {
            pushFollow(FOLLOW_rule__RepeatElement__Group__3__Impl_in_rule__RepeatElement__Group__33450);
            rule__RepeatElement__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RepeatElement__Group__4_in_rule__RepeatElement__Group__33453);
            rule__RepeatElement__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__3


    // $ANTLR start rule__RepeatElement__Group__3__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1748:1: rule__RepeatElement__Group__3__Impl : ( ( rule__RepeatElement__ContentsAssignment_3 )* ) ;
    public final void rule__RepeatElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1752:1: ( ( ( rule__RepeatElement__ContentsAssignment_3 )* ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1753:1: ( ( rule__RepeatElement__ContentsAssignment_3 )* )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1753:1: ( ( rule__RepeatElement__ContentsAssignment_3 )* )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1754:1: ( rule__RepeatElement__ContentsAssignment_3 )*
            {
             before(grammarAccess.getRepeatElementAccess().getContentsAssignment_3()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1755:1: ( rule__RepeatElement__ContentsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1755:2: rule__RepeatElement__ContentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RepeatElement__ContentsAssignment_3_in_rule__RepeatElement__Group__3__Impl3480);
            	    rule__RepeatElement__ContentsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRepeatElementAccess().getContentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__3__Impl


    // $ANTLR start rule__RepeatElement__Group__4
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1765:1: rule__RepeatElement__Group__4 : rule__RepeatElement__Group__4__Impl ;
    public final void rule__RepeatElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1769:1: ( rule__RepeatElement__Group__4__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1770:2: rule__RepeatElement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RepeatElement__Group__4__Impl_in_rule__RepeatElement__Group__43511);
            rule__RepeatElement__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__4


    // $ANTLR start rule__RepeatElement__Group__4__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1776:1: rule__RepeatElement__Group__4__Impl : ( '}' ) ;
    public final void rule__RepeatElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1780:1: ( ( '}' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1781:1: ( '}' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1781:1: ( '}' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1782:1: '}'
            {
             before(grammarAccess.getRepeatElementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__RepeatElement__Group__4__Impl3539); 
             after(grammarAccess.getRepeatElementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__Group__4__Impl


    // $ANTLR start rule__Model__NameAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1806:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1810:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1811:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1811:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1812:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_13585); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__NameAssignment_1


    // $ANTLR start rule__Model__DomainAssignment_2
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1821:1: rule__Model__DomainAssignment_2 : ( ruleDomainModel ) ;
    public final void rule__Model__DomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1825:1: ( ( ruleDomainModel ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1826:1: ( ruleDomainModel )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1826:1: ( ruleDomainModel )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1827:1: ruleDomainModel
            {
             before(grammarAccess.getModelAccess().getDomainDomainModelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDomainModel_in_rule__Model__DomainAssignment_23616);
            ruleDomainModel();
            _fsp--;

             after(grammarAccess.getModelAccess().getDomainDomainModelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__DomainAssignment_2


    // $ANTLR start rule__Model__WebAssignment_3
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1836:1: rule__Model__WebAssignment_3 : ( ruleWebModel ) ;
    public final void rule__Model__WebAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1840:1: ( ( ruleWebModel ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1841:1: ( ruleWebModel )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1841:1: ( ruleWebModel )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1842:1: ruleWebModel
            {
             before(grammarAccess.getModelAccess().getWebWebModelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWebModel_in_rule__Model__WebAssignment_33647);
            ruleWebModel();
            _fsp--;

             after(grammarAccess.getModelAccess().getWebWebModelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__WebAssignment_3


    // $ANTLR start rule__DomainModel__TypesAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1851:1: rule__DomainModel__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__DomainModel__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1855:1: ( ( ruleType ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1856:1: ( ruleType )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1856:1: ( ruleType )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1857:1: ruleType
            {
             before(grammarAccess.getDomainModelAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__DomainModel__TypesAssignment_13678);
            ruleType();
            _fsp--;

             after(grammarAccess.getDomainModelAccess().getTypesTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModel__TypesAssignment_1


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1866:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1870:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1871:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1871:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1872:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_13709); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__FeaturesAssignment_3
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1881:1: rule__Entity__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1885:1: ( ( ruleFeature ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1886:1: ( ruleFeature )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1886:1: ( ruleFeature )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1887:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_33740);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__FeaturesAssignment_3


    // $ANTLR start rule__Feature__NameAssignment_0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1896:1: rule__Feature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1900:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1901:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1901:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1902:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_03771); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__NameAssignment_0


    // $ANTLR start rule__Feature__TypeAssignment_2
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1911:1: rule__Feature__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1915:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1916:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1916:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1917:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1918:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1919:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__TypeAssignment_23806); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__TypeAssignment_2


    // $ANTLR start rule__Feature__MultivaluedAssignment_3
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1930:1: rule__Feature__MultivaluedAssignment_3 : ( ( rule__Feature__MultivaluedAlternatives_3_0 ) ) ;
    public final void rule__Feature__MultivaluedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1934:1: ( ( ( rule__Feature__MultivaluedAlternatives_3_0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1935:1: ( ( rule__Feature__MultivaluedAlternatives_3_0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1935:1: ( ( rule__Feature__MultivaluedAlternatives_3_0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1936:1: ( rule__Feature__MultivaluedAlternatives_3_0 )
            {
             before(grammarAccess.getFeatureAccess().getMultivaluedAlternatives_3_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1937:1: ( rule__Feature__MultivaluedAlternatives_3_0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1937:2: rule__Feature__MultivaluedAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Feature__MultivaluedAlternatives_3_0_in_rule__Feature__MultivaluedAssignment_33841);
            rule__Feature__MultivaluedAlternatives_3_0();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getMultivaluedAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__MultivaluedAssignment_3


    // $ANTLR start rule__DataType__NameAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1946:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1950:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1951:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1951:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1952:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_13874); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__NameAssignment_1


    // $ANTLR start rule__WebModel__PagesAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1961:1: rule__WebModel__PagesAssignment_1 : ( rulePage ) ;
    public final void rule__WebModel__PagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1965:1: ( ( rulePage ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1966:1: ( rulePage )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1966:1: ( rulePage )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1967:1: rulePage
            {
             before(grammarAccess.getWebModelAccess().getPagesPageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__WebModel__PagesAssignment_13905);
            rulePage();
            _fsp--;

             after(grammarAccess.getWebModelAccess().getPagesPageParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WebModel__PagesAssignment_1


    // $ANTLR start rule__Page__NameAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1976:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1980:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1981:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1981:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1982:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13936); 
             after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__NameAssignment_1


    // $ANTLR start rule__Page__TitleAssignment_5
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1991:1: rule__Page__TitleAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Page__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1995:1: ( ( RULE_STRING ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1996:1: ( RULE_STRING )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1996:1: ( RULE_STRING )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1997:1: RULE_STRING
            {
             before(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_53967); 
             after(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__TitleAssignment_5


    // $ANTLR start rule__Page__EntityAssignment_7
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2006:1: rule__Page__EntityAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Page__EntityAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2010:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2011:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2011:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2012:1: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getEntityEntityCrossReference_7_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2013:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2014:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getEntityEntityIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__EntityAssignment_74002); 
             after(grammarAccess.getPageAccess().getEntityEntityIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getPageAccess().getEntityEntityCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__EntityAssignment_7


    // $ANTLR start rule__Page__ContentsAssignment_9
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2025:1: rule__Page__ContentsAssignment_9 : ( rulePageElement ) ;
    public final void rule__Page__ContentsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2029:1: ( ( rulePageElement ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2030:1: ( rulePageElement )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2030:1: ( rulePageElement )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2031:1: rulePageElement
            {
             before(grammarAccess.getPageAccess().getContentsPageElementParserRuleCall_9_0()); 
            pushFollow(FOLLOW_rulePageElement_in_rule__Page__ContentsAssignment_94037);
            rulePageElement();
            _fsp--;

             after(grammarAccess.getPageAccess().getContentsPageElementParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__ContentsAssignment_9


    // $ANTLR start rule__ActionElement__NameAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2040:1: rule__ActionElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2044:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2045:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2045:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2046:1: RULE_ID
            {
             before(grammarAccess.getActionElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionElement__NameAssignment_14068); 
             after(grammarAccess.getActionElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionElement__NameAssignment_1


    // $ANTLR start rule__DisplayElement__ReferenceAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2055:1: rule__DisplayElement__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DisplayElement__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2059:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2060:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2060:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2061:1: ( RULE_ID )
            {
             before(grammarAccess.getDisplayElementAccess().getReferenceFeatureCrossReference_1_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2062:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2063:1: RULE_ID
            {
             before(grammarAccess.getDisplayElementAccess().getReferenceFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DisplayElement__ReferenceAssignment_14103); 
             after(grammarAccess.getDisplayElementAccess().getReferenceFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDisplayElementAccess().getReferenceFeatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DisplayElement__ReferenceAssignment_1


    // $ANTLR start rule__RepeatElement__ReferenceAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2074:1: rule__RepeatElement__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RepeatElement__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2078:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2079:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2079:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2080:1: ( RULE_ID )
            {
             before(grammarAccess.getRepeatElementAccess().getReferenceFeatureCrossReference_1_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2081:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2082:1: RULE_ID
            {
             before(grammarAccess.getRepeatElementAccess().getReferenceFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RepeatElement__ReferenceAssignment_14142); 
             after(grammarAccess.getRepeatElementAccess().getReferenceFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRepeatElementAccess().getReferenceFeatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__ReferenceAssignment_1


    // $ANTLR start rule__RepeatElement__ContentsAssignment_3
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2093:1: rule__RepeatElement__ContentsAssignment_3 : ( ruleSingleElement ) ;
    public final void rule__RepeatElement__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2097:1: ( ( ruleSingleElement ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2098:1: ( ruleSingleElement )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2098:1: ( ruleSingleElement )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2099:1: ruleSingleElement
            {
             before(grammarAccess.getRepeatElementAccess().getContentsSingleElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSingleElement_in_rule__RepeatElement__ContentsAssignment_34177);
            ruleSingleElement();
            _fsp--;

             after(grammarAccess.getRepeatElementAccess().getContentsSingleElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RepeatElement__ContentsAssignment_3


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__0_in_ruleDomainModel154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebModel_in_entryRuleWebModel421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebModel428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__0_in_ruleWebModel454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageElement_in_entryRulePageElement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageElement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageElement__Alternatives_in_rulePageElement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_entryRuleSingleElement601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleElement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleElement__Alternatives_in_ruleSingleElement634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionElement_in_entryRuleActionElement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionElement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionElement__Group__0_in_ruleActionElement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayElement728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayElement__Group__0_in_ruleDisplayElement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatElement_in_entryRuleRepeatElement781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeatElement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__0_in_ruleRepeatElement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Feature__MultivaluedAlternatives_3_0851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Feature__MultivaluedAlternatives_3_0871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_rule__PageElement__Alternatives954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatElement_in_rule__PageElement__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionElement_in_rule__SingleElement__Alternatives1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_rule__SingleElement__Alternatives1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__0__Impl1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11112 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21172 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DomainAssignment_2_in_rule__Model__Group__2__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WebAssignment_3_in_rule__Model__Group__3__Impl1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__01297 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__01300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DomainModel__Group__0__Impl1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__11359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__TypesAssignment_1_in_rule__DomainModel__Group__1__Impl1388 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_rule__DomainModel__TypesAssignment_1_in_rule__DomainModel__Group__1__Impl1400 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__0__Impl1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11499 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21559 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__2__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31621 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl1651 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__4__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01751 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Feature__Group__1__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21873 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__MultivaluedAssignment_3_in_rule__Feature__Group__3__Impl1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataType__Group__0__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__0__Impl_in_rule__WebModel__Group__02122 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__WebModel__Group__1_in_rule__WebModel__Group__02125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__WebModel__Group__0__Impl2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__1__Impl_in_rule__WebModel__Group__12184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__PagesAssignment_1_in_rule__WebModel__Group__1__Impl2213 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__WebModel__PagesAssignment_1_in_rule__WebModel__Group__1__Impl2225 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Page__Group__0__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12324 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22384 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group__2__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32446 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Page__Group__3__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Page__Group__4__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52570 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__52573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__TitleAssignment_5_in_rule__Page__Group__5__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__62630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__7_in_rule__Page__Group__62633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Page__Group__6__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__72692 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Page__Group__8_in_rule__Page__Group__72695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__EntityAssignment_7_in_rule__Page__Group__7__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82752 = new BitSet(new long[]{0x000000000E020000L});
    public static final BitSet FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group__8__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92814 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ContentsAssignment_9_in_rule__Page__Group__9__Impl2844 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102875 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Page__Group__11_in_rule__Page__Group__102878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Page__Group__10__Impl2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__11__Impl_in_rule__Page__Group__112937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Page__Group__11__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionElement__Group__0__Impl_in_rule__ActionElement__Group__03020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionElement__Group__1_in_rule__ActionElement__Group__03023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActionElement__Group__0__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionElement__Group__1__Impl_in_rule__ActionElement__Group__13082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionElement__NameAssignment_1_in_rule__ActionElement__Group__1__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayElement__Group__0__Impl_in_rule__DisplayElement__Group__03143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DisplayElement__Group__1_in_rule__DisplayElement__Group__03146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DisplayElement__Group__0__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayElement__Group__1__Impl_in_rule__DisplayElement__Group__13205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayElement__ReferenceAssignment_1_in_rule__DisplayElement__Group__1__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__0__Impl_in_rule__RepeatElement__Group__03266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__1_in_rule__RepeatElement__Group__03269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RepeatElement__Group__0__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__1__Impl_in_rule__RepeatElement__Group__13328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__2_in_rule__RepeatElement__Group__13331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatElement__ReferenceAssignment_1_in_rule__RepeatElement__Group__1__Impl3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__2__Impl_in_rule__RepeatElement__Group__23388 = new BitSet(new long[]{0x0000000006020000L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__3_in_rule__RepeatElement__Group__23391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RepeatElement__Group__2__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__3__Impl_in_rule__RepeatElement__Group__33450 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__4_in_rule__RepeatElement__Group__33453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatElement__ContentsAssignment_3_in_rule__RepeatElement__Group__3__Impl3480 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__RepeatElement__Group__4__Impl_in_rule__RepeatElement__Group__43511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RepeatElement__Group__4__Impl3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_13585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_rule__Model__DomainAssignment_23616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebModel_in_rule__Model__WebAssignment_33647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__DomainModel__TypesAssignment_13678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_13709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_33740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_03771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__TypeAssignment_23806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__MultivaluedAlternatives_3_0_in_rule__Feature__MultivaluedAssignment_33841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__WebModel__PagesAssignment_13905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_53967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__EntityAssignment_74002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageElement_in_rule__Page__ContentsAssignment_94037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionElement__NameAssignment_14068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DisplayElement__ReferenceAssignment_14103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RepeatElement__ReferenceAssignment_14142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_rule__RepeatElement__ContentsAssignment_34177 = new BitSet(new long[]{0x0000000000000002L});

}