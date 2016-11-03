package org.gemoc.sample.legacytfsm.xstfsm.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class XstfsmAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("XSTFSM", "Animation"));

		return res;
	}

}
