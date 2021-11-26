package Listconcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashmaptoArrayList {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();  
		map.put("dfg", 300);
		map.put("fdre", 400);
		map.put("dfdg", 500);
		map.put("qws", 600);
		
		System.out.println(map.size());
		
		Iterator it=map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pairs=(Map.Entry)it.next();
			System.out.println(pairs.getKey()+"="+pairs.getValue());
		}
		
		//lambda functions
		map.forEach((k,v)-> System.out.println("Key ="+k+"value="+v));
		
		//convert hashmap keys into Arraylist
		List<String> names=new ArrayList<String>(map.keySet());
		for (String str:names) {
			System.out.println(str);
		}
		
		//convert hashmap values into Arraylist
				List<Integer> values=new ArrayList<Integer>(map.values());
				for (Integer i:values) {
					System.out.println(i);
				}

	}

}
