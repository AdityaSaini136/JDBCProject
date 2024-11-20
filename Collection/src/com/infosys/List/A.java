package com.infosys.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class A {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>(2);
		al1.add(11);
		al1.add(22);
		al1.add(33);
		al1.add(44);
		al1.add(55);
		for(int i =0; i<al1.size(); i++) {
			System.out.println("Loop : "+al1.get(i));
		}
		ArrayList<Integer> al = new ArrayList<>(al1);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1, 55);
		al.set(0, 10);
		//ListIterator<Integer> listIterator = al.listIterator();
		Iterator<Integer> Iterator = al.iterator();
		while(Iterator.hasNext()) {
			Object next = Iterator.next();
			//System.out.println(next);
		}
		 ListIterator<Integer> listIterator = al.listIterator();
		while(listIterator.hasPrevious()) {
			Integer previous = listIterator.previous();
			//System.out.println(previous);
		}
     for(Integer res : al) {
    	 System.out.println(res);
     }
	}
}