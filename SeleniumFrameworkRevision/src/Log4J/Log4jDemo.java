package Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main (String args[]) {
		
		System.out.println("Process start");
		
		logger.info("Information log");
		
		logger.debug("Debugger log");
		
		logger.error("Error log");
		
		logger.fatal("Fatal log");
		
		logger.warn("Warning log");
		
		logger.trace("Tracing log");
	}
	
	
	
	
}
