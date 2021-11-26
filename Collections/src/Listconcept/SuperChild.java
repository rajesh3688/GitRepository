package Listconcept;

public class SuperChild extends SuperParent {
	
	public SuperChild(int i,int j)
	{
		//super is used to call parent class constructor
		//super should be always the first statement in any constructor
		super(10,20);
		System.out.println("child class const");
	}
	
	public SuperChild(int i)
	{
		//super is used to call parent class constructor
		//super should be always the first statement in any constructor
		super(10);
		System.out.println("child class const");
	}
	
	public SuperChild()
	{
		//super is used to call parent class constructor
		//super should be always the first statement in any constructor
		super();
		System.out.println("child class const");
	}
	

	public static void main(String[] args) {
		
		SuperChild sc=new SuperChild();
		SuperChild sc1=new SuperChild(10);
		SuperChild sc2=new SuperChild(10,20);
		
	}

}
