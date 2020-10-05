package accessModifiers;

public class AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();
		
	}
		//public, private, protected, default
		
		//public==>can be access throughout the project(class, package,project)
		//Private==>can be access only within class(class)
		//default==>can be access within the package(package,class)
		//protected==>can be access within the package
		      //and can be access outside the package by using child class object 
		
		public void publicFunction()
		{
			System.out.println("public Function");
		}

		private void privateFunction()
		{
			System.out.println("private Function");
		}

		 void defaultFunction()
		{
			System.out.println("No access modifiers function");
		}

		protected void protectedFunction()
		{
			System.out.println("protected access modifiers");
		}
	
		
}


