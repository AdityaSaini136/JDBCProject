package com.bmw.build.HashMap.CircularCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class CircularCache2 extends LinkedHashMap<Integer, String> {

	int initialCapacity = 0;
	float loadFactor = 0.0f;
	boolean accessOrder = false;
	public CircularCache2(int initialCapacity, float loadFactor, boolean accessOrder) {
		super(initialCapacity , loadFactor, accessOrder);
		this.initialCapacity = initialCapacity;
		this.loadFactor = loadFactor;
		this.accessOrder = accessOrder;
	}
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<Integer, String> eldest) {
		return this.size() > initialCapacity;
	}
	public static void main(String[] args) {
		CircularCache2 cache = new CircularCache2(3, 0.75f, true);
		cache.put(10, "Java");
		cache.put(20, "Oracle");
		cache.put(30, "Python");
		cache.get(10);
		cache.put(50, "Php");
		cache.get(20);
		cache.put(60, "Cybase");
		System.out.println(cache);
	}
}
