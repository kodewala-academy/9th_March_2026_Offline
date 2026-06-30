package com.kodewala.threads7;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount
{
	private int balance = 1000;
	ReentrantLock reentrantLock = new ReentrantLock();

	public void withdraw(int amount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " some other logic..... 50 lines....");

		boolean lockStatus = reentrantLock.tryLock(2000, TimeUnit.MILLISECONDS); // sync started --> T1

		System.out.println("BankAccount.withdraw() " + lockStatus);
		
		if (balance >= amount)
		{
			System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);

			// Simulate delay
			try
			{
				Thread.sleep(5000); // it will hold the lock and moves to waiting state 
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}

			balance = balance - amount;
			System.out.println(Thread.currentThread().getName() + " completed withdrawal. Balance = " + balance);
		} else
		{
			System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
		}

		reentrantLock.unlock();
	}

	public int getBalance()
	{
		return balance;
	}
}

class Customer extends Thread
{
	private BankAccount account;

	public Customer(BankAccount account, String name)
	{
		super(name);
		this.account = account;
	}

	@Override
	public void run()
	{
		try
		{
			account.withdraw(800);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class RaceConditionDemo
{
	public static void main(String[] args) throws Exception
	{
		BankAccount account = new BankAccount(); // shared account belongs to Raunak
		System.out.println("Raunak's Init Balance = " + account.getBalance());

		Customer t1 = new Customer(account, "Raunak is doing PhonePay");
		Customer t2 = new Customer(account, "Raunak's Brother is doing Gpay");

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Balance = " + account.getBalance());
	}
}