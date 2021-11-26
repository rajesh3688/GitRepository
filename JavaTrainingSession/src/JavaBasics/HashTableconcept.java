package JavaBasics;

import java.util.Hashtable;

public class HashTableconcept {

	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		
		h.put(1, "200");
		h.put(2, "sf");
		
		h.put("A", "ashff");
		
		System.out.println(h.get(1));
		
		System.out.println(h.get("A"));
		
		
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(2,3);
		System.out.println(h1.get(2));
		
		Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
		h2.put(2,"dgfr");
		System.out.println(h2.get(2));

	}

}
