/*******************************************************************************
 * Copyright (c) 2015, 2017  I3S Laboratory  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *******************************************************************************/
/**
 */
package org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TFSM#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TFSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TFSM#getLocalEvents <em>Local Events</em>}</li>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TFSM#getLocalClock <em>Local Clock</em>}</li>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TFSM#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TFSM#getCurrentState <em>Current State</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage#getTFSM()
 * @model
 * @generated
 */
public interface TFSM extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.State}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage#getTFSM_OwnedStates()
	 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage#getTFSM_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TFSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Local Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.FSMEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Events</em>' containment reference list.
	 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage#getTFSM_LocalEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<FSMEvent> getLocalEvents();

	/**
	 * Returns the value of the '<em><b>Local Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Clock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Clock</em>' containment reference.
	 * @see #setLocalClock(FSMClock)
	 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage#getTFSM_LocalClock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FSMClock getLocalClock();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TFSM#getLocalClock <em>Local Clock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Clock</em>' containment reference.
	 * @see #getLocalClock()
	 * @generated
	 */
	void setLocalClock(FSMClock value);

	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage#getTFSM_OwnedTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransitions();

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage#getTFSM_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TFSM#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeCurrentState(State newState);

} // TFSM
