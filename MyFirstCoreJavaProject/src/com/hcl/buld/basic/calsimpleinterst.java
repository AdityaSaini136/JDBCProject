package com.hcl.buld.basic;

import java.util.Scanner;

public class calsimpleinterst {
	public static void main(String args[]) {
		float p, r, t,  sinterest;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principal : ");
		p  = scan.nextFloat();
		System.out.println("Enter the Rate  of interest  : ");
		r = scan.nextFloat();
		System.out.println("Enter the time period : ");
		t = scan.nextFloat();
		scan.close ();
		sinterest = (p * r * t )/100;
		System.out.println("Simple interst is :"+sinterest);
	}
}