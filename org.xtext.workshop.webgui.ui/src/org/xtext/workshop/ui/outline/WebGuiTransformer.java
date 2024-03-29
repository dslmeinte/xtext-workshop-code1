package org.xtext.workshop.ui.outline;

import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

/**
 * Customization of the default outline structure.
 */
public class WebGuiTransformer extends AbstractDeclarativeSemanticModelTransformer {

	/*
	 * Do not show the features of entities, and
	 * do not show the page elements of pages:
	public List<EObject> getChildren(Entity entity) {
		return NO_CHILDREN;
	}
	
	public List<EObject> getChildren(Page page) {
		return NO_CHILDREN;
	}
	 */

	/*  
	 * Show the entities used on a page in the outline:
	 * 	
	public List<EObject> getChildren(Page page) {
		List<EObject> children = new ArrayList<EObject>();
		
		children.add(page.getEntity());
		
		for (PageElement elm : page.getContents()) {
			if (elm instanceof RepeatElement) {
				visitRepeat(children, (RepeatElement) elm);
			}
		}
		
		return children;
	}
	
	private void visitRepeat(List<EObject> children, RepeatElement repeatElm) {
		if (repeatElm.getReference() != null && repeatElm.getReference().getType() != null) {
			children.add(repeatElm.getReference().getType());
		}
		for (PageElement elm : repeatElm.getContents()) {
			if (elm instanceof RepeatElement) {
				visitRepeat(children, (RepeatElement) elm);
			}
		}
		
	}
	 */	

}
