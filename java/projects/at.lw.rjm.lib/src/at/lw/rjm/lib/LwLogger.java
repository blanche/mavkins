package at.lw.rjm.lib;

import org.apache.logging.log4j.LogManager;

public class LwLogger {
	
	public static void info(Class<?> x, String arg) {
		LogManager.getLogger(x).info(arg);
	}
}
