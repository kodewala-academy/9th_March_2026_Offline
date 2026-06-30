package com.kodewala.threads5;

class Cooking extends Thread
{
	public void run()
	{
		System.out.println(" Food is being prepared... ["+Thread.currentThread().getName()+"]");
		try
		{
			sleep(5000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Food preparation done...["+Thread.currentThread().getName()+"]");
	} 
}

public class Driver
{

	public static void main(String[] args) throws InterruptedException
	{
		Thread.currentThread().setName("Waiter");
		System.out.println(" Waiter took the order....[" + Thread.currentThread().getName() + "]");

		Cooking t1 = new Cooking();
		t1.setName("Cook");
		t1.start(); // cooking started
        
		t1.join(); // waiter thread will wait here till food is cooked.
		
		System.out.println(" Waiter started serving food [" + Thread.currentThread().getName() + "]");
	}

}
