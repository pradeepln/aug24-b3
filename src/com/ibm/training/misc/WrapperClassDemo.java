package com.ibm.training.misc;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//Object o = 12; // 
		
		Integer iObj = new Integer(232323);
		
		int i = iObj.intValue();
		
		//int iFromString = Integer.parseInt(args[0]);
		
		int intFromS = Integer.parseInt("123");
		
		double d = Double.parseDouble("23.2");
		
		float f = Float.parseFloat("232");
		
		//int intFromS2 = Integer.parseInt("v123");
		
		
		int iPrimitive = iObj; //int iPrimitive = iObj.intValue()
		
		Integer jObj = 1234; // new Integer(1234)
	}

}
