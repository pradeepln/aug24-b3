package com.ibm.training.exceptions;

public class OutOfMemorySuicideCode {

	public static void main(String[] args) {
		System.out.println("About to allocate lot of memory ........");
		
		byte[] bigArray = new byte[600_000_000];

		System.out.println("After allocating lot of memory....");
	}

}
