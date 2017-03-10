package javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args) 
	{
		Set<Object> s=new HashSet<>();
		
		//Writing the data into the set
		
		s.add("Selenium");
		s.add("Apple");
		s.add("UFT");
		s.add(40000);
		s.add("Apple");
		//Reading the data from hashset
		
		Iterator<Object> it=s.iterator();
		
		while (it.hasNext()) 
		{
			Object data=it.next();
			System.out.println(data);
		}

	}

}
