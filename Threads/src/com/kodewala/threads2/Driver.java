package com.kodewala.threads2;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("MyThread.run() : " + i +" "+Thread.currentThread().getName());
		}
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		MyThread t0 = new MyThread();
		t0.start();
		
		MyThread t1 = new MyThread();
		t1.start();

	}

}
