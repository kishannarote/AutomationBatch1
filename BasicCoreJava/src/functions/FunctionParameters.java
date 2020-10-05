package functions;

public class FunctionParameters {

	public static void main(String[] args) {
		sum(10,20);
		sum(50,60);
		sum(10, 20, 30);
		
		message("Anand", 32);
		
	}
	
	//Access Modifiers //Type/Nature  //Return Type   //Name   //Parameters
	public              static          void            sum    (int a, int b  )
	{			
		System.out.println(a+b); 
	}
	
	public              static          void            sum    (int a, int b ,int c )
	{			
		System.out.println(a+b+c); 
	}
	public              static          void            sum    (int a, String name  )
	{			
		
	}
	public              static          void            sum    (String name, int a )
	{			
		
	}
	
	public static void message(String name, int age)
	{
		System.out.println("Your name is "+name+" and and your age is "+age);
	}
	}


