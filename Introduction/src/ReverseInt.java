
public class ReverseInt {

	public static void main(String[] args) {
		
		int num=34553;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Rverse numer is:"+rev);
		
		
		//StringBuffer sf=new StringBuffer(num);
		long num1=345313;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
