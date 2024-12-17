/**
 * generated by Xtext 2.32.0
 */
package org.xtext.algorithme.algo.algo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.algorithme.algo.algo.AlgoFactory;
import org.xtext.algorithme.algo.algo.AlgoPackage;
import org.xtext.algorithme.algo.algo.Algorithme;
import org.xtext.algorithme.algo.algo.Catalogue;
import org.xtext.algorithme.algo.algo.Direction;
import org.xtext.algorithme.algo.algo.Port;
import org.xtext.algorithme.algo.algo.Ressource;
import org.xtext.algorithme.algo.algo.TypeDonnees;
import org.xtext.algorithme.algo.algo.TypeRessource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgoPackageImpl extends EPackageImpl implements AlgoPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass catalogueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass algorithmeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ressourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeRessourceEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeDonneesEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.algorithme.algo.algo.AlgoPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AlgoPackageImpl()
  {
    super(eNS_URI, AlgoFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link AlgoPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AlgoPackage init()
  {
    if (isInited) return (AlgoPackage)EPackage.Registry.INSTANCE.getEPackage(AlgoPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredAlgoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    AlgoPackageImpl theAlgoPackage = registeredAlgoPackage instanceof AlgoPackageImpl ? (AlgoPackageImpl)registeredAlgoPackage : new AlgoPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theAlgoPackage.createPackageContents();

    // Initialize created meta-data
    theAlgoPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAlgoPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AlgoPackage.eNS_URI, theAlgoPackage);
    return theAlgoPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCatalogue()
  {
    return catalogueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCatalogue_Nom()
  {
    return (EAttribute)catalogueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCatalogue_Algorithmes()
  {
    return (EReference)catalogueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAlgorithme()
  {
    return algorithmeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAlgorithme_Nom()
  {
    return (EAttribute)algorithmeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAlgorithme_Documentation()
  {
    return (EAttribute)algorithmeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAlgorithme_Ressource()
  {
    return (EReference)algorithmeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAlgorithme_Port()
  {
    return (EReference)algorithmeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRessource()
  {
    return ressourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRessource_Type()
  {
    return (EAttribute)ressourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRessource_Emplacement()
  {
    return (EAttribute)ressourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPort()
  {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPort_Direction()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPort_Constant()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPort_Nom()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPort_Type()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getTypeRessource()
  {
    return typeRessourceEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getDirection()
  {
    return directionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getTypeDonnees()
  {
    return typeDonneesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlgoFactory getAlgoFactory()
  {
    return (AlgoFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    catalogueEClass = createEClass(CATALOGUE);
    createEAttribute(catalogueEClass, CATALOGUE__NOM);
    createEReference(catalogueEClass, CATALOGUE__ALGORITHMES);

    algorithmeEClass = createEClass(ALGORITHME);
    createEAttribute(algorithmeEClass, ALGORITHME__NOM);
    createEAttribute(algorithmeEClass, ALGORITHME__DOCUMENTATION);
    createEReference(algorithmeEClass, ALGORITHME__RESSOURCE);
    createEReference(algorithmeEClass, ALGORITHME__PORT);

    ressourceEClass = createEClass(RESSOURCE);
    createEAttribute(ressourceEClass, RESSOURCE__TYPE);
    createEAttribute(ressourceEClass, RESSOURCE__EMPLACEMENT);

    portEClass = createEClass(PORT);
    createEAttribute(portEClass, PORT__DIRECTION);
    createEAttribute(portEClass, PORT__CONSTANT);
    createEAttribute(portEClass, PORT__NOM);
    createEAttribute(portEClass, PORT__TYPE);

    // Create enums
    typeRessourceEEnum = createEEnum(TYPE_RESSOURCE);
    directionEEnum = createEEnum(DIRECTION);
    typeDonneesEEnum = createEEnum(TYPE_DONNEES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(catalogueEClass, Catalogue.class, "Catalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCatalogue_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCatalogue_Algorithmes(), this.getAlgorithme(), null, "algorithmes", null, 0, -1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(algorithmeEClass, Algorithme.class, "Algorithme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlgorithme_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Algorithme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlgorithme_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Algorithme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlgorithme_Ressource(), this.getRessource(), null, "ressource", null, 0, 1, Algorithme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlgorithme_Port(), this.getPort(), null, "port", null, 0, -1, Algorithme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ressourceEClass, Ressource.class, "Ressource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRessource_Type(), this.getTypeRessource(), "type", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRessource_Emplacement(), ecorePackage.getEString(), "emplacement", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPort_Direction(), this.getDirection(), "direction", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPort_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPort_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPort_Type(), this.getTypeDonnees(), "type", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(typeRessourceEEnum, TypeRessource.class, "TypeRessource");
    addEEnumLiteral(typeRessourceEEnum, TypeRessource.PYTHON);
    addEEnumLiteral(typeRessourceEEnum, TypeRessource.SCRIPT);

    initEEnum(directionEEnum, Direction.class, "Direction");
    addEEnumLiteral(directionEEnum, Direction.ENTREE);
    addEEnumLiteral(directionEEnum, Direction.SORTIE);

    initEEnum(typeDonneesEEnum, TypeDonnees.class, "TypeDonnees");
    addEEnumLiteral(typeDonneesEEnum, TypeDonnees.INT);
    addEEnumLiteral(typeDonneesEEnum, TypeDonnees.FLOAT);
    addEEnumLiteral(typeDonneesEEnum, TypeDonnees.STR);
    addEEnumLiteral(typeDonneesEEnum, TypeDonnees.BOOL);

    // Create resource
    createResource(eNS_URI);
  }

} //AlgoPackageImpl
