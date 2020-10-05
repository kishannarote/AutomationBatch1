package ifElseStatements;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//And ==>>&&
				//OR ==>>||
				
				int month=2;
				int day=29;
				
				if(month==2 && day==29)
				{
					System.out.println("Leap Year");
				}else {
					System.out.println("Not a leap year");
				}
				
				int tenth=65;
				int tweth=60;
				int degree=65;
				
				if(tenth>=60 && tweth>=60 && degree>=65)
				{
					System.out.println("You are qualified");
				}else {
					System.out.println("You are not qualified");
				}
				
				//************************OR****************************//
				
				int jee=50;
				int cet=80;
				
				if(jee>=50 || cet>=80)
				{
					System.out.println("you are qualified");
				}else {
					System.out.println("You are not qualified");
				}

		
	}
}