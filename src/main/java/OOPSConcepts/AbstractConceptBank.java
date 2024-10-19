package OOPSConcepts;

public abstract class AbstractConceptBank {
	
	
	//in abstract class atleast one method should have abstract method--->means no method body only prototype
	// to achieve abstraction --interface and abstract class is used
	//through abstract class  we achieve partial abstraction
	//hiding the implementation logic----called abstraction
	//abstract class can have abstract and non abstract methods
	//cannot create object of abstract class
	//abstract class is faster than interface
	
	public abstract void loan();
	
	public void credit() {
		System.out.println("Credit Abstract Concept");
	}
	
	public void debit() {
		System.out.println("Debit Abstract Concept");
	}

}
