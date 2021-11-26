
public class MainmethodOverload {

	//jvm will look for main(String[] args)
	public static void main(String[] args) {
		System.out.println("Main method-1");
        main("test");
        //MainmethodOverload.main("test");
        main(10);
        main(20,30);
	}
	
	public static void main(String args) {
		System.out.println("Main method-2");
	}

	public static void main(int p) {
		System.out.println("Main method-3");
	}
	
    public static void main(int p,int q) {
    	System.out.println("Main method-4");
	}
	
	
}
