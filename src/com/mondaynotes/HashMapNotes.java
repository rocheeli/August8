package com.mondaynotes;

import java.util.HashMap;

public class HashMapNotes {
	public static void main(String[] args) {
		
	

	HashMap  cars = new HashMap();
	
	cars.put("Sonic", "Chevy");
	cars.put("Malibu", "Chevy");
	cars.put("F-150", "Ford");
	cars.put("F-250", "Ford");
	
	System.out.println(cars.get("F-150"));
	System.out.println(cars.get("Malibu"));
	
	HashMap zipCodes =new HashMap();
	
	zipCodes.put("48158", "Michigan");
	
	System.out.println(zipCodes.get("48158"));
	
	
	
	
	
	
	
	}
}
