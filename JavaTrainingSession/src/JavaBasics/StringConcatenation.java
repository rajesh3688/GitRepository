package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//println -used to print on the console with new line
				//print-used to print on the console
		
		int a=20;
		int b=30;
		
		String x="hello";
		String y="world";

		double c=10.33;
		double d=12.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(a+x+y+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+(x+y));
		
		System.out.println(a+b+x+y+a+x+b+y);//50helloworld20hello30world
		
		System.out.println(a+b+x+y+a+b);//50helloworld2030
		
		System.out.println(c+d);
		
		System.out.println(x+y+c+d);
		
		System.out.println("value of a is:"+a);
		
		System.out.println("value of b is:"+b);
		
		System.out.println("Sum of a and b is:"+(a+b));
		
		System.out.println("hello world");
		System.out.print("selenium");
		System.out.println("works");
		
		
		
		
		
		
		
		
		
	}

}
