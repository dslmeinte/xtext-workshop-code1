/*
* generated by Xtext
*/
package org.xtext.workshop.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.workshop.services.WebGuiGrammarAccess;

public class WebGuiParser extends AbstractContentAssistParser {
	
	@Inject
	private WebGuiGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.workshop.ui.contentassist.antlr.internal.InternalWebGuiParser createParser() {
		org.xtext.workshop.ui.contentassist.antlr.internal.InternalWebGuiParser result = new org.xtext.workshop.ui.contentassist.antlr.internal.InternalWebGuiParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFeatureAccess().getMultivaluedAlternatives_3_0(), "rule__Feature__MultivaluedAlternatives_3_0");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getPageElementAccess().getAlternatives(), "rule__PageElement__Alternatives");
					put(grammarAccess.getAdditionAccess().getAlternatives_1_0(), "rule__Addition__Alternatives_1_0");
					put(grammarAccess.getMultiplicationAccess().getAlternatives_1_0(), "rule__Multiplication__Alternatives_1_0");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getDomainModelAccess().getGroup(), "rule__DomainModel__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_4(), "rule__Feature__Group_4__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getWebModelAccess().getGroup(), "rule__WebModel__Group__0");
					put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
					put(grammarAccess.getActionElementAccess().getGroup(), "rule__ActionElement__Group__0");
					put(grammarAccess.getDisplayElementAccess().getGroup(), "rule__DisplayElement__Group__0");
					put(grammarAccess.getDomainPathAccess().getGroup(), "rule__DomainPath__Group__0");
					put(grammarAccess.getDomainPathTailAccess().getGroup(), "rule__DomainPathTail__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_0(), "rule__Addition__Group_1_0_0__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_1(), "rule__Addition__Group_1_0_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0(), "rule__Multiplication__Group_1_0_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_1(), "rule__Multiplication__Group_1_0_1__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getDomainAssignment_2(), "rule__Model__DomainAssignment_2");
					put(grammarAccess.getModelAccess().getWebAssignment_3(), "rule__Model__WebAssignment_3");
					put(grammarAccess.getDomainModelAccess().getTypesAssignment_1(), "rule__DomainModel__TypesAssignment_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getFeaturesAssignment_3(), "rule__Entity__FeaturesAssignment_3");
					put(grammarAccess.getFeatureAccess().getNameAssignment_0(), "rule__Feature__NameAssignment_0");
					put(grammarAccess.getFeatureAccess().getTypeAssignment_2(), "rule__Feature__TypeAssignment_2");
					put(grammarAccess.getFeatureAccess().getMultivaluedAssignment_3(), "rule__Feature__MultivaluedAssignment_3");
					put(grammarAccess.getFeatureAccess().getExpressionAssignment_4_1(), "rule__Feature__ExpressionAssignment_4_1");
					put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
					put(grammarAccess.getWebModelAccess().getPagesAssignment_1(), "rule__WebModel__PagesAssignment_1");
					put(grammarAccess.getPageAccess().getNameAssignment_1(), "rule__Page__NameAssignment_1");
					put(grammarAccess.getPageAccess().getTitleAssignment_5(), "rule__Page__TitleAssignment_5");
					put(grammarAccess.getPageAccess().getEntityAssignment_8(), "rule__Page__EntityAssignment_8");
					put(grammarAccess.getPageAccess().getContentsAssignment_9(), "rule__Page__ContentsAssignment_9");
					put(grammarAccess.getActionElementAccess().getNameAssignment_1(), "rule__ActionElement__NameAssignment_1");
					put(grammarAccess.getDisplayElementAccess().getReferenceAssignment_1(), "rule__DisplayElement__ReferenceAssignment_1");
					put(grammarAccess.getDomainPathAccess().getFeatureAssignment_0(), "rule__DomainPath__FeatureAssignment_0");
					put(grammarAccess.getDomainPathAccess().getTailAssignment_1(), "rule__DomainPath__TailAssignment_1");
					put(grammarAccess.getDomainPathTailAccess().getFeatureAssignment_1(), "rule__DomainPathTail__FeatureAssignment_1");
					put(grammarAccess.getDomainPathTailAccess().getTailAssignment_2(), "rule__DomainPathTail__TailAssignment_2");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_1(), "rule__Addition__RightAssignment_1_1");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1(), "rule__Multiplication__RightAssignment_1_1");
					put(grammarAccess.getNumberLiteralAccess().getValueAssignment(), "rule__NumberLiteral__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.workshop.ui.contentassist.antlr.internal.InternalWebGuiParser typedParser = (org.xtext.workshop.ui.contentassist.antlr.internal.InternalWebGuiParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public WebGuiGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(WebGuiGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
