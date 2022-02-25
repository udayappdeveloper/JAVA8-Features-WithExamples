package com.java8;

public class DecorableMain {

	public static void main(String[] args) {
		// Using lambada expression
		Decorable dec = () -> {
			System.out.println("Decorating with curtains");
		};
		dec.decorateWithCurtains();
		Decorable.decorateTheWindows();
	}

}
