package JavaBasics;

public class StaticNonStaticMethods {
	
	String name="Tom";
    static int age=24;
    
	public static void main(String[] args) {
		//How to call Static Method---->Direct Calling or by class name
		
		sum();
		StaticNonStaticMethods.sum();
		System.out.println("Static Variable calling directly "+age);
		System.out.println("Static Variable calling by class name "+StaticNonStaticMethods.age);
		
		//How to call Static Method---->need to create object of the class
		StaticNonStaticMethods obj1= new StaticNonStaticMethods();
		System.out.println(obj1.name);
		obj1.sendmail();
		
	}
	
	
	public void sendmail() {
		System.out.println("Non Static Method");
	}
	
	public static void sum() {
		System.out.println("Static Method");
	}

}
