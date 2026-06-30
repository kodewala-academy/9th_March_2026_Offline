package com.kodewala;

class Delivery {
	private String name;
	private String addLine1;
	private String addLine2;
	private String city;
	private String pinCode;

	public Delivery(String name, String addLine1, String addLine2, String city, String pinCode) {
		super();
		this.name = name;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}

class Order
{
	private String status;
    private String message;
	
	
	public Order(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

public class Driver {

	public static void main(String[] args) {

		Delivery delivery = new Delivery("Lavkush", "BTM 16th", "28th cross", null, null);
		Order order;
		try {

			delivery.getAddLine1();
			delivery.getAddLine2();

			String pincode = delivery.getPinCode(); 
			
			System.out.println(pincode.codePointAt(0));// NPE
			 order = new Order("Placed", "sent for delivery");

		} catch (NullPointerException e) {
			 order = new Order("Hold", "address is incomplete");
		}

		System.out.println(" status "+order.getStatus());
	}

}
