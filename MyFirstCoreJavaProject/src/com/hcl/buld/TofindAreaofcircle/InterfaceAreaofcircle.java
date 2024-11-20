package com.hcl.buld.TofindAreaofcircle;
import java.util.Scanner;
public interface InterfaceAreaofcircle {
	interface areacal
	{ 
		void circle();
	}
	abstract class areaofC
	{
		double area ;
		public abstract void Circle(double r);
		{
			int r = 0;
			area = (22*r*r)/7;
		}
		public static void main(String[] args) {
			{
				Areaofcircle x;
				Scanner s = new Scanner (System.in);
				System.out.println("enter the radious :");
				double rad = s.nextDouble();
				x=new Areaofcircle();
				x.Circle(rad);
				System.out.println("Area of Circle is : "+x.area);
			}
		}
	}
}



