package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String[][] data= {{"User1","Password1"},{"User2","Password2"},{"User3","Password3"}};
		
		for(int r=0; r<data.length; r++)
		{
			for(int c=0; c<data[r].length; c++)
			{
				System.out.print(data[r][c]+"  ");
			}
			System.out.println();
		}
	 }

}


