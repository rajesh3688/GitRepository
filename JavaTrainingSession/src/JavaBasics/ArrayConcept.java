package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static array-size is fixed-to overcome this prblm we use dynamic array-collections-Arraylist and hashtable
		//similar data types-to overcome this problem we use object array
		int i[]=new int[3];
		i[0]=10;
		i[1]=-20;
		i[2]=30;
		
		System.out.println(i[1]);
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//char array
		char c[]=new char[2];
		c[0]='A';
		c[1]='2';
		
		//boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//double array
		double d[]=new double[2];
		d[0]=-12.33;
		d[1]=100;
		
		//string array
		String s[]=new String[2];
		s[0]="hello";
		s[1]="-12";
		
		System.out.println(s.length);
		
		//Object array-object is a class used to sotre diff data types
		Object obj[]=new Object[3];
		obj[0]="2";
		obj[1]="23.22";
		obj[2]="hello";
		//obj[3]="e";
		
		System.out.println(obj[2]);
		
		for(int k=0;k<obj.length;k++)
		{
			System.out.println(obj[k]);
		}
		
		
		
		
		
		
		
		
	}

}
