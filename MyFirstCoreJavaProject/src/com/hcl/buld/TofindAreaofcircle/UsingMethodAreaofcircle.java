package com.hcl.buld.TofindAreaofcircle;

import java.util.Scanner;

public class UseingMethodAreaofcircle {
	static class Aeraofcircle
	{
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the radius:");
			double rad = s.nextDouble();
			double a = area(rad);
			System.out.println("Area of circle is:"+ a);
		}
		static double area (double r)
		{
			return (22*r*r)/7;
		}
	}

}
