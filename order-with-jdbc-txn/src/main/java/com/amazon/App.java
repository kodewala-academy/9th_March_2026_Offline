package com.amazon;

import java.sql.SQLException;

import com.amazon.orders.OrderMgmt;
import com.amazon.orders.OrderMgmtPreparedStmt;

public class App {
	public static void main(String[] args) {
		OrderMgmt mgmt = new OrderMgmt();

		try {
			// mgmt.placeOrder();
			
			OrderMgmtPreparedStmt mgmtPreparedStmt = new OrderMgmtPreparedStmt();
		//	mgmtPreparedStmt.updatePayment("BLOCKED", 1);
			mgmtPreparedStmt.insertRecords();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
