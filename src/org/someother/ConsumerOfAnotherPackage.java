package org.someother;

//import com.ibm.training.basics.Driver;

import com.ibm.training.basics.*;

public class ConsumerOfAnotherPackage {

	public static void main(String[] args) {
		com.ibm.training.basics.Car c = new com.ibm.training.basics.Car();
		
		Driver d1 = new Driver();
		
		Driver d2 = new Driver();
		
		Point p = new Point(12,12);
		
		Employee e1 = new Employee(1, "name");
		
		//Manager m;
		
		java.sql.Driver databaseDriver ;
		java.awt.Point guiPoint;

	}

}
