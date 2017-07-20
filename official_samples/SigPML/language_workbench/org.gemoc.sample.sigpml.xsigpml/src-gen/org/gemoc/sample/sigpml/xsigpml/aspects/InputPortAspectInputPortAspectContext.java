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

import java.util.Map;

import org.gemoc.sample.sigpml.xsigpml.sigpml.InputPort;

@SuppressWarnings("all")
public class InputPortAspectInputPortAspectContext {
  public final static InputPortAspectInputPortAspectContext INSTANCE = new InputPortAspectInputPortAspectContext();
  
  public static InputPortAspectInputPortAspectProperties getSelf(final InputPort _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.sigpml.xsigpml.aspects.InputPortAspectInputPortAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InputPort, InputPortAspectInputPortAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.sigpml.xsigpml.sigpml.InputPort, org.gemoc.sample.sigpml.xsigpml.aspects.InputPortAspectInputPortAspectProperties>();
  
  public Map<InputPort, InputPortAspectInputPortAspectProperties> getMap() {
    return map;
  }
}
