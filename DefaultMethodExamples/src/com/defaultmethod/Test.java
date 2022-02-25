package com.defaultmethod;

public class Test implements Inter1,Inter2 {

	@Override
	public void m() {
		
	}
	
	@Override
	public void m1() {
		//Inter1.super.m1(); //or we should add our own features
		Inter2.super.m1();
		//System.out.println("m1 from test");
	}

	@Override
	public void m2() {
		
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.m1();
		
		
		t.m3();
	}

}
