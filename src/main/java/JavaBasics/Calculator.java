package JavaBasics;

public class Calculator {
	
	public int addition(int num1 ,int num2) {
		int result= num1+num2;
		return result;	
	}
	public int subtraction(int num1 ,int num2) {
		return num1-num2;
		
	}
	
	public int multiplication(int num1 ,int num2) {
		return num1*num2;
		
	}
	
	public int division(int num1 ,int num2) {
		return num1/num2;
			
	}

	public static void main(String[] args) {
		Calculator obj1= new Calculator();
		System.out.println("Addition is " +obj1.addition(10, 20));
		System.out.println("Subtraction is " +obj1.subtraction(20, 10));
		System.out.println("Multiplication is " +obj1.multiplication(10, 20));
		System.out.println("Division is " +obj1.division(20, 2));

	}

}
