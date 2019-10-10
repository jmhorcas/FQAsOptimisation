/**
 */
package uma.caosd.FQAsArchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.caosd.FQAsArchitecture.FQAsArchitectureModel#getJoinpoints <em>Joinpoints</em>}</li>
 *   <li>{@link uma.caosd.FQAsArchitecture.FQAsArchitectureModel#getFqas <em>Fqas</em>}</li>
 * </ul>
 *
 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getFQAsArchitectureModel()
 * @model
 * @generated
 */
public interface FQAsArchitectureModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Joinpoints</b></em>' containment reference list.
	 * The list contents are of type {@link uma.caosd.FQAsArchitecture.Joinpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joinpoints</em>' containment reference list.
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getFQAsArchitectureModel_Joinpoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joinpoint> getJoinpoints();

	/**
	 * Returns the value of the '<em><b>Fqas</b></em>' containment reference list.
	 * The list contents are of type {@link uma.caosd.FQAsArchitecture.FQA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fqas</em>' containment reference list.
	 * @see uma.caosd.FQAsArchitecture.FQAsArchitecturePackage#getFQAsArchitectureModel_Fqas()
	 * @model containment="true"
	 * @generated
	 */
	EList<FQA> getFqas();

} // FQAsArchitectureModel
