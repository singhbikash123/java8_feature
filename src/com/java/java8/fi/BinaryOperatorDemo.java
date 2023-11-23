package com.java.java8.fi;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	
	public static void main(String args[]) {
		
		BinaryOperator<Double> binaryOperator = (x,y)-> Math.pow(x, y);
		System.out.println("result::"+binaryOperator.apply(5.0, 5.0));
	}

}
