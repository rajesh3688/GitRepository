package Listconcept;

public class SuperParent {
	
	public SuperParent()
	{
		System.out.println("Parent class const");
	}
	
	public SuperParent(int i)
	{
		System.out.println("Parent class const with 1 param");
		System.out.println("value of i "+i);
	}
	
	public SuperParent(int i,int j)
	{
		System.out.println("Parent class const with 2 param");
		System.out.println("value of i "+i);
		System.out.println("value of j "+j);
	}

}
