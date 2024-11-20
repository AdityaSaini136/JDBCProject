package com.java.mohali;

public class ItemDriver {
	public static void main(String[] args) {
		//1. Create three objects of the item class with your choice of attributes....
		Item item1 = new Item(1234,350, "sugar", "Grade A", 1, true);
		Item item2 = new Item(12345,4000, "Wheat", "Grade B", 1, true);
		Item item3 = new Item(123456,4500,"Rice","Grade C", 1, false);
		//2. Display the items on the screen....
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		//3. Change the price and quantity of the items using the setter methods. Do not create new objects	
		item1.setPrice(700);
		item2.setPrice(5000);
		item3.setPrice(6000);
		item1.setQuantity(2);
		item2.setQuantity(2);
		item3.setQuantity(2);
		//4. Display your items on the screen by calling the toString method on each object
		System.out.println(item1.toString());
		System.out.println(item2.toString());
		System.out.println(item3.toString());
		//5.Display the total for all three items by calling the getTotal method for every Item object created
		System.out.println("Total Item Coast:>>"+(item1.getTotal()+item2.getTotal()+item3.getTotal()));
	}
}
//1. Create three objects of the item class with your choice of attributes.
//2. Display the items on the screen
//3. Change the price and quantity of the items using the setter methods. Do not create new objects
//4. Display your items on the screen by calling the toString method on each object
//5. Display the total for all three items by calling the getTotal method for every Item object created 
//in step 1. Add them all together and display the total cost for all the items purchased on the 
//screen