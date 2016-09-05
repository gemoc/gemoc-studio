/**
 */
package tfsm_plaink3Trace.States.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tfsm_plaink3Trace.States.State;
import tfsm_plaink3Trace.States.StatesPackage;
import tfsm_plaink3Trace.States.TFSM_lastStateChangeStepNumber_Value;

import tfsm_plaink3Trace.States.tfsm_plaink3.Tfsm_plaink3Package;
import tfsm_plaink3Trace.States.tfsm_plaink3.TracedTFSM;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFSM last State Change Step Number Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tfsm_plaink3Trace.States.impl.TFSM_lastStateChangeStepNumber_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link tfsm_plaink3Trace.States.impl.TFSM_lastStateChangeStepNumber_ValueImpl#getLastStateChangeStepNumber <em>Last State Change Step Number</em>}</li>
 *   <li>{@link tfsm_plaink3Trace.States.impl.TFSM_lastStateChangeStepNumber_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link tfsm_plaink3Trace.States.impl.TFSM_lastStateChangeStepNumber_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFSM_lastStateChangeStepNumber_ValueImpl extends MinimalEObjectImpl.Container implements TFSM_lastStateChangeStepNumber_Value {
	/**
	 * The default value of the '{@link #getLastStateChangeStepNumber() <em>Last State Change Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStateChangeStepNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_STATE_CHANGE_STEP_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLastStateChangeStepNumber() <em>Last State Change Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStateChangeStepNumber()
	 * @generated
	 * @ordered
	 */
	protected int lastStateChangeStepNumber = LAST_STATE_CHANGE_STEP_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFSM_lastStateChangeStepNumber_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLastStateChangeStepNumber() {
		return lastStateChangeStepNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStateChangeStepNumber(int newLastStateChangeStepNumber) {
		int oldLastStateChangeStepNumber = lastStateChangeStepNumber;
		lastStateChangeStepNumber = newLastStateChangeStepNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__LAST_STATE_CHANGE_STEP_NUMBER, oldLastStateChangeStepNumber, lastStateChangeStepNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTFSM getParent() {
		if (eContainerFeatureID() != StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT) return null;
		return (TracedTFSM)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedTFSM newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedTFSM newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, Tfsm_plaink3Package.TRACED_TFSM__LAST_STATE_CHANGE_STEP_NUMBER_SEQUENCE, TracedTFSM.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__STATES, StatesPackage.STATE__TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedTFSM)otherEnd, msgs);
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, Tfsm_plaink3Package.TRACED_TFSM__LAST_STATE_CHANGE_STEP_NUMBER_SEQUENCE, TracedTFSM.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__LAST_STATE_CHANGE_STEP_NUMBER:
				return getLastStateChangeStepNumber();
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT:
				return getParent();
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__STATES:
				return getStates();
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
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__LAST_STATE_CHANGE_STEP_NUMBER:
				setLastStateChangeStepNumber((Integer)newValue);
				return;
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT:
				setParent((TracedTFSM)newValue);
				return;
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__LAST_STATE_CHANGE_STEP_NUMBER:
				setLastStateChangeStepNumber(LAST_STATE_CHANGE_STEP_NUMBER_EDEFAULT);
				return;
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT:
				setParent((TracedTFSM)null);
				return;
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__LAST_STATE_CHANGE_STEP_NUMBER:
				return lastStateChangeStepNumber != LAST_STATE_CHANGE_STEP_NUMBER_EDEFAULT;
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.TFSM_LAST_STATE_CHANGE_STEP_NUMBER_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lastStateChangeStepNumber: ");
		result.append(lastStateChangeStepNumber);
		result.append(')');
		return result.toString();
	}

} //TFSM_lastStateChangeStepNumber_ValueImpl
