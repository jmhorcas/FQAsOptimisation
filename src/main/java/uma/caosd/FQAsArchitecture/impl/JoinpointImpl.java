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

import uma.caosd.FQAsArchitecture.FQA;
import uma.caosd.FQAsArchitecture.FQAsArchitecturePackage;
import uma.caosd.FQAsArchitecture.Joinpoint;
import uma.caosd.FQAsArchitecture.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joinpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.caosd.FQAsArchitecture.impl.JoinpointImpl#getUsagecontext <em>Usagecontext</em>}</li>
 *   <li>{@link uma.caosd.FQAsArchitecture.impl.JoinpointImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link uma.caosd.FQAsArchitecture.impl.JoinpointImpl#getFqas <em>Fqas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinpointImpl extends NamedElementImpl implements Joinpoint {
	/**
	 * The cached value of the '{@link #getUsagecontext() <em>Usagecontext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagecontext()
	 * @generated
	 * @ordered
	 */
	protected UsageContext usagecontext;

	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected Joinpoint depends;

	/**
	 * The cached value of the '{@link #getFqas() <em>Fqas</em>}' reference list.
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
	protected JoinpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FQAsArchitecturePackage.Literals.JOINPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageContext getUsagecontext() {
		return usagecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsagecontext(UsageContext newUsagecontext, NotificationChain msgs) {
		UsageContext oldUsagecontext = usagecontext;
		usagecontext = newUsagecontext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FQAsArchitecturePackage.JOINPOINT__USAGECONTEXT, oldUsagecontext, newUsagecontext);
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
	public void setUsagecontext(UsageContext newUsagecontext) {
		if (newUsagecontext != usagecontext) {
			NotificationChain msgs = null;
			if (usagecontext != null)
				msgs = ((InternalEObject)usagecontext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FQAsArchitecturePackage.JOINPOINT__USAGECONTEXT, null, msgs);
			if (newUsagecontext != null)
				msgs = ((InternalEObject)newUsagecontext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FQAsArchitecturePackage.JOINPOINT__USAGECONTEXT, null, msgs);
			msgs = basicSetUsagecontext(newUsagecontext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FQAsArchitecturePackage.JOINPOINT__USAGECONTEXT, newUsagecontext, newUsagecontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Joinpoint getDepends() {
		if (depends != null && depends.eIsProxy()) {
			InternalEObject oldDepends = (InternalEObject)depends;
			depends = (Joinpoint)eResolveProxy(oldDepends);
			if (depends != oldDepends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FQAsArchitecturePackage.JOINPOINT__DEPENDS, oldDepends, depends));
			}
		}
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joinpoint basicGetDepends() {
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepends(Joinpoint newDepends) {
		Joinpoint oldDepends = depends;
		depends = newDepends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FQAsArchitecturePackage.JOINPOINT__DEPENDS, oldDepends, depends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FQA> getFqas() {
		if (fqas == null) {
			fqas = new EObjectWithInverseResolvingEList.ManyInverse<FQA>(FQA.class, this, FQAsArchitecturePackage.JOINPOINT__FQAS, FQAsArchitecturePackage.FQA__APPLIES_OVER);
		}
		return fqas;
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
			case FQAsArchitecturePackage.JOINPOINT__FQAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFqas()).basicAdd(otherEnd, msgs);
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
			case FQAsArchitecturePackage.JOINPOINT__USAGECONTEXT:
				return basicSetUsagecontext(null, msgs);
			case FQAsArchitecturePackage.JOINPOINT__FQAS:
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
			case FQAsArchitecturePackage.JOINPOINT__USAGECONTEXT:
				return getUsagecontext();
			case FQAsArchitecturePackage.JOINPOINT__DEPENDS:
				if (resolve) return getDepends();
				return basicGetDepends();
			case FQAsArchitecturePackage.JOINPOINT__FQAS:
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
			case FQAsArchitecturePackage.JOINPOINT__USAGECONTEXT:
				setUsagecontext((UsageContext)newValue);
				return;
			case FQAsArchitecturePackage.JOINPOINT__DEPENDS:
				setDepends((Joinpoint)newValue);
				return;
			case FQAsArchitecturePackage.JOINPOINT__FQAS:
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
			case FQAsArchitecturePackage.JOINPOINT__USAGECONTEXT:
				setUsagecontext((UsageContext)null);
				return;
			case FQAsArchitecturePackage.JOINPOINT__DEPENDS:
				setDepends((Joinpoint)null);
				return;
			case FQAsArchitecturePackage.JOINPOINT__FQAS:
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
			case FQAsArchitecturePackage.JOINPOINT__USAGECONTEXT:
				return usagecontext != null;
			case FQAsArchitecturePackage.JOINPOINT__DEPENDS:
				return depends != null;
			case FQAsArchitecturePackage.JOINPOINT__FQAS:
				return fqas != null && !fqas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JoinpointImpl
