package com.mondaynotes;

public class ParkingLot {

	public static void main(String[] args) {

	
		KeithsCar hisCar = new KeithsCar();
		
		System.out.println(hisCar.getColor());
				
		Car kavitasCar = new Car(6, 4, true, "Toyota", "Corolla", "Blue", false);
		
		System.out.println(kavitasCar.getModel());
		
		Car erinsCar = new Car(5, 4, true, "Chevy", "Sonic", "White", false);
		
		System.out.println(erinsCar.isRuns());
		
		erinsCar.setRuns(false);
		
		System.out.println(erinsCar.isRuns());
				
	}

}
