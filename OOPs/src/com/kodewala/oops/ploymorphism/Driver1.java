package com.kodewala.oops.ploymorphism;

class Delivery
{
	public void doDeliver()
	{
		System.out.println("Delivery.doDeliver()");
	}
}

class EComDelivery extends Delivery
{

	public void doDeliver()
	{
		System.out.println("EComDelivery.doDeliver()");
	}
}


public class Driver1 {

	public static void main(String[] args)
	{
		Delivery delivery = new EComDelivery(); // parent class can refer child class object(auto up casting)
		
		
		delivery.doDeliver();    // compile type it check  + it call based on actual object 
	}

}
