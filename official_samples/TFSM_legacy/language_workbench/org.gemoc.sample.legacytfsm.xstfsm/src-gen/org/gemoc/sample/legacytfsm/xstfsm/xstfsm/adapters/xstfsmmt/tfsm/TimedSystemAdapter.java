package org.gemoc.sample.legacytfsm.xstfsm.xstfsm.adapters.xstfsmmt.tfsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.sample.legacytfsm.xstfsm.xstfsm.adapters.xstfsmmt.XSTFSMMTAdaptersFactory;
import org.gemoc.sample.legacytfsm.xstfsm.xstfsm.tfsm.TimedSystem;
import org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.FSMClock;
import org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.FSMEvent;
import org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TimeFSM;

@SuppressWarnings("all")
public class TimedSystemAdapter extends EObjectAdapter<TimedSystem> implements org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TimedSystem {
  private XSTFSMMTAdaptersFactory adaptersFactory;
  
  public TimedSystemAdapter() {
    super(org.gemoc.sample.legacytfsm.xstfsm.xstfsm.adapters.xstfsmmt.XSTFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.sample.legacytfsm.xstfsm.xstfsm.adapters.xstfsmmt.XSTFSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<TimeFSM> tfsms_;
  
  @Override
  public EList<TimeFSM> getTfsms() {
    if (tfsms_ == null)
    	tfsms_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTfsms(), adaptersFactory, eResource);
    return tfsms_;
  }
  
  private EList<FSMClock> globalClocks_;
  
  @Override
  public EList<FSMClock> getGlobalClocks() {
    if (globalClocks_ == null)
    	globalClocks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getGlobalClocks(), adaptersFactory, eResource);
    return globalClocks_;
  }
  
  private EList<FSMEvent> globalEvents_;
  
  @Override
  public EList<FSMEvent> getGlobalEvents() {
    if (globalEvents_ == null)
    	globalEvents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getGlobalEvents(), adaptersFactory, eResource);
    return globalEvents_;
  }
  
  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.gemoc.sample.legacytfsm.xstfsm.xstfsm.aspects.TimedSystemAspect.initializeModel(adaptee, args
    );
  }
  
  @Override
  public void main() {
    org.gemoc.sample.legacytfsm.xstfsm.xstfsm.aspects.TimedSystemAspect.main(adaptee);
  }
  
  @Override
  public void visit() {
    org.gemoc.sample.legacytfsm.xstfsm.xstfsm.aspects.TimedSystemVisitorAspect.visit(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.eINSTANCE.getTimedSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__NAME:
    		return getName();
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__TFSMS:
    		return getTfsms();
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__GLOBAL_CLOCKS:
    		return getGlobalClocks();
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__GLOBAL_EVENTS:
    		return getGlobalEvents();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__TFSMS:
    		return getTfsms() != null && !getTfsms().isEmpty();
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__GLOBAL_CLOCKS:
    		return getGlobalClocks() != null && !getGlobalClocks().isEmpty();
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__GLOBAL_EVENTS:
    		return getGlobalEvents() != null && !getGlobalEvents().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__TFSMS:
    		getTfsms().clear();
    		getTfsms().addAll((Collection) newValue);
    		return;
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__GLOBAL_CLOCKS:
    		getGlobalClocks().clear();
    		getGlobalClocks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.sample.legacytfsm.xstfsm.xstfsmmt.tfsm.TfsmPackage.TIMED_SYSTEM__GLOBAL_EVENTS:
    		getGlobalEvents().clear();
    		getGlobalEvents().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
