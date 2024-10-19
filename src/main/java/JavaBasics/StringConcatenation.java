package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		String abc= new String();
		abc="Hello";
		
		String abc1= "Hello";

		
		String s1="Way";
		String s2="To";
	    String s3="Automation";
	    
	    String s4=s1+s2+s3;
	    
	    System.out.println(s4);
	    
	    System.out.println("Way" + "To" + "Automation");
	    
	    int num1=5;
	    int num2=10;
	    System.out.println(num1+num2);
	    System.out.println("before"+ (num1+num2)+ "after");
	    System.out.println(!true);
	    System.out.println(78==78);
	    System.out.println(78==18);
	    System.out.println((123==78) && (3==3));
	}

}
