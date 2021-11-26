
public class Armstrongnumber {
	
	public static void isArmstrong(int num)
	{
		System.out.println("Given number is "+num);
		int r;
		int cube=0;
		int t;
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		
			if(t==cube)
			{
				System.out.println("Given number is Armstrong");
			}
			else {			
				System.out.println("Given number is not Armstrong");
			}
		}

	public static void main(String[] args) {
		
		isArmstrong(150);
		isArmstrong(151);
		isArmstrong(153);
		isArmstrong(0);
		isArmstrong(1);
		
	}

}
