package functions;

import accessModifiers.AccessModifiers;
				//subclass								//superclass
				//childclass							//parentclass
				//derived class
public class TestAccessModifiersAtProjectLlevel extends AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		
		TestAccessModifiersAtProjectLlevel a= new TestAccessModifiersAtProjectLlevel();
		a.protectedFunction();
		
		
	}

}
