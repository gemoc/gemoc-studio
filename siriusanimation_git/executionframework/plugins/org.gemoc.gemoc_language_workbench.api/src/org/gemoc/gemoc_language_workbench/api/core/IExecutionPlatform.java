package org.gemoc.gemoc_language_workbench.api.core;

import java.util.Collection;

import org.gemoc.gemoc_language_workbench.api.dsa.ICodeExecutor;
import org.gemoc.gemoc_language_workbench.api.engine_addon.IEngineAddon;

public interface IExecutionPlatform extends IDisposable
{

	/**
	 * @return The code executor to use for the model execution.
	 */
	ICodeExecutor getCodeExecutor();

	/**
	 * @return The model loader used to load the model to be executed.
	 */
	IModelLoader getModelLoader();

	void addEngineAddon(IEngineAddon addon);
	void removeEngineAddon(IEngineAddon addon);
	Iterable<IEngineAddon> getEngineAddons();
	

}
