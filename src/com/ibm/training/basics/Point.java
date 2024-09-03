package com.ibm.training.basics;

public class Point {
	int x, y;

	//Point(){}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String whereAmI() {
		return "I am at "+x+" , "+y;
	}
	
	//the following equals isnt completely correct. fix later
	
	public boolean equals(Point other) {
		return (this.x == other.x && this.y == other.y);
	}
}
