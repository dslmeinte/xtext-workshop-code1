package org.xtext.workshop.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.workshop.webGui.Entity;
import org.xtext.workshop.webGui.WebGuiPackage;
 

public class WebGuiJavaValidator extends AbstractWebGuiJavaValidator {

	@Check
	public void checkEntityStartsWithCapital(Entity entity) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
			warning("Name should start with a capital", WebGuiPackage.ENTITY__NAME);
		}
	}
	
	
}
