package Listconcept;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class HashMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> marks=new HashMap<String,Integer>();
		marks.put("tom", 100);
		marks.put("raj", 200);
		marks.put("dfrg", 300);
		marks.put("ersf", 400);
		
		marks.put(null, 500);*/
		

	Map<String,Integer> map1=Collections.singletonMap("dgg", 100);
	System.out.println(map1.get("dgg"));
	map1.put("dff", 200);//UnsupportedOperationException
	
	Map<String,Integer>  map2=new HashMap<String,Integer>();
	map2.put("1", 100);
	map2.put("2", 200);
	
	Map<String,Integer> map3=Collections.synchronizedMap(map2);
	System.out.println(map3);
	
	

	
	}
	
}
