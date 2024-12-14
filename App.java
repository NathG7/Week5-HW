package LoggerCodingAssignment;


public class App {
static Logger logger;
	
	public static void main(String[] arg) {
		//List<String> list = ArrayList<String>();
		Logger logger = new SpacedLogger();
		
		logger.log("Hello");
		logger.error("Oops, this is an error");
		
		
		logger.close();
		
		Logger logger1 = new AsteriskLogger();
		
		logger1.log("Hello");
		logger1.error("Oops, this is an error");
		
		
		logger1.close();
	}
	
}