package javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		Object[][] s=new Object[2][3];
		
		System.out.println("Rows Length "+s.length);
		
		System.out.println("Columns length "+s[0].length);
		
		//Writing the data 
		
		s[0][1]="Selenium";
		s[1][2]=30000;
		
		
		//Reading the data
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
			}
		}
		
	}

}
