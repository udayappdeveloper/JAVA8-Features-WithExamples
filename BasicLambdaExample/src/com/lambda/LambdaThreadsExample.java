package com.lambda;

public class LambdaThreadsExample {

	public static void main(String[] args) {

		approach1();
		approach2();

	}

	private static void approach1() {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Calling run() with out lambda");

			}
		};

		Thread t = new Thread(runnable);
		t.start();

	}

	private static void approach2() {

		Runnable runnable = () -> System.out.println("Calling run() with  lambda");
		Thread t = new Thread(runnable);
		t.start();

	}

}
