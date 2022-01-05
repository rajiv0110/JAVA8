package com.rajiv.functional.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ForEachDemo
 * 
 * @author rajivkumar
 *
 */
public class ForEachDemo {
	// filter----> conditional check

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Rajiv");
		list.add("Vikram");
		list.add("Pujara");
		list.add("Rohit");
		list.add("Jadeja");

		for (String s : list) {
			if (s.startsWith("R")) {
				System.out.println(s);
			}
		}

		list.stream().filter(t -> t.startsWith("R")).forEach(t -> System.out.println(t));

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

		/*
		 * map.forEach((key,value)->System.out.println(key+": "+value));
		 */

		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));

		/*
		 * Consumer<String> consumer=(t)->System.out.println(t); for(String s1:list) {
		 * consumer.accept(s1); }
		 */

	}
}
