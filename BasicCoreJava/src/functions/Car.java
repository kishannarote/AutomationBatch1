package functions;
public class Car {
	//note:The default value of int var is 0, String var is null
	//instance variables==non static variables==>can be called only using object of the class
	public String colour;
	public String type;
	
	//class variables==Static variables==>can be called using class name
	public static int wheels; 
	
	
	public void feature() 
	{
 System.out.println("My car colour is "+colour+"  which has "+wheels+"  wheels its of "+type+" type");
	}

}
