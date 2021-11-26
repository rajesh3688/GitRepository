package OOPsConcept2;

public class TestCar {

	public static void main(String[] args) {
		
		//Static/compile time polymorphism-at the time of compilation java will decide which method to call
		//polymorphism-one to many many methods method overriding same method inside parent and child class
		BMW bc=new BMW();
		bc.start();
		bc.stop();
		bc.refuel();
		bc.threadsafety();
		
		//parent(car) cannot inherit properties from child class(BMW)
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		//top casting
		//Dynamic polymorphism/Run time polymorphism
		Car d=new BMW();//child class object can be referred by parent class reference variable
		d.start();
		d.stop();
		d.refuel();
		
		//down casting
		BMW b1=(BMW) new Car();//classcast exception
		b1.start();
		b1.stop();
		b1.refuel();
		b1.threadsafety();
		

	}

}
