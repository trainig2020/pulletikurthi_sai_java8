package com.lambda.satya;

import java.util.Arrays;
import java.util.List;

public class Streams {
	
public static void main(String[] args) {
		
	List<Person> people = Arrays.asList(
			new Person("satya", "sai", 23),
			new Person("sanju", "ramu", 20),
			new Person("sai", "krishna", 20),
			new Person("lakshmi", "sri", 20)
		);
		
		/*
		 * people.stream() .filter(p -> p.getLastName().startsWith("G")) .forEach(p ->
		 * System.out.println(p.getFirstName()));
		 */
		
		/*
		 * long count = people.stream() .filter(p -> p.getLastName().startsWith("k"))
		 * .count();
		 * 
		 * System.out.println(count);
		 */
		
		long count = people.parallelStream()
				.filter(p -> p.getLastname().startsWith("s"))
				.count();
				
				System.out.println(count);
				

}

}