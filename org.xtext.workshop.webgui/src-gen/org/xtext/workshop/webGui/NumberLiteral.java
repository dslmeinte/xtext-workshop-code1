/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.workshop.webGui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.workshop.webGui.NumberLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.workshop.webGui.WebGuiPackage#getNumberLiteral()
 * @model
 * @generated
 */
public interface NumberLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.workshop.webGui.WebGuiPackage#getNumberLiteral_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.workshop.webGui.NumberLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // NumberLiteral
