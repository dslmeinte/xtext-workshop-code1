/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.workshop.webGui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.workshop.webGui.WebModel#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.workshop.webGui.WebGuiPackage#getWebModel()
 * @model
 * @generated
 */
public interface WebModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.workshop.webGui.Page}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' containment reference list.
   * @see org.xtext.workshop.webGui.WebGuiPackage#getWebModel_Pages()
   * @model containment="true"
   * @generated
   */
  EList<Page> getPages();

} // WebModel
