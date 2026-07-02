package com.kodewala.cf1;

import java.util.concurrent.CompletableFuture;

public class Driver
{

	public static void main(String[] args)
	{
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println(" I am from supply async");
			return "Success";
		});

		System.out.println("completableFuture's response from supply async , " + completableFuture.join());

	}

}
