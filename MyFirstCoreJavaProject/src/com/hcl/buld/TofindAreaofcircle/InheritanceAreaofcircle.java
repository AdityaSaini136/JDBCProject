package com.hcl.buld.TofindAreaofcircle;

import java.awt.geom.Area;
import java.util.Scanner;

class AreaCalculation {
	double area;
	void circle (double r)
	{
		area = (22*r*r)/7;
	}
}
class Aeraofcircle extends AreaCalculation
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the radious : " );
		double rad = s.nextDouble();
		Aeraofcircle a =new Aeraofcircle ();
		a.circle(rad);
		System.out.println("Aera of circle is :"+a.area);
	}
}