/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.workshop.webGui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.workshop.webGui.RepeatElement#getReference <em>Reference</em>}</li>
 *   <li>{@link org.xtext.workshop.webGui.RepeatElement#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.workshop.webGui.WebGuiPackage#getRepeatElement()
 * @model
 * @generated
 */
public interface RepeatElement extends PageElement
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Feature)
   * @see org.xtext.workshop.webGui.WebGuiPackage#getRepeatElement_Reference()
   * @model
   * @generated
   */
  Feature getReference();

  /**
   * Sets the value of the '{@link org.xtext.workshop.webGui.RepeatElement#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Feature value);

  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.workshop.webGui.SingleElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see org.xtext.workshop.webGui.WebGuiPackage#getRepeatElement_Contents()
   * @model containment="true"
   * @generated
   */
  EList<SingleElement> getContents();

} // RepeatElement
