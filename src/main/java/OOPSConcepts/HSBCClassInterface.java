package OOPSConcepts;

public class HSBCClassInterface implements USBankInterface , BrazilBankInterface{

	@Override
	public void credit() {
		System.out.println("HSBC Credit");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC Debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC Transfer Money");
		
	}
	
	public void educationLoan() {
		System.out.println("HSBC Education Loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC Car Loan");
	}

	@Override
	public void safety() {
		System.out.println("HSBC Safety method");
		
	}

}
