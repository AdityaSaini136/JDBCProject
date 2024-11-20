package com.java.mohali;
import java.util.Date;

public class OnlineItem extends Item {

	public static final int SHIP_RATE = 3; // rate per pound
	private  double shippingCost ;// shipping cost is calculated based on the weight. 
	private  double weight ;// this attribute is used to calculate the shipping cost
	private Date purchaseDate; //date that the item was purchased
	private  Date shipdate ; //date the item was shipped
	//private double total;// returns the total cost including the shipping. getTotal from the Item class
	@Override
	public String toString() {
		return super.toString()+"OnlineItem [shippingCost=" + shippingCost + ", weight=" + weight + ", purchaseDate=" 
				+ purchaseDate + ", shipdate=" + shipdate + "]";
	}
	public OnlineItem(int barCode, double price, String name,String description,int quantity,Boolean ship){
		super(barCode, price, name, description, quantity, ship); 
		// TODO Auto-generated constructor stub
	}
	public OnlineItem(int barCode, double price, String name, String description, int quantity,
			Boolean ship,double weight, Date purchaseDate, Date shipdate) {
		super(barCode, price, name, description, quantity, ship);
		this.weight = weight;
		this.shipdate = shipdate;
	}
	public static int getShipRate() {
		return SHIP_RATE;
	}
	public double getShippingCost() {
		return shippingCost;
	}
	public double getWeight() {
		return weight;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public Date getShipdate() {
		return shipdate;
	}
	public double getTotal() {
		shippingCost = weight*SHIP_RATE;
		double total = super.getTotal()+shippingCost;
		return total;
	}	
}
