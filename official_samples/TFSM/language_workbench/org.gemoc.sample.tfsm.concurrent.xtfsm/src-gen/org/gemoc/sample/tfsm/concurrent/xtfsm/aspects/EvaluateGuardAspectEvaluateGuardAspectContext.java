package org.gemoc.sample.tfsm.concurrent.xtfsm.aspects;

import java.util.Map;
import org.gemoc.sample.tfsm.concurrent.xtfsm.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties;
import org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.EvaluateGuard;

@SuppressWarnings("all")
public class EvaluateGuardAspectEvaluateGuardAspectContext {
  public final static EvaluateGuardAspectEvaluateGuardAspectContext INSTANCE = new EvaluateGuardAspectEvaluateGuardAspectContext();
  
  public static EvaluateGuardAspectEvaluateGuardAspectProperties getSelf(final EvaluateGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.tfsm.concurrent.xtfsm.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EvaluateGuard, EvaluateGuardAspectEvaluateGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.EvaluateGuard, org.gemoc.sample.tfsm.concurrent.xtfsm.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties>();
  
  public Map<EvaluateGuard, EvaluateGuardAspectEvaluateGuardAspectProperties> getMap() {
    return map;
  }
}