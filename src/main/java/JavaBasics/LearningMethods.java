package JavaBasics;

public class LearningMethods {
	int i;
	
	
	public void method1() {//declaring methods
		System.out.println("Display method without returning value");
	}
	
	public int method2() {//declaring methods
		System.out.println("Display method with returning value");
		return 10;
		//there can only be 1 return statement
	}

	public static void main(String[] args) {
		System.out.println("Hello how are you");
		LearningMethods obj1= new LearningMethods();
		obj1.method1();
		obj1.method2();
	}

}
