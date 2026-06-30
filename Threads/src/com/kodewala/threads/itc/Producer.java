package com.kodewala.threads.itc;

public class Producer extends Thread

{
	Task task;

	public Producer(Task task)
	{
		this.task = task;
	}

	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			try
			{
			
				task.produce(i);
				
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
