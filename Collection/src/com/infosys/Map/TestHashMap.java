package com.infosys.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<Integer,String>(0, 1);
		hm.put(101, "Zditya");
		hm.put(101, "Zditya");
		hm.put(109, "Ahubham");
		hm.put(103, "Ravi");
		hm.put(104, "Madhuri");
		hm.put(102, "Madhuri");
		hm.put(null, "Payal");
		hm.put(null, "Raja");
		hm.put(110, null);
		hm.put(111, null);
		for(Map.Entry res :  hm.entrySet()) {
			System.out.println(res.getKey()+ ":>>"+ res.getValue());
		}
		
		
		for(int i=1; i<=hm.size(); i++) {
			String val  = hm.get(100 +i);
			System.out.println(val);
		}
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			//System.out.println(next);
		}
		Set keySet = hm.keySet();
		Iterator iterator2 = keySet.iterator();
		while(iterator2.hasNext()) {
			Object next = iterator2.next();
			//System.out.println(next);
		}
		Collection values = hm.values();
		Iterator iterator3 = values.iterator();
		while(iterator3.hasNext()) {
			Object next = iterator3.next();
			//System.out.println(next);
		}
	}
}