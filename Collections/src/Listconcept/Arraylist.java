package Listconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		//contain duplicate values
		//maintians insertions order
		//synchronized
		//allows random access to fetch the data as it stores the value based on indexes
		
		ArrayList ar=new ArrayList();
		
		ar.add(2);
		ar.add(24.2);
		ar.add("sff");
		ar.add('e');
		
		ar.get(2);
		
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ar1.add(2);
		
		ArrayList<String> ar2=new ArrayList<String>();
		
		ar2.add("dfg");
		
		Employee e1=new Employee("df",23,"fg");
		Employee e2=new Employee("gg",24,"dfr");
		
		ArrayList<Employee> ar3=new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		
		Iterator<Employee> it=ar3.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		ArrayList<String> ar4=new ArrayList<String>();
		ar4.add("fdf");
		ar4.add("fr");
		
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("dghg");
		ar5.add("ght");
		
		ar4.addAll(ar5);
		
		System.out.println(ar4);
		
		ar4.removeAll(ar5);
		
		System.out.println(ar4);
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("fdf");
		ar6.add("fr");
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("fdf");
		ar7.add("ght");
		
		ar6.retainAll(ar7);
		
		System.out.println(ar6);
		
		
		
		

	}

}
