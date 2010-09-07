/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.workshop.webGui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.workshop.webGui.DisplayElement#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.workshop.webGui.WebGuiPackage#getDisplayElement()
 * @model
 * @generated
 */
public interface DisplayElement extends PageElement
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
   * @see org.xtext.workshop.webGui.WebGuiPackage#getDisplayElement_Reference()
   * @model
   * @generated
   */
  Feature getReference();

  /**
   * Sets the value of the '{@link org.xtext.workshop.webGui.DisplayElement#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Feature value);

} // DisplayElement
