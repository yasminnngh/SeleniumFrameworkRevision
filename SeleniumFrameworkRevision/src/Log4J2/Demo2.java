package Log4J2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Log4J.Log4jDemo;

public class Demo2 {

	private static Logger logger = LogManager.getLogger(Demo2.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Process start");

		logger.info("Information log");

		logger.debug("Debugger log");

		logger.error("Error log");

		logger.fatal("Fatal log");

		logger.warn("Warning log");

		logger.trace("Tracing log");

		logger.info("Information log");

		logger.debug("Debugger log");

		logger.error("Error log");

		logger.fatal("Fatal log");

		logger.warn("Warning log");

		logger.trace("Tracing log");

		logger.info("Information log");

		logger.debug("Debugger log");

		logger.error("Error log");

		logger.fatal("Fatal log");

		logger.warn("Warning log");

		logger.trace("Tracing log");

	}

}
