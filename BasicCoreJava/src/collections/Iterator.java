package collections;

import java.util.HashSet;
import java.util.Set;

public class Iterator {
	public static void main(String[] args) {
		
	Set<String> set= new HashSet<>();		
	set.add("Vikas");
	set.add("Prajyot");
	set.add("Sanket");
	
	java.util.Iterator<String> it=set.iterator();
	
	//it.hasNext(); //boolean value, information about next element
	//it.next();  //Actual next value

	while(it.hasNext())
	{
		String str=it.next();
		System.out.println(str);
	}

}}

