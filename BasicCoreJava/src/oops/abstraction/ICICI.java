package oops.abstraction;

public class ICICI implements RBI{

	@Override
	public void savingAccounts() {
		System.out.println("ICICI:saving Accounts");
	
		
	}

	@Override
	public void currentAccounts() {
		System.out.println("ICICI:currentAccounts");
		
	}

	@Override
	public void creditCard() {
		System.out.println("ICICI:creditCard");
		
	}

	@Override
	public void debitCard() {
		System.out.println("ICICI:debitCard");
		
	}

}
