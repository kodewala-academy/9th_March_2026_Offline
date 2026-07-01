package com.kodewala.ex.fw1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class NotifyDelivery implements Callable<String>
{

	@Override
	public String call() throws InterruptedException
	{
		System.out.println("NotifyDelivery.run() : " + Thread.currentThread().getName());
		DeliveryService deliveryService = new DeliveryService();
		deliveryService.confirmDelivery();
		Thread.sleep(3000);
		return "SUCCESS";
		
	}

}

public class Driver
{
	// java 1.5
	// No of threads ? X reuse
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		// Create the executor service
		 ExecutorService exeService = Executors.newSingleThreadExecutor(); // Only single thread will be created.

		// ExecutorService exeService = Executors.newCachedThreadPool(); // thread will be decided by exe framework
		
	//	ExecutorService exeService = Executors.newFixedThreadPool(5); // fix number of thread will by exe framework
		
		for (int i = 0; i < 3; i++)
		{
			NotifyDelivery task = new NotifyDelivery();

			Future<String> response =  exeService.submit(task);
			System.out.println(" waiting for response");
			System.out.println(response.get()); // Blocking 
			System.out.println(" got response");
		}

		exeService.shutdown();
	}

}
