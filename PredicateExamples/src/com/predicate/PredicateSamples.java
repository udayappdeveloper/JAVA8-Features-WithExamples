package com.predicate;

import java.util.function.Predicate;

public class PredicateSamples {

	public static void main(String[] args) {

		// example1();
		// andCheck();
		// orCheck();
		//negate();
		equal();

	}

	public static void example1() {

		Predicate<Integer> pr = a -> (a > 18); // Creating predicate
		System.out.println(pr.test(10)); // Calling Predicate method
	}

	public static void andCheck() {

		Predicate<Integer> predicate1 = i -> i > 100;
		Predicate<Integer> predicate2 = i -> i < 300;

		Predicate<Integer> andPredicate = predicate1.and(predicate2);
		boolean rangeCheck = andPredicate.test(200);
		System.out.println(" The result is:" + rangeCheck);
	}

	public static void orCheck() {

		Predicate<Integer> predicate1 = i -> i > 100;
		Predicate<Integer> predicate2 = i -> i < 50;

		Predicate<Integer> andPredicate = predicate1.or(predicate2);
		boolean rangeCheck = andPredicate.test(60);
		System.out.println(" The result is:" + rangeCheck);

	}

	public static void negate() {
		Predicate<Integer> predicate = i -> i > 100;
		Predicate<Integer> NegatePredicate = predicate.negate();
		// Negate predicate will become i -> i < 100
		boolean rangeCheck = NegatePredicate.test(30);
		System.out.println("30 is less than 100: " + rangeCheck);
	}
	
	public static void equal() {
		Predicate<String> predicate = Predicate.isEqual("test1");
        System.out.println(predicate.test("test1"));
        System.out.println(predicate.test("test2"));
	}


}
