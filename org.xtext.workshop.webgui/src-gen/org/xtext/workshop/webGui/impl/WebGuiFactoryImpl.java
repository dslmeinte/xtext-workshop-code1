/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.workshop.webGui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.workshop.webGui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGuiFactoryImpl extends EFactoryImpl implements WebGuiFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WebGuiFactory init()
  {
    try
    {
      WebGuiFactory theWebGuiFactory = (WebGuiFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/workshop/WebGui"); 
      if (theWebGuiFactory != null)
      {
        return theWebGuiFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WebGuiFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebGuiFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WebGuiPackage.MODEL: return createModel();
      case WebGuiPackage.DOMAIN_MODEL: return createDomainModel();
      case WebGuiPackage.ENTITY: return createEntity();
      case WebGuiPackage.FEATURE: return createFeature();
      case WebGuiPackage.TYPE: return createType();
      case WebGuiPackage.DATA_TYPE: return createDataType();
      case WebGuiPackage.WEB_MODEL: return createWebModel();
      case WebGuiPackage.PAGE: return createPage();
      case WebGuiPackage.PAGE_ELEMENT: return createPageElement();
      case WebGuiPackage.ACTION_ELEMENT: return createActionElement();
      case WebGuiPackage.DISPLAY_ELEMENT: return createDisplayElement();
      case WebGuiPackage.DOMAIN_PATH: return createDomainPath();
      case WebGuiPackage.DOMAIN_PATH_TAIL: return createDomainPathTail();
      case WebGuiPackage.EXPRESSION: return createExpression();
      case WebGuiPackage.VALUE: return createValue();
      case WebGuiPackage.NUMBER_LITERAL: return createNumberLiteral();
      case WebGuiPackage.ADD: return createAdd();
      case WebGuiPackage.SUBTRACT: return createSubtract();
      case WebGuiPackage.MULTIPLY: return createMultiply();
      case WebGuiPackage.DIVIDE: return createDivide();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebModel createWebModel()
  {
    WebModelImpl webModel = new WebModelImpl();
    return webModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageElement createPageElement()
  {
    PageElementImpl pageElement = new PageElementImpl();
    return pageElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionElement createActionElement()
  {
    ActionElementImpl actionElement = new ActionElementImpl();
    return actionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisplayElement createDisplayElement()
  {
    DisplayElementImpl displayElement = new DisplayElementImpl();
    return displayElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainPath createDomainPath()
  {
    DomainPathImpl domainPath = new DomainPathImpl();
    return domainPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainPathTail createDomainPathTail()
  {
    DomainPathTailImpl domainPathTail = new DomainPathTailImpl();
    return domainPathTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subtract createSubtract()
  {
    SubtractImpl subtract = new SubtractImpl();
    return subtract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiply createMultiply()
  {
    MultiplyImpl multiply = new MultiplyImpl();
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Divide createDivide()
  {
    DivideImpl divide = new DivideImpl();
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebGuiPackage getWebGuiPackage()
  {
    return (WebGuiPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WebGuiPackage getPackage()
  {
    return WebGuiPackage.eINSTANCE;
  }

} //WebGuiFactoryImpl
