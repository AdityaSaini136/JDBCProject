package com.infosys.List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class TestStack {
	public static void main(String[] args) {

		Stack<Object> st = new Stack<Object>();
		st.push("A");
		st.push("Z");
		st.push("D");
		st.push("R");
		st.add("Q");
		System.out.println(st.peek());
//		st.add("U");
//		st.add("B");
//		st.add("Z");
//		st.add("D");
//		st.add("J");
//		st.add("F");
		//		Iterator<Object> iterator = st.iterator();
		//		while(iterator.hasNext()) {
		//			Object next = iterator.next();
		//			System.out.println(next);
		//		}
		Enumeration<Object> elements = st.elements();
		while(elements.hasMoreElements()) {
			Object nextElement = elements.nextElement();
			System.out.println(nextElement);
		}


	}

}
