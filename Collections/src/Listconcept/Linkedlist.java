package Listconcept;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("sff");
		ll.add("stedt");
		ll.add("fed");
		
		System.out.println(ll.get(1));
		
		ll.remove(1);
		
		System.out.println(ll.get(1));
		
		ll.addFirst("esd");
		ll.addLast("eerf");
		
		System.out.println("contents of linked list:"+ll);
		
		System.out.println(ll.get(0));
		
		//using for loop
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		//using advanced for loop
		System.out.println("**using advanced for loop");
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		//Iterator
		System.out.println("**using iterator**");
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//using while loop
		System.out.println("**using while loop**");
		int j=0;
		while(j<ll.size())
		{
			System.out.println(ll.get(j));
			j++;
		}
		

	}

}
