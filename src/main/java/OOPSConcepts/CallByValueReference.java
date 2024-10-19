package OOPSConcepts;

public class CallByValueReference {
	
	int p;
	int q;
	

	public static void main(String[] args) {
		CallByValueReference  obj= new CallByValueReference();
		int x=10;
		int y=20;
		//obj.sum(10, 20);
		obj.sum(x, y);  // call by  value OR pass by value
		
		obj.p=50;
		obj.q=60;
		
	}

	
	public int sum(int a, int b) {
	int c= a+ b;
	return c;

}
}
