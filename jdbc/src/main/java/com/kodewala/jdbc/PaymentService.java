package com.kodewala.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaymentService
{

	public void getAllPayments(String _status) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // checked exception --> Class not found

		// Creating the connection with data.
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Test@12345");

		// Create the statement

		Statement stmt = connection.createStatement();
		String query = null;
		if (_status == null)
		{
			query = "select * from payment";
		} else
		{
			query = "select * from payment where status='" + _status + "'";
			System.out.println(query);
		}
		// execute query
		ResultSet rs = stmt.executeQuery(query); // CURD --> C--> Create, U --> update, R --> read , D --> Delete

		while (rs.next())
		{
			int id = rs.getInt(1);
			String refId = rs.getString(2);
			String status = rs.getString(3);

			System.out.println("ID      : " + id);
			System.out.println("Ref ID  : " + refId);
			System.out.println("Status  : " + status);
			System.out.println("----------------------");
		}

	}

	public void updatePaymentStatus(int _id, String _status) throws ClassNotFoundException, SQLException
	{

		Class.forName("com.mysql.cj.jdbc.Driver"); // checked exception --> Class not found

		// Creating the connection with data.
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Test@12345");

		// Create the statement

		Statement stmt = connection.createStatement();
		String sql = "update Payment set status='" + _status + "' where id=" + _id;
		System.out.println(" Query is : " + sql);

		int recordsUpdated = stmt.executeUpdate(sql);
		
		System.out.println(" Records updated ====> " + recordsUpdated);

	}

}
