package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);
			System.out.println("hemant");
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("end of Execution");
	}

}
