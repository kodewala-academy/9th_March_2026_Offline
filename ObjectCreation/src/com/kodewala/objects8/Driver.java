package com.kodewala.objects8;

public class Driver {
	public static void main(String[] args) {
		Driver d = new Driver();
		d.m1();
		System.out.println("Driver.main()");
	}

	public void m1() {
		m2();
		System.out.println("Driver.m1()");

	}

	public void m2() {
		m3();
		System.out.println("Driver.m2()");
	}

	public void m3() {
		System.out.println("Driver.m3()");
	}
}
