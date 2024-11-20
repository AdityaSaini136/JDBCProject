package com.hcl.buld.TofindAreaofcircle;

import java.util.Scanner;

public class Areaofcircle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the radious : ");
		double r =  s.nextDouble();
		double area = (22*r*r)/7;
		System.out.println("Area of circle is : "+area);
	}
}
