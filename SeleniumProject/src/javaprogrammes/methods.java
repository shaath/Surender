package javaprogrammes;

public class methods {

	static int s=300;
	public static void main(String[] args) 
	{
		
		function1();
		int res=sum();
		System.out.println(res);
	}
	
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	

	public static int sum()
	{
		int a=3000;
		int b=4000;
		int c=a+b;
		return c;
	}
}
