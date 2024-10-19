package JavaPrograms;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		
		int num[]= {-6,66,23,56,0,5,77,98};
		int largest=num[0];
		int smallest=num[0];
		
		for(int i=1; i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
			else if(num[i]<smallest){
				smallest=num[i];
			}
		}
		
		System.out.println("Largest number is "+largest);
		System.out.println("Largest number is "+smallest);
	}

}
