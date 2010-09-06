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
 *   <li>{@link org.xtext.workshop.webGui.WebModel#getName <em>Name</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.workshop.webGui.WebGuiPackage#getWebModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.workshop.webGui.WebModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
