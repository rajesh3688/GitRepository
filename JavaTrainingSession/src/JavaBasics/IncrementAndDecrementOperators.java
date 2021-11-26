package JavaBasics;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		int i=1;
		int j=i++; //post increment
		
		System.out.println(i);//2
		System.out.println(j);//1
		
		int a=1;
		int b=++a; //pre increment
		
		System.out.println(a);//2
		System.out.println(b);//2
		
		int k=1;
		int l=k--; //post decrement
		
		System.out.println(k);//0
		System.out.println(l);//1
		
		int p=2;
		int q=--p; //pre decrement
		
		System.out.println(p);//1
		System.out.println(q);//1

	}

}
