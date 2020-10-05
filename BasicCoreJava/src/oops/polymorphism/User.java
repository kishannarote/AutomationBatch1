package oops.polymorphism;

public class User {

		public static void main(String[] args) {
			StaticPolymorphism obj=new StaticPolymorphism();
			obj.sum(10, 20);
			obj.sum(10, 20, 30);
			
			//1.we can use parent class reference for child class object
			//2.when we use parent class reference for child class 
			//object then we can only call functions which are present  in parent class
			//3.when we use parent class reference for child class object then
			//the overriden functions will get call from child class
			
		//parent ka reference		//object of child
			
			Telephone phone=new Mobile();
			phone.calling();
			phone.billing();
			
			Telephone phone2=new Smartphone();
			phone2.calling();
			
			
	}

}


