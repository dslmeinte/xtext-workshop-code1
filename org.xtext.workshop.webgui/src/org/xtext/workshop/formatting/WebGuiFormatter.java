package org.xtext.workshop.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.xtext.workshop.services.WebGuiGrammarAccess;
import org.xtext.workshop.services.WebGuiGrammarAccess.FeatureElements;

/**
 * This class contains custom formatting description.
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

		// model:
		cfg.setLinewrap(2).between(grammar.getModelRule(), grammar.getDomainModelRule());

		// 'domain:' heading:
		cfg.setIndentationIncrement().after(grammar.getDomainModelRule());
		cfg.setLinewrap(2).after(grammar.getDomainModelRule());

		// entity:
		cfg.setLinewrap(2).between(grammar.getDomainModelRule(), grammar.getEntityRule());
		cfg.setIndentationIncrement().after(grammar.getEntityAccess().getLeftCurlyBracketKeyword_2());
		cfg.setIndentationDecrement().before(grammar.getEntityAccess().getRightCurlyBracketKeyword_4());
		cfg.setLinewrap().after(grammar.getEntityAccess().getLeftCurlyBracketKeyword_2());
		cfg.setLinewrap().after(grammar.getEntityAccess().getRightCurlyBracketKeyword_4());

		// feature:
		FeatureElements featureAccess = grammar.getFeatureAccess();
		cfg.setLinewrap().after(featureAccess.getRule());
		cfg.setNoSpace().before(featureAccess.getMultivaluedSKeyword_3_0_0());
		cfg.setNoSpace().before(featureAccess.getMultivaluedEsKeyword_3_0_1());

		// data type:
		cfg.setLinewrap().after(grammar.getDataTypeRule());

		// 'web:' heading:
		cfg.setIndentationDecrement().before(grammar.getWebModelRule());
		cfg.setIndentationIncrement().after(grammar.getWebModelRule());
		cfg.setLinewrap(2).after(grammar.getWebModelRule());

		// page:
		cfg.setLinewrap().after(grammar.getPageAccess().getTitleSTRINGTerminalRuleCall_5_0());

		// display element:
		cfg.setLinewrap().after(grammar.getDisplayElementRule());

		// action element:
		cfg.setLinewrap().after(grammar.getActionElementRule());

		// comments:
		cfg.setLinewrap(0, 1, 2).before(grammar.getSL_COMMENTRule());
		cfg.setLinewrap(0, 1, 2).before(grammar.getML_COMMENTRule());
		cfg.setLinewrap(0, 1, 1).after(grammar.getML_COMMENTRule());
	}

}
