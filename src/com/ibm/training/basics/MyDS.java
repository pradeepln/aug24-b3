package com.ibm.training.basics;

public class MyDS {

	
	public void addElement(Object o) {}
}


class MyDSClient{
	
	public static void main(String[] args) {
		MyDS ds = new MyDS();
		
		ds.addElement("stringval");
		
		Car c = new Car();
		
		ds.addElement(c);
		
		Driver d = new Driver();
		
		ds.addElement(d);
		
		Object o = new ChemicalElement(1, "", "");
		
		
	}
}
