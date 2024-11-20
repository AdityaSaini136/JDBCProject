package com.infosys.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSet {
	public static void main(String[] args) {

		HashSet<Object> hs1 = new HashSet<>();
		Set<String> hs2 = new LinkedHashSet<>();
		TreeSet<Object> hs = new TreeSet<Object>();
		hs.add(5);
		hs.add(21);
		hs.add(2);
		hs.add(367);
		hs.add(4);
		hs.add(5);
		hs.add(4);
       Iterator<Object> iterator = hs.iterator();
       while(iterator.hasNext()) {
    	   Object res = iterator.next();
    	   //System.out.println(res);
       }
      for(Object res : hs) {
    	  System.out.println(res);
      }

	}
}