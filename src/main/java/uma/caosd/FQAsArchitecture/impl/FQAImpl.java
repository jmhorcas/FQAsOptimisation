/**
 */
package uma.caosd.FQAsArchitecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.caosd.FQAsArchitecture.Configuration;
import uma.caosd.FQAsArchitecture.FQA;
import uma.caosd.FQAsArchitecture.FQAsArchitecturePackage;
import uma.caosd.FQAsArchitecture.Joinpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FQA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.caosd.FQAsArchitecture.impl.FQAImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link uma.caosd.FQAsArchitecture.impl.FQAImpl#getAppliesOver <em>Applies Over</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FQAImpl extends NamedElementImpl implements FQA {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The cached value of the '{@link #getAppliesOver() <em>Applies Over</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesOver()
	 * @generated
	 * @ordered
	 */
	protected EList<Joinpoint> appliesOver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FQAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FQAsArchitecturePackage.Literals.FQA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FQAsArchitecturePackage.FQA__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FQAsArchitecturePackage.FQA__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FQAsArchitecturePackage.FQA__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FQAsArchitecturePackage.FQA__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Joinpoint> getAppliesOver() {
		if (appliesOver == null) {
			appliesOver = new EObjectWithInverseResolvingEList.ManyInverse<Joinpoint>(Joinpoint.class, this, FQAsArchitecturePackage.FQA__APPLIES_OVER, FQAsArchitecturePackage.JOINPOINT__FQAS);
		}
		return appliesOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FQAsArchitecturePackage.FQA__APPLIES_OVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppliesOver()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FQAsArchitecturePackage.FQA__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case FQAsArchitecturePackage.FQA__APPLIES_OVER:
				return ((InternalEList<?>)getAppliesOver()).basicRemove(otherEnd, msgs);
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
			case FQAsArchitecturePackage.FQA__CONFIGURATION:
				return getConfiguration();
			case FQAsArchitecturePackage.FQA__APPLIES_OVER:
				return getAppliesOver();
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
			case FQAsArchitecturePackage.FQA__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case FQAsArchitecturePackage.FQA__APPLIES_OVER:
				getAppliesOver().clear();
				getAppliesOver().addAll((Collection<? extends Joinpoint>)newValue);
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
			case FQAsArchitecturePackage.FQA__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case FQAsArchitecturePackage.FQA__APPLIES_OVER:
				getAppliesOver().clear();
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
			case FQAsArchitecturePackage.FQA__CONFIGURATION:
				return configuration != null;
			case FQAsArchitecturePackage.FQA__APPLIES_OVER:
				return appliesOver != null && !appliesOver.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FQAImpl
