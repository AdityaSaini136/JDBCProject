package com.infosys.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {

		Vector<String> st = new Vector<>();
		st.add("U");
		st.add("B");
		st.add("Z");
		st.add("U");
		st.add("D");
		st.add("J");
		st.add("F");
//	    vc.add(0,"Aditya Saini");
//		vc.add(1, "Shubham Saini");
//		vc.add(2, "Raja Bhaiya");
		Enumeration<String> elements = st.elements();
		while(elements.hasMoreElements()) {
			String nextElement = elements.nextElement();
			System.out.println(nextElement);
		}
		Iterator<String> iterator = st.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			//System.out.println(next);
		}
	}
}