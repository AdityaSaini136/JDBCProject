package com.hcl.buld.basic;

public class Compoundinterst {
	public void calculate(int p, int t ,double r, int n ) {
		double amount = p*Math.pow(1+(r/n),n*t);
		double cinterest = amount - p;
		System.out.println("Compund Interst after " + t + " year: " +cinterest);
		System.out.println("Amount after " + " year: "+amount);
	}
	public static void main(String[] args) {
		Compoundinterst obj = new Compoundinterst();
		obj.calculate(200, 5, 0.08, 12);
	}
}









