package com.fdm.carparkproject;

import java.util.Scanner;


public class CarParkView implements iView {

	public String getInput() {

		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public void display(String output) {

		System.out.println(output);
	}

}
