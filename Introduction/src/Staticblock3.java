
public class Staticblock3 {

	//how can we create objects if we make constructor private
	
	int age;
	
	static {
		Staticblock3 obj1=new Staticblock3();
	}
	
	public static int createobject() {
		Staticblock3 obj1=new Staticblock3();
		obj1.age=40;
		//System.out.println(obj1.age);
		return obj1.age;
	}
	
	private Staticblock3() {
		age=30;
	}
	
	public static void main(String args[]) {
		Staticblock3 obj=new Staticblock3();
		System.out.println(obj.age);
	}
	
}
