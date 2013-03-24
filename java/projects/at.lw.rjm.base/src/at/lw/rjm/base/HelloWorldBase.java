package at.lw.rjm.base;

import java.util.Map;

import at.lw.rjm.lib.LwLogger;

public class HelloWorldBase {

	public Map<String, String> getEnvironment(){
		return System.getenv();
	}

	public String getComputerName(){
		LwLogger.info(this.getClass(), "Accessing ComputerName");
		return getEnvironment().get("COMPUTERNAME");
	}
}
