/**
 */
package tfsm_plaink3Trace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import tfsm_plaink3Trace.States.tfsm_plaink3.TracedTFSM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tfsm plaink3 TFSM Init</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tfsm_plaink3Trace.Steps.StepsPackage#getTfsm_plaink3_TFSM_Init()
 * @model
 * @generated
 */
public interface Tfsm_plaink3_TFSM_Init extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (tfsm_plaink3Trace.States.tfsm_plaink3.TracedTFSM) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedTFSM getCaller();

} // Tfsm_plaink3_TFSM_Init
