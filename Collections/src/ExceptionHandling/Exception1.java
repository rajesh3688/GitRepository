package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		Exception1 obj=new Exception1();
		obj.sum();
		System.out.println("abc");

	}
	
	public void sum() {
		try{
			div();
		}catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void div() throws ArithmeticException{
		int z=10/0;
	}

}
