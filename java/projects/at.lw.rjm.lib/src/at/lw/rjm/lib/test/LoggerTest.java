package at.lw.rjm.lib.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerTest {
	
	private static Logger logger = LogManager.getLogger(LoggerTest.class);
	
	public static void main(String[] args) {
		logger.info("Lib Test");
	}
}
