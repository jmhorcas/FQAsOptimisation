/**
 */
package uma.caosd.FQAsArchitecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.caosd.FQAsArchitecture.FQA;
import uma.caosd.FQAsArchitecture.FQAsArchitectureModel;
import uma.caosd.FQAsArchitecture.FQAsArchitecturePackage;
import uma.caosd.FQAsArchitecture.Joinpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.caosd.FQAsArchitecture.impl.FQAsArchitectureModelImpl#getJoinpoints <em>Joinpoints</em>}</li>
 *   <li>{@link uma.caosd.FQAsArchitecture.impl.FQAsArchitectureModelImpl#getFqas <em>Fqas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FQAsArchitectureModelImpl extends MinimalEObjectImpl.Container implements FQAsArchitectureModel {
	/**
	 * The cached value of the '{@link #getJoinpoints() <em>Joinpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Joinpoint> joinpoints;

	/**
	 * The cached value of the '{@link #getFqas() <em>Fqas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqas()
	 * @generated
	 * @ordered
	 */
	protected EList<FQA> fqas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FQAsArchitectureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FQAsArchitecturePackage.Literals.FQ_AS_ARCHITECTURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Joinpoint> getJoinpoints() {
		if (joinpoints == null) {
			joinpoints = new EObjectContainmentEList<Joinpoint>(Joinpoint.class, this, FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__JOINPOINTS);
		}
		return joinpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FQA> getFqas() {
		if (fqas == null) {
			fqas = new EObjectContainmentEList<FQA>(FQA.class, this, FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__FQAS);
		}
		return fqas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__JOINPOINTS:
				return ((InternalEList<?>)getJoinpoints()).basicRemove(otherEnd, msgs);
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__FQAS:
				return ((InternalEList<?>)getFqas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__JOINPOINTS:
				return getJoinpoints();
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__FQAS:
				return getFqas();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__JOINPOINTS:
				getJoinpoints().clear();
				getJoinpoints().addAll((Collection<? extends Joinpoint>)newValue);
				return;
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__FQAS:
				getFqas().clear();
				getFqas().addAll((Collection<? extends FQA>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__JOINPOINTS:
				getJoinpoints().clear();
				return;
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__FQAS:
				getFqas().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__JOINPOINTS:
				return joinpoints != null && !joinpoints.isEmpty();
			case FQAsArchitecturePackage.FQ_AS_ARCHITECTURE_MODEL__FQAS:
				return fqas != null && !fqas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FQAsArchitectureModelImpl
