package com.supplier;

import java.util.function.Supplier;

public class StudentSupplierMain {
	
	
	public static void main(String[] args) {
		  Supplier<Student> studentSupplier = () -> new Student(1, "Arpit", "M", 19);
	        Student student =studentSupplier.get();
	        System.out.println(student);
	}

}
