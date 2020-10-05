package functions;
public class NonStaticFunction {
	public int age=32;
	public static String name="banty";
	public static void main(String[] args) {
		
		//static methods can only call static methods and variables. T&C*
		//to call non static function and variables u hv to create an object of that class
		
		                   //Reference    //Object
		 NonStaticFunction    objRef     = new NonStaticFunction();//object creation
		 
		 int add= objRef.sum(10, 20);
		 System.out.println(objRef.age);//we call it by objreference
		 
          message();
          System.out.println(name);
	}
	
	public  int sum(int a, int b) {
		return a+b;
	}	
	public static void message() {
		System.out.println("your message");
			
	}
	
	
}
