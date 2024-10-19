package OOPSConcepts;

public class Interface {

	 
	 //Interface--->
	 //Only method declarartion no method method 
	 // in interface we can declare variables and variable are by default static in nature and value cannot be changed --final
	 // no static methods in Interface
	 //no main method 
	 // interface are abstract in nature cannot create object of it
	// iF  a class is implement any interface then it is mandatory to define/override all the methods in interface
	// through interface we achieve multiple inheritance
	// is also called is-a relationship---> class to interface
	//has a relationship--  class to class
	
	public static void main(String[] args) {
		//USBankInterface ub = new USBankInterface(); // cannot create object of interface
		HSBCClassInterface hsbc = new HSBCClassInterface();
		hsbc.credit();
		hsbc.debit();
		hsbc.transferMoney();
		hsbc.educationLoan();
		hsbc.carLoan();
		
		System.out.println(USBankInterface.min_bal);
		
		//Dynamic 
		//Child call objects can be referred  by parent interface reference

		USBankInterface b= new HSBCClassInterface();
		b.credit();
		b.debit();
		b.transferMoney();
		// b.educationLoan(); --> cannot be called
		 // b.carLoan();  ---> cannot be called

	}

}
