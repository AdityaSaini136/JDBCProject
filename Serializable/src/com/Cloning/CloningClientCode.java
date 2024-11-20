package com.Cloning;

public class CloningClientCode {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address(12345, "Strren No 1", "Near Bank Square", "Roorkee", "Haridwar", "UK", "Taliban");
		Employee e1 = new Employee(1,"Mukul Saini", address);

		System.out.println(e1);
		Employee e2 = (Employee)e1.clone();

		e2.setName("Bharat");
		e2.getAddress().setCity("PAK");

		System.out.println(e1);
		System.out.println(e2);
	}
}