package com.kodewala.cf4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{

		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);

		
		
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 30);
		

		CompletableFuture<Integer> finalFuture = future1.thenCombineAsync(future2, (n1, n2) -> n1 + n2);

		
		CompletableFuture.anyOf(future1,future2);
		
		
		System.out.println(" Tasks has been completed...");

	}

}
