package ExceptionHandling;

public class Exception {
	
	int a=10;
	
	
	
	

	public static void main(String[] args) {
		
		
		Exception obj=new Exception();
		//obj=null;
		System.out.println(obj.a);
		
		try
		{
		int b=20/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("abc");		
		//Thread.sleep(2000);
		

	}

}
