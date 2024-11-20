package com.infosys.Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap<>();
		tm.put(101, "Java1");
		tm.put(102, "Java2");
		tm.put(103, "Java3");
		tm.put(108 , "Java3");
		tm.put(104, "Java4");
		tm.put(105, null);
		tm.put(106, null);
		tm.put(107, null);
		
        Set keySet = tm.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()) {
        	Object res = iterator.next();
        	//System.out.println(res);
        }
        Set entrySet = tm.entrySet();
        Iterator iterator2 = entrySet.iterator();
        while(iterator2.hasNext()) {
        	Object res = iterator2.next();
        	//System.out.println(res);
        }
        Collection values = tm.values();
        Iterator iterator3 = values.iterator();
        while(iterator3.hasNext()) {
        	Object res = iterator3.next();
        	System.out.println(res);
        }
        
        
        
	}

}
