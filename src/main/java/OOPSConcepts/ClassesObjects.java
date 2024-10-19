package OOPSConcepts;

public class ClassesObjects {

	//class var
	int mod;
	int wheel;
	public static void main(String[] args) {
		ClassesObjects a = new ClassesObjects();
		ClassesObjects b = new ClassesObjects();
		ClassesObjects c = new ClassesObjects();
		
		a.mod=2015;
		a.wheel=2;
		
		b.mod=2016;
		b.wheel=2;
		
		c.mod=2017;
		c.wheel=2;
		
		System.out.println(a.mod);
	}

}
