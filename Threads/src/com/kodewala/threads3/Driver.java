package com.kodewala.threads3;

class MyThread implements Runnable
{

	@Override
	public void run() // RUNNING
	{
		System.out.println("MyThread.run()... attending Kodewala classess ---- STARTED at 9 AM");
		System.out.println("MyThread.run()......");
		System.out.println("MyThread.run()......");
		System.out.println("MyThread.run()......");
		// T1(student) can go to Sleep/wait/ pause state.(30 mins) --> WAITING State -
		// Once waiting is over, T1 will move to RUNNABLE --> CPU gives time to T1 --> RUNNING state
		System.out.println("MyThread.run()......");
		System.out.println("MyThread.run()......");
		
		
		System.out.println("MyThread.run()... attending Kodewala classess ---- END  at 6 PM ");

	} // Once run method is completed, your thread T1 is terminated / DEAD

}

public class Driver
{

	public static void main(String[] args)
	{
		MyThread myThread = new MyThread();

		Thread t1 = new Thread(myThread); // New Born (Thread object created)
		t1.start(); // Threaded Moved from New born to RUNNABLE 
		t1.start();
		
	}

}
