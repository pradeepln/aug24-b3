package com.ibm.training.basics;

public class Motorbike extends Vehicle{

	@Override
	public void start() {
		System.out.println("^^^ Bike Starting ^^^");
	}
	
	@Override
	public void stop() {
		System.out.println("^^^ Bike Stopping ^^^");
	}
}
