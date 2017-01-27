package org.gemoc.sample.legacyfsm.fsm.design.services;

import org.gemoc.sample.legacyfsm.fsm.Transition;

/** FSM services.
 * 
 * @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * 
 */
public class FSMServices {

	/**
	 * Gets the label for the given {@link Transition}.
	 * 
	 * @param transition
	 *            the {@link Transition}
	 * @return the label for the given {@link Transition}
	 */
	public String getLabel(Transition transition) {
		final StringBuilder res = new StringBuilder();

		res.append("on ");
		res.append(transition.getInput());
		res.append(" do ");
		res.append(transition.getOutput());
		res.append("\n");		
		return res.toString();
	}

}
