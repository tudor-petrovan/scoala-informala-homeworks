package siit.java4.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
	private static Logger LOGGER = Logger.getLogger("ro.sci.logging.Logging");

	public static void main(String[] args) {

		LOGGER.fine("In main");
		
		
		
		LOGGER.info("start main");
		try {
			
			String file = "read it from UI";
			
			LOGGER.fine("before read first line");
			
			readFirstLine(file);
			
			LOGGER.fine("after read first line");
			// more code that throws exceptions
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error during run", e);
		}
		LOGGER.info("end main");
	}

	public static void readFirstLine(String file) {
		try (BufferedReader r = new BufferedReader(new FileReader(file))) {
			String firstLine = r.readLine();
		} catch (IOException e) {
			// do not log here
			throw new RuntimeException("cannot read first line from file " + file, e);
		}
	}
}
