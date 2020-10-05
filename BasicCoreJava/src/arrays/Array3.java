package arrays;

public class Array3 {

	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "kishan";
		str[1] = "sanju";
		str[2] = "sujata";
		//str[3]="hhjsg"; //ArrayIndexOutOfBoundsException
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);

		Object[] obj = new Object[4];
		obj[0] = "kishan";
		obj[1] = 2;
		obj[2] = "patil";
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}

}
