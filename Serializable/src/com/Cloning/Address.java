package com.Cloning;

public class Address {

	private int pin;
	private String street;
	private String landmark;
	private String city;
	private String dist;
	private String state;
	private String country;

	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(int pin, String street, String landmark, String city, String dist, String state, String country) {
		super();
		this.pin = pin;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.dist = dist;
		this.state = state;
		this.country = country;
	}

	public Address() {
		System.out.println("Address default constructor invoked.");
	}

	public String toString() {
		return  "Address [pin=" + pin + ", street=" + street + ", landmark=" + landmark + ", city=" + city + ", dist="
				+ dist + ", state=" + state + ", country=" + country +"]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}