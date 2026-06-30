package com.kodewala.threads4;

class PrintNumbers extends Thread
{
	public void run()
	{ // RUNNING
		System.out.println("PrintNumbers.run()....");
		for (int i = 0; i < 10; i++)
		{
			System.out.println(" Number is " + i + " and printed by " + Thread.currentThread().getName());
			if (i == 5)
			{
				System.out.println(" sending " + Thread.currentThread().getName() + " to sleeping/waiting state");
				try
				{
					Thread.currentThread().sleep(5000); // sleep for 5 sec
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out
						.println(" sleep time over.. starting executing again... " +Thread.currentThread().getName());
			}
		}
	} // TERMINATED
}

public class Driver
{

	public static void main(String[] args)
	{
		PrintNumbers numbers = new PrintNumbers(); // NEW
		numbers.run(); // RUNNABLE
	}

}
