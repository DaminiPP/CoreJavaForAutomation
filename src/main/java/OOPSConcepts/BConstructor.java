package OOPSConcepts;

public class BConstructor extends AConstructor{

	public BConstructor() {
		super();
		//super(10, 20);
		System.out.println("B class child Constructor");
	}
	
	public BConstructor(int i) {
		//super(10);
		super(i);
		System.out.println("B class child Constructor");
	}
	
	public BConstructor(int i, int j) {
		//super(10);
		super(i, j);
		System.out.println("B class child Constructor");
	}
	
	//super keyword is used to called parent parameterized constructor
	// 2 super keywords can't be used
	//super keyword  should always be written in the child class constructor and should be the 1st statement
	
	public static void main(String[] args) {
		BConstructor obj= new BConstructor();
		BConstructor obj1= new BConstructor(10);
		BConstructor obj2= new BConstructor(10, 20);
	

	}

}
