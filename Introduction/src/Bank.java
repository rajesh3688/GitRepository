
//abstract class can have bth abstract and non abstract methods
//we can have both final,static and non static variables
//no main method
//we cannot create object of an abstract class
//no method body for abstract method
//only method body for non abstract method
//we can achieve partial abstraction
//Abstraction-process of hiding implementation logic
//Abstract class and abstract method is prefixed by abstract keyword
public abstract class Bank {
	
	int age=25;
	static String str="dfh";
	final int num=10;
	
	
	public abstract void loan();
	
	public void credit() {
		System.out.println("bank-credit");
	}
	
	
	public void debit()
	
	{
		System.out.println("bank-debit");
	}
	
	

}
