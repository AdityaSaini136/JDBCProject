package com.java.mohali;

import java.util.ArrayList;

public class OnlineShoppingCart {

	private String cutomerName; 
	private  ArrayList<OnlineItem> list = null;
	public OnlineShoppingCart(String name){
		cutomerName = name;
		list = new ArrayList<>();
	}
//returns the name of the customer
	 public String getCutomerName() {
		return this.cutomerName;
	 }
// returns the reference to the list of the items
   public ArrayList<OnlineItem> getList() {
	   return this.list;
   }
//removes the items from the list, if the item is not in the list returns false otherwise returns true
  public boolean remove(OnlineItem item) {
	  if(list.contains(item)) {
		  list.remove(item);
		  return true;
	  }
	return false;
  }
//adds the item to the list
	 public void addItem(OnlineItem item) {
		  list.add(item);
	  }
//returns the total cost for all the items in the list including the shipping fee. You need a
 //for loop to go through the list and call methods from the OnlineItem class
	 public  double getTotalCost() {
		double totalCost = 0.0;
		for( int j=0; j<list.size() ; j++) {
			OnlineItem onlineItem = list.get(j);
			 totalCost += onlineItem.getTotal();
		}
		return totalCost;
	 }
	public boolean changeQuantity(OnlineItem item, int quantity) {
		if (list.contains(item)) {
			for(int j=0;j<list.size();j++) {
				OnlineItem onlineItem = list.get(j);
				if(item.equals(onlineItem)) {
				onlineItem.setQuantity(quantity);
			}
		}
		return true;
	}
	return false;
 }
}