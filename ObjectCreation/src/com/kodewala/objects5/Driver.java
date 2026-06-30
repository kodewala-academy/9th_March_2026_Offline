package com.kodewala.objects5;

class OrderMgmt  {
	public OrderMgmt(String name) {
     super();
	}
}

class Order extends OrderMgmt {

	int amount;
	String itemName;
	int qty;
	String status;

	public Order(int _amount, String _itemName, int _qty) {

		this(_amount, _itemName, _qty, "PLACED");
	}

	public Order(int _amount, String _itemName, int _qty, String _status) {
		super("saome name");// call Super class(OrderMgmt)
		this.amount = _amount;
		this.itemName = _itemName;
		this.qty = _qty;
		this.status = _status;
	}
}

public class Driver {

	public static void main(String[] args) {

		Order ord = new Order(1000, "IPhone 17", 2);

		System.out.println(ord);
	}

}
