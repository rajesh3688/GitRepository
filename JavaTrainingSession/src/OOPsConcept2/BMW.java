package OOPsConcept2;

public class BMW extends Car //class to class relationship has-a relationship
{

	//when method name is same in parent class and child class with same number of arguments:Method Overriding
	public void start()
	{
		System.out.println("BMW--Start");
	}
	
	public void threadsafety()
	{
		System.out.println("BMW--Threadsafe");
	}
}
