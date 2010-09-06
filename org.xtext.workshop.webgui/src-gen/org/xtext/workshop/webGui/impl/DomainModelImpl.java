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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.workshop.webGui.DataType;
import org.xtext.workshop.webGui.DomainModel;
import org.xtext.workshop.webGui.Entity;
import org.xtext.workshop.webGui.WebGuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.workshop.webGui.impl.DomainModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.workshop.webGui.impl.DomainModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.xtext.workshop.webGui.impl.DomainModelImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainModelImpl extends MinimalEObjectImpl.Container implements DomainModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataTypes()
   * @generated
   * @ordered
   */
  protected EList<DataType> dataTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainModelImpl()
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
    return WebGuiPackage.Literals.DOMAIN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebGuiPackage.DOMAIN_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, WebGuiPackage.DOMAIN_MODEL__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataType> getDataTypes()
  {
    if (dataTypes == null)
    {
      dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, WebGuiPackage.DOMAIN_MODEL__DATA_TYPES);
    }
    return dataTypes;
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
      case WebGuiPackage.DOMAIN_MODEL__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case WebGuiPackage.DOMAIN_MODEL__DATA_TYPES:
        return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
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
      case WebGuiPackage.DOMAIN_MODEL__NAME:
        return getName();
      case WebGuiPackage.DOMAIN_MODEL__ENTITIES:
        return getEntities();
      case WebGuiPackage.DOMAIN_MODEL__DATA_TYPES:
        return getDataTypes();
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
      case WebGuiPackage.DOMAIN_MODEL__NAME:
        setName((String)newValue);
        return;
      case WebGuiPackage.DOMAIN_MODEL__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case WebGuiPackage.DOMAIN_MODEL__DATA_TYPES:
        getDataTypes().clear();
        getDataTypes().addAll((Collection<? extends DataType>)newValue);
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
      case WebGuiPackage.DOMAIN_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WebGuiPackage.DOMAIN_MODEL__ENTITIES:
        getEntities().clear();
        return;
      case WebGuiPackage.DOMAIN_MODEL__DATA_TYPES:
        getDataTypes().clear();
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
      case WebGuiPackage.DOMAIN_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WebGuiPackage.DOMAIN_MODEL__ENTITIES:
        return entities != null && !entities.isEmpty();
      case WebGuiPackage.DOMAIN_MODEL__DATA_TYPES:
        return dataTypes != null && !dataTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DomainModelImpl
