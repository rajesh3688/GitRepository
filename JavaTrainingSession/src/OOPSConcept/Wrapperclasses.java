package OOPSConcept;

public class Wrapperclasses {

	public static void main(String[] args) {
		
		String s="100";
		System.out.println(s+20);
		int i=Integer.parseInt(s);
		System.out.println(i+20);
		
		String s1="2.33";
		System.out.println(s1+2);
		double d=Double.parseDouble(s1);
		System.out.println(d+2);
		
		String s2="true";
		System.out.println(s2+3);
		Boolean e=Boolean.parseBoolean(s2);
		System.out.println(e);
		
		/*String s3="100A";
		int k=Integer.parseInt(s3);
		System.out.println(k);*/

		int l=100;
		System.out.println(l+20);
		String s4=String.valueOf(l);
		System.out.println(s4+20);
	}

}
