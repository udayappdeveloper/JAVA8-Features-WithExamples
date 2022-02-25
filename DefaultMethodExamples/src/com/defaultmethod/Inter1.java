package com.defaultmethod;


@FunctionalInterface
public interface Inter1 {
	
	void m2();
	
	default void m1() {
		System.out.println("inter1 m1()");
	}
	
	default void m3() {
		
		
	}

}
