package com.bmw.build.HashMap.HashCode;

public class HashCode {
	private String name;
	private int custAccountNo;
	private float salary;

	public  int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name==null) ? 0 : name.hashCode());    
		result = prime * result + custAccountNo;
		result = prime * result +Float.floatToIntBits(salary);
		return result;
	}
	public static void main(String[] args) {
		HashCode code = new HashCode();
		System.out.println(code.hashCode());
	}
}
