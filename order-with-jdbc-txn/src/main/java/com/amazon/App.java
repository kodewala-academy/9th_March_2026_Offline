package com.amazon;

import java.sql.SQLException;

import com.amazon.orders.OrderMgmt;

public class App {
	public static void main(String[] args) {
		OrderMgmt mgmt = new OrderMgmt();

		try {
			mgmt.placeOrder();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
