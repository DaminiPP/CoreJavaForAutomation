package OOPSConcepts;

public class AbstractTest {

	public static void main(String[] args) {
		AbstractHDFCBank obj1= new AbstractHDFCBank();
		obj1.loan();
		obj1.credit();
		obj1.debit();
		obj1.funds();
		
		AbstractConceptBank obj2= new AbstractHDFCBank();
		obj2.loan();
		obj2.credit();
		obj2.debit();
		

	}

}
