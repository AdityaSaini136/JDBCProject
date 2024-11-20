package com.bmw.build.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
public class HashMap1 {
	public static void main(String[] args) {
		Map< String, String > hashMap = new HashMap();
		hashMap.put("A001", "Java1");
		hashMap.put("A001", "Java2");
		hashMap.put("A003", "Java2");
		hashMap.put("A003", "Java4");
		hashMap.put("A005", "Java5");
		//System.out.println(hashMap);
		    Set<String> keySet = hashMap.keySet();
		    for(String values : keySet) {
		    	System.out.println(values);
		    }
//		if(hashMap.containsKey("A001")) {
//			hashMap.put("A001", "Java8");
//		}
//		String string = hashMap.get("A001");
//		System.out.println(string);
//		System.out.println(string);
//		Set<Entry<String,String>> entrySet = hashMap.entrySet();
//		Collection<String> values2 = hashMap.values();
//		Set<String> keySet = hashMap.keySet();
//		Iterator<Entry<String, String>> iterator = entrySet.iterator();
//		while(iterator.hasNext()) {
//			Entry<String, String> entry = iterator.next();
//			System.out.println(entry);
//		}
	}
}