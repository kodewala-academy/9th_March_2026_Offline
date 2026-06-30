package com.kodewala;

import java.util.ArrayList;

public class Driver1
{

	public static void main(String[] args)
	{

		ArrayList<SBIUser> defaultList = new ArrayList<SBIUser>();

		SBIUser u1 = new SBIUser("Rahul", "BTM Bangalore", "SBINOO1", 123);
		SBIUser u2 = new SBIUser("Raj", "BTM Bangalore", "SBINOO1", 453);
		SBIUser u3 = new SBIUser("Nadeem", "BTM Bangalore", "SBINOO1", 54);
		SBIUser u4 = new SBIUser("Rhoit", "BTM Bangalore", "SBINOO1", 789);
		SBIUser u5 = new SBIUser("Fazal", "BTM Bangalore", "SBINOO1", 756856);
		SBIUser u6 = new SBIUser("Laxmi", "BTM Bangalore", "SBINOO1", 43152);
		SBIUser u7 = new SBIUser("Abhi", "BTM Bangalore", "SBINOO1", 85);

		defaultList.add(u1);
		defaultList.add(u2);
		defaultList.add(u3);
		defaultList.add(u4);
		defaultList.add(u5);
		defaultList.add(u6);
		defaultList.add(u7);

		// ===========================================================

		for (int i = 0; i < defaultList.size(); i++)
		{
			SBIUser user = defaultList.get(i);
			if (user.getBalance() < 1000)
			{
				System.out
						.println(" sending email to user " + user.getName() + " as his/her balance is not maintained");
			}
		}

	}

}
