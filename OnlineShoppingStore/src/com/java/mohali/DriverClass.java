package com.java.mohali;

import java.util.Calendar;
import java.util.Date;

public class DriverClass {
	public static void main(String[] args) {
		//Date today = new Date();
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DAY_OF_MONTH, 0);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 3);
		
		//1. Create an object of onlineItem with your choice of attributes....
		OnlineItem onlineitem = new OnlineItem(245, 2600, "Mango", "Grade A", 5, true, 
				 100, today.getTime(), cal.getTime());
		//2. Display the item on the screen
		System.out.println(onlineitem);	
		onlineitem.setPrice(360);
		System.out.println("Change the price of the item = "+onlineitem.getPrice());
		System.out.println("shipping Cost of the item ="+onlineitem.getShippingCost());
		System.out.println("date and time was purchased = "+onlineitem.getPurchaseDate());
		System.out.println("shipping date = ="+onlineitem.getShipdate());
		System.out.println("total cost of the item including the shipping ="+onlineitem.getTotal());
		//3. Change the price of the item
		//System.out.println(onlineitem.setPrice(3000));
		//4. Display the shipping cost of the item  56
		//System.out.println(onlineitem.getShippingCost());
		//5. Display the date the item was purchased...
		//System.out.println(onlineitem.getPurchaseDate());
		//6. Display the shipping date.....
		//System.out.println(onlineitem.getShipdate());
		//7. Display the total cost of the item including the shipping
		//System.out.println(onlineitem.getTotal());
	}
}
