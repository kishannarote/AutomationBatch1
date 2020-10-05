package exceptionHandling;

import oops.abstraction.RBI;

//An Exception is an unwanted event that interrupts the normal flow of the program.
//exception can be handled
public class UncheckedExceptions {

	public static void main(String[] args) {
		int a = 0;
		int b = 20;

		// 1.Arithmatic Exception
		//System.out.println(b / a);

		// 2.StringIndexOutOfBoundsException
	//	String name = "anand";
		//System.out.println(name.charAt(6));
		
		//3.ArrayIndexOutOfBoundsException
		//String[] arr= {"Hemant","Kishan"};
		//System.out.println(arr[2]);
		
		//4.NullPointerException
		RBI rbi=null;
		rbi.creditCard();
	}

}
