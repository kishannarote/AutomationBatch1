package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws InterruptedException  {
		
		sum(10,20);
	//	throw new Exception("Testing exception");
		

	}
	public static void sum(int a, int b) throws InterruptedException {//only works with checked exception
		System.out.println(a+b);
		Thread.sleep(3000);
	}

}
