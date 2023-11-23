package com.java.java8.fi;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	public static void main(String args[]) {
		
		BiPredicate<String, Integer> biPredicate = (x,y)->{
			return (x.length()==y);
		};
		
		boolean result = biPredicate.test("Bikash", 6);
        System.out.println(result);  // true
	}

}
