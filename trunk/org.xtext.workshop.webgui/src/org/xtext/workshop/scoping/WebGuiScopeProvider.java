package org.xtext.workshop.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.xtext.workshop.webGui.DisplayElement;
import org.xtext.workshop.webGui.DomainPath;
import org.xtext.workshop.webGui.DomainPathTail;
import org.xtext.workshop.webGui.Entity;
import org.xtext.workshop.webGui.Feature;
import org.xtext.workshop.webGui.Page;

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
		    text.append( ((LeafNode) abstractNode).getText() );
		}
		System.out.println(text);
		
		return super.getScope(context, reference);
	}
	*/

	/* simple scope implementation:
	public IScope scope_DisplayElement_reference(final Page context, EReference reference) {
		IScope scope = IScope.NULLSCOPE;
		
		Entity entity = page.getEntity();
		if (entity != null) {
			scope = scopeFor(entity.getFeatures());
		}
		return scope;
	}
	*/
	
	/* domain path scope implementation: */
	public IScope scope_DomainPath_feature(final DisplayElement context, EReference reference) {
		//System.out.println("scope_DomainPath_feature for DisplayElement");
		IScope scope = IScope.NULLSCOPE;
		
		Entity entity = ((Page) context.eContainer()).getEntity();
		if (entity != null) {
			scope = scopeFor(entity.getFeatures());
		}
		return scope;
	}

	public IScope scope_DomainPathTail_feature(final DomainPathTail context, EReference reference) {
		//System.out.println("scope_DomainPathTail_feature for DomainPathTail");
		IScope scope = IScope.NULLSCOPE;
		
		EObject container = context.eContainer();
		Feature prev = null;
		if (container instanceof DomainPath) {
			prev = ((DomainPath) container).getFeature();
		} else if (container instanceof DomainPathTail) {
			prev = ((DomainPathTail) container).getFeature();
		}
		
		if (prev.getType() instanceof Entity) {
	 		Entity entity = (Entity) prev.getType();
			scope = scopeFor(entity.getFeatures());
		}
		
		return scope;
	}
	

}
