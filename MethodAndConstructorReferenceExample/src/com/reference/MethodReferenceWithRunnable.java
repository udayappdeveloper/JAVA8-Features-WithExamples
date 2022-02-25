package com.reference;

public class MethodReferenceWithRunnable {

	public void running() {

		System.out.println("run() alternate instance running()");
	}

	public static  void runningStaticMethod() {

		System.out.println("run() alternate static runningStaticMethod()");
	}

	public static void main(String[] args) {

		Runnable runnable = new MethodReferenceWithRunnable()::running;

		new Thread(runnable).start();
		
		
		
		Runnable runnable1 =  MethodReferenceWithRunnable::runningStaticMethod;

		new Thread(runnable1).start();

	}

}
