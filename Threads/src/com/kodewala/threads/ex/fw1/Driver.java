package com.kodewala.threads.ex.fw1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmailSender implements Callable<String>
{
	@Override
	public String call()
	{
		System.out.println(Thread.currentThread().getName());
		return "failed....FDSAGDFGDGDGDSGDS";
	}
}

public class Driver
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		ExecutorService es = Executors.newFixedThreadPool(2);
		EmailSender task = new EmailSender();
		
		for(int i=0; i<5 ;i++) 
		{
		
		Future<String> response = es.submit(task);
		System.out.println("response from call() method is " + response.get());
		}
		
		es.shutdown();
	}

}
