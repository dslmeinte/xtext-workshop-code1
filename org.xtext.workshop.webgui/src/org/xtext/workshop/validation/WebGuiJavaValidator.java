package org.xtext.workshop.validation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.validation.Check;
import org.xtext.workshop.webGui.DomainModel;
import org.xtext.workshop.webGui.Entity;
import org.xtext.workshop.webGui.Page;
import org.xtext.workshop.webGui.Type;
import org.xtext.workshop.webGui.WebGuiPackage;
import org.xtext.workshop.webGui.WebModel;

import static org.eclipse.xtext.validation.CheckType.*;


public class WebGuiJavaValidator extends AbstractWebGuiJavaValidator {

	@Check(FAST)
	public void check_entity_starts_with_capital(Entity entity) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
			warning("Name should start with a capital", WebGuiPackage.ENTITY__NAME);
		}
	}

	@Check
	public void check_types_have_unique_names(DomainModel domain) {
		Map<String, Type> types = new HashMap<String, Type>();
		for( Type type : domain.getTypes() ) {
			String name = type.getName();
			if( types.get(name) == null ) {
				types.put(name, type);
			} else {
				error( "type has duplicate name '" + name + "'", type, WebGuiPackage.TYPE__NAME );
			}
		}
	}

	@Check(NORMAL)	// = default
	public void check_pages_have_unique_names(WebModel web) {
		Map<String, Page> pages = new HashMap<String, Page>();
		for( Page page : web.getPages() ) {
			String name = page.getName();
			if( pages.get(name) == null ) {
				pages.put(name, page);
			} else {
				error( "page has duplicate name '" + name + "'", page, WebGuiPackage.ENTITY__NAME );
			}
		}
	}

}
