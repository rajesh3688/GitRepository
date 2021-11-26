package JavaBasics;

import java.util.ArrayList;

public class ArrayListconcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add(1);
		ar.add("100");
		ar.add("fer");
		ar.add(12.33);
		ar.add('h');
		
		ar.remove(0);
		
		//System.out.println(ar.get(0));
		//System.out.println(ar.get(4));
		//System.out.println(ar.get(5));//Indexoutofbounds Exception
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(0);
		//a1.add("df");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("erf");
		//a2.add(3);
		
		

	}

}
