package com.java.java8.fi;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String args[]) {
		
		
		
		Function<Integer, Integer> func = x->x*x;
		Integer apply  = func.apply(5);
		System.out.println("apply::"+apply);
		
		
	}

}
