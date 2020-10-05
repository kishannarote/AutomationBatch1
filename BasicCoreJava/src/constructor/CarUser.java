package constructor;
public class CarUser {
	public static void main(String[] args) {
		
		//object==> Object is an instance of a class
		//primitive: int,char,short,long,double, byte,float,boolean
		//Non-primitive: classes, Arrays, Interfaces
		
		//Data Type   //obj-reference   //object(instance)
		Car           car1=            new Car();
		int           a=              10;
		boolean       status=         true;
		String         name=          "Kishan";
		
		car1.colour="Red";
		car1.type="SUV";
		car1.fuelType="Diesel";
		car1.feature();
		
		Car car2=new Car();
		car2.colour="Black";
		car2.type="Sedan";
		car1.fuelType="Petrol";
		car2.feature();
		
		Car car3=new Car();
		car3.colour="White";
		car3.type="Coupe";
		car3.fuelType="CNG";
		car3.feature();
		
		Car car4=new Car("White", "SUV", "petrol");
		car4.feature();

		Car car6=new Car("Green", "SUV", "CNG");
		car6.feature();
		
		Car car7=new Car();
		car7.feature();
		
	}
}
