package com.kodewala.objects4;

class OrderMgmt {
	OrderMgmt() {
		super(); // calling Object class constructor
		System.out.println("OrderMgmt.OrderMgmt()");
	}
}

class Order extends OrderMgmt {

	public Order() {
		// either super() or this()
		this("kodewala"); // call super class no arg constructor
		System.out.println("Order.Order()");
	}

	public Order(String name) {
        super();
        System.out.println("Order.Order(name)");
	}

}

public class Driver extends Object {

	public static void main(String[] args) {
		Order ord = new Order(); // call the constructor
	System.out.println();
	}

}
