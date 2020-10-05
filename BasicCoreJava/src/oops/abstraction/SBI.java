package oops.abstraction;

public class SBI implements RBI {

	@Override
	public void savingAccounts() {
		System.out.println("SBI: saving Accounts");
		
	}

	@Override
	public void currentAccounts() {
		System.out.println("SBI:currentAccounts");
		
	}

	@Override
	public void creditCard() {
		System.out.println("SBI:creditCard");
		
	}

	@Override
	public void debitCard() {
		System.out.println("SBI:debitCard");
		
	}

}
