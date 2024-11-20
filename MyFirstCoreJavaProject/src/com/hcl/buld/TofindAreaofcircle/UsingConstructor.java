package com.hcl.buld.TofindAreaofcircle;

import java.util.Scanner;

public class UsingConstructor {
	class Area
	{
		int area;
		Area (int r)
		{
			area = (22*r*r)/7;
		}
	}
	public int rad;
	class Areaofcircle
	{
		public void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the radius");
			Area a = new Area (rad);
			System.out.println("Area of circle is :"+ a.area);

		}
	}
}


