/**
 */
package uma.caosd.FQAsArchitecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.caosd.FQAsArchitecture.Configuration#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getConfiguration_Id()
	 * @model default="0"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link uma.caosd.FQAsArchitecture.Configuration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Configuration
