package com.ibm.training.lambdas;

import java.util.Arrays;

public class LambdaWithTryCatch {

	public static void main(String[] args) {
		String[] words = new String[] {"this","is","a","series","sardine","of","weird","words","like","zebra","and","orion"};
		
//		try {
//			Arrays.sort(words,(s1,s2) -> s1.charAt(20) - s2.charAt(0));
//		}catch (StringIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		
		Arrays.sort(words,(s1,s2) -> {
			try {
				return s1.charAt(22) - s2.charAt(0);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return 0;
		});

	}

}
