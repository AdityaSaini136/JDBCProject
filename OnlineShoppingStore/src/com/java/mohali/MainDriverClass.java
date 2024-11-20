package com.java.mohali;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainDriverClass {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		OnlineShoppingCart myCart = new OnlineShoppingCart(null);
		purchase(myCart);
		displayCart(myCart);
		OnlineItem itemToBeRemoved = getItemToRemove(sc, myCart);
		if(itemToBeRemoved !=null)
			remove(myCart, itemToBeRemoved);
		else
		{
			System.out.println("we dont have this item in our cart");
		}
	}
	private static OnlineItem getItemToRemove(Scanner sc,OnlineShoppingCart myCart) {
		// ask bar code of item to delete
		int barCode = Integer.parseInt(sc.nextLine());// will come from scanner
		OnlineItem itemToBeRemoved = null;
		// based on barcode get the item from list
		for(OnlineItem item : myCart.getList()) {
			if(item.getBarCode() == barCode) {
				itemToBeRemoved = item;
				break;
			}
		}
		return itemToBeRemoved;
	}
	private static void purchase(OnlineShoppingCart myCart) {
		String buyMore = "Y";
		int barCode = 1000;
		while(buyMore.equalsIgnoreCase("Y")) {
			//System.out.println("Enter BarCode Value...");
			barCode++;
			System.out.println("Enter Price....");
			double price =  Double.parseDouble(sc.nextLine());
			System.out.println("Enter Product Name...");
			String name = sc.nextLine();
			System.out.println("Enter Product description");
			String description = sc.nextLine();
			System.out.println("Enter Product quantity...");
			int quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Product Shiping Status true/false...");
			boolean ship = Boolean.parseBoolean(sc.nextLine());
			System.out.println("Enter Product weight(Kg)...");
			double weight =   Double.parseDouble(sc.nextLine());
			//for purchase date
			Calendar cal = Calendar.getInstance();
			Date purchaseDate = cal.getTime();
			System.out.println("purchaseDate==="+purchaseDate);
			// for ship Date....
			Calendar cal1 = Calendar.getInstance();
			cal1.add(Calendar.DAY_OF_MONTH, 3);
			Date shipdate = cal1.getTime();
			System.out.println("shipdate==="+shipdate);
			OnlineItem onlineItem = new OnlineItem(barCode, price, name, description,quantity, ship,
					weight, purchaseDate, shipdate);	
			myCart.getList().add(onlineItem);
			System.out.println("Do you want to buy more ? Enter Y to accept or any other key to exit..!");
			buyMore = sc.nextLine();
			
		}
	}
	private static void displayCart(OnlineShoppingCart myCart) {
		ArrayList<OnlineItem> list = myCart.getList();
		for(OnlineItem onlineItem : list) {
			System.out.println(onlineItem);
		}
		System.out.println("Total Cost : $ "+ myCart.getTotalCost());
	}
	public static void remove (OnlineShoppingCart myCart , OnlineItem item) {
		myCart.getList().remove(item);
		myCart.getList().forEach(s -> System.out.println(s));
	} 
	public static void barCode() {
		int barCode = 1000;
		
	}
} 