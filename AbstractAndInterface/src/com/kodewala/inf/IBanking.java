package com.kodewala.inf;

public interface IBanking // 100% abstract
{
	public abstract void pay();

	public abstract void settle();

	void addPayee(); // public abstract void addPayee();

	void modifyPayee(); // By Default all the methods in interface are public and abstract
	
	void doEKYC();
	
}
