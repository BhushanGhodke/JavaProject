package com.excellon.soft;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[]args) {
		List<String> list = new LinkedList<String>();
		list.add("Bhushan");
		list.add("Ghodke");
		list.add("Ahmednagar");
		
	//	System.out.println(list);
		list.stream().forEach(x->System.out.println(x));
	}
}
