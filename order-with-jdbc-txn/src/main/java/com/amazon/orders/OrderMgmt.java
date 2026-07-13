package com.amazon.orders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderMgmt {

	public void placeOrder() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); // checked exception --> Class not found

		// Creating the connection with data.
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Test@12345");

		// Create the statement

		try {
			Statement stmt = connection.createStatement();

			connection.setAutoCommit(false); // set ghe auto commit false

			// create order record with status CREATED
			// Confirm the payment
			// Update the orders tables with PAID

			String createOrderSql = "INSERT INTO ORDERS(id, item,status) VALUES(1,'IPHONE18', 'CREATED')";

			int records = stmt.executeUpdate(createOrderSql); // 1st
			if (records > 0) {
				System.out.println(" Order record created.");
			} else {
				System.err.println(" unable to create record");
			}

			String createPaymentSql = "INSERT INTO payment(id, refid,status) VALUES(1,'PR1234', 'INIT')";

			records = stmt.executeUpdate(createPaymentSql); // 2nd
			if (records > 0) {
				System.out.println(" Payment record created.");
			} else {
				System.err.println(" unable to create payment record");
			}

			// user did not have enough balance

			String updatePayment = "update payment set status='FAILED' where id=1";

			/*
			 * String name = null; name.length();
			 */

			records = stmt.executeUpdate(updatePayment); // 3rd
			if (records > 0) {
				System.out.println(" Payment record updated.");
			} else {
				System.err.println(" unable to update payment record");
			}

			System.out.println(" Doing commit...");
			connection.commit();

		} catch (Exception e) {

			System.out.println(" Exception - Doing roll back...");
			connection.rollback();
		}
	}

}
