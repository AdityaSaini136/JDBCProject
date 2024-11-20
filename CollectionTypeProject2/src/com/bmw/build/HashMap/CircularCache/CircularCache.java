package com.bmw.build.HashMap.CircularCache;

import java.util.LinkedHashMap;

public class CircularCache extends LinkedHashMap<Integer, String> {
	int initialCapacity = 0;
	float loadFactor = 0.0f;
	boolean accessOrder = false;
	public CircularCache (int initialCapacity , float loadFactor, boolean accessOrder) {
		super(initialCapacity , loadFactor , accessOrder);
		this.initialCapacity = initialCapacity;
		this.loadFactor = loadFactor;
		this.accessOrder = accessOrder;
	}
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<Integer, String> eldest) {
		return this.size() > initialCapacity;
	}
	public static void main(String[] args) {
		CircularCache cache = new CircularCache(3, 0.75f, false);
		cache.put(10, "One");
		cache.put(20, "Two");
		cache.put(30, "Three");
		cache.get(10);
		cache.put(40, "Four");
		System.out.println(cache);
	}
}