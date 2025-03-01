package com.bmw.build.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap2 {
	public static void main(String[] args) {

		Map<Integer, String> mapData = new HashMap<>();
		mapData.put(112, "Aditya");
		mapData.put(113, "Shubham");
		mapData.put(114, "Ankur");
		mapData.put(115, "Sam");
		String string = mapData.get(112);
		System.out.println(string);
		// to find out the keys..............
		Set<Integer> keySet = mapData.keySet();
		System.out.println(keySet);
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}//to find out the value.................
		Collection<String> values = mapData.values();
		System.out.println(values);
		Iterator<String> iterator2 = values.iterator();
		while(iterator2.hasNext()) {
			String next = iterator2.next();
			System.out.println(next);
		}//to find out the key and values both .............
		Set<Entry<Integer,String>> entrySet = mapData.entrySet();
		Iterator<Entry<Integer, String>> iterator3 = entrySet.iterator();
		while (iterator3.hasNext()) {
			Entry<Integer, String> next = iterator3.next();
			System.out.println(next);
		}//4th approach .........................to find out values==
		for(int i=1; i<=mapData.size(); i++) {
			String val  = mapData.get(111 +i);
			System.out.println(val);
		}
	}
}
