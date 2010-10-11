package org.xtext.workshop.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.xtext.workshop.services.WebGuiGrammarAccess;
import org.xtext.workshop.services.WebGuiGrammarAccess.FeatureElements;

/**
 * This class contains custom the formatting description.
 * 
 * See http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it. Also see
 * {@link org.eclipse.xtext.xtext.XtextFormatter} as an example.
 */
public class WebGuiFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig cfg) {

		WebGuiGrammarAccess grammar = (WebGuiGrammarAccess) getGrammarAccess();

		cfg.setAutoLinewrap(120);

		// generic '{' and '}' formatting:
		for (Pair<Keyword, Keyword> pair : grammar.findKeywordPairs("{", "}") ) {
			cfg.setIndentationDecrement().before( pair.getSecond() );
			cfg.setIndentationIncrement().after( pair.getFirst() );
			cfg.setLinewrap().after( pair.getFirst() );
			cfg.setLinewrap(2).after( pair.getSecond() );
		}

		// 'domain:' heading:
		cfg.setLinewrap(2).before(grammar.getDomainModelAccess().getDomainKeyword_0());
		cfg.setIndentationIncrement().after(grammar.getDomainModelAccess().getDomainKeyword_0());
		cfg.setLinewrap(2).after(grammar.getDomainModelAccess().getDomainKeyword_0());

		// feature:
		FeatureElements featureAccess = grammar.getFeatureAccess();
		cfg.setLinewrap().after(featureAccess.getRule());
		cfg.setNoSpace().before(featureAccess.getMultivaluedSKeyword_3_0_0());
		cfg.setNoSpace().before(featureAccess.getMultivaluedEsKeyword_3_0_1());

		// data type:
		cfg.setLinewrap().after(grammar.getDataTypeRule());

		// 'web:' heading:
		cfg.setIndentationDecrement().before(grammar.getWebModelRule());
		cfg.setIndentationIncrement().after(grammar.getWebModelAccess().getWebKeyword_0());
		cfg.setLinewrap(2).before(grammar.getWebModelAccess().getWebKeyword_0());
		cfg.setLinewrap(2).after(grammar.getWebModelAccess().getWebKeyword_0());

		// page:
		cfg.setLinewrap().after(grammar.getPageAccess().getTitleSTRINGTerminalRuleCall_5_0());
		cfg.setLinewrap(2).after(grammar.getPageAccess().getEntityAssignment_8());

		// display element:
		cfg.setLinewrap().after(grammar.getDisplayElementRule());
		
		// domain path:
		cfg.setNoSpace().before(grammar.getDomainPathTailAccess().getFullStopKeyword_0());
		cfg.setNoSpace().after(grammar.getDomainPathTailAccess().getFullStopKeyword_0());

		// action element:
		cfg.setLinewrap().after(grammar.getActionElementRule());

		// comments:
		cfg.setLinewrap(0, 1, 2).before(grammar.getSL_COMMENTRule());
		cfg.setLinewrap(0, 1, 2).before(grammar.getML_COMMENTRule());
		cfg.setLinewrap(0, 1, 1).after(grammar.getML_COMMENTRule());
	}

}
