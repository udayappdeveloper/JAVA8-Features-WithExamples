package com.constructorref;

public class ConstructorRefSample {
	
	private String s;
	
	
	public ConstructorRefSample(String val) {
		
		this.s=val;
		System.out.println("Constructor Executed:"+s); 
	}
	
	public static void main(String[] args) {
		
		SampleInterface inter1=s->new ConstructorRefSample(s);
		inter1.getObject("From Lambda Expression");
		
		
		SampleInterface inter2=ConstructorRefSample::new;
		inter2.getObject("From Constructor ref");
		
		
		
	}

}


@FunctionalInterface
interface SampleInterface{
	
	ConstructorRefSample getObject(String a);
}


/*
 *  In method and constructor references compulsory the argument types must
 * be matched.
 */


