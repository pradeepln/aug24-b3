package com.ibm.training.basics;

/**
 * This is a demo classs that shows ternary operator and use of java docs
 */
public class OddEvenFinder {

	public static void main(String[] args) {
		OddEvenFinder finder = new OddEvenFinder();

		System.out.println(finder.isEven(10));
		System.out.println(finder.isEven(11));

	}

	/**
	 * This methods tests if the given number is even or odd
	 * @param aNum the number to test
	 * @return returns a string "even" or "odd"
	 */
	public String isEven(int aNum) {
//		if(aNum % 2 == 0) {
//			return "Even";
//		}else {
//			return "Odd";
//		}

		return (aNum % 2 == 0) ? "Even" : "Odd";
	}
}
