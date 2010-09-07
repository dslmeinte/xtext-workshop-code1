/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.workshop.webGui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.workshop.webGui.WebGuiFactory
 * @model kind="package"
 * @generated
 */
public interface WebGuiPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "webGui";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/workshop/WebGui";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "webGui";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WebGuiPackage eINSTANCE = org.xtext.workshop.webGui.impl.WebGuiPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.ModelImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DOMAIN = 1;

  /**
   * The feature id for the '<em><b>Web</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__WEB = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.DomainModelImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__TYPES = 0;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.TypeImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.EntityImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.FeatureImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Multivalued</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MULTIVALUED = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.DataTypeImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.WebModelImpl <em>Web Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.WebModelImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getWebModel()
   * @generated
   */
  int WEB_MODEL = 6;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__PAGES = 0;

  /**
   * The number of structural features of the '<em>Web Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.PageImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getPage()
   * @generated
   */
  int PAGE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__TITLE = 1;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__ENTITY = 2;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__CONTENTS = 3;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.PageElementImpl <em>Page Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.PageElementImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getPageElement()
   * @generated
   */
  int PAGE_ELEMENT = 8;

  /**
   * The number of structural features of the '<em>Page Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.ActionElementImpl <em>Action Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.ActionElementImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getActionElement()
   * @generated
   */
  int ACTION_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__NAME = PAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.DisplayElementImpl <em>Display Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.DisplayElementImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDisplayElement()
   * @generated
   */
  int DISPLAY_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY_ELEMENT__REFERENCE = PAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Display Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.ExpressionImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 13;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.DomainPathImpl <em>Domain Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.DomainPathImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDomainPath()
   * @generated
   */
  int DOMAIN_PATH = 11;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PATH__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PATH__TAIL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Domain Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PATH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.DomainPathTailImpl <em>Domain Path Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.DomainPathTailImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDomainPathTail()
   * @generated
   */
  int DOMAIN_PATH_TAIL = 12;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PATH_TAIL__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PATH_TAIL__TAIL = 1;

  /**
   * The number of structural features of the '<em>Domain Path Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PATH_TAIL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.LiteralImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 14;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.NumberLiteralImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.AddImpl <em>Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.AddImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getAdd()
   * @generated
   */
  int ADD = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.SubstractImpl <em>Substract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.SubstractImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getSubstract()
   * @generated
   */
  int SUBSTRACT = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTRACT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTRACT__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Substract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTRACT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.MultiplyImpl <em>Multiply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.MultiplyImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getMultiply()
   * @generated
   */
  int MULTIPLY = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.DivideImpl <em>Divide</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.DivideImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDivide()
   * @generated
   */
  int DIVIDE = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Divide</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.workshop.webGui.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.workshop.webGui.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.workshop.webGui.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Model#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see org.xtext.workshop.webGui.Model#getDomain()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Domain();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Model#getWeb <em>Web</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Web</em>'.
   * @see org.xtext.workshop.webGui.Model#getWeb()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Web();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.xtext.workshop.webGui.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.workshop.webGui.DomainModel#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.xtext.workshop.webGui.DomainModel#getTypes()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Types();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.xtext.workshop.webGui.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.workshop.webGui.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.xtext.workshop.webGui.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.xtext.workshop.webGui.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.workshop.webGui.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.workshop.webGui.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.workshop.webGui.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.workshop.webGui.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.workshop.webGui.Feature#isMultivalued <em>Multivalued</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multivalued</em>'.
   * @see org.xtext.workshop.webGui.Feature#isMultivalued()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Multivalued();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Feature#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.workshop.webGui.Feature#getExpression()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.workshop.webGui.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.workshop.webGui.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.workshop.webGui.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.xtext.workshop.webGui.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.WebModel <em>Web Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Model</em>'.
   * @see org.xtext.workshop.webGui.WebModel
   * @generated
   */
  EClass getWebModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.workshop.webGui.WebModel#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see org.xtext.workshop.webGui.WebModel#getPages()
   * @see #getWebModel()
   * @generated
   */
  EReference getWebModel_Pages();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.xtext.workshop.webGui.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.workshop.webGui.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.workshop.webGui.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.workshop.webGui.Page#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.workshop.webGui.Page#getTitle()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Title();

  /**
   * Returns the meta object for the reference '{@link org.xtext.workshop.webGui.Page#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.xtext.workshop.webGui.Page#getEntity()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Entity();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.workshop.webGui.Page#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.xtext.workshop.webGui.Page#getContents()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Contents();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.PageElement <em>Page Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Element</em>'.
   * @see org.xtext.workshop.webGui.PageElement
   * @generated
   */
  EClass getPageElement();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.ActionElement <em>Action Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Element</em>'.
   * @see org.xtext.workshop.webGui.ActionElement
   * @generated
   */
  EClass getActionElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.workshop.webGui.ActionElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.workshop.webGui.ActionElement#getName()
   * @see #getActionElement()
   * @generated
   */
  EAttribute getActionElement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.DisplayElement <em>Display Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Display Element</em>'.
   * @see org.xtext.workshop.webGui.DisplayElement
   * @generated
   */
  EClass getDisplayElement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.DisplayElement#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see org.xtext.workshop.webGui.DisplayElement#getReference()
   * @see #getDisplayElement()
   * @generated
   */
  EReference getDisplayElement_Reference();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.DomainPath <em>Domain Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Path</em>'.
   * @see org.xtext.workshop.webGui.DomainPath
   * @generated
   */
  EClass getDomainPath();

  /**
   * Returns the meta object for the reference '{@link org.xtext.workshop.webGui.DomainPath#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.xtext.workshop.webGui.DomainPath#getFeature()
   * @see #getDomainPath()
   * @generated
   */
  EReference getDomainPath_Feature();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.DomainPath#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.xtext.workshop.webGui.DomainPath#getTail()
   * @see #getDomainPath()
   * @generated
   */
  EReference getDomainPath_Tail();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.DomainPathTail <em>Domain Path Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Path Tail</em>'.
   * @see org.xtext.workshop.webGui.DomainPathTail
   * @generated
   */
  EClass getDomainPathTail();

  /**
   * Returns the meta object for the reference '{@link org.xtext.workshop.webGui.DomainPathTail#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.xtext.workshop.webGui.DomainPathTail#getFeature()
   * @see #getDomainPathTail()
   * @generated
   */
  EReference getDomainPathTail_Feature();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.DomainPathTail#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.xtext.workshop.webGui.DomainPathTail#getTail()
   * @see #getDomainPathTail()
   * @generated
   */
  EReference getDomainPathTail_Tail();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.workshop.webGui.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.xtext.workshop.webGui.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.xtext.workshop.webGui.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.workshop.webGui.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.workshop.webGui.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add</em>'.
   * @see org.xtext.workshop.webGui.Add
   * @generated
   */
  EClass getAdd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Add#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.workshop.webGui.Add#getLeft()
   * @see #getAdd()
   * @generated
   */
  EReference getAdd_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Add#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.workshop.webGui.Add#getRight()
   * @see #getAdd()
   * @generated
   */
  EReference getAdd_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Substract <em>Substract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substract</em>'.
   * @see org.xtext.workshop.webGui.Substract
   * @generated
   */
  EClass getSubstract();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Substract#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.workshop.webGui.Substract#getLeft()
   * @see #getSubstract()
   * @generated
   */
  EReference getSubstract_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Substract#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.workshop.webGui.Substract#getRight()
   * @see #getSubstract()
   * @generated
   */
  EReference getSubstract_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiply</em>'.
   * @see org.xtext.workshop.webGui.Multiply
   * @generated
   */
  EClass getMultiply();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Multiply#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.workshop.webGui.Multiply#getLeft()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Multiply#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.workshop.webGui.Multiply#getRight()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.Divide <em>Divide</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Divide</em>'.
   * @see org.xtext.workshop.webGui.Divide
   * @generated
   */
  EClass getDivide();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Divide#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.workshop.webGui.Divide#getLeft()
   * @see #getDivide()
   * @generated
   */
  EReference getDivide_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.workshop.webGui.Divide#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.workshop.webGui.Divide#getRight()
   * @see #getDivide()
   * @generated
   */
  EReference getDivide_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WebGuiFactory getWebGuiFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.ModelImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DOMAIN = eINSTANCE.getModel_Domain();

    /**
     * The meta object literal for the '<em><b>Web</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__WEB = eINSTANCE.getModel_Web();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.DomainModelImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__TYPES = eINSTANCE.getDomainModel_Types();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.EntityImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.FeatureImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '<em><b>Multivalued</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MULTIVALUED = eINSTANCE.getFeature_Multivalued();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__EXPRESSION = eINSTANCE.getFeature_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.TypeImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.DataTypeImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.WebModelImpl <em>Web Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.WebModelImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getWebModel()
     * @generated
     */
    EClass WEB_MODEL = eINSTANCE.getWebModel();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_MODEL__PAGES = eINSTANCE.getWebModel_Pages();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.PageImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__ENTITY = eINSTANCE.getPage_Entity();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__CONTENTS = eINSTANCE.getPage_Contents();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.PageElementImpl <em>Page Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.PageElementImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getPageElement()
     * @generated
     */
    EClass PAGE_ELEMENT = eINSTANCE.getPageElement();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.ActionElementImpl <em>Action Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.ActionElementImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getActionElement()
     * @generated
     */
    EClass ACTION_ELEMENT = eINSTANCE.getActionElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_ELEMENT__NAME = eINSTANCE.getActionElement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.DisplayElementImpl <em>Display Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.DisplayElementImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDisplayElement()
     * @generated
     */
    EClass DISPLAY_ELEMENT = eINSTANCE.getDisplayElement();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPLAY_ELEMENT__REFERENCE = eINSTANCE.getDisplayElement_Reference();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.DomainPathImpl <em>Domain Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.DomainPathImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDomainPath()
     * @generated
     */
    EClass DOMAIN_PATH = eINSTANCE.getDomainPath();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_PATH__FEATURE = eINSTANCE.getDomainPath_Feature();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_PATH__TAIL = eINSTANCE.getDomainPath_Tail();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.DomainPathTailImpl <em>Domain Path Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.DomainPathTailImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDomainPathTail()
     * @generated
     */
    EClass DOMAIN_PATH_TAIL = eINSTANCE.getDomainPathTail();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_PATH_TAIL__FEATURE = eINSTANCE.getDomainPathTail_Feature();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_PATH_TAIL__TAIL = eINSTANCE.getDomainPathTail_Tail();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.ExpressionImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.LiteralImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.NumberLiteralImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.AddImpl <em>Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.AddImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getAdd()
     * @generated
     */
    EClass ADD = eINSTANCE.getAdd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD__LEFT = eINSTANCE.getAdd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD__RIGHT = eINSTANCE.getAdd_Right();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.SubstractImpl <em>Substract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.SubstractImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getSubstract()
     * @generated
     */
    EClass SUBSTRACT = eINSTANCE.getSubstract();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSTRACT__LEFT = eINSTANCE.getSubstract_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSTRACT__RIGHT = eINSTANCE.getSubstract_Right();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.MultiplyImpl <em>Multiply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.MultiplyImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getMultiply()
     * @generated
     */
    EClass MULTIPLY = eINSTANCE.getMultiply();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__LEFT = eINSTANCE.getMultiply_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__RIGHT = eINSTANCE.getMultiply_Right();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.DivideImpl <em>Divide</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.DivideImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDivide()
     * @generated
     */
    EClass DIVIDE = eINSTANCE.getDivide();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVIDE__LEFT = eINSTANCE.getDivide_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVIDE__RIGHT = eINSTANCE.getDivide_Right();

  }

} //WebGuiPackage
