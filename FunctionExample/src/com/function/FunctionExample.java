package com.function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		example1();
		andThen();
		compose();
	}

	public static void example1() {

		Function<Integer, Double> functionSqrt = n -> Math.sqrt(n);
		System.out.println("Square root of 49: " + functionSqrt.apply(49));
		System.out.println("Square root of 68: " + functionSqrt.apply(68));
	}

	public static void andThen() {

		Function<Integer, Double> functionSqrt = n -> Math.sqrt(n);
		Function<Double, Double> functionDouble = n -> 2.0 * n;

		double result2 = functionSqrt.andThen(functionDouble).apply(4);
		System.out.println("Result with andThen: " + result2);
	}

	public static void compose() {

		Function<Integer, Double> functionSqrt = n -> Math.sqrt(n);
		Function<Double, Double> functionDouble = n -> 2.0 * n;

		double result2 = functionDouble.compose(functionSqrt).apply(8);
		System.out.println("Result with compose: " + result2);
	}

}
