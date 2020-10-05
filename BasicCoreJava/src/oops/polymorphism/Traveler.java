package oops.polymorphism;

public class Traveler {

	public static void main(String[] args) {
		
		Vehicle v=null;
		  String travelling="Motor";
		
		if(travelling.equals("Car"))
		{
			v=new Car();
		}else if(travelling.equals("Motor"))
		{
			v=new Motor();
		}else if(travelling.equals("Cycle"))
		{
			v=new Cycle();
		}
		v.travel();
	}

}
