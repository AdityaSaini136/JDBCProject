package com.infosys.List;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		Queue<String> pq1 = new PriorityQueue<>();
		ArrayDeque<String> pq = new ArrayDeque<>();
		pq.add("Z");
		pq.offer("A");
		pq.add("E");
		pq.add("H");
		pq.add("SB");
		//pq.add("BA");
		pq.add("WD");
		System.out.println(pq.size());
		System.out.println("Peek "+pq.peek());
		System.out.println();
		Iterator<String> iterator = pq.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

	}
}