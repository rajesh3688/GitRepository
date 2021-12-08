
public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(Factorial(6));
		System.out.println(3);
		System.out.println(fact(7));
		System.out.println(fact(0));
		
		

	}
	
	public static int Factorial(int num)
	{
	int fact=1;
	
		if(num==0) {
			return 1;
		}
		
		for (int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	//using recursive function
	public static int fact(int num)
	{
		if(num==0) {
			return 1;
		}else
			return(num*fact(num-1));
	}
	
}



