/**
 */
package gemoc_language_designer_conf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Ecore Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemoc_language_designer_conf.EMFEcoreProject#getEcoreModel <em>Ecore Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemoc_language_designer_conf.Gemoc_language_designer_confPackage#getEMFEcoreProject()
 * @model
 * @generated
 */
public interface EMFEcoreProject extends DomainModelProject {
	/**
	 * Returns the value of the '<em><b>Ecore Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Model</em>' containment reference.
	 * @see #setEcoreModel(EcoreModel)
	 * @see gemoc_language_designer_conf.Gemoc_language_designer_confPackage#getEMFEcoreProject_EcoreModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EcoreModel getEcoreModel();

	/**
	 * Sets the value of the '{@link gemoc_language_designer_conf.EMFEcoreProject#getEcoreModel <em>Ecore Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Model</em>' containment reference.
	 * @see #getEcoreModel()
	 * @generated
	 */
	void setEcoreModel(EcoreModel value);

} // EMFEcoreProject
