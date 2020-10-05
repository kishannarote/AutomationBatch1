package exceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//
public class CheckedException {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("kishan");
		
		//1.InterruptedException
		Thread.sleep(5000);
		
		System.out.println("Sanket");
		
		// FileNotFoundException
		FileInputStream fis=new FileInputStream("");
		
		Properties p=new Properties();
		//3.IOException 
		p.load(fis);
		

	}

}
