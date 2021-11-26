package OOPSConcept;

public class Car {
	
	//class variables
	int mod;
	int wheel;
	

	public static void main(String[] args) {
	
		//new car -object of car class
		//a -object reference variable
		//new -keyword used to create object
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.mod=2014;
		a.wheel=4;
		
		b.mod=2015;
		b.wheel=4;
		
		c.mod=2016;
		c.wheel=4;
		
		System.out.println(b.mod);
		System.out.println(c.wheel);
		
		
		//after swapping 
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);
		
		System.out.println(b.mod);
		
		System.out.println(c.mod);

	}

}
