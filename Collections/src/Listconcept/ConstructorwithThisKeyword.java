package Listconcept;

public class ConstructorwithThisKeyword {

	//global or class variables
	String name;
	int age;
	
	public ConstructorwithThisKeyword(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
	
	public static void main(String[] args) {
		ConstructorwithThisKeyword obj=new ConstructorwithThisKeyword("tom",30);

	}

}
