package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	
	//HashMap									//HashTaable
	//
	//allows null key

	//name:anand--String
	//stds:Prajyot, Vikas, Amruta, Sanket--String[]
	//stds:ArrayList/HashSet--dynamic data
	
	public static void main(String[] args) throws FileNotFoundException {
		 Map<Integer,String> stds  = new HashMap<>(); 

     stds.put(1,"Abhilasha"); 
     stds.put(2,"Amruta"); 
     stds.put(3,"Vikas"); 
    
     System.out.println(stds.get(2));
     
   
     
     


	}

}
