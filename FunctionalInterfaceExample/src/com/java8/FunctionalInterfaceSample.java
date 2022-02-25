package com.java8;

public class FunctionalInterfaceSample {

	public static void main(String[] args) {

		// traditional way of code

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(" Run method by using normal way");
			}
		});

		// by using lambda

		Thread t2 = new Thread(() -> System.out.println("Run method by using lambda"));

		t1.start();
		t2.start();

	}

}
