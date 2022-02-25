package com.java8;


@FunctionalInterface
public interface Decorable {
	
	// one abstract method
	 void decorateWithCurtains();
	 
	 // default method
	 default void decorateWithPaints()
	 {
	  System.out.println("Decorating using paints");
	 }
	 
	// static method
	 static void decorateTheWindows()
	 {
	  System.out.println("Decorating windows");
	 }
	 
	 
	 // Overriding method of java.lang.Object
	 @Override
	 public int hashCode();
}
