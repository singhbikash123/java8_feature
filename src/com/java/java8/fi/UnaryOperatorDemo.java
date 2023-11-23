package com.java.java8.fi;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String args[]) {
		
		UnaryOperator<Integer> unary = x->x+x;
		System.out.println(unary.apply(5));;
	}
}
