package OOPSConcept;

public class StaticvsNonStatic {
	
	//global variable-scope will be across all the functions with some conditions
	String name="tom";
	static int age=25;
	

	public static void main(String[] args) {
		
		//direct calling
		image();
		//classname.method name
		StaticvsNonStatic.image();
		
		StaticvsNonStatic obj=new StaticvsNonStatic();
		System.out.println(obj.name);
		obj.sum();
		
		System.out.println(age);
		System.out.println(StaticvsNonStatic.age);
		
		

	}
	
	public void sum()
	{
		System.out.println("sum method");
	}
	
	public static void image()
	{
		System.out.println("Image method");
	}

}
