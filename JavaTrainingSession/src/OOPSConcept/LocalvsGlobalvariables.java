package OOPSConcept;

public class LocalvsGlobalvariables {
	
	//Gloabl or Class variables(variables declared under class are called class or global variables)
	String name="tom";//non-static variables
	int age=34;
	

	public static void main(String[] args) {
	 
		int i=10;//local variables-specific to method
		System.out.println(i);
		LocalvsGlobalvariables obj=new LocalvsGlobalvariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
	}
	
	public void sum()
	{
		int i=20;//local variables-declared inside method 
		int j=30;
		int k=i+j;
		System.out.println(k);
	
	}

}
