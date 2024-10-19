package JavaPrograms;

public class Swap2Numbers {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		System.out.println("Value of x before swapping "+x);
		System.out.println("Value of y before swapping "+y);
		
		int temp;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("Value of x after swapping "+x);
		System.out.println("Value of y after swapping "+y);
		
		System.out.println("*********************************************");
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of x after swapping "+x);
		System.out.println("Value of y after swapping "+y);
		
		System.out.println("*********************************************");
		
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println("Value of x after swapping "+x);
		System.out.println("Value of y after swapping "+y);
		
	}

}
