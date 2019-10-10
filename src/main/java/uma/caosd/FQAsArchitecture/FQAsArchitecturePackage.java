/**
 */
package uma.caosd.FQAsArchitecture;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uma.caosd.FQAsArchitecture.FQAsArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface FQAsArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FQAsArchitecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://caosd.lcc.uma.es/FQAsArchitecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FQAsArchitecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FQAsArchitecturePackage eINSTANCE = uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link uma.caosd.FQAsArchitecture.impl.FQAsArchitectureModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitectureModelImpl
	 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getFQAsArchitectureModel()
	 * @generated
	 */
	int FQ_AS_ARCHITECTURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Joinpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQ_AS_ARCHITECTURE_MODEL__JOINPOINTS = 0;

	/**
	 * The feature id for the '<em><b>Fqas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQ_AS_ARCHITECTURE_MODEL__FQAS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQ_AS_ARCHITECTURE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQ_AS_ARCHITECTURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uma.caosd.FQAsArchitecture.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uma.caosd.FQAsArchitecture.impl.NamedElementImpl
	 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uma.caosd.FQAsArchitecture.impl.JoinpointImpl <em>Joinpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uma.caosd.FQAsArchitecture.impl.JoinpointImpl
	 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getJoinpoint()
	 * @generated
	 */
	int JOINPOINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINPOINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Usagecontext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINPOINT__USAGECONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINPOINT__DEPENDS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fqas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINPOINT__FQAS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Joinpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINPOINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Joinpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINPOINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uma.caosd.FQAsArchitecture.impl.UsageContextImpl <em>Usage Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uma.caosd.FQAsArchitecture.impl.UsageContextImpl
	 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getUsageContext()
	 * @generated
	 */
	int USAGE_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Usage Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Usage Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uma.caosd.FQAsArchitecture.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uma.caosd.FQAsArchitecture.impl.VariableImpl
	 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uma.caosd.FQAsArchitecture.impl.FQAImpl <em>FQA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uma.caosd.FQAsArchitecture.impl.FQAImpl
	 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getFQA()
	 * @generated
	 */
	int FQA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQA__CONFIGURATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies Over</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQA__APPLIES_OVER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FQA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FQA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uma.caosd.FQAsArchitecture.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uma.caosd.FQAsArchitecture.impl.ConfigurationImpl
	 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link uma.caosd.FQAsArchitecture.FQAsArchitectureModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitectureModel
	 * @generated
	 */
	EClass getFQAsArchitectureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uma.caosd.FQAsArchitecture.FQAsArchitectureModel#getJoinpoints <em>Joinpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joinpoints</em>'.
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitectureModel#getJoinpoints()
	 * @see #getFQAsArchitectureModel()
	 * @generated
	 */
	EReference getFQAsArchitectureModel_Joinpoints();

	/**
	 * Returns the meta object for the containment reference list '{@link uma.caosd.FQAsArchitecture.FQAsArchitectureModel#getFqas <em>Fqas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fqas</em>'.
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitectureModel#getFqas()
	 * @see #getFQAsArchitectureModel()
	 * @generated
	 */
	EReference getFQAsArchitectureModel_Fqas();

	/**
	 * Returns the meta object for class '{@link uma.caosd.FQAsArchitecture.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see uma.caosd.FQAsArchitecture.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link uma.caosd.FQAsArchitecture.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uma.caosd.FQAsArchitecture.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link uma.caosd.FQAsArchitecture.Joinpoint <em>Joinpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joinpoint</em>'.
	 * @see uma.caosd.FQAsArchitecture.Joinpoint
	 * @generated
	 */
	EClass getJoinpoint();

	/**
	 * Returns the meta object for the containment reference '{@link uma.caosd.FQAsArchitecture.Joinpoint#getUsagecontext <em>Usagecontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usagecontext</em>'.
	 * @see uma.caosd.FQAsArchitecture.Joinpoint#getUsagecontext()
	 * @see #getJoinpoint()
	 * @generated
	 */
	EReference getJoinpoint_Usagecontext();

	/**
	 * Returns the meta object for the reference '{@link uma.caosd.FQAsArchitecture.Joinpoint#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depends</em>'.
	 * @see uma.caosd.FQAsArchitecture.Joinpoint#getDepends()
	 * @see #getJoinpoint()
	 * @generated
	 */
	EReference getJoinpoint_Depends();

	/**
	 * Returns the meta object for the reference list '{@link uma.caosd.FQAsArchitecture.Joinpoint#getFqas <em>Fqas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fqas</em>'.
	 * @see uma.caosd.FQAsArchitecture.Joinpoint#getFqas()
	 * @see #getJoinpoint()
	 * @generated
	 */
	EReference getJoinpoint_Fqas();

	/**
	 * Returns the meta object for class '{@link uma.caosd.FQAsArchitecture.UsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Context</em>'.
	 * @see uma.caosd.FQAsArchitecture.UsageContext
	 * @generated
	 */
	EClass getUsageContext();

	/**
	 * Returns the meta object for the containment reference list '{@link uma.caosd.FQAsArchitecture.UsageContext#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see uma.caosd.FQAsArchitecture.UsageContext#getVariables()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_Variables();

	/**
	 * Returns the meta object for class '{@link uma.caosd.FQAsArchitecture.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see uma.caosd.FQAsArchitecture.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link uma.caosd.FQAsArchitecture.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uma.caosd.FQAsArchitecture.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link uma.caosd.FQAsArchitecture.FQA <em>FQA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FQA</em>'.
	 * @see uma.caosd.FQAsArchitecture.FQA
	 * @generated
	 */
	EClass getFQA();

	/**
	 * Returns the meta object for the containment reference '{@link uma.caosd.FQAsArchitecture.FQA#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see uma.caosd.FQAsArchitecture.FQA#getConfiguration()
	 * @see #getFQA()
	 * @generated
	 */
	EReference getFQA_Configuration();

	/**
	 * Returns the meta object for the reference list '{@link uma.caosd.FQAsArchitecture.FQA#getAppliesOver <em>Applies Over</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies Over</em>'.
	 * @see uma.caosd.FQAsArchitecture.FQA#getAppliesOver()
	 * @see #getFQA()
	 * @generated
	 */
	EReference getFQA_AppliesOver();

	/**
	 * Returns the meta object for class '{@link uma.caosd.FQAsArchitecture.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see uma.caosd.FQAsArchitecture.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link uma.caosd.FQAsArchitecture.Configuration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uma.caosd.FQAsArchitecture.Configuration#getId()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FQAsArchitectureFactory getFQAsArchitectureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uma.caosd.FQAsArchitecture.impl.FQAsArchitectureModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitectureModelImpl
		 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getFQAsArchitectureModel()
		 * @generated
		 */
		EClass FQ_AS_ARCHITECTURE_MODEL = eINSTANCE.getFQAsArchitectureModel();

		/**
		 * The meta object literal for the '<em><b>Joinpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FQ_AS_ARCHITECTURE_MODEL__JOINPOINTS = eINSTANCE.getFQAsArchitectureModel_Joinpoints();

		/**
		 * The meta object literal for the '<em><b>Fqas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FQ_AS_ARCHITECTURE_MODEL__FQAS = eINSTANCE.getFQAsArchitectureModel_Fqas();

		/**
		 * The meta object literal for the '{@link uma.caosd.FQAsArchitecture.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uma.caosd.FQAsArchitecture.impl.NamedElementImpl
		 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link uma.caosd.FQAsArchitecture.impl.JoinpointImpl <em>Joinpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uma.caosd.FQAsArchitecture.impl.JoinpointImpl
		 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getJoinpoint()
		 * @generated
		 */
		EClass JOINPOINT = eINSTANCE.getJoinpoint();

		/**
		 * The meta object literal for the '<em><b>Usagecontext</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINPOINT__USAGECONTEXT = eINSTANCE.getJoinpoint_Usagecontext();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINPOINT__DEPENDS = eINSTANCE.getJoinpoint_Depends();

		/**
		 * The meta object literal for the '<em><b>Fqas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINPOINT__FQAS = eINSTANCE.getJoinpoint_Fqas();

		/**
		 * The meta object literal for the '{@link uma.caosd.FQAsArchitecture.impl.UsageContextImpl <em>Usage Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uma.caosd.FQAsArchitecture.impl.UsageContextImpl
		 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getUsageContext()
		 * @generated
		 */
		EClass USAGE_CONTEXT = eINSTANCE.getUsageContext();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__VARIABLES = eINSTANCE.getUsageContext_Variables();

		/**
		 * The meta object literal for the '{@link uma.caosd.FQAsArchitecture.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uma.caosd.FQAsArchitecture.impl.VariableImpl
		 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link uma.caosd.FQAsArchitecture.impl.FQAImpl <em>FQA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uma.caosd.FQAsArchitecture.impl.FQAImpl
		 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getFQA()
		 * @generated
		 */
		EClass FQA = eINSTANCE.getFQA();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FQA__CONFIGURATION = eINSTANCE.getFQA_Configuration();

		/**
		 * The meta object literal for the '<em><b>Applies Over</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FQA__APPLIES_OVER = eINSTANCE.getFQA_AppliesOver();

		/**
		 * The meta object literal for the '{@link uma.caosd.FQAsArchitecture.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uma.caosd.FQAsArchitecture.impl.ConfigurationImpl
		 * @see uma.caosd.FQAsArchitecture.impl.FQAsArchitecturePackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__ID = eINSTANCE.getConfiguration_Id();

	}

} //FQAsArchitecturePackage
