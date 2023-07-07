package day02.practice;

public class Logger {
	
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void log (String msg) {
		// TODO complete this code using the above template
		System.out.println("LOG: " + msg);
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + msg);
	}
	
	public static void debug (int num) {
		
		System.out.println("DEBUG: " + num);
		
		// TODO Complete this code
	}
	public static void log (int num) {
		
		System.out.println("LOG: " + num);
	}
	
	public static void error (int num) {
		
	System.out.println("ERROR: " + num);
	
	}// Similarly write overloaded methods for error and info.
	
	
	public static void main(String[] args) {
		
		Logger obj1 = new Logger();
		
		obj1.debug("Vishali");
		obj1.log("abcd");
		obj1.error("efgh");
		obj1.debug(1);
		obj1.log(2);
		obj1.error(3);
	}
}

