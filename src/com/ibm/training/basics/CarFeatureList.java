package com.ibm.training.basics;

public class CarFeatureList {

	public static void main(String[] args) {
		
		printFeatures("L");

	}
	
	
	public static void printFeatures(String variant) {
		//L - Power Steering, 2 Air Bags, Power Windows , LX - Music System , VX - Ventilated Seats
		switch(variant) {
		case "VX":
			System.out.println("Ventilated Seats");
		case "LX":
			System.out.println("Music System");
		case "L":
			System.out.println("Power Steering");
			System.out.println("2 Air Bags");
			System.out.println("Power Windows");
		}
	}

}
