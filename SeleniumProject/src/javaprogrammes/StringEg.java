package javaprogrammes;

public class StringEg {

	public static void main(String[] args)
	{
		String course="Manual";//launaM
		
//		System.out.println("You are selected "+course);
		
		//Finding the length of the string
		System.out.println("The length of th String is "+course.length());

//		System.out.println(course.charAt(3));
//		
//		
//		System.out.println(course.substring(2, 5));
//		
//		System.out.println(course.substring(2));
		
		
		for (int i = 0; i < course.length(); i++) 
		{
			System.out.println(course.charAt(i));
			
			
		}
		
		for (int i = course.length()-1; i >= 0; i--)
		{
			System.out.print(course.charAt(i));
		}
		
	}

}
