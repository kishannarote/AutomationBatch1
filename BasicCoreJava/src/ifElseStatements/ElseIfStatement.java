package ifElseStatements;

public class ElseIfStatement {

	public static void main(String[] args) {
		
		int a=30;
		int b=40;
		
		if(a>b) 
		{  
			System.out.println("a is greater than b");
        }
		
		else if(a==b) 
		{
			System.out.println("a is equal to b");
		}
		else  
		{
			System.out.println("b is greater than a");
		}
}
}