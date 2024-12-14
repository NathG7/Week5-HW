package LoggerCodingAssignment;

import java.util.Date;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		Date date = new Date();
		System.out.println(date.toString() + "Log: " + "***" + log + "***");
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		System.err.println(date.toString() + "Error - " + "***" + error + "***");
	}
	
	@Override
	public void close() {
		
	}
}
