package com.java.java8.fi;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String args[]) {
		
		Consumer<String> consumer = x->System.out.println(x);
	    consumer.accept("Hello Java");
	}

}
