package JavaBasics;

public class Loops {

	public static void main(String[] args) {
		int i=1; //initialization
		
		//WHILE LOOP
		
		while(i<=10)//conditional 
			{
			//dis advantage--->generate infinite loop if increament/decrement is not given
			System.out.println(i);//
			i=i+1; //increment
		}
		
		System.out.println("**********************************");
		
		//FOR LOOP
		
		
		//Print 1 to 10
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
		
		System.out.println("**********************************");
		//Print 10 to 1
		for(int j=10; j>=1; j--) {
			System.out.println(j);
		}

	}

}
