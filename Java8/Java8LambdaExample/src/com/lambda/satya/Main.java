package com.lambda.satya;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("satya", "sai", 23), new Person("sanju", "ramu", 20),
				new Person("sai", "krishna", 20), new Person("lakshmi", "sri", 20));

		// 1.Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));

		// 2.Print All
		System.out.println("All Persons : ");
		for (Person p : people) {
			System.out.println(p);
		}

		// 3.Get person with specific lastname
		System.out.println("\nPerson with lastname 's'");
		printWithCond(people, (p) -> p.getLastname().startsWith("s"));

	}

	private static void printWithCond(List<Person> people, Predicate<Person> pred) {
		for (Person p : people) {
			if (pred.test(p)) {
				System.out.println(p);
			}
		}
	}

}
