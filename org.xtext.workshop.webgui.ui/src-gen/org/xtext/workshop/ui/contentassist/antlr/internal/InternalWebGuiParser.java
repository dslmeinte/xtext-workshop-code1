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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'(s)'", "'(es)'", "'model'", "'domain:'", "'entity'", "'{'", "'}'", "':'", "'type'", "'web:'", "'page'", "'title'", "'='", "'context'", "'action'", "'show'", "'.'"
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


    // $ANTLR start entryRuleActionElement
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:313:1: entryRuleActionElement : ruleActionElement EOF ;
    public final void entryRuleActionElement() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:314:1: ( ruleActionElement EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:315:1: ruleActionElement EOF
            {
             before(grammarAccess.getActionElementRule()); 
            pushFollow(FOLLOW_ruleActionElement_in_entryRuleActionElement601);
            ruleActionElement();
            _fsp--;

             after(grammarAccess.getActionElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionElement608); 

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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:322:1: ruleActionElement : ( ( rule__ActionElement__Group__0 ) ) ;
    public final void ruleActionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:326:2: ( ( ( rule__ActionElement__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:327:1: ( ( rule__ActionElement__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:327:1: ( ( rule__ActionElement__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:328:1: ( rule__ActionElement__Group__0 )
            {
             before(grammarAccess.getActionElementAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:329:1: ( rule__ActionElement__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:329:2: rule__ActionElement__Group__0
            {
            pushFollow(FOLLOW_rule__ActionElement__Group__0_in_ruleActionElement634);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:341:1: entryRuleDisplayElement : ruleDisplayElement EOF ;
    public final void entryRuleDisplayElement() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:342:1: ( ruleDisplayElement EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:343:1: ruleDisplayElement EOF
            {
             before(grammarAccess.getDisplayElementRule()); 
            pushFollow(FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement661);
            ruleDisplayElement();
            _fsp--;

             after(grammarAccess.getDisplayElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayElement668); 

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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:350:1: ruleDisplayElement : ( ( rule__DisplayElement__Group__0 ) ) ;
    public final void ruleDisplayElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:354:2: ( ( ( rule__DisplayElement__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:355:1: ( ( rule__DisplayElement__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:355:1: ( ( rule__DisplayElement__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:356:1: ( rule__DisplayElement__Group__0 )
            {
             before(grammarAccess.getDisplayElementAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:357:1: ( rule__DisplayElement__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:357:2: rule__DisplayElement__Group__0
            {
            pushFollow(FOLLOW_rule__DisplayElement__Group__0_in_ruleDisplayElement694);
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


    // $ANTLR start entryRuleDomainPath
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:369:1: entryRuleDomainPath : ruleDomainPath EOF ;
    public final void entryRuleDomainPath() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:370:1: ( ruleDomainPath EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:371:1: ruleDomainPath EOF
            {
             before(grammarAccess.getDomainPathRule()); 
            pushFollow(FOLLOW_ruleDomainPath_in_entryRuleDomainPath721);
            ruleDomainPath();
            _fsp--;

             after(grammarAccess.getDomainPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainPath728); 

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
    // $ANTLR end entryRuleDomainPath


    // $ANTLR start ruleDomainPath
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:378:1: ruleDomainPath : ( ( rule__DomainPath__Group__0 ) ) ;
    public final void ruleDomainPath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:382:2: ( ( ( rule__DomainPath__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:383:1: ( ( rule__DomainPath__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:383:1: ( ( rule__DomainPath__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:384:1: ( rule__DomainPath__Group__0 )
            {
             before(grammarAccess.getDomainPathAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:385:1: ( rule__DomainPath__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:385:2: rule__DomainPath__Group__0
            {
            pushFollow(FOLLOW_rule__DomainPath__Group__0_in_ruleDomainPath754);
            rule__DomainPath__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDomainPathAccess().getGroup()); 

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
    // $ANTLR end ruleDomainPath


    // $ANTLR start entryRuleDomainPathTail
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:397:1: entryRuleDomainPathTail : ruleDomainPathTail EOF ;
    public final void entryRuleDomainPathTail() throws RecognitionException {
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:398:1: ( ruleDomainPathTail EOF )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:399:1: ruleDomainPathTail EOF
            {
             before(grammarAccess.getDomainPathTailRule()); 
            pushFollow(FOLLOW_ruleDomainPathTail_in_entryRuleDomainPathTail781);
            ruleDomainPathTail();
            _fsp--;

             after(grammarAccess.getDomainPathTailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainPathTail788); 

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
    // $ANTLR end entryRuleDomainPathTail


    // $ANTLR start ruleDomainPathTail
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:406:1: ruleDomainPathTail : ( ( rule__DomainPathTail__Group__0 ) ) ;
    public final void ruleDomainPathTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:410:2: ( ( ( rule__DomainPathTail__Group__0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:411:1: ( ( rule__DomainPathTail__Group__0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:411:1: ( ( rule__DomainPathTail__Group__0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:412:1: ( rule__DomainPathTail__Group__0 )
            {
             before(grammarAccess.getDomainPathTailAccess().getGroup()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:413:1: ( rule__DomainPathTail__Group__0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:413:2: rule__DomainPathTail__Group__0
            {
            pushFollow(FOLLOW_rule__DomainPathTail__Group__0_in_ruleDomainPathTail814);
            rule__DomainPathTail__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDomainPathTailAccess().getGroup()); 

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
    // $ANTLR end ruleDomainPathTail


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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:473:1: rule__PageElement__Alternatives : ( ( ruleActionElement ) | ( ruleDisplayElement ) );
    public final void rule__PageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:477:1: ( ( ruleActionElement ) | ( ruleDisplayElement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("473:1: rule__PageElement__Alternatives : ( ( ruleActionElement ) | ( ruleDisplayElement ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:478:1: ( ruleActionElement )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:478:1: ( ruleActionElement )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:479:1: ruleActionElement
                    {
                     before(grammarAccess.getPageElementAccess().getActionElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionElement_in_rule__PageElement__Alternatives954);
                    ruleActionElement();
                    _fsp--;

                     after(grammarAccess.getPageElementAccess().getActionElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:484:6: ( ruleDisplayElement )
                    {
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:484:6: ( ruleDisplayElement )
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:485:1: ruleDisplayElement
                    {
                     before(grammarAccess.getPageElementAccess().getDisplayElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDisplayElement_in_rule__PageElement__Alternatives971);
                    ruleDisplayElement();
                    _fsp--;

                     after(grammarAccess.getPageElementAccess().getDisplayElementParserRuleCall_1()); 

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


    // $ANTLR start rule__Model__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:497:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:501:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:502:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01001);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01004);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:509:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:513:1: ( ( 'model' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:514:1: ( 'model' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:514:1: ( 'model' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:515:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__0__Impl1032); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:528:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:532:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:533:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11063);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11066);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:540:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:544:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:545:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:545:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:546:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:547:1: ( rule__Model__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:547:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1093);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:557:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:561:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:562:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21123);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21126);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:569:1: rule__Model__Group__2__Impl : ( ( rule__Model__DomainAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:573:1: ( ( ( rule__Model__DomainAssignment_2 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:574:1: ( ( rule__Model__DomainAssignment_2 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:574:1: ( ( rule__Model__DomainAssignment_2 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:575:1: ( rule__Model__DomainAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getDomainAssignment_2()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:576:1: ( rule__Model__DomainAssignment_2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:576:2: rule__Model__DomainAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__DomainAssignment_2_in_rule__Model__Group__2__Impl1153);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:586:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:590:1: ( rule__Model__Group__3__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:591:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31183);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:597:1: rule__Model__Group__3__Impl : ( ( rule__Model__WebAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:601:1: ( ( ( rule__Model__WebAssignment_3 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:602:1: ( ( rule__Model__WebAssignment_3 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:602:1: ( ( rule__Model__WebAssignment_3 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:603:1: ( rule__Model__WebAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getWebAssignment_3()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:604:1: ( rule__Model__WebAssignment_3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:604:2: rule__Model__WebAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__WebAssignment_3_in_rule__Model__Group__3__Impl1210);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:622:1: rule__DomainModel__Group__0 : rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 ;
    public final void rule__DomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:626:1: ( rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:627:2: rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__01248);
            rule__DomainModel__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__01251);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:634:1: rule__DomainModel__Group__0__Impl : ( 'domain:' ) ;
    public final void rule__DomainModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:638:1: ( ( 'domain:' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:639:1: ( 'domain:' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:639:1: ( 'domain:' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:640:1: 'domain:'
            {
             before(grammarAccess.getDomainModelAccess().getDomainKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__DomainModel__Group__0__Impl1279); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:653:1: rule__DomainModel__Group__1 : rule__DomainModel__Group__1__Impl ;
    public final void rule__DomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:657:1: ( rule__DomainModel__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:658:2: rule__DomainModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__11310);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:664:1: rule__DomainModel__Group__1__Impl : ( ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* ) ) ;
    public final void rule__DomainModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:668:1: ( ( ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:669:1: ( ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:669:1: ( ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:670:1: ( ( rule__DomainModel__TypesAssignment_1 ) ) ( ( rule__DomainModel__TypesAssignment_1 )* )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:670:1: ( ( rule__DomainModel__TypesAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:671:1: ( rule__DomainModel__TypesAssignment_1 )
            {
             before(grammarAccess.getDomainModelAccess().getTypesAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:672:1: ( rule__DomainModel__TypesAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:672:2: rule__DomainModel__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__DomainModel__TypesAssignment_1_in_rule__DomainModel__Group__1__Impl1339);
            rule__DomainModel__TypesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getTypesAssignment_1()); 

            }

            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:675:1: ( ( rule__DomainModel__TypesAssignment_1 )* )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:676:1: ( rule__DomainModel__TypesAssignment_1 )*
            {
             before(grammarAccess.getDomainModelAccess().getTypesAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:677:1: ( rule__DomainModel__TypesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:677:2: rule__DomainModel__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__TypesAssignment_1_in_rule__DomainModel__Group__1__Impl1351);
            	    rule__DomainModel__TypesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:692:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:696:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:697:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01388);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01391);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:704:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:708:1: ( ( 'entity' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:709:1: ( 'entity' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:709:1: ( 'entity' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:710:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__0__Impl1419); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:723:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:727:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:728:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11450);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11453);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:735:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:739:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:740:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:740:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:741:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:742:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:742:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1480);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:752:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:756:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:757:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21510);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21513);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:764:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:768:1: ( ( '{' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:769:1: ( '{' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:769:1: ( '{' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:770:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__2__Impl1541); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:783:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:787:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:788:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31572);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31575);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:795:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__FeaturesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:799:1: ( ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:800:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:800:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:801:1: ( rule__Entity__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:802:1: ( rule__Entity__FeaturesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:802:2: rule__Entity__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl1602);
            	    rule__Entity__FeaturesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:812:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:816:1: ( rule__Entity__Group__4__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:817:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41633);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:823:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:827:1: ( ( '}' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:828:1: ( '}' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:828:1: ( '}' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:829:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__4__Impl1661); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:852:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:856:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:857:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01702);
            rule__Feature__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01705);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:864:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__NameAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:868:1: ( ( ( rule__Feature__NameAssignment_0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:869:1: ( ( rule__Feature__NameAssignment_0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:869:1: ( ( rule__Feature__NameAssignment_0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:870:1: ( rule__Feature__NameAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:871:1: ( rule__Feature__NameAssignment_0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:871:2: rule__Feature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1732);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:881:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:885:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:886:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11762);
            rule__Feature__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11765);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:893:1: rule__Feature__Group__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:897:1: ( ( ':' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:898:1: ( ':' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:898:1: ( ':' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:899:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Feature__Group__1__Impl1793); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:912:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:916:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:917:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21824);
            rule__Feature__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21827);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:924:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TypeAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:928:1: ( ( ( rule__Feature__TypeAssignment_2 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:929:1: ( ( rule__Feature__TypeAssignment_2 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:929:1: ( ( rule__Feature__TypeAssignment_2 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:930:1: ( rule__Feature__TypeAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_2()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:931:1: ( rule__Feature__TypeAssignment_2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:931:2: rule__Feature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl1854);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:941:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:945:1: ( rule__Feature__Group__3__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:946:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31884);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:952:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__MultivaluedAssignment_3 )? ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:956:1: ( ( ( rule__Feature__MultivaluedAssignment_3 )? ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:957:1: ( ( rule__Feature__MultivaluedAssignment_3 )? )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:957:1: ( ( rule__Feature__MultivaluedAssignment_3 )? )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:958:1: ( rule__Feature__MultivaluedAssignment_3 )?
            {
             before(grammarAccess.getFeatureAccess().getMultivaluedAssignment_3()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:959:1: ( rule__Feature__MultivaluedAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:959:2: rule__Feature__MultivaluedAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Feature__MultivaluedAssignment_3_in_rule__Feature__Group__3__Impl1911);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:977:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:981:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:982:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01950);
            rule__DataType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01953);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:989:1: rule__DataType__Group__0__Impl : ( 'type' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:993:1: ( ( 'type' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:994:1: ( 'type' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:994:1: ( 'type' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:995:1: 'type'
            {
             before(grammarAccess.getDataTypeAccess().getTypeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__DataType__Group__0__Impl1981); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1008:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1012:1: ( rule__DataType__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1013:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12012);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1019:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1023:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1024:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1024:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1025:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1026:1: ( rule__DataType__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1026:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2039);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1040:1: rule__WebModel__Group__0 : rule__WebModel__Group__0__Impl rule__WebModel__Group__1 ;
    public final void rule__WebModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1044:1: ( rule__WebModel__Group__0__Impl rule__WebModel__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1045:2: rule__WebModel__Group__0__Impl rule__WebModel__Group__1
            {
            pushFollow(FOLLOW_rule__WebModel__Group__0__Impl_in_rule__WebModel__Group__02073);
            rule__WebModel__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WebModel__Group__1_in_rule__WebModel__Group__02076);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1052:1: rule__WebModel__Group__0__Impl : ( 'web:' ) ;
    public final void rule__WebModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1056:1: ( ( 'web:' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1057:1: ( 'web:' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1057:1: ( 'web:' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1058:1: 'web:'
            {
             before(grammarAccess.getWebModelAccess().getWebKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__WebModel__Group__0__Impl2104); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1071:1: rule__WebModel__Group__1 : rule__WebModel__Group__1__Impl ;
    public final void rule__WebModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1075:1: ( rule__WebModel__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1076:2: rule__WebModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WebModel__Group__1__Impl_in_rule__WebModel__Group__12135);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1082:1: rule__WebModel__Group__1__Impl : ( ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* ) ) ;
    public final void rule__WebModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1086:1: ( ( ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1087:1: ( ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1087:1: ( ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1088:1: ( ( rule__WebModel__PagesAssignment_1 ) ) ( ( rule__WebModel__PagesAssignment_1 )* )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1088:1: ( ( rule__WebModel__PagesAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1089:1: ( rule__WebModel__PagesAssignment_1 )
            {
             before(grammarAccess.getWebModelAccess().getPagesAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1090:1: ( rule__WebModel__PagesAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1090:2: rule__WebModel__PagesAssignment_1
            {
            pushFollow(FOLLOW_rule__WebModel__PagesAssignment_1_in_rule__WebModel__Group__1__Impl2164);
            rule__WebModel__PagesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getWebModelAccess().getPagesAssignment_1()); 

            }

            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1093:1: ( ( rule__WebModel__PagesAssignment_1 )* )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1094:1: ( rule__WebModel__PagesAssignment_1 )*
            {
             before(grammarAccess.getWebModelAccess().getPagesAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1095:1: ( rule__WebModel__PagesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1095:2: rule__WebModel__PagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__WebModel__PagesAssignment_1_in_rule__WebModel__Group__1__Impl2176);
            	    rule__WebModel__PagesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1110:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1114:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1115:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02213);
            rule__Page__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02216);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1122:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1126:1: ( ( 'page' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1127:1: ( 'page' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1127:1: ( 'page' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1128:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Page__Group__0__Impl2244); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1141:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1145:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1146:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12275);
            rule__Page__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12278);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1153:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1157:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1158:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1158:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1159:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1160:1: ( rule__Page__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1160:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl2305);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1170:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1174:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1175:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22335);
            rule__Page__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22338);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1182:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1186:1: ( ( '{' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1187:1: ( '{' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1187:1: ( '{' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1188:1: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Page__Group__2__Impl2366); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1201:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1205:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1206:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32397);
            rule__Page__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32400);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1213:1: rule__Page__Group__3__Impl : ( 'title' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1217:1: ( ( 'title' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1218:1: ( 'title' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1218:1: ( 'title' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1219:1: 'title'
            {
             before(grammarAccess.getPageAccess().getTitleKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Page__Group__3__Impl2428); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1232:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1236:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1237:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42459);
            rule__Page__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42462);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1244:1: rule__Page__Group__4__Impl : ( '=' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1248:1: ( ( '=' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1249:1: ( '=' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1249:1: ( '=' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1250:1: '='
            {
             before(grammarAccess.getPageAccess().getEqualsSignKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Page__Group__4__Impl2490); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1263:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1267:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1268:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52521);
            rule__Page__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__6_in_rule__Page__Group__52524);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1275:1: rule__Page__Group__5__Impl : ( ( rule__Page__TitleAssignment_5 ) ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1279:1: ( ( ( rule__Page__TitleAssignment_5 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1280:1: ( ( rule__Page__TitleAssignment_5 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1280:1: ( ( rule__Page__TitleAssignment_5 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1281:1: ( rule__Page__TitleAssignment_5 )
            {
             before(grammarAccess.getPageAccess().getTitleAssignment_5()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1282:1: ( rule__Page__TitleAssignment_5 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1282:2: rule__Page__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__Page__TitleAssignment_5_in_rule__Page__Group__5__Impl2551);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1292:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1296:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1297:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__62581);
            rule__Page__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__7_in_rule__Page__Group__62584);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1304:1: rule__Page__Group__6__Impl : ( 'context' ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1308:1: ( ( 'context' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1309:1: ( 'context' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1309:1: ( 'context' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1310:1: 'context'
            {
             before(grammarAccess.getPageAccess().getContextKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__Page__Group__6__Impl2612); 
             after(grammarAccess.getPageAccess().getContextKeyword_6()); 

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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1323:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1327:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1328:2: rule__Page__Group__7__Impl rule__Page__Group__8
            {
            pushFollow(FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__72643);
            rule__Page__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__8_in_rule__Page__Group__72646);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1335:1: rule__Page__Group__7__Impl : ( '=' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1339:1: ( ( '=' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1340:1: ( '=' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1340:1: ( '=' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1341:1: '='
            {
             before(grammarAccess.getPageAccess().getEqualsSignKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Page__Group__7__Impl2674); 
             after(grammarAccess.getPageAccess().getEqualsSignKeyword_7()); 

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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1354:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1358:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1359:2: rule__Page__Group__8__Impl rule__Page__Group__9
            {
            pushFollow(FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82705);
            rule__Page__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82708);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1366:1: rule__Page__Group__8__Impl : ( ( rule__Page__EntityAssignment_8 ) ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1370:1: ( ( ( rule__Page__EntityAssignment_8 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1371:1: ( ( rule__Page__EntityAssignment_8 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1371:1: ( ( rule__Page__EntityAssignment_8 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1372:1: ( rule__Page__EntityAssignment_8 )
            {
             before(grammarAccess.getPageAccess().getEntityAssignment_8()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1373:1: ( rule__Page__EntityAssignment_8 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1373:2: rule__Page__EntityAssignment_8
            {
            pushFollow(FOLLOW_rule__Page__EntityAssignment_8_in_rule__Page__Group__8__Impl2735);
            rule__Page__EntityAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getPageAccess().getEntityAssignment_8()); 

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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1383:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1387:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1388:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92765);
            rule__Page__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92768);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1395:1: rule__Page__Group__9__Impl : ( ( rule__Page__ContentsAssignment_9 )* ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1399:1: ( ( ( rule__Page__ContentsAssignment_9 )* ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1400:1: ( ( rule__Page__ContentsAssignment_9 )* )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1400:1: ( ( rule__Page__ContentsAssignment_9 )* )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1401:1: ( rule__Page__ContentsAssignment_9 )*
            {
             before(grammarAccess.getPageAccess().getContentsAssignment_9()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1402:1: ( rule__Page__ContentsAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=25 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1402:2: rule__Page__ContentsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Page__ContentsAssignment_9_in_rule__Page__Group__9__Impl2795);
            	    rule__Page__ContentsAssignment_9();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1412:1: rule__Page__Group__10 : rule__Page__Group__10__Impl ;
    public final void rule__Page__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1416:1: ( rule__Page__Group__10__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1417:2: rule__Page__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102826);
            rule__Page__Group__10__Impl();
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1423:1: rule__Page__Group__10__Impl : ( '}' ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1427:1: ( ( '}' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1428:1: ( '}' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1428:1: ( '}' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1429:1: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_17_in_rule__Page__Group__10__Impl2854); 
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


    // $ANTLR start rule__ActionElement__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1464:1: rule__ActionElement__Group__0 : rule__ActionElement__Group__0__Impl rule__ActionElement__Group__1 ;
    public final void rule__ActionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1468:1: ( rule__ActionElement__Group__0__Impl rule__ActionElement__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1469:2: rule__ActionElement__Group__0__Impl rule__ActionElement__Group__1
            {
            pushFollow(FOLLOW_rule__ActionElement__Group__0__Impl_in_rule__ActionElement__Group__02907);
            rule__ActionElement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ActionElement__Group__1_in_rule__ActionElement__Group__02910);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1476:1: rule__ActionElement__Group__0__Impl : ( 'action' ) ;
    public final void rule__ActionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1480:1: ( ( 'action' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1481:1: ( 'action' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1481:1: ( 'action' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1482:1: 'action'
            {
             before(grammarAccess.getActionElementAccess().getActionKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ActionElement__Group__0__Impl2938); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1495:1: rule__ActionElement__Group__1 : rule__ActionElement__Group__1__Impl ;
    public final void rule__ActionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1499:1: ( rule__ActionElement__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1500:2: rule__ActionElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionElement__Group__1__Impl_in_rule__ActionElement__Group__12969);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1506:1: rule__ActionElement__Group__1__Impl : ( ( rule__ActionElement__NameAssignment_1 ) ) ;
    public final void rule__ActionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1510:1: ( ( ( rule__ActionElement__NameAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1511:1: ( ( rule__ActionElement__NameAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1511:1: ( ( rule__ActionElement__NameAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1512:1: ( rule__ActionElement__NameAssignment_1 )
            {
             before(grammarAccess.getActionElementAccess().getNameAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1513:1: ( rule__ActionElement__NameAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1513:2: rule__ActionElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionElement__NameAssignment_1_in_rule__ActionElement__Group__1__Impl2996);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1527:1: rule__DisplayElement__Group__0 : rule__DisplayElement__Group__0__Impl rule__DisplayElement__Group__1 ;
    public final void rule__DisplayElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1531:1: ( rule__DisplayElement__Group__0__Impl rule__DisplayElement__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1532:2: rule__DisplayElement__Group__0__Impl rule__DisplayElement__Group__1
            {
            pushFollow(FOLLOW_rule__DisplayElement__Group__0__Impl_in_rule__DisplayElement__Group__03030);
            rule__DisplayElement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DisplayElement__Group__1_in_rule__DisplayElement__Group__03033);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1539:1: rule__DisplayElement__Group__0__Impl : ( 'show' ) ;
    public final void rule__DisplayElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1543:1: ( ( 'show' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1544:1: ( 'show' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1544:1: ( 'show' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1545:1: 'show'
            {
             before(grammarAccess.getDisplayElementAccess().getShowKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__DisplayElement__Group__0__Impl3061); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1558:1: rule__DisplayElement__Group__1 : rule__DisplayElement__Group__1__Impl ;
    public final void rule__DisplayElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1562:1: ( rule__DisplayElement__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1563:2: rule__DisplayElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DisplayElement__Group__1__Impl_in_rule__DisplayElement__Group__13092);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1569:1: rule__DisplayElement__Group__1__Impl : ( ( rule__DisplayElement__ReferenceAssignment_1 ) ) ;
    public final void rule__DisplayElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1573:1: ( ( ( rule__DisplayElement__ReferenceAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1574:1: ( ( rule__DisplayElement__ReferenceAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1574:1: ( ( rule__DisplayElement__ReferenceAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1575:1: ( rule__DisplayElement__ReferenceAssignment_1 )
            {
             before(grammarAccess.getDisplayElementAccess().getReferenceAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1576:1: ( rule__DisplayElement__ReferenceAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1576:2: rule__DisplayElement__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__DisplayElement__ReferenceAssignment_1_in_rule__DisplayElement__Group__1__Impl3119);
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


    // $ANTLR start rule__DomainPath__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1590:1: rule__DomainPath__Group__0 : rule__DomainPath__Group__0__Impl rule__DomainPath__Group__1 ;
    public final void rule__DomainPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1594:1: ( rule__DomainPath__Group__0__Impl rule__DomainPath__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1595:2: rule__DomainPath__Group__0__Impl rule__DomainPath__Group__1
            {
            pushFollow(FOLLOW_rule__DomainPath__Group__0__Impl_in_rule__DomainPath__Group__03153);
            rule__DomainPath__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainPath__Group__1_in_rule__DomainPath__Group__03156);
            rule__DomainPath__Group__1();
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
    // $ANTLR end rule__DomainPath__Group__0


    // $ANTLR start rule__DomainPath__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1602:1: rule__DomainPath__Group__0__Impl : ( ( rule__DomainPath__FeatureAssignment_0 ) ) ;
    public final void rule__DomainPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1606:1: ( ( ( rule__DomainPath__FeatureAssignment_0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1607:1: ( ( rule__DomainPath__FeatureAssignment_0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1607:1: ( ( rule__DomainPath__FeatureAssignment_0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1608:1: ( rule__DomainPath__FeatureAssignment_0 )
            {
             before(grammarAccess.getDomainPathAccess().getFeatureAssignment_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1609:1: ( rule__DomainPath__FeatureAssignment_0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1609:2: rule__DomainPath__FeatureAssignment_0
            {
            pushFollow(FOLLOW_rule__DomainPath__FeatureAssignment_0_in_rule__DomainPath__Group__0__Impl3183);
            rule__DomainPath__FeatureAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDomainPathAccess().getFeatureAssignment_0()); 

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
    // $ANTLR end rule__DomainPath__Group__0__Impl


    // $ANTLR start rule__DomainPath__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1619:1: rule__DomainPath__Group__1 : rule__DomainPath__Group__1__Impl ;
    public final void rule__DomainPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1623:1: ( rule__DomainPath__Group__1__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1624:2: rule__DomainPath__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainPath__Group__1__Impl_in_rule__DomainPath__Group__13213);
            rule__DomainPath__Group__1__Impl();
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
    // $ANTLR end rule__DomainPath__Group__1


    // $ANTLR start rule__DomainPath__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1630:1: rule__DomainPath__Group__1__Impl : ( ( rule__DomainPath__TailAssignment_1 )? ) ;
    public final void rule__DomainPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1634:1: ( ( ( rule__DomainPath__TailAssignment_1 )? ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1635:1: ( ( rule__DomainPath__TailAssignment_1 )? )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1635:1: ( ( rule__DomainPath__TailAssignment_1 )? )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1636:1: ( rule__DomainPath__TailAssignment_1 )?
            {
             before(grammarAccess.getDomainPathAccess().getTailAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1637:1: ( rule__DomainPath__TailAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1637:2: rule__DomainPath__TailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__DomainPath__TailAssignment_1_in_rule__DomainPath__Group__1__Impl3240);
                    rule__DomainPath__TailAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainPathAccess().getTailAssignment_1()); 

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
    // $ANTLR end rule__DomainPath__Group__1__Impl


    // $ANTLR start rule__DomainPathTail__Group__0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1651:1: rule__DomainPathTail__Group__0 : rule__DomainPathTail__Group__0__Impl rule__DomainPathTail__Group__1 ;
    public final void rule__DomainPathTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1655:1: ( rule__DomainPathTail__Group__0__Impl rule__DomainPathTail__Group__1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1656:2: rule__DomainPathTail__Group__0__Impl rule__DomainPathTail__Group__1
            {
            pushFollow(FOLLOW_rule__DomainPathTail__Group__0__Impl_in_rule__DomainPathTail__Group__03275);
            rule__DomainPathTail__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainPathTail__Group__1_in_rule__DomainPathTail__Group__03278);
            rule__DomainPathTail__Group__1();
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
    // $ANTLR end rule__DomainPathTail__Group__0


    // $ANTLR start rule__DomainPathTail__Group__0__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1663:1: rule__DomainPathTail__Group__0__Impl : ( '.' ) ;
    public final void rule__DomainPathTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1667:1: ( ( '.' ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1668:1: ( '.' )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1668:1: ( '.' )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1669:1: '.'
            {
             before(grammarAccess.getDomainPathTailAccess().getFullStopKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__DomainPathTail__Group__0__Impl3306); 
             after(grammarAccess.getDomainPathTailAccess().getFullStopKeyword_0()); 

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
    // $ANTLR end rule__DomainPathTail__Group__0__Impl


    // $ANTLR start rule__DomainPathTail__Group__1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1682:1: rule__DomainPathTail__Group__1 : rule__DomainPathTail__Group__1__Impl rule__DomainPathTail__Group__2 ;
    public final void rule__DomainPathTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1686:1: ( rule__DomainPathTail__Group__1__Impl rule__DomainPathTail__Group__2 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1687:2: rule__DomainPathTail__Group__1__Impl rule__DomainPathTail__Group__2
            {
            pushFollow(FOLLOW_rule__DomainPathTail__Group__1__Impl_in_rule__DomainPathTail__Group__13337);
            rule__DomainPathTail__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainPathTail__Group__2_in_rule__DomainPathTail__Group__13340);
            rule__DomainPathTail__Group__2();
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
    // $ANTLR end rule__DomainPathTail__Group__1


    // $ANTLR start rule__DomainPathTail__Group__1__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1694:1: rule__DomainPathTail__Group__1__Impl : ( ( rule__DomainPathTail__FeatureAssignment_1 ) ) ;
    public final void rule__DomainPathTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1698:1: ( ( ( rule__DomainPathTail__FeatureAssignment_1 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1699:1: ( ( rule__DomainPathTail__FeatureAssignment_1 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1699:1: ( ( rule__DomainPathTail__FeatureAssignment_1 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1700:1: ( rule__DomainPathTail__FeatureAssignment_1 )
            {
             before(grammarAccess.getDomainPathTailAccess().getFeatureAssignment_1()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1701:1: ( rule__DomainPathTail__FeatureAssignment_1 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1701:2: rule__DomainPathTail__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__DomainPathTail__FeatureAssignment_1_in_rule__DomainPathTail__Group__1__Impl3367);
            rule__DomainPathTail__FeatureAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDomainPathTailAccess().getFeatureAssignment_1()); 

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
    // $ANTLR end rule__DomainPathTail__Group__1__Impl


    // $ANTLR start rule__DomainPathTail__Group__2
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1711:1: rule__DomainPathTail__Group__2 : rule__DomainPathTail__Group__2__Impl ;
    public final void rule__DomainPathTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1715:1: ( rule__DomainPathTail__Group__2__Impl )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1716:2: rule__DomainPathTail__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DomainPathTail__Group__2__Impl_in_rule__DomainPathTail__Group__23397);
            rule__DomainPathTail__Group__2__Impl();
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
    // $ANTLR end rule__DomainPathTail__Group__2


    // $ANTLR start rule__DomainPathTail__Group__2__Impl
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1722:1: rule__DomainPathTail__Group__2__Impl : ( ( rule__DomainPathTail__TailAssignment_2 )? ) ;
    public final void rule__DomainPathTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1726:1: ( ( ( rule__DomainPathTail__TailAssignment_2 )? ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1727:1: ( ( rule__DomainPathTail__TailAssignment_2 )? )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1727:1: ( ( rule__DomainPathTail__TailAssignment_2 )? )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1728:1: ( rule__DomainPathTail__TailAssignment_2 )?
            {
             before(grammarAccess.getDomainPathTailAccess().getTailAssignment_2()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1729:1: ( rule__DomainPathTail__TailAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1729:2: rule__DomainPathTail__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DomainPathTail__TailAssignment_2_in_rule__DomainPathTail__Group__2__Impl3424);
                    rule__DomainPathTail__TailAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainPathTailAccess().getTailAssignment_2()); 

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
    // $ANTLR end rule__DomainPathTail__Group__2__Impl


    // $ANTLR start rule__Model__NameAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1746:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1750:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1751:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1751:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1752:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_13466); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1761:1: rule__Model__DomainAssignment_2 : ( ruleDomainModel ) ;
    public final void rule__Model__DomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1765:1: ( ( ruleDomainModel ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1766:1: ( ruleDomainModel )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1766:1: ( ruleDomainModel )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1767:1: ruleDomainModel
            {
             before(grammarAccess.getModelAccess().getDomainDomainModelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDomainModel_in_rule__Model__DomainAssignment_23497);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1776:1: rule__Model__WebAssignment_3 : ( ruleWebModel ) ;
    public final void rule__Model__WebAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1780:1: ( ( ruleWebModel ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1781:1: ( ruleWebModel )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1781:1: ( ruleWebModel )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1782:1: ruleWebModel
            {
             before(grammarAccess.getModelAccess().getWebWebModelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWebModel_in_rule__Model__WebAssignment_33528);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1791:1: rule__DomainModel__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__DomainModel__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1795:1: ( ( ruleType ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1796:1: ( ruleType )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1796:1: ( ruleType )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1797:1: ruleType
            {
             before(grammarAccess.getDomainModelAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__DomainModel__TypesAssignment_13559);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1806:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1810:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1811:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1811:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1812:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_13590); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1821:1: rule__Entity__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1825:1: ( ( ruleFeature ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1826:1: ( ruleFeature )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1826:1: ( ruleFeature )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1827:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_33621);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1836:1: rule__Feature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1840:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1841:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1841:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1842:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_03652); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1851:1: rule__Feature__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1855:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1856:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1856:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1857:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1858:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1859:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__TypeAssignment_23687); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1870:1: rule__Feature__MultivaluedAssignment_3 : ( ( rule__Feature__MultivaluedAlternatives_3_0 ) ) ;
    public final void rule__Feature__MultivaluedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1874:1: ( ( ( rule__Feature__MultivaluedAlternatives_3_0 ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1875:1: ( ( rule__Feature__MultivaluedAlternatives_3_0 ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1875:1: ( ( rule__Feature__MultivaluedAlternatives_3_0 ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1876:1: ( rule__Feature__MultivaluedAlternatives_3_0 )
            {
             before(grammarAccess.getFeatureAccess().getMultivaluedAlternatives_3_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1877:1: ( rule__Feature__MultivaluedAlternatives_3_0 )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1877:2: rule__Feature__MultivaluedAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Feature__MultivaluedAlternatives_3_0_in_rule__Feature__MultivaluedAssignment_33722);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1886:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1890:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1891:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1891:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1892:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_13755); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1901:1: rule__WebModel__PagesAssignment_1 : ( rulePage ) ;
    public final void rule__WebModel__PagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1905:1: ( ( rulePage ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1906:1: ( rulePage )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1906:1: ( rulePage )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1907:1: rulePage
            {
             before(grammarAccess.getWebModelAccess().getPagesPageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__WebModel__PagesAssignment_13786);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1916:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1920:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1921:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1921:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1922:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13817); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1931:1: rule__Page__TitleAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Page__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1935:1: ( ( RULE_STRING ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1936:1: ( RULE_STRING )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1936:1: ( RULE_STRING )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1937:1: RULE_STRING
            {
             before(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_53848); 
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


    // $ANTLR start rule__Page__EntityAssignment_8
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1946:1: rule__Page__EntityAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Page__EntityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1950:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1951:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1951:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1952:1: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getEntityEntityCrossReference_8_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1953:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1954:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getEntityEntityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__EntityAssignment_83883); 
             after(grammarAccess.getPageAccess().getEntityEntityIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getPageAccess().getEntityEntityCrossReference_8_0()); 

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
    // $ANTLR end rule__Page__EntityAssignment_8


    // $ANTLR start rule__Page__ContentsAssignment_9
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1965:1: rule__Page__ContentsAssignment_9 : ( rulePageElement ) ;
    public final void rule__Page__ContentsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1969:1: ( ( rulePageElement ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1970:1: ( rulePageElement )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1970:1: ( rulePageElement )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1971:1: rulePageElement
            {
             before(grammarAccess.getPageAccess().getContentsPageElementParserRuleCall_9_0()); 
            pushFollow(FOLLOW_rulePageElement_in_rule__Page__ContentsAssignment_93918);
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1980:1: rule__ActionElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1984:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1985:1: ( RULE_ID )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1985:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1986:1: RULE_ID
            {
             before(grammarAccess.getActionElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionElement__NameAssignment_13949); 
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
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1995:1: rule__DisplayElement__ReferenceAssignment_1 : ( ruleDomainPath ) ;
    public final void rule__DisplayElement__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:1999:1: ( ( ruleDomainPath ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2000:1: ( ruleDomainPath )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2000:1: ( ruleDomainPath )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2001:1: ruleDomainPath
            {
             before(grammarAccess.getDisplayElementAccess().getReferenceDomainPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDomainPath_in_rule__DisplayElement__ReferenceAssignment_13980);
            ruleDomainPath();
            _fsp--;

             after(grammarAccess.getDisplayElementAccess().getReferenceDomainPathParserRuleCall_1_0()); 

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


    // $ANTLR start rule__DomainPath__FeatureAssignment_0
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2010:1: rule__DomainPath__FeatureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DomainPath__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2014:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2015:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2015:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2016:1: ( RULE_ID )
            {
             before(grammarAccess.getDomainPathAccess().getFeatureFeatureCrossReference_0_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2017:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2018:1: RULE_ID
            {
             before(grammarAccess.getDomainPathAccess().getFeatureFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DomainPath__FeatureAssignment_04015); 
             after(grammarAccess.getDomainPathAccess().getFeatureFeatureIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDomainPathAccess().getFeatureFeatureCrossReference_0_0()); 

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
    // $ANTLR end rule__DomainPath__FeatureAssignment_0


    // $ANTLR start rule__DomainPath__TailAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2029:1: rule__DomainPath__TailAssignment_1 : ( ruleDomainPathTail ) ;
    public final void rule__DomainPath__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2033:1: ( ( ruleDomainPathTail ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2034:1: ( ruleDomainPathTail )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2034:1: ( ruleDomainPathTail )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2035:1: ruleDomainPathTail
            {
             before(grammarAccess.getDomainPathAccess().getTailDomainPathTailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDomainPathTail_in_rule__DomainPath__TailAssignment_14050);
            ruleDomainPathTail();
            _fsp--;

             after(grammarAccess.getDomainPathAccess().getTailDomainPathTailParserRuleCall_1_0()); 

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
    // $ANTLR end rule__DomainPath__TailAssignment_1


    // $ANTLR start rule__DomainPathTail__FeatureAssignment_1
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2044:1: rule__DomainPathTail__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DomainPathTail__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2048:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2049:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2049:1: ( ( RULE_ID ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2050:1: ( RULE_ID )
            {
             before(grammarAccess.getDomainPathTailAccess().getFeatureFeatureCrossReference_1_0()); 
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2051:1: ( RULE_ID )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2052:1: RULE_ID
            {
             before(grammarAccess.getDomainPathTailAccess().getFeatureFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DomainPathTail__FeatureAssignment_14085); 
             after(grammarAccess.getDomainPathTailAccess().getFeatureFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDomainPathTailAccess().getFeatureFeatureCrossReference_1_0()); 

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
    // $ANTLR end rule__DomainPathTail__FeatureAssignment_1


    // $ANTLR start rule__DomainPathTail__TailAssignment_2
    // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2063:1: rule__DomainPathTail__TailAssignment_2 : ( ruleDomainPathTail ) ;
    public final void rule__DomainPathTail__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2067:1: ( ( ruleDomainPathTail ) )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2068:1: ( ruleDomainPathTail )
            {
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2068:1: ( ruleDomainPathTail )
            // ../org.xtext.workshop.webgui.ui/src-gen/org/xtext/workshop/ui/contentassist/antlr/internal/InternalWebGui.g:2069:1: ruleDomainPathTail
            {
             before(grammarAccess.getDomainPathTailAccess().getTailDomainPathTailParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDomainPathTail_in_rule__DomainPathTail__TailAssignment_24120);
            ruleDomainPathTail();
            _fsp--;

             after(grammarAccess.getDomainPathTailAccess().getTailDomainPathTailParserRuleCall_2_0()); 

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
    // $ANTLR end rule__DomainPathTail__TailAssignment_2


 

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
    public static final BitSet FOLLOW_ruleActionElement_in_entryRuleActionElement601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionElement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionElement__Group__0_in_ruleActionElement634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_entryRuleDisplayElement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayElement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayElement__Group__0_in_ruleDisplayElement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainPath_in_entryRuleDomainPath721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainPath728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPath__Group__0_in_ruleDomainPath754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainPathTail_in_entryRuleDomainPathTail781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainPathTail788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPathTail__Group__0_in_ruleDomainPathTail814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Feature__MultivaluedAlternatives_3_0851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Feature__MultivaluedAlternatives_3_0871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionElement_in_rule__PageElement__Alternatives954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayElement_in_rule__PageElement__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__0__Impl1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11063 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21123 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DomainAssignment_2_in_rule__Model__Group__2__Impl1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WebAssignment_3_in_rule__Model__Group__3__Impl1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__01248 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__01251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DomainModel__Group__0__Impl1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__TypesAssignment_1_in_rule__DomainModel__Group__1__Impl1339 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_rule__DomainModel__TypesAssignment_1_in_rule__DomainModel__Group__1__Impl1351 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__0__Impl1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11450 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21510 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__2__Impl1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31572 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl1602 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__4__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01702 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Feature__Group__1__Impl1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21824 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__MultivaluedAssignment_3_in_rule__Feature__Group__3__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataType__Group__0__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__0__Impl_in_rule__WebModel__Group__02073 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__WebModel__Group__1_in_rule__WebModel__Group__02076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__WebModel__Group__0__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__1__Impl_in_rule__WebModel__Group__12135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__PagesAssignment_1_in_rule__WebModel__Group__1__Impl2164 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__WebModel__PagesAssignment_1_in_rule__WebModel__Group__1__Impl2176 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Page__Group__0__Impl2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12275 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22335 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group__2__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32397 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Page__Group__3__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Page__Group__4__Impl2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52521 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__52524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__TitleAssignment_5_in_rule__Page__Group__5__Impl2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__62581 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Page__Group__7_in_rule__Page__Group__62584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Page__Group__6__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__72643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__8_in_rule__Page__Group__72646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Page__Group__7__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__82705 = new BitSet(new long[]{0x0000000006020000L});
    public static final BitSet FOLLOW_rule__Page__Group__9_in_rule__Page__Group__82708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__EntityAssignment_8_in_rule__Page__Group__8__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__92765 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Page__Group__10_in_rule__Page__Group__92768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ContentsAssignment_9_in_rule__Page__Group__9__Impl2795 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Page__Group__10__Impl_in_rule__Page__Group__102826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Page__Group__10__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionElement__Group__0__Impl_in_rule__ActionElement__Group__02907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionElement__Group__1_in_rule__ActionElement__Group__02910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActionElement__Group__0__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionElement__Group__1__Impl_in_rule__ActionElement__Group__12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionElement__NameAssignment_1_in_rule__ActionElement__Group__1__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayElement__Group__0__Impl_in_rule__DisplayElement__Group__03030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DisplayElement__Group__1_in_rule__DisplayElement__Group__03033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DisplayElement__Group__0__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayElement__Group__1__Impl_in_rule__DisplayElement__Group__13092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayElement__ReferenceAssignment_1_in_rule__DisplayElement__Group__1__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPath__Group__0__Impl_in_rule__DomainPath__Group__03153 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__DomainPath__Group__1_in_rule__DomainPath__Group__03156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPath__FeatureAssignment_0_in_rule__DomainPath__Group__0__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPath__Group__1__Impl_in_rule__DomainPath__Group__13213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPath__TailAssignment_1_in_rule__DomainPath__Group__1__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPathTail__Group__0__Impl_in_rule__DomainPathTail__Group__03275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainPathTail__Group__1_in_rule__DomainPathTail__Group__03278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DomainPathTail__Group__0__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPathTail__Group__1__Impl_in_rule__DomainPathTail__Group__13337 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__DomainPathTail__Group__2_in_rule__DomainPathTail__Group__13340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPathTail__FeatureAssignment_1_in_rule__DomainPathTail__Group__1__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPathTail__Group__2__Impl_in_rule__DomainPathTail__Group__23397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainPathTail__TailAssignment_2_in_rule__DomainPathTail__Group__2__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_13466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_rule__Model__DomainAssignment_23497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebModel_in_rule__Model__WebAssignment_33528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__DomainModel__TypesAssignment_13559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_13590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_33621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_03652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__TypeAssignment_23687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__MultivaluedAlternatives_3_0_in_rule__Feature__MultivaluedAssignment_33722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_13755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__WebModel__PagesAssignment_13786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_53848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__EntityAssignment_83883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageElement_in_rule__Page__ContentsAssignment_93918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionElement__NameAssignment_13949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainPath_in_rule__DisplayElement__ReferenceAssignment_13980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DomainPath__FeatureAssignment_04015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainPathTail_in_rule__DomainPath__TailAssignment_14050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DomainPathTail__FeatureAssignment_14085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainPathTail_in_rule__DomainPathTail__TailAssignment_24120 = new BitSet(new long[]{0x0000000000000002L});

}