package functions;

public class CarUser {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.colour="Red";
		car1.type="SUV";
		car1.wheels=4;   
		car1.feature();
		
		Car car2=new Car();
		car2.wheels=5;
		car2.feature();
		
		Car car3=new Car();
		car3.feature();
	}

}
