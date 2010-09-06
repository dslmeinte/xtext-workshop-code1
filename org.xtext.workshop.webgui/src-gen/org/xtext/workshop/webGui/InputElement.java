/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.workshop.webGui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.workshop.webGui.InputElement#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.workshop.webGui.WebGuiPackage#getInputElement()
 * @model
 * @generated
 */
public interface InputElement extends SingleElement
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
   * @see org.xtext.workshop.webGui.WebGuiPackage#getInputElement_Reference()
   * @model
   * @generated
   */
  Feature getReference();

  /**
   * Sets the value of the '{@link org.xtext.workshop.webGui.InputElement#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Feature value);

} // InputElement
