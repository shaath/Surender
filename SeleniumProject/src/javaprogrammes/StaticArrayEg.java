package javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		int[] salary={30000,40000,50000,60000,70000,40000};
		
		//Finding the length of the array
		
		
		System.out.println(salary.length);
		
		
		//reading the value from array
		
//		System.out.println(salary[3]);
		
//		for (int i = 0; i < salary.length; i++)
//		{
//			System.out.println(salary[i]);
//		}
		
		for (int surendar : salary)
		{
			System.out.println(surendar);
		}
		
	}

}
