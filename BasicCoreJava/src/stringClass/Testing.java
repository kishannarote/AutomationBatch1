package stringClass;

public class Testing {

	public static void main(String[] args) {
		String name="anand";
		
		//1.
		System.out.println(name.length());
		
		//2.
		System.out.println(name.charAt(3));
		
		//3.
		String name2="Anand";
	    System.out.println(name.equals(name2));
	    
	    //4.
	    System.out.println(name.equalsIgnoreCase(name2));
	    
	    //5.it remove extra whitespace
	    System.out.println(name);
	    System.out.println(name.trim());
	    
	    //6.
	    System.out.println(name.toUpperCase());
	    
	    //7.
	    System.out.println(name2.toLowerCase());
	    
	    //8.
	    System.out.println(name.substring(3));
	    System.out.println(name.substring(2, 4));
	    
	    //9.
	    System.out.println(name.replace("a", "x"));
	    
	    //10.
	   String[] str=name.split("n");
	   for(String s:str)
	   {
		   System.out.print(s);
	   }

	}

}
