package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {

     //while loop-generates infinite loop if we dont provide incremental statement
		int i=1;//initialization
		while(i<=10)//condition
		{
			System.out.println(i);
			i++;//increment/decrement
		}
		System.out.println("**************");
		
		for(int j=1;j<=100;j++)
		{
			System.out.println(j);
		}
		
		System.out.println("**************");
		//print 10 to 1 in reverse order
		
		for (int k=10;k>=-10;k--)
		{
			System.out.println(k);
		}
				

	}

}
