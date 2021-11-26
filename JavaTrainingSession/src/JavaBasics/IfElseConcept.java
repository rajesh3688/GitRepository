package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if(a>b)
		{
			System.out.println("a greater than b");
		}
		else
		{
			System.out.println("b greater than a");
		}
		
		//comparison operators
		//< > <= >= == !=
		int c=500;
		int d=400;
		
		if (c==d)
		{
			System.out.println("c and d are equal");
		}
		else
		{
			System.out.println("c and d are not equal");
		}
		
		//witre a program to find highest number
		
		//nested if-else
		int a1=600;
		int b1=500;
		int c1=400;
		
		if((a1>b1)&(a1>c1))
		{
			System.out.println("a1 is greater than b1 and c1");
		}
		else if(b1>c1)
		{
			System.out.println("b1 is greater than c1 and a1");
		}
		else
		{
			System.out.println("c1 is greater than a1 and b1");
			
		}
			

	}

}
