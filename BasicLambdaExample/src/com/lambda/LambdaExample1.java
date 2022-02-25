package com.lambda;

public class LambdaExample1 {

	public static void main(String[] args) {

		// basic example
		MyInter myInter = () -> System.out.println("Hi");
		myInter.sample();

		// example 2 #Approach1

		AdditionInter addInter = (int a, int b) -> System.out.println(a + b);

		addInter.add(2, 3);

		// example 3 #Approach2

		AdditionInter addInter1 = (a, b) -> System.out.println(a + b);

		addInter1.add(2, 3);

		// example 4 #Approach3
		StringInter strInter = a -> a;
		System.out.println(strInter.getString("uday"));
		
		// calling default method
		//strInter.log("Logging added for Object...");
		// Calling static method
		//StringInter.print("Printing logic added here..");

	}

}

@FunctionalInterface
interface MyInter {
	void sample();
}

@FunctionalInterface
interface AdditionInter {
	void add(int a, int b);
}

@FunctionalInterface
interface StringInter {
	String getString(String str);

	/*
	 * default void log(String str) { System.out.println(str); }
	 * 
	 * static void print(String str) {
	 * 
	 * System.out.println(str); }
	 */
}
