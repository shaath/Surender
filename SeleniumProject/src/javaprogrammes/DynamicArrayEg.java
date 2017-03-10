package javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[5];
		
		System.out.println(x.length);
		
		//Writing the data into array
		
		x[2]="Surendar";
		x[4]=60000;
		x[2]="QEdge";
//		x[5]="Sharath";
		
		//Reading the data from array
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}

	}

}
