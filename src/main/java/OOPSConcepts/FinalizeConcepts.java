package OOPSConcepts;

public class FinalizeConcepts {
	
	public void finalize() {
		System.out.println("Finalize Method");
	}

	public static void main(String[] args) {
		FinalizeConcepts f1= new FinalizeConcepts();
		FinalizeConcepts f2= new FinalizeConcepts();
		
		f1=null;
		f2=null;
		
		//no reference to objects
		//when there is no reference Garbage collector will destroy all the objects
		//finalize keyword is used to call Garbage collector
		
		System.gc();
	}

}
