package com.excellon.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Bhushan");
		set.add("Ghodke");
		set.add("Bhushan");
		set.add("Java");
		set.add("Java Developer");
		
		set.stream().forEach(a->System.out.println(a));
	}
}
