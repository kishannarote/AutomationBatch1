package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<Integer> ids=new HashSet<>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(2);
		ids.add(4);
		for(int id:ids) 
		{
			//System.out.println(id);
		}
	//System.out.println("**********************************");
		
	Set<String> names=new HashSet<>(); //random data
		names.add("Vikas");
		names.add("Prajyot");
		names.add("Amruta");
		names.add("Abhilasha");
		for(String s:names) 
		{
			System.out.println(s);
		}
	System.out.println("*******************************************");
		

		names=new LinkedHashSet<>();  //insertion order preserved
		names.add("Vikas");
		names.add("Prajyot");
		names.add("Amruta");
		names.add("Abhilasha");
		for(String s:names) 
		{
			System.out.println(s);
		}
		System.out.println("***************************************");
		
		names=new TreeSet<>();   //default sorting order
		names.add("Prajyot");
		names.add("Amruta");
		names.add("Abhilasha");
		names.add("Vikas");
		for(String s:names) 
		{
			System.out.println(s);
		}
		System.out.println("*******************************************");
		
		
		
		
}}
