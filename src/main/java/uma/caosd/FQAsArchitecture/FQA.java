/**
 */
package uma.caosd.FQAsArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FQA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.caosd.FQAsArchitecture.FQA#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link uma.caosd.FQAsArchitecture.FQA#getAppliesOver <em>Applies Over</em>}</li>
 * </ul>
 *
 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getFQA()
 * @model
 * @generated
 */
public interface FQA extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Configuration)
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getFQA_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link uma.caosd.FQAsArchitecture.FQA#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Applies Over</b></em>' reference list.
	 * The list contents are of type {@link uma.caosd.FQAsArchitecture.Joinpoint}.
	 * It is bidirectional and its opposite is '{@link uma.caosd.FQAsArchitecture.Joinpoint#getFqas <em>Fqas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies Over</em>' reference list.
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getFQA_AppliesOver()
	 * @see uma.caosd.FQAsArchitecture.Joinpoint#getFqas
	 * @model opposite="fqas"
	 * @generated
	 */
	EList<Joinpoint> getAppliesOver();

} // FQA
