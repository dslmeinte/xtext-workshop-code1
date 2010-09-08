package org.xtext.workshop.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.xtext.workshop.webGui.DisplayElement;
import org.xtext.workshop.webGui.DomainPath;
import org.xtext.workshop.webGui.DomainPathTail;
import org.xtext.workshop.webGui.Entity;
import org.xtext.workshop.webGui.Feature;
import org.xtext.workshop.webGui.Page;

/**
 * This class contains the custom scoping implementation.
 */
public class WebGuiScopeProvider extends AbstractDeclarativeScopeProvider {
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		System.out.println(
				"scope_" + reference.getEContainingClass().getName() + "_" + reference.getName()
				+ "(" + context.eClass().getName() + ", ..)"
			);
		return super.getScope(context, reference);
	}

	/* domain path scope implementation: */
	public IScope scope_DomainPath_feature(final DisplayElement context, EReference reference) {
		Entity entity = ((Page) context.eContainer()).getEntity();
		return ( entity != null ) ? scopeFor(entity.getFeatures()) : IScope.NULLSCOPE;
	}

	/* (continued) */
	public IScope scope_DomainPathTail_feature(final DomainPathTail context, EReference reference) {
		EObject container = context.eContainer();
			// ...is either a DomainPath or a DomainPathTail
		// determine previous 'feature':
		Feature previous =
			( container instanceof DomainPath )
				? ((DomainPath) container).getFeature()
				: ((DomainPathTail) container).getFeature();

		if (previous.getType() instanceof Entity) {
	 		Entity entity = (Entity) previous.getType();
			return scopeFor(entity.getFeatures());
		} else {
			return IScope.NULLSCOPE;
		}
	}

	/* domain path scope implementation for expression: */
	public IScope scope_DomainPath_feature(final Feature context, EReference reference) {
		Entity entity = (Entity) context.eContainer();
		return scopeFor(entity.getFeatures());
	}

}
