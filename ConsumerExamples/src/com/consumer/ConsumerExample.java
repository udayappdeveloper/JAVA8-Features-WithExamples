package com.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// example1();
		andThen();
	}

	public static void example1() {

		Consumer<String> consumerString = s -> System.out.println(s);
		consumerString.accept("Uday");

	}

	public static void andThen() {

		Consumer<String> firstC = x -> System.out.println(x.toLowerCase());
		Consumer<String> secondC = y -> System.out.println(y.toUpperCase());

		Consumer<String> result = firstC.andThen(secondC);

		result.accept("Udaykumar");
	}

}
