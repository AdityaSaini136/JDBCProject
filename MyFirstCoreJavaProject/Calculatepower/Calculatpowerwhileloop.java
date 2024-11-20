package com.hcl.buld.basic;

public class Calculatpowerwhileloop {
	public static void main (String[]args){

		int number =5, p=2 ;
		long result = 1;

		int i = p;
		while (i != 0)

		{
			result *= number;
			--i;
		}
		System.out.println(number+"^"+p+" = "+result);
	}
}


