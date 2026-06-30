package com.kodewala.threads6;

class Task
{

	synchronized void doPayment() throws InterruptedException // this method is being executed in parallel (t1 and t2)
	{
		for (int i = 0; i < 10; i++)
		{
            this.wait(2000);
			System.out.println(" Number : " + i + " --> " + Thread.currentThread().getName());

		}
	}

}

class PrinterThread extends Thread
{

	Task task;

	public PrinterThread(Task task)
	{
		this.task = task;
	}

	@Override
	public void run()
	{
		try
		{
			task.doPayment();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // calling on shared object
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		Task user1 = new Task(); // one lock --> if someone taken this lock from an object. remaining lock with
									// task object will be 0

		PrinterThread oddThread = new PrinterThread(user1);
		oddThread.start();

		PrinterThread evenThread = new PrinterThread(user1);
		evenThread.start();
	}

}
