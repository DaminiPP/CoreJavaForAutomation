package JavaPrograms;

public class RemovingJunkChar {

	public static void main(String[] args) {
         
		String s= "^&&*^%%%&^^*ghhggf**&gjdsjgksfjrto(%^&12476fhfgh";
  
		 System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
