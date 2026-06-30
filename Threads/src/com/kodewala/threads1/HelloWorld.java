package com.kodewala.threads1;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("MyThread.run()..... executing the task... " + Thread.currentThread().getName());
		Payment payment = new Payment();
		payment.doPayment();
	}

}

public class HelloWorld
{

	public static void main(String[] args)
	{
		System.out.println("HelloWorld.main() START : " + Thread.currentThread().getName());

		MyThread t1 = new MyThread(); // new thread created
		t1.setName("T1");
		t1.start(); // new thread started --> main thread + T1

		MyThread t2 = new MyThread(); // new thread created
		t2.setName("T2");
		t2.start(); // new thread started --> main thread + T2
        
		// 
		System.out.println("HelloWorld.main() END : " + Thread.currentThread().getName());

	}

}

class Payment
{

	public void doPayment()
	{
		System.out.println("Payment.doPayment() " + Thread.currentThread().getName());
	}

}
