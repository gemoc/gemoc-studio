/*******************************************************************************
 * Copyright (c) 2015, 2016  I3S Laboratory  and others.
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
package org.gemoc.sample.tfsm.concurrent.tfsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.tfsm.TemporalGuard#getOnClock <em>On Clock</em>}</li>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.tfsm.TemporalGuard#getAfterDuration <em>After Duration</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.tfsm.concurrent.tfsm.TfsmPackage#getTemporalGuard()
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
	 * @see #setOnClock(FSMClock)
	 * @see org.gemoc.sample.tfsm.concurrent.tfsm.TfsmPackage#getTemporalGuard_OnClock()
	 * @model required="true"
	 * @generated
	 */
	FSMClock getOnClock();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.tfsm.concurrent.tfsm.TemporalGuard#getOnClock <em>On Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Clock</em>' reference.
	 * @see #getOnClock()
	 * @generated
	 */
	void setOnClock(FSMClock value);

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
	 * @see org.gemoc.sample.tfsm.concurrent.tfsm.TfsmPackage#getTemporalGuard_AfterDuration()
	 * @model required="true"
	 * @generated
	 */
	int getAfterDuration();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.tfsm.concurrent.tfsm.TemporalGuard#getAfterDuration <em>After Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Duration</em>' attribute.
	 * @see #getAfterDuration()
	 * @generated
	 */
	void setAfterDuration(int value);

} // TemporalGuard
