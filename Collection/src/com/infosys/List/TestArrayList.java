package com.infosys.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Vector;

public class TestArrayList {

	public static void main(String[] args) {
		//ArrayList<Object> all = new ArrayList<Object>();
		LinkedList<Object> al = new LinkedList<>();
		//Queue<Object> al1 = new LinkedList<>();
		al.add(0, "ABC");
		al.add(1, "BCH");
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		Collections.sort((List<T>) al);
		Iterator<Object> iterator2 = al.iterator();
		//System.out.println(al);
		al.set(1, 90);
		ListIterator<Object> listIterator = al.listIterator();
		while(listIterator.hasNext()) {
			//System.out.println(listIterator.next());
		}//System.out.println(".........");
		while(listIterator.hasPrevious()) {
			//System.out.println(listIterator.previous());
		}

		//System.out.println(al);
		//		for(Object dfhc : al) {
		//			System.out.println(dfhc);
		//		}
		Iterator<Object> iterator = al.iterator();
		while(iterator.hasNext()) {
			Object res = iterator.next();
			System.out.println(res);
		}
		//		Iterator<Object> iterator = al.iterator();
		//		while (iterator.hasNext()) {
		//			Object res = iterator.next();
		//			//System.out.println("while loop : > "+res);
		//		}

	}
}