package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into array
		x.add("Selenium");
		x.add(22000);
		x.add('M');
		x.add("UFT");
		x.add(2, "Surendar");
		
		//Finding the length of the arraylist
		
		System.out.println(x.size());
		
		//Reading the data from arraylist
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
			
		}
		
	}

}
