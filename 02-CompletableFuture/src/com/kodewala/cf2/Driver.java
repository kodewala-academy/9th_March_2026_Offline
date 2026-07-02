package com.kodewala.cf2;

import java.util.concurrent.CompletableFuture;

public class Driver
{

	public static void main(String[] args)
	{
		// Write and program to return string in upper case.

		CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
			String name = "Kodewala";

			return name;
		}).thenApply((n) -> n.toUpperCase() );

		System.out.println("response :: "+ cf.join());
	}

}
