package Listconcept;

public class FinallyConcept {

	public static void main(String[] args) {
		
		FinallyConcept fc=new FinallyConcept();
        //fc.test1();
		//test2();
		//fc.test3();
		fc.test4();
		
	}

	//finally is a block
	public void test1()
	{
		try
		{
			System.out.println("inside test1 method");
			throw new RuntimeException("fef");
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		
		finally
		{
			System.out.println("inside finally block");
		}
	}
	
	public static void test2()
	{
		try
		{
			System.out.println("inside test2");
		}
		
		finally
		{
			System.out.println("inside finally method");
		}
	}
	
	public void test3()
	{
		try
		{
			System.out.println("inside test3");
			int i=10;
			int j=i/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside finally");
		}
	}
		
		public void test4()
		{
			try
			{
				System.out.println("inside test4");
				int i=10;
				int j=i/0;
			}
			catch(NullPointerException e)
			{
				System.out.println("inside catch block");
			}
			finally
			{
				System.out.println("inside finally");
			}	
		
	}
	
}
