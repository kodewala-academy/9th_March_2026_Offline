package com.kodewala.threads.itc;

public class Driver
{

	public static void main(String[] args)
	{
		Task task = new Task(); // shared object
		
		Consumer c = new Consumer(task);
		c.setName("Consumer");
		c.start();

		Producer p = new Producer(task);
		p.setName("Producer");
		p.start();

		
	}

}
