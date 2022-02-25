package com.reference;

public class MethodReference {
	
	void mul(int a,int b) {
		
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args) {
		
		SampleInter inter1=(a,b)->System.out.println(a+b);
		inter1.add(2, 3);
		
		SampleInter inter2=new MethodReference()::mul;
		inter2.add(2, 3);
		
		}
		
	

}

@FunctionalInterface
interface SampleInter {

	void add(int a, int b);
}
