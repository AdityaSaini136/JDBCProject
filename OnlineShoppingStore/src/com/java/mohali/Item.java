package com.java.mohali;

public class Item {
	private int barCode;
	private double price; //price of the item cannot be negative
	private String name;  //name of the item
	private String description;  // description of the item
	private int quantity;  //quantity that can be purchased, cannot be negative
	private Boolean ship;
	public Item(int barCode,double price, String name, String description, int quantity, Boolean ship) {
		super();
		this.barCode = barCode;
		this.price = price;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.ship = ship;
	}
	public int getBarCode() {
		return barCode;
	}
	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Boolean getShip() {
		return ship;
	}
	public void setShip(Boolean ship) {
		this.ship = ship;
	}
	@Override
	public String toString() {
		return "Iteam [barCode=" + barCode + ", price=" + price + ", name=" + name + ", description=" 
				+ description+ ", quantity=" + quantity + ", ship=" + ship + "]";
	} 
	//+equals(Item other) : boolean // compares two items based on the bar code
	public boolean equals(Item other) {
		return ship;
	}
	//+getTotal () : double //returns the total cost of the item based on the quantity
	public double getTotal() {
		double Total  =	price*quantity;
		return Total;
	}
}
