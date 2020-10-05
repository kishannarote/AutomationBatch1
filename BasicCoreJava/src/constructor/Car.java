package constructor;

public class Car {

	//instance/global/class variable==non static
		 String colour;
		 String type;
		 String fuelType;
		
	//instance/global/class variable== static
		 public static int wheels=4;
		 
		public void feature() {
		
	    System.out.println(colour+" colour "+type+" "+fuelType+" Car");
		}
		
	    public Car() 
	    {
	    //A constructor in Java is a special method that is used to initialize objects. or inst variables
	    //The constructor is called when an object of a class is created. 
	    //it doesn't hv any return type
	    //every class has a default constructor	
	    }
	           //constructor
	    public Car(String colour, String type,String fuelType) 
	    {
	    	//Initialization
	        this.colour=colour;   //this always point to instance variable
	    	this.type=type;
	    	this.fuelType=fuelType;
	    }
}