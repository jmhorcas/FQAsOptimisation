/**
 */
package uma.caosd.FQAsArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joinpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.caosd.FQAsArchitecture.Joinpoint#getUsagecontext <em>Usagecontext</em>}</li>
 *   <li>{@link uma.caosd.FQAsArchitecture.Joinpoint#getDepends <em>Depends</em>}</li>
 *   <li>{@link uma.caosd.FQAsArchitecture.Joinpoint#getFqas <em>Fqas</em>}</li>
 * </ul>
 *
 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getJoinpoint()
 * @model
 * @generated
 */
public interface Joinpoint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Usagecontext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usagecontext</em>' containment reference.
	 * @see #setUsagecontext(UsageContext)
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getJoinpoint_Usagecontext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UsageContext getUsagecontext();

	/**
	 * Sets the value of the '{@link uma.caosd.FQAsArchitecture.Joinpoint#getUsagecontext <em>Usagecontext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usagecontext</em>' containment reference.
	 * @see #getUsagecontext()
	 * @generated
	 */
	void setUsagecontext(UsageContext value);

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference.
	 * @see #setDepends(Joinpoint)
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getJoinpoint_Depends()
	 * @model
	 * @generated
	 */
	Joinpoint getDepends();

	/**
	 * Sets the value of the '{@link uma.caosd.FQAsArchitecture.Joinpoint#getDepends <em>Depends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends</em>' reference.
	 * @see #getDepends()
	 * @generated
	 */
	void setDepends(Joinpoint value);

	/**
	 * Returns the value of the '<em><b>Fqas</b></em>' reference list.
	 * The list contents are of type {@link uma.caosd.FQAsArchitecture.FQA}.
	 * It is bidirectional and its opposite is '{@link uma.caosd.FQAsArchitecture.FQA#getAppliesOver <em>Applies Over</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fqas</em>' reference list.
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getJoinpoint_Fqas()
	 * @see uma.caosd.FQAsArchitecture.FQA#getAppliesOver
	 * @model opposite="appliesOver"
	 * @generated
	 */
	EList<FQA> getFqas();

} // Joinpoint
