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

@SuppressWarnings("all")
public class SystemAspectSystemAspectContext {
  public final static SystemAspectSystemAspectContext INSTANCE = new SystemAspectSystemAspectContext();
  
  public static SystemAspectSystemAspectProperties getSelf(final org.gemoc.sample.sigpml.xsigpml.sigpml.System _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.sigpml.xsigpml.aspects.SystemAspectSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<org.gemoc.sample.sigpml.xsigpml.sigpml.System, SystemAspectSystemAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.sigpml.xsigpml.sigpml.System, org.gemoc.sample.sigpml.xsigpml.aspects.SystemAspectSystemAspectProperties>();
  
  public Map<org.gemoc.sample.sigpml.xsigpml.sigpml.System, SystemAspectSystemAspectProperties> getMap() {
    return map;
  }
}
