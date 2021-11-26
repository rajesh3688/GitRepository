
public class Staticblock2 {

	static {
		System.out.println("static block");
	}
	
	public static void test() {
		System.out.println("test static method");
	}
	
	public static void cover() {
		System.out.println("cover static method");
		test();
	}
	
	
	public static void main(String[] args) {
		
      System.out.println("main method");
      test();
      cover();
	}

}
