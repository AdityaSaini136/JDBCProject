package com.bmw.build.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapwithIterator {
	public static void main(String[] args) {
		
		Map<String , String> mapData = new HashMap<>();
		mapData.put("A001", "Java");
		mapData.put("A002", "Oracle");
		mapData.put("A003", "Cybase");
		mapData.put("A004", "Python");
		Set<Entry<String,String>> entrySet = mapData.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
	    while(iterator.hasNext()) {
	    	Entry<String, String> entry = iterator.next();
	    	String key = entry.getKey();
	    	String value = entry.getValue();
	    	System.out.println(key+" : "+ value);
	    	System.out.println(entry);
	    }
		Set<String> keySet = mapData.keySet();
		Iterator<String> iterator1 = keySet.iterator();
		while(iterator1.hasNext()) {
			String next = iterator1.next();
			System.out.println(next);
		}
		Collection<String> values = mapData.values();
		Iterator<String> iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			String string = iterator2.next();
			System.out.println(string);
		}
		Set<Entry<String,String>> entrySet1 = mapData.entrySet();
		Iterator<Entry<String, String>> iterator3 = entrySet.iterator();
		while (iterator3.hasNext()) {
			Entry<String, String> next = iterator3.next();
			//System.out.println(next);
			String key = next.getKey();
			String value = next.getValue();
			System.out.println(key+" : "+ value);
		}
		
	}
}
