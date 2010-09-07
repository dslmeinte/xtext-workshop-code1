package org.xtext.workshop.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.xtext.workshop.webGui.Entity;
import org.xtext.workshop.webGui.Feature;
import org.xtext.workshop.webGui.Page;
import org.xtext.workshop.webGui.RepeatElement;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class WebGuiScopeProvider extends AbstractDeclarativeScopeProvider {
	
	/*
	@Override
	public IScope getScope(EObject context, EReference reference) {
		System.out.println("context: " + context.toString());
		System.out.println("reference: " + reference.toString());
		
		CompositeNode node = NodeUtil.getNode(context);
		Iterable<AbstractNode> contents = NodeUtil.getAllContents(node);
		StringBuffer text = new StringBuffer();
		for (AbstractNode abstractNode : contents) {
		  if (abstractNode instanceof LeafNode)
		    text.append(((LeafNode)abstractNode).getText());
		}
		System.out.println(text);
		
		return super.getScope(context, reference);
	}
	*/
	
	public IScope scope_DisplayElement_reference(final Page context, EReference reference) {
		return getFeatureScope(context);
	}

	public IScope scope_InputElement_reference(final Page context, EReference reference) {
		return getFeatureScope(context);
	}

	public IScope scope_RepeatElement_reference(final Page context, EReference reference) {
		return getFeatureScope(context);
	}

	private IScope getFeatureScope(final Page page) {
		Entity entity = page.getEntity();
		return (entity != null) ? scopeFor(entity.getFeatures()) : IScope.NULLSCOPE;
	}

	public IScope scope_DisplayElement_reference(final RepeatElement context, EReference reference) {
		return getFeatureScope(context);
	}

	public IScope scope_InputElement_reference(final RepeatElement context, EReference reference) {
		return getFeatureScope(context);
	}

	private IScope getFeatureScope(final RepeatElement context) {
		Feature reference = context.getReference();
		return
			(reference != null && reference.getType() instanceof Entity)
				? scopeFor( ((Entity) reference.getType()).getFeatures() )
				: IScope.NULLSCOPE;
	}

}