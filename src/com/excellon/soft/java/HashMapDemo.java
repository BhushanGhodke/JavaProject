package com.excellon.soft.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new  HashMap();
		
	map.put("Bhushan", "Ghodke");
	map.put("Java", "developer");
	map.put("Become", "Definately");
	
	map.forEach((x,y)->System.out.println(x + " "+ y));
	
	
	
	}
}
