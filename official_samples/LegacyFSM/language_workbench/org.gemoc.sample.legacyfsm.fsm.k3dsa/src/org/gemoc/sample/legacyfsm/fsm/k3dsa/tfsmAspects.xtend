package org.gemoc.sample.legacyfsm.fsm.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step

import org.gemoc.sample.legacyfsm.fsm.FSM
import org.gemoc.sample.legacyfsm.fsm.State
import org.gemoc.sample.legacyfsm.fsm.Transition

import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StateAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.TransitionAspect.*
import org.eclipse.emf.common.util.EList

@Aspect(className=FSM)
class FSMAspect {

	public State currentState
	
	public EList<String> actionsToProcess
	public String producedString 
	
	private int processedTokens
	
	@fr.inria.diverse.k3.al.annotationprocessor.Main
    def public void main() {
    	try{
			_self.actionsToProcess.forEach[inputToken, counter |
				println("Reading "+inputToken)
				_self.currentState.step(inputToken) 
				_self.processedTokens = counter			
			]
		
		} catch (NoTransition nt){
			println("Stopped due to NoTransition")
		} catch (NonDeterminism nd){
			println("Stopped due to NonDeterminism")
		}
		println("processed tokens: "+_self.processedTokens+"/"+_self.actionsToProcess.size)
		println("produced string: "+_self.producedString)
	}
       
       
	@fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
	def public void initializeModel(EList<String> args){
		_self.currentState = _self.initialState;
		_self.actionsToProcess.addAll(args)
	}
	

}


@Aspect(className=State)
class StateAspect {
	@Step
	def public void step(String inputToken) {
		// Get the valid transitions	
		val validTransitions =  _self.outgoingTransitions.filter[t | t.input.equals(inputToken)]
		if(validTransitions.empty) {
			throw new NoTransition
		}
		if(validTransitions.size > 1) {
			throw new NonDeterminism
		}
		// Fire transition
		validTransitions.get(0).fire
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	@Step
	def public void fire() {
		println("Firing " + _self.name + " and entering " + _self.target.name)
		_self.source.owningFSM.currentState = _self.target
		_self.source.owningFSM.producedString = _self.source.owningFSM.producedString + _self.output
	}
}

class NoTransition extends Exception{
	
}

class NonDeterminism extends Exception{
	
}