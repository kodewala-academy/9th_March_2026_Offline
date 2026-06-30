package com.kodewala.threads.itc;

public class Consumer extends Thread

{
	Task task;

	public Consumer(Task task)
	{
		this.task = task;
	}

	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			try
			{
		
				task.consume();
				
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
