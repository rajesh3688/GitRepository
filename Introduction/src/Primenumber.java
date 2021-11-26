
public class Primenumber {
	
	//chk given number is prime or not
	//2 is the lowest prime number
	public static boolean isPrime(int num)
	{
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}
	
	//print prime number in the range
	public static void getPrimenumber(int num)
	{
		for(int i=2;i<=num;i++)
			if(isPrime(i))
					{
				     System.out.println(i+ " ");
					}
	}

	public static void main(String[] args) {
		

		System.out.println("2 is prime number: "+isPrime(2));
		System.out.println("4 is prime number: "+isPrime(4));
		System.out.println("13 is prime number: "+isPrime(13));
		
		getPrimenumber(2);
		getPrimenumber(17);
		getPrimenumber(20);
		
		
	}

}
