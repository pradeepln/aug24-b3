package com.ibm.training.exceptions;

import com.ibm.training.basics.Car;

public class ExceptionDemo {

	static Car c;

	public static void main(String[] args) {
		System.out.println("In main before calling m1");
		m1();
		System.out.println("In main after calling m1");

	}

	private static void m1() {

		System.out.println("In m1 before calling m2");
		m2();
		System.out.println("In m1 after calling m2");

	}

	private static void m2() {

		try {
			System.out.println("In m2 before calling m3");
			m3();
			System.out.println("In m2 after calling m3");
		} catch (ArithmeticException e) {
			System.out.println("Looks like division by 0..... doesn't cause infinity always");
			e.printStackTrace();
		}
	}

	private static void m3() throws ArithmeticException {

		System.out.println("In m3 before any ops");

		try {

//			System.out.println("Trying to play music on a null car");
//			c.playMusic();

//			int[] nums = new int[] { 15, 17 };
//			System.out.println("Trying to access 3rd element from an array of length 2");
//			System.out.println(nums[2]);

		//	return;
			
			int i = 0;
			int j = 25;
			int k = j / i;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("What went wrong? " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Soomething null? ");
			// e.printStackTrace();
			System.out.println("Handled NPE... Now no prob...");
		}finally {
			System.out.println("This line will always print...come what may!!!");
		}

		System.out.println("In m3 after any ops");

	}

}
