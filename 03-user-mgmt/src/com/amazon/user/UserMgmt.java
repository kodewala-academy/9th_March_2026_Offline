package com.amazon.user;

public class UserMgmt
{
	public void getUserInfo(String _type)
	{

		if (UserType.RETAIL.equals(_type))
		{

			System.out.println("========= Retail Customer =========");
			System.out.println("Customer ID      : CUST1001");
			System.out.println("Customer Name    : Rahul Sharma");
			System.out.println("Email            : rahul@gmail.com");
			System.out.println("User Type        : " + UserType.RETAIL);
			System.out.println("Prime Member     : Yes");
			System.out.println("Wallet Balance   : ₹2,350");
			System.out.println("Reward Points    : 1,250");
			System.out.println("Total Orders     : 18");
			System.out.println("Account Status   : Active");
			System.out.println("===================================");

		} else if (UserType.RESELLER.equals(_type))
		{

			System.out.println("========== Reseller Profile ==========");
			System.out.println("Reseller ID      : RES5001");
			System.out.println("Company Name     : ABC Electronics");
			System.out.println("Contact Person   : Amit Verma");
			System.out.println("Email            : sales@abcelectronics.com");
			System.out.println("User Type        : " + UserType.RESELLER);
			System.out.println("GST Number       : 29ABCDE1234F1Z5");
			System.out.println("Business City    : Bangalore");
			System.out.println("Products Listed  : 245");
			System.out.println("Total Sales      : ₹58,75,000");
			System.out.println("Seller Rating    : 4.8/5");
			System.out.println("Account Status   : Verified");
			System.out.println("======================================");

		} else if(UserType.MARKETPLACE.equals(_type))
		{
			System.out.println(" This is marketplace user....");
		}
		
		
		else
		{

			System.out.println("Invalid user type.");
		}
	}
}
