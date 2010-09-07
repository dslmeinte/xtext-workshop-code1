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
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

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
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.SingleElementImpl <em>Single Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.SingleElementImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getSingleElement()
   * @generated
   */
  int SINGLE_ELEMENT = 9;

  /**
   * The number of structural features of the '<em>Single Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.ActionElementImpl <em>Action Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.ActionElementImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getActionElement()
   * @generated
   */
  int ACTION_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT__NAME = SINGLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ELEMENT_FEATURE_COUNT = SINGLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.DisplayElementImpl <em>Display Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.DisplayElementImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getDisplayElement()
   * @generated
   */
  int DISPLAY_ELEMENT = 11;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY_ELEMENT__REFERENCE = SINGLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Display Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY_ELEMENT_FEATURE_COUNT = SINGLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.workshop.webGui.impl.RepeatElementImpl <em>Repeat Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.workshop.webGui.impl.RepeatElementImpl
   * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getRepeatElement()
   * @generated
   */
  int REPEAT_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_ELEMENT__REFERENCE = PAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_ELEMENT__CONTENTS = PAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Repeat Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 2;


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
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.SingleElement <em>Single Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Element</em>'.
   * @see org.xtext.workshop.webGui.SingleElement
   * @generated
   */
  EClass getSingleElement();

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
   * Returns the meta object for the reference '{@link org.xtext.workshop.webGui.DisplayElement#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.xtext.workshop.webGui.DisplayElement#getReference()
   * @see #getDisplayElement()
   * @generated
   */
  EReference getDisplayElement_Reference();

  /**
   * Returns the meta object for class '{@link org.xtext.workshop.webGui.RepeatElement <em>Repeat Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat Element</em>'.
   * @see org.xtext.workshop.webGui.RepeatElement
   * @generated
   */
  EClass getRepeatElement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.workshop.webGui.RepeatElement#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.xtext.workshop.webGui.RepeatElement#getReference()
   * @see #getRepeatElement()
   * @generated
   */
  EReference getRepeatElement_Reference();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.workshop.webGui.RepeatElement#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.xtext.workshop.webGui.RepeatElement#getContents()
   * @see #getRepeatElement()
   * @generated
   */
  EReference getRepeatElement_Contents();

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
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.SingleElementImpl <em>Single Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.SingleElementImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getSingleElement()
     * @generated
     */
    EClass SINGLE_ELEMENT = eINSTANCE.getSingleElement();

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
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPLAY_ELEMENT__REFERENCE = eINSTANCE.getDisplayElement_Reference();

    /**
     * The meta object literal for the '{@link org.xtext.workshop.webGui.impl.RepeatElementImpl <em>Repeat Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.workshop.webGui.impl.RepeatElementImpl
     * @see org.xtext.workshop.webGui.impl.WebGuiPackageImpl#getRepeatElement()
     * @generated
     */
    EClass REPEAT_ELEMENT = eINSTANCE.getRepeatElement();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_ELEMENT__REFERENCE = eINSTANCE.getRepeatElement_Reference();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_ELEMENT__CONTENTS = eINSTANCE.getRepeatElement_Contents();

  }

} //WebGuiPackage
