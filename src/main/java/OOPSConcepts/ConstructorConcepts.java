package OOPSConcepts;

public class ConstructorConcepts {
	
	//constructor doesn't return any value
	//constructor has the same name as the class name
	// when object is created automatically constructor is called
	//constructor can be overloaded
	//this keyword --> in class when class variable is same as local variable in constructor  we use this keyword
	
	
	
	//class variables/instance or global variable
	String name;
	int age;
	
	public ConstructorConcepts() { //0 parameter constructor
		System.out.println("Default Constructors");
	}
	
	public ConstructorConcepts(int i) { //1 parameter constructor
		System.out.println("1 parameter Constructors");
		System.out.println(i);
	}
	
	public ConstructorConcepts(int i, int j) { //2 parameter constructor
		System.out.println("2 parameter Constructors");
		System.out.println("Value of " +i  +j);
	}

	
	//local variables
	public ConstructorConcepts(String name, int age) { //2 parameter constructor
         this.name=name; //this.classvariable=local variable
         this.age=age;
	}
	
	public static void main(String[] args) {
		ConstructorConcepts obj= new ConstructorConcepts();
		ConstructorConcepts obj1= new ConstructorConcepts(10);
		ConstructorConcepts obj2= new ConstructorConcepts(10,20);
		ConstructorConcepts obj3= new ConstructorConcepts("tom",20);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
	}

}
