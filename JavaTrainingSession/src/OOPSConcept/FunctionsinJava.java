package OOPSConcept;

public class FunctionsinJava {

	public static void main(String[] args) {
		
		//all the copy of non static methods will be given to obj 
		FunctionsinJava obj=new FunctionsinJava();
		
		obj.abc();
		int l=obj.pqr();
		System.out.println(l);
		
		obj.div(3,2);
		System.out.println(obj.div(3,2));
		

		//main method is void-because it never returns any value
	}
	
	
	public void abc() //no i/p no o/p
	{
		System.out.println("abc");
	}
	
	public int pqr() //no i/p some o/p
	{ 
		System.out.println("pqr");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	
	public String xyz() 
	{
		
		System.out.println("bdge");
		String s="dfg";
		return s;
	}
	
	public int div(int x,int y) //some i/p some o/p
	{
		
		int d=x/y;
		return d;
	}

}
