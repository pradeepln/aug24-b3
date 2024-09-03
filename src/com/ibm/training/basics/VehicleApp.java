package com.ibm.training.basics;

public class VehicleApp {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		Driver d = new Driver();
		
		d.drive(c); //type substitution

		Truck t = new Truck();
		
		d.drive(t); //type substitution
		
		//Vehicle v0 = new Vehicle();
		Vehicle v1 = new Car();
		Vehicle v2 = new Truck();
		
		
		Vehicle v3 = new Motorbike();
		Motorbike m = new Motorbike();
		
		d.drive(m);
	}

}
