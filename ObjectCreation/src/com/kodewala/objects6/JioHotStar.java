package com.kodewala.objects6;

class User {

	public static int totalLiveUsers = 0;

	private String mobile;

	public User(String mobile) {
		this.mobile = mobile;
	}

	{
		totalLiveUsers = totalLiveUsers + 1;
	}
}

public class JioHotStar {

	public static void main(String[] args) {

		User u1 = new User("6354366365");
		User u2 = new User("6354353462");
		User u3 = new User("1234366365");
		User u4 = new User("635455353462");
		User u5 = new User("1234443366365");
		User u6 = new User("33333333");
		User u7 = new User("1236654366365");
		
		System.out.println(" Total Live Viewers are : " + User.totalLiveUsers);
	}

}
