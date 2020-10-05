package collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		//ArrayList: Default size 10--15
		//Vector: Default size 10 -20
		List list1= new ArrayList<>();
		list1.add(10);
		list1.add("Prajyot");
		list1.add(true);
		
		//foreach loop //advanced for loop
		for(Object o: list1) 
		{
			System.out.println(o);
		}
		
		List<String> list= new ArrayList<>();
		list.add("Hemant");
		list.add("Prajyot");
		list.add("Vikas");
		list.add("Hemant");
		
		for(String s: list) 
		{
			System.out.println(s);
		}
		//we can use this also
		System.out.println(list);
		
		//ArrayList
		// implement dynamic Array
		// its better in accessing and storing data
		
		//LinkedList
		//doubly LinkedList
		//its better  in manipulation
		
		//Vector:
		//Synchronized//Legacy class//Thread safe
		//ArrayList (grows by 50%) and Vector grows by 100%
		//Dynamic array

}}
