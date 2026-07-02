package com.kodewala.cf3;

import java.util.concurrent.CompletableFuture;

public class Driver
{

	public static void main(String[] args)
	{

		// Write and program to return string in upper case.

		CompletableFuture cf = CompletableFuture.supplyAsync(() -> {
			String name = "Kodewala";

			return name;
		}).thenAccept(a -> System.out.print(" Hello "));

		System.out.println("   response :: " + cf.join());

	}

}
