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
package org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.FSMEvent;
import org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage;
import org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.impl.FSMEventImpl#getSollicitingTransitions <em>Solliciting Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMEventImpl extends NamedElementImpl implements FSMEvent {
	/**
	 * The cached value of the '{@link #getSollicitingTransitions() <em>Solliciting Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSollicitingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> sollicitingTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TfsmPackage.Literals.FSM_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getSollicitingTransitions() {
		if (sollicitingTransitions == null) {
			sollicitingTransitions = new EObjectResolvingEList<Transition>(Transition.class, this, TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS);
		}
		return sollicitingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String occurs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS:
				return getSollicitingTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS:
				getSollicitingTransitions().clear();
				getSollicitingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS:
				getSollicitingTransitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TfsmPackage.FSM_EVENT__SOLLICITING_TRANSITIONS:
				return sollicitingTransitions != null && !sollicitingTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FSMEventImpl
