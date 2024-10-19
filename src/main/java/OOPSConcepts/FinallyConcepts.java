package OOPSConcepts;

import javax.management.RuntimeErrorException;

public class FinallyConcepts {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	public static void test1() {
		try {
			System.out.println("Inside try block");
			throw new RuntimeException("test");
			
		} catch (Exception e) {
			System.out.println("Inside Catch block");

		}
		finally {
			System.out.println("Inside Finally Block");
		}
	}
	
	//finally keyword is always associated with try and catch block
	//finally block would always be executed doesn't matter exception is coming or not

	public static void test2() {
		try {
			System.out.println("Inside test2 try block");
			
		} 
		finally {
			System.out.println("Inside test2 Finally Block");
		}
	}
}
