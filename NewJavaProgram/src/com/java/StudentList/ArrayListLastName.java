package com.java.StudentList;

import java.util.Comparator;
public class ArrayListLastName implements Comparator<Students> {

	@Override
	public int compare(Students s1, Students s2) {
		return s1.getLastName().compareTo(s2.getLastName());
	} 
}