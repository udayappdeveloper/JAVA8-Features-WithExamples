package com.defaultmethod;

public interface Inter2 {
	
	void m();
	default void m1() {
		
		System.out.println("inter2 method");
	}

}
