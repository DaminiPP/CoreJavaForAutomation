package OOPSConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj1 = new MethodOverloading();
		obj1.sum();
		obj1.sum(10);
		obj1.sum(10, 20);
	}
	
	public void sum() {
		System.out.println("Zero Parameter");
	}
	
    public void sum(int i) {
    	System.out.println("One Parameter");
    	System.out.println(i);
    }

    public void sum(int i,int j) {
	System.out.println("Two Parameter");
	System.out.println(i+j);
	}
    
    
    public static void main(int i) {
    	
    }
    
    public static void main(int i,int j) {
    	
    }
    
    
    
    //Method Overloading-----
    //When the method name is  same with different arguments or input parameters within the same class
    // you cannot create method inside method
    //duplicate methods not allowed---same method name with same no. of arguments
    //Main method can be overloaded
    

}
