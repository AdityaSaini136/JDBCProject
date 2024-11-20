package com.bmw.build.HashMap.HashCode;

import java.util.HashMap;
import java.util.Map;

public class EmpClientCode {

	public static void main(String[] args) {
		
		Employee employee = new Employee("One");
		Employee employee2 = new  Employee ("One");

		Map<Employee, String> map = new HashMap<>();
		map.put(employee, "Java");
		map.put(employee2, "Java");
		System.out.println("Both Object are equals :>>"+ employee.equals(employee2));
		System.out.println("Hash Code employee :>>>"+ employee.hashCode());
		System.out.println("Hash Code emp;oyee :>>>"+ employee2.hashCode());
	//	map.forEach(k,v)-> System.out.println("key : >>>"+ k + "value : >>" + v);
	}
}
