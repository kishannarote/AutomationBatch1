package oops.polymorphism;

public class BrowserUser  {
	
	//create browseruser class
	//create ch,ff,ed driver class
	//create superbrowser class
	//same functions should be in all classes
	
	public static void main(String[] args) {
	
		SuperBrowser dr=null;
	  String browser="Edge";
	
	if(browser.equals("chrome"))
	{
		dr=new ChromeDriver();
	}else if(browser.equals("Firefox"))
	{
		dr=new FireFoxDriver();
	}else if(browser.equals("Edge"))
	{
		dr=new EdgeDriver();
	}
	dr.get();
	dr.findelement();
	dr.close();
}}