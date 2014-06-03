package org.gemoc.gemoc_commons.logging.backends;

import org.eclipse.core.runtime.Status;
import org.gemoc.gemoc_commons.logging.ILoggingBackend;
import org.gemoc.gemoc_commons.pde.GemocUIPlugin;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class DefaultLoggingBackend implements ILoggingBackend 
{

	private GemocUIPlugin _plugin;

	public DefaultLoggingBackend(GemocUIPlugin plugin)
	{
		_plugin = plugin;
	}
	
	private MessagingSystem _messagingSystem = new StdioSimpleMessagingSystem();

	@Override
	public void info(String message) {
		_messagingSystem.info(message, _plugin.getPluginId());	
	}

	@Override
	public void debug(String message) {
		_messagingSystem.debug(message, _plugin.getPluginId());	
	}

	@Override
	public void warn(String message) {
		_messagingSystem.warn(message, _plugin.getPluginId());	
	}

	@Override
	public void error(String message) {
		_messagingSystem.error(message, _plugin.getPluginId());	
	}

	@Override
	public void warn(String message, Throwable e) {
		warn(message);
		_plugin
			.getLog()
			.log(new Status(
						Status.WARNING, 
						_plugin.getPluginId(), 
						Status.OK, 
						message, e));
	}

	@Override
	public void error(String message, Throwable e) {
		error(message);
		_plugin
			.getLog()
			.log(new Status(
						Status.ERROR, 
						_plugin.getPluginId(), 
						Status.OK, 
						message, e));	
	}

	@Override
	public void info(String message, Throwable e) {
		info(message);
		_plugin
			.getLog()
			.log(new Status(
						Status.INFO, 
						_plugin.getPluginId(), 
						Status.OK, 
						message, e));	
	}

}
