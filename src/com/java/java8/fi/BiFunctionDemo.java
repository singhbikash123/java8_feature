package com.java.java8.fi;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	
	public static void main(String args[]) {
		
		BiFunction<Double, Double, Double> bifunc = (x,y)-> Math.pow(x, y);
		Double result = bifunc.apply(5.0, 2.0);
		System.out.println("Result:::"+result);
		
	}

}
