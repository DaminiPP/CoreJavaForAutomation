package JavaPrograms;

public class Test {

	public static void main(String[] args) {

		String s = "SeleniumAutomation";
		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);

		System.out.println("*************************************************");

		StringBuffer sb = new StringBuffer(s);
		System.out.println("Reverse of String " + sb.reverse());

		System.out.println("***************************************************");

		String str = "&&^&*&^HGFVBNJHBkhjhgh12345678&^&*&^&*(ghnjkjhn((()";

		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

		System.out.println("**********************************");

		int num = 12345;
		int revnum = 0;

		while (num != 0) {
			revnum = revnum * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(revnum);
		System.out.println("*************************");

		System.out.println(new StringBuffer(String.valueOf(revnum)).reverse());

		System.out.println("*********************************************");

		int x = 5;
		int y = 10;
		int temp;

		temp = x;
		x = y;
		y = temp;
		System.out.println("Value of x after swapping " + x);
		System.out.println("Value of x after swapping " + y);

		System.out.println("*********************************************");

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Value of x after swapping " + x);
		System.out.println("Value of x after swapping " + y);

		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("Value of x after swapping " + x);
		System.out.println("Value of x after swapping " + y);

		System.out.println("*********************************************");

		String a = "Hello";
		String b = "World";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("Value of a after swapping " + a);
		System.out.println("Value of b after swapping " + b);

		System.out.println("*********************************************");

		int arr[] = { 1, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}

		System.out.println(sum);
		int sum1 = 0;

		for (int j = 1; j <= 9; j++) {
			sum1 = sum1 + j;
		}

		System.out.println(sum1);

		int misnum = sum1 - sum;
		System.out.println(misnum);
		
		
		int numbers[]= {9,23,-8,4,103};
		int smallest=numbers[0];
		int largest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			
			else if(numbers[i]<smallest){
				smallest=numbers[i];
			}
		}
		System.out.println("*********************************************");
		System.out.println("Largest " +largest );
		System.out.println("smallest " +smallest );
	}

}
