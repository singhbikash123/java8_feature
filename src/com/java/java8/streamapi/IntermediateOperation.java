package com.java.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperation {
	
	public static void main(String args[]) {
		
		/*filter(Predicate<T>)
		map(Function<T>)
		flatMap(Function<T>)
		sorted(Comparator<T>)
		peek(Consumer<T>)
		distinct()
		limit(long n)
		skip(long n)*/
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,66,88,99,12,13);
		List<String> stringList = Arrays.asList("Bikash","Kumar","Singh");
		
		  // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
          
        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
          
        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
  
        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
  
		///filter example
		System.out.println("filter example");
		list.stream().filter(x->x>5).collect(Collectors.toList()).forEach(System.out::println);
		
		//map example
		System.out.println("map example");
		stringList.stream().map(x->x.length()).collect(Collectors.toList()).forEach(System.out::println);
		
		//flat map example
        System.out.println("The Structure before flattening is : " +
                                                  listOfListofInts);
     //Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                                    .flatMap(lst -> lst.stream())
                                    .collect(Collectors.toList());
  
        System.out.println("The Structure after flattening is : " +
                                                         listofInts);
		System.out.println("Sorted  example");
        //Sorted map
        listofInts.stream().sorted().forEach(x-> System.out.println(x));
        
        //peek example
        System.out.println("Peek example");
        list.stream().peek(System.out::println);
        
       //distinct example
        System.out.println("distinct example");
       listofInts.stream().distinct().forEach(System.out::println);
		
       //limit example 
       System.out.println("limit example");
       listofInts.stream().limit(5).forEach(System.out::println);
	
       //skip example 
       System.out.println("skip example");
       listofInts.stream().skip(5).forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
