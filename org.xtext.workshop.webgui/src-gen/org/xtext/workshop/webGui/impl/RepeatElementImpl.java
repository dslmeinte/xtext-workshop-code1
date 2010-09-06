/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.workshop.webGui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.workshop.webGui.Feature;
import org.xtext.workshop.webGui.RepeatElement;
import org.xtext.workshop.webGui.SingleElement;
import org.xtext.workshop.webGui.WebGuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.workshop.webGui.impl.RepeatElementImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.xtext.workshop.webGui.impl.RepeatElementImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatElementImpl extends PageElementImpl implements RepeatElement
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected Feature reference;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected EList<SingleElement> contents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WebGuiPackage.Literals.REPEAT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (Feature)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGuiPackage.REPEAT_ELEMENT__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(Feature newReference)
  {
    Feature oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebGuiPackage.REPEAT_ELEMENT__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SingleElement> getContents()
  {
    if (contents == null)
    {
      contents = new EObjectContainmentEList<SingleElement>(SingleElement.class, this, WebGuiPackage.REPEAT_ELEMENT__CONTENTS);
    }
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WebGuiPackage.REPEAT_ELEMENT__CONTENTS:
        return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WebGuiPackage.REPEAT_ELEMENT__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case WebGuiPackage.REPEAT_ELEMENT__CONTENTS:
        return getContents();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WebGuiPackage.REPEAT_ELEMENT__REFERENCE:
        setReference((Feature)newValue);
        return;
      case WebGuiPackage.REPEAT_ELEMENT__CONTENTS:
        getContents().clear();
        getContents().addAll((Collection<? extends SingleElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WebGuiPackage.REPEAT_ELEMENT__REFERENCE:
        setReference((Feature)null);
        return;
      case WebGuiPackage.REPEAT_ELEMENT__CONTENTS:
        getContents().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WebGuiPackage.REPEAT_ELEMENT__REFERENCE:
        return reference != null;
      case WebGuiPackage.REPEAT_ELEMENT__CONTENTS:
        return contents != null && !contents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RepeatElementImpl
