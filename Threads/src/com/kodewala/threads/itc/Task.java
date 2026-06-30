package com.kodewala.threads.itc;

public class Task
{
   int number;
   boolean isDataAvailable= false;
   
   public synchronized void produce(int _num) throws InterruptedException
   {
	   while(isDataAvailable)
	   {
		   System.out.println(Thread.currentThread().getName() +" is waiting....");
		   wait();
	   }
	   number= _num;
	   System.out.println(" producing data : "+number);
	   isDataAvailable=true;
	   notify();
   }
   
   public synchronized void consume() throws InterruptedException
   {
	   while(!isDataAvailable)
	   {
		   System.out.println(Thread.currentThread().getName() +" is waiting....");
		   wait();
	   }
	   System.out.println(" consuming it .. "+number);
	   isDataAvailable=false;
	   notify();
   }
   
}
