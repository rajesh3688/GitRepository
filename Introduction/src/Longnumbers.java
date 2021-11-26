
public class Longnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long l=(long) (1000*60*60*24*365);//will retrieve 36 bit
		
		System.out.println(l);//1471228928  
		long l1= 1000*60*60*24*365L;
		
		System.out.println(l1);//31536000000 correct output
	}

}
