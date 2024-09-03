package com.ibm.training.misc;

public class MethodsWithArgs {
	
	public static int sumUp(int startAt,int... nums) { //varargs
		int sum = startAt;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		return sum;
	}

	
	
	public static void main(String... args) {
		
		int sum = sumUp(1000,10, 20,123);
		System.out.println(sum);

	}

}
