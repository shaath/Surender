package javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] s={20000,"QEdge",'M',222.22,true};
		
		System.out.println(s.length);
		
		for (Object object : s) 
		{
			System.out.println(object);
		}

	}

}
