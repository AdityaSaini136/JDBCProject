package com.hcl.buld.basic;

public class CalculatPowerforloop
{
	public static void main (String[]args) {
		//Here number is the base and p is the exponent
		int number =5, p = 2;
		long result=1;

		//copying the ecponent value to the loop counter 
		int i = p;
		for (;i != 0; --i)
		{
			result *= number;
		}
		//Displaying the output
		System.out.println(number+"^"+p+" = "+result);
	}

}

