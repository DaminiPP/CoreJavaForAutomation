package JavaBasics;

public class BreakAndContinue {
	
	public void go() {
		System.out.println("First");
		//break  ----->can be use in loop and switch statement
		//continue --> can be used in loops
		System.out.println("Second");
	}

	public static void main(String[] args) {
		BreakAndContinue obj1= new BreakAndContinue();
		obj1.go();
		
		for(int i=1; i<=10; i++) {
			if(i==5) 
				break;
			System.out.println(i);
		}
	}

}
