package functions;

public class FunctionReturnType {

	public static void main(String[] args) {
		int add1=sum(10,20);
		int add2=sum(30,40);
		
		System.out.println(add1+add2);
		
		boolean ret=eligibility(30, 79);
		System.out.println(ret);
		
		System.out.println(eligibility(50, 79));
		System.out.println(eligibility(30, 80));
		System.out.println(eligibility(60, 89));
	}
	
	public static int sum(int a, int b)
	{
		int sum=a+b;
		return sum;
	}	
	
	public static boolean eligibility(int jeeMarks, int cetMarks)
	{
		if(jeeMarks>=50 ||cetMarks>=80)
		{
			return true;
		}else {
			return false;
		}


	}

}
