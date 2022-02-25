package com.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		//approach1();
		approach2();
		
	}
	
	public static void approach1() {
		String[] words = new String[10];
		String word = words[5].toLowerCase();
		System.out.print(word);
		
	}
	
	public static void approach2() {
		String[] words = new String[10];
        Optional<String> checkNull
            = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
		
	

}
