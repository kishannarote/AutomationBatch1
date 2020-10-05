package exceptionHandling;

import java.rmi.AccessException;

import oops.abstraction.RBI;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		int a = 0;
		int b = 20;
		
		try {
		// 1.Arithmatic Exception		//on failure delete logs
		System.out.println(b / a);

		// 2.StringIndexOutOfBoundsException  //
		String name = "anand";
		System.out.println(name.charAt(6));
		
		//3.ArrayIndexOutOfBoundsException	 //on failure remove the error from proc
	    String[] arr= {"Hemant","Kishan"};
		System.out.println(arr[2]);
		
		//4.NullPointerException		//on failure restart t serv
		RBI rbi=null;
		rbi.creditCard();
		
		}catch(ArithmeticException e)
		{
		System.out.println("Recovery Scenario 1"+e.getMessage());
		
		
		}catch(StringIndexOutOfBoundsException e)
		{
		System.out.println("Recovery Scenario 2"+e.getMessage());
	
		
		}catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Recovery Scenario 3"+e.getMessage());
		
		
		}catch(NullPointerException e)
		{
		System.out.println("Recovery Scenario 4"+e.getMessage());
		
		}catch(Exception e)
		{
		System.out.println("Unknown Exception "+e.getMessage());

}}}
