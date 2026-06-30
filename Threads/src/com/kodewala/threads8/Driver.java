package com.kodewala.threads8;

class FirstThread extends Thread
{
	@Override
	public void run() // does not return anything... and not exception 
	{
		boolean status = sendEmail();
	}
	
	public boolean sendEmail()
	{
		return true;
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		FirstThread t1 = new FirstThread();
		
		t1.start();

		FirstThread t2 = new FirstThread();

		t2.start();

	}

}
