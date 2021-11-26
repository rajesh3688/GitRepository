package JavaBasics;

public class NullConcept {

	Integer i;
	String str;
	double d;
	
	public static void main(String[] args) {
		NullConcept nc=new NullConcept();
		System.out.println(nc.i);
		System.out.println(nc.str);
		
		Integer i=null;
		//int j=i;
		//System.out.println(j);
		
		Integer k=null;
		Integer l=10;
		
		System.out.println(k instanceof Integer);
		System.out.println(l instanceof Integer);
		System.out.println(null==null);
		System.out.println(null!=null);
		
		String s1=null;
		s1=(String)null;
		
		System.out.println(s1+"123");
		//System.out.println(s1.length());

	}

}
