package com.supplier;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		example1();
	}

	private static void example1() {
		Supplier<String> supplier = () -> "Arpit";
		System.out.println(supplier.get());
	}

}
