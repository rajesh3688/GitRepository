
public class NullArgument {

	public static void main(String[] args) {
		
		//Pass null argument with method overloading with string and object types
		test(null);

	}
	
	public static void test(Object o) {
		System.out.println("Object argument");
	}
	
	public static void test(String s) {
		System.out.println("String argument");
	}
	
	public static void test(StringBuffer s) {
		System.out.println("String argument");
	}

}
