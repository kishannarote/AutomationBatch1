package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
String[][] data= new String[3][2];
		
		//Row 1
		data[0][0]="User1";
		data[0][1]="Password1";
		
		//Row 2
		data[1][0]="User2";
		data[1][1]="Password2";
		
		//Row 3
		data[2][0]="User3";
		data[2][1]="Password3";
		
		System.out.println(data.length);
		System.out.println(data[0].length);
		
		for(int r=0; r<data.length; r++)
		{
			for(int c=0; c<data[r].length; c++)
			{
				System.out.println(data[r][c]);
			}
		}
		
	}

}
