package com.java.StudentList;

import java.util.Comparator;

public class ArrayListFirstName implements Comparator<Students> {
	@Override
	public int compare(Students s1, Students s2) {
		return s1.getFirstName().compareTo(s2.getFirstName());
	}
}  