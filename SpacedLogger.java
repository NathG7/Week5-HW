package LoggerCodingAssignment;

import java.util.Date;

public class SpacedLogger implements Logger{
//yourString.replace("", " ").trim()
	@Override
	public void log(String log) {
		Date date = new Date();
		System.out.println(date.toString() + "Log: " +  log.replace("", " ").trim());
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		System.err.println(date.toString() + "Error - " +  error.replace("", " ").trim());
		
	}
	
	@Override
	public void close() {
		
	}
}
	
//	public class AddSpace {
//
//	    public static String addSpace(String str) {
//	        StringBuilder result = new StringBuilder();
//
//	        for (int i = 0; i < str.length(); i++) {
//	            result.append(str.charAt(i));
//	            if (i < str.length() - 1) {
//	                result.append(" ");
//	            }
//	        }
//
//	        return result.toString();
//	    }

//	    public static void main(String[] args) {
//	        String originalString = "Hello";
//	        String spacedString = addSpace(originalString);
//	        System.out.println(spacedString); // Output: H e l l o
//	    }
	

