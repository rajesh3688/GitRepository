
public class Palindromenumber {
	
	public static void isPalindrome(int num)
	{
		System.out.println("Given number "+num);
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		}
		
		if(t==sum)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}

	public static void main(String[] args) {
		
		isPalindrome(2);
		isPalindrome(151);
		isPalindrome(789);
		isPalindrome(1);
		isPalindrome(0);
		isPalindrome(154);
		
		
		
		

	}

}
