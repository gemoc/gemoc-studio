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
package org.gemoc.sample.sigpml.xsigpml.aspects;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.sigpml.xsigpml.sigpml.HWComputationalResource;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = HWComputationalResource.class)
@SuppressWarnings("all")
public class HWComputationalResourceAspect {
  public static void incCycle(final HWComputationalResource _self) {
	final org.gemoc.sample.sigpml.xsigpml.aspects.HWComputationalResourceAspectHWComputationalResourceAspectProperties _self_ = org.gemoc.sample.sigpml.xsigpml.aspects.HWComputationalResourceAspectHWComputationalResourceAspectContext
			.getSelf(_self);
	_privk3_incCycle(_self_, _self);
	;
}
  
  public static int currentExecCycle(final HWComputationalResource _self) {
	final org.gemoc.sample.sigpml.xsigpml.aspects.HWComputationalResourceAspectHWComputationalResourceAspectProperties _self_ = org.gemoc.sample.sigpml.xsigpml.aspects.HWComputationalResourceAspectHWComputationalResourceAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentExecCycle(_self_, _self);
	;
	return (int) result;
}
  
  public static void currentExecCycle(final HWComputationalResource _self, final int currentExecCycle) {
	final org.gemoc.sample.sigpml.xsigpml.aspects.HWComputationalResourceAspectHWComputationalResourceAspectProperties _self_ = org.gemoc.sample.sigpml.xsigpml.aspects.HWComputationalResourceAspectHWComputationalResourceAspectContext
			.getSelf(_self);
	_privk3_currentExecCycle(_self_, _self, currentExecCycle);
	;
}
  
  protected static void _privk3_incCycle(final HWComputationalResourceAspectHWComputationalResourceAspectProperties _self_, final HWComputationalResource _self) {
    int _currentExecCycle = HWComputationalResourceAspect.currentExecCycle(_self);
    int _plus = (_currentExecCycle + 1);
    HWComputationalResourceAspect.currentExecCycle(_self, _plus);
    String _name = _self.getName();
    String _plus_1 = ("time in CPU " + _name);
    String _plus_2 = (_plus_1 + " = ");
    int _currentExecCycle_1 = HWComputationalResourceAspect.currentExecCycle(_self);
    String _plus_3 = (_plus_2 + Integer.valueOf(_currentExecCycle_1));
    InputOutput.<String>println(_plus_3);
  }
  
  protected static int _privk3_currentExecCycle(final HWComputationalResourceAspectHWComputationalResourceAspectProperties _self_, final HWComputationalResource _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentExecCycle") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentExecCycle;
  }
  
  protected static void _privk3_currentExecCycle(final HWComputationalResourceAspectHWComputationalResourceAspectProperties _self_, final HWComputationalResource _self, final int currentExecCycle) {
    _self_.currentExecCycle = currentExecCycle; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentExecCycle")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentExecCycle);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
