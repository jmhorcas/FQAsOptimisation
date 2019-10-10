/**
 */
package uma.caosd.FQAsArchitecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uma.caosd.FQAsArchitecture.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FQAsArchitectureFactoryImpl extends EFactoryImpl implements FQAsArchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FQAsArchitectureFactory init() {
		try {
			FQAsArchitectureFactory theFQAsArchitectureFactory = (FQAsArchitectureFactory)EPackage.Registry.INSTANCE.getEFactory(FQAsArchitecturePackage.eNS_URI);
			if (theFQAsArchitectureFactory != null) {
				return theFQAsArchitectureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FQAsArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FQAsArchitectureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL: return createFQAsArchitectureModel();
			case FQAsArchitecturePackage.NAMED_ELEMENT: return createNamedElement();
			case FQAsArchitecturePackage.JOINPOINT: return createJoinpoint();
			case FQAsArchitecturePackage.USAGE_CONTEXT: return createUsageContext();
			case FQAsArchitecturePackage.VARIABLE: return createVariable();
			case FQAsArchitecturePackage.FQA: return createFQA();
			case FQAsArchitecturePackage.CONFIGURATION: return createConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FQAsArchitectureModel createFQAsArchitectureModel() {
		FQAsArchitectureModelImpl fqAsArchitectureModel = new FQAsArchitectureModelImpl();
		return fqAsArchitectureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Joinpoint createJoinpoint() {
		JoinpointImpl joinpoint = new JoinpointImpl();
		return joinpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageContext createUsageContext() {
		UsageContextImpl usageContext = new UsageContextImpl();
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FQA createFQA() {
		FQAImpl fqa = new FQAImpl();
		return fqa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FQAsArchitecturePackage getFQAsArchitecturePackage() {
		return (FQAsArchitecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FQAsArchitecturePackage getPackage() {
		return FQAsArchitecturePackage.eINSTANCE;
	}

} //FQAsArchitectureFactoryImpl
