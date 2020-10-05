package exceptionHandling;
import oops.abstraction.RBI;
public class ExceptionHandling2 {

	public static void main(String[] args) {
		//********Scenario 1************(DEPENDENT STEPS) we use single try
		
				try {
					//Launch browser
					
					//Login
					
					//Validate Compose email
				}catch(Exception e)
				{
					
				}
				//*******************************************
				
				//********Scenario 2************(INDEPENDENT STEPS) we use multiple try
				
				try { //Need to create separate try catch block for each step
					//validate searchbox is displayed
					
					//validate Gmail link is displayed
					
					//validate Images link is displayed
					
					//Validate Languages are displayed
				}catch(Exception e)
				{
					
				}
				
				
				//Scenario 1
				//Launch browser
				//Login
				//Validate Composeemail functionality
				
				//Scenario 2: Validate the visibility of all the fields displayed on homepage
				//Search text box, Gmail link, YouTube, Languages, Images link
}}
