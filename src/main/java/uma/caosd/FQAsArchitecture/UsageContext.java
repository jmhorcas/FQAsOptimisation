/**
 */
package uma.caosd.FQAsArchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.caosd.FQAsArchitecture.UsageContext#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getUsageContext()
 * @model
 * @generated
 */
public interface UsageContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link uma.caosd.FQAsArchitecture.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getUsageContext_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // UsageContext
