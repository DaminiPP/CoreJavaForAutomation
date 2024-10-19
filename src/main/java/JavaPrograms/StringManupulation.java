package JavaPrograms;

public class StringManupulation {

	public static void main(String[] args) {
		String str="The rains has started here";
		
		String str1="The rains has started here";
		
		String str2="The rains has Started here";
		
		System.out.println("The length of the String "+ str.length());
		
		System.out.println(str.charAt(7));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('s', 9));
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));

		
		//String comparision
		
		System.out.println(str.equals(str1));
		
		
		System.out.println(str.equals(str2));
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str.substring(0, 9));
		
		String str4=" Hello World ";
		
		System.out.println(str4.trim());
		
		
		String date="11-Dec-1994";
		
		System.out.println(date.replace("-", "/"));
		
		String str5="Hello_World_Test_Selenium";
		
		String strval[]=str5.split("_");
		
		for(int i=0; i<strval.length;i++) {
			System.out.println(strval[i]);
		}
		
		String str6="Java";
		
		String str7="Python";
		
		System.out.println(str6.concat(str7));
		
		
		String str8="Shreyas";
		String str9="Damini";
		int x=10;
		int y=20;
		
		System.out.println(str8+str9);
		System.out.println(x+y);
		System.out.println(x+y+str8+str9);
		System.out.println(str8+str9+x+y);
		System.out.println(str8+x+y+str9);
		
		
	}

}
