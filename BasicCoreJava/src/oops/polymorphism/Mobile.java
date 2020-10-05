package oops.polymorphism;

public class Mobile extends Telephone {
	
	//when we hv same methods wt same parameters in both parent and child class
	//then the concept is knwn as method overriding
	
	public void texting() { 
	System.out.println("Texting from mobile");	
	}
	
	public void calling() { 
	System.out.println("Calling from mobile");	
	}


}
