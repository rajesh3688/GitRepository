package OOPSConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		
		//MethodOverloading-same method name with same or diff arguments or parameters and with diff data types within the same class
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(0);
		obj.sum(1, 2);

	}
	
	//we can overload main method
	public static void main(int p)
	{
		
	}
	
	//we cannot declare method inside another method
	public void sum()
	{
		System.out.println("sum-with 0 arguments");
		
		public void test()
		{
			
		}
	}
	
	public void sum(int p)//same method name with same no of arguments and same data type are not allowed
	{
		System.out.println("sum-with 1 arguments");
	}
	
	public void sum(int f) {
		
	}
	
	public void sum(double d)//same method name with same no of arguments and diff data type are allowed
	{
		
	}
	
	public void sum(int p,int q)
	{
		System.out.println("sum-with 2 arguments");
	}

}
