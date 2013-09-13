/**
 */
package tfsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tfsm.TemporalGuard#getOnClock <em>On Clock</em>}</li>
 *   <li>{@link tfsm.TemporalGuard#getAfterDuration <em>After Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see tfsm.TfsmPackage#getTemporalGuard()
 * @model
 * @generated
 */
public interface TemporalGuard extends Guard {
    /**
     * Returns the value of the '<em><b>On Clock</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>On Clock</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>On Clock</em>' reference.
     * @see #setOnClock(TfsmClock)
     * @see tfsm.TfsmPackage#getTemporalGuard_OnClock()
     * @model required="true"
     * @generated
     */
    TfsmClock getOnClock();

    /**
     * Sets the value of the '{@link tfsm.TemporalGuard#getOnClock <em>On Clock</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>On Clock</em>' reference.
     * @see #getOnClock()
     * @generated
     */
    void setOnClock(TfsmClock value);

    /**
     * Returns the value of the '<em><b>After Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>After Duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>After Duration</em>' attribute.
     * @see #setAfterDuration(int)
     * @see tfsm.TfsmPackage#getTemporalGuard_AfterDuration()
     * @model required="true"
     * @generated
     */
    int getAfterDuration();

    /**
     * Sets the value of the '{@link tfsm.TemporalGuard#getAfterDuration <em>After Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>After Duration</em>' attribute.
     * @see #getAfterDuration()
     * @generated
     */
    void setAfterDuration(int value);

} // TemporalGuard
