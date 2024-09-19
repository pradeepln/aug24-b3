package com.ibm.training.strings;

import java.util.Arrays;

public class SampleConcatWithNums {

	public static void main(String[] args) {
		
		int i = 10,j=20,k=30;
		System.out.println(i+j+k);
		
		System.out.println("hi"+i+j+k);
		
		int[] nums = {12,13,45};
		
		System.out.println(nums);
		
		System.out.println(Arrays.toString(nums));
		
		String name = "pppp";
		
		StringBuffer bu = new StringBuffer("pppp");
		
		System.out.println(name);
		System.out.println(bu);
		
		//System.out.println((name == bu));
		System.out.println(name.equals(bu));

	}

}
