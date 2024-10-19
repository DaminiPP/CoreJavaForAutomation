package JavaPrograms;

public class StringSwap {

	public static void main(String[] args) {
	  String a="Hello";
	  String b="World";
	  
	  System.out.println("Value of a before swapping " +a);
	  System.out.println("Value of b before swapping " +b);
	  
	   a=a+b;
	  
	   b=a.substring(0, a.length()-b.length());
	   a=a.substring(b.length());
	   
	   System.out.println("Value of a after swapping " +a);
	   System.out.println("Value of b after swapping " +b);
	}

}
