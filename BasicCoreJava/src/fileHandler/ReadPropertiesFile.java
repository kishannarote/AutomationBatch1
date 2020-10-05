package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		
		//1.filepath
	String filepath=System.getProperty("user.dir")+"\\src\\fileHandler\\TestData.properties";
	//	G:\Automation\AutomationBatch1\BasicCoreJava\src\fileHandler\TestData.properties
  // System.out.println(filepath);
	
    //2.create FileInputStream object
    FileInputStream file=new FileInputStream(filepath);
   
    //3.create Properties class object
    Properties p=new Properties();
    
    //4.call load function
    p.load(file);
    
    System.out.println(p.getProperty("name"));
    System.out.println(p.getProperty("age"));
	}

}
