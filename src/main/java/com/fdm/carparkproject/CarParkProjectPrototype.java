package com.fdm.carparkproject;

import java.util.Arrays;
import java.util.Scanner;

public class CarParkProjectPrototype {
	
	public static void main(String[] args) {
		
		int current = 0;
		int carCount = 0;
		int carsExited = 0;
		int TrucksExited = 0;
		int truckCount = 0;
		double feesPayed = 0;
		Vehicle[] parkingSpaces = new Vehicle[0];

		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		while (true) {
			input = scanner.nextLine();
			
			if ("10".contains(input)) {
				parkingSpaces = new Vehicle[10];
				Arrays.fill(parkingSpaces, new EmptyBay());
//				for (int i = 0; i < parkingSpaces.length; i++) {
//					parkingSpaces[i] = new EmptyBay();
//				}
				System.out.println("Created 10 parking spaces");
				System.out.println(Arrays.toString(parkingSpaces));
			}
			if ("in car".contains(input)) {
				parkingSpaces[current] = new Car();
				System.out.println(Arrays.toString(parkingSpaces));
				//System.out.println(parkingSpaces[0].getParkingRate());
				current++;
				carCount++;
				feesPayed += parkingSpaces[current-1].getParkingRate();
			}
			if ("report".contains(input)) {
				System.out.println("Cars Entered: " + carCount);
				System.out.println("Fees paid: " + feesPayed);
			}
		}

		
//		while (true) {
//			input = scanner.nextLine();
//			System.out.println(input);
//			switch (input) {
//			case "10":
//				parkingSpaces = new Vehicle[10];
//			case "in car":
//				parkingSpaces[current] = new Car();
//				System.out.println(Arrays.toString(parkingSpaces));
//				current++;
//				carCount++;
//				feesPayed += parkingSpaces[current].getParkingRate();
//			case "out car 2":
//				parkingSpaces[current] = null;
//				current--;
//				carsExited++;
//				carCount--;
//			case "report":
//				System.out.println("Cars Entered: " + carCount);
//				break;
//			case "q":
//				break;
//			}
//
//		}
	}
}
