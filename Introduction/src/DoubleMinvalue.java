

public class DoubleMinvalue {

	public static void main(String[] args) {
		
		System.out.println(Double.MIN_VALUE); //+ve number
		
		System.out.println(Long.MIN_VALUE); //-ve number
		
		System.out.println(Integer.MIN_VALUE);  //-ve number
		
		System.out.println(Float.MIN_VALUE); // +ve number
		
		System.out.println(Math.min(Integer.MIN_VALUE, 0));
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		System.out.println(Math.min(Long.MIN_VALUE, 0));
		
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));

	}

}
