package com.reference;

public class MethodReferenceExample2 {

	public void m2(int i) {
		System.out.println("From Method Reference:" + i);
	}

	public static void main(String[] args) {
		SampleInterface inter = a -> System.out.println("The value is :" + a);
		inter.m1(2);
		
		
		SampleInterface inter2=new MethodReferenceExample2()::m2;
		inter2.m1(10);
	}

}

@FunctionalInterface
interface SampleInterface {

	void m1(int i);
}


/*
 * In the above example functional interface method m1() referring to
 * MethodReferenceExample2 class instance method m2(). The main advantage of
 * method reference is we can use already existing code to implement functional
 * interfaces(code reusability).
 */