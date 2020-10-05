package oops.abstraction;

public class BankUser {
	public static void main(String[] args) {


		RBI bank=new HDFC();
		
		BankUser bank1=new BankUser();
		bank1.bankFeatures(bank);
	}

	public void bankFeatures(RBI bank) {
		bank.creditCard();
		bank.currentAccounts();
		bank.debitCard();
		bank.savingAccounts();

	}
}
