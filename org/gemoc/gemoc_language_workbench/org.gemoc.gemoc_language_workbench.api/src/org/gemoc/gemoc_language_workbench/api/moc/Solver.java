package org.gemoc.gemoc_language_workbench.api.moc;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.aoste.trace.EventOccurrence;
import fr.inria.aoste.trace.LogicalStep;
import glml.MocEvent;

/**
 * A Solver is the visible interface of any constraint solver system that runs
 * on its corresponding input based on a Model of Execution, returns Steps upon
 * requests and provides an API to influence the constraint-solving.
 * 
 * The steps it returns are based on the trace metamodel fr.inria.aoste.trace.
 * 
 * @author flatombe
 */
public interface Solver {
	/**
	 * Forces the underlying MoC structure to forbid the given EventOccurrence
	 * from ticking in the next step.
	 */
	public void forbidEventOccurrence(EventOccurrence eventOccurrence);

	/**
	 * Forces the underlying MoC structure to force the given EventOccurrence to
	 * tick in the next step.
	 */
	public void forceEventOccurrence(EventOccurrence eventOccurrence);

	/**
	 * Returns the next step on the MoC's agenda.
	 * 
	 * @return a LogicalStep conforming to the (fr.inria.aoste.trace) scheduling
	 *         trace metamodel.
	 */
	public LogicalStep getNextStep();

	/**
	 * Returns the facility that allows the Execution Engine to create an input
	 * acceptable for the solver based on the Model-Specific Events file.
	 * 
	 * @return the SolverInputBuilder for this solver.
	 */
	public SolverInputBuilder getSolverInputBuilder();

	/**
	 * Sets the input (constraints instanciated for the model) for this solver.
	 * We use a file URI to allow different formats.
	 * 
	 * @param solverInputURI
	 */
	public void setSolverInputFile(URI solverInputURI);

	/**
	 * Returns the instance of MocEvent for the EObject target. The Solver (or
	 * its SolverInputBuilder more precisely) being responsible for
	 * instanciating the Moc Events down to the model level, but this mapping
	 * not being explicitly appearing in the trace metamodel, this method allows
	 * us to keep track of this mapping.
	 * 
	 * @param mocEvent
	 * @param target
	 * @return
	 */
	public EventOccurrence getCorrespondingEventOccurrence(MocEvent mocEvent,
			EObject target);

	/**
	 * Creates a registry which represents the mapping between a MocEvent and
	 * its "name" (string representation...). Used for the feedback at the
	 * Moc-event level since the feedback specification does not know of the Moc
	 * Event implementation thus does not know if it really has a name. So this
	 * registry is there to make sure we can somehow still create references to
	 * these Moc Events.
	 * 
	 * @param mocEventsResource
	 * @return
	 */
	public Map<String, MocEvent> createMocEventsRegistry(
			Resource mocEventsResource);
}
