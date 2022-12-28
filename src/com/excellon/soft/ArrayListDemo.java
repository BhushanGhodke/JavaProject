package com.excellon.soft;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Bhushan");
		list.add("Ghodke");
		list.add("Ahmednagar");
		list.add("Ketan");
		
		list.stream().forEach(a->System.out.println(a));
	}
}
