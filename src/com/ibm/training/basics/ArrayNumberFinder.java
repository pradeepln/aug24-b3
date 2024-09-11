package com.ibm.training.basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayNumberFinder {

	public static void main(String[] args) {
		List<List<Integer>> nums = find(new int[] { 10, 21, 34, 55, 12, 23, 44, 11}, 55);
		System.out.println(nums);
	}

	private static List<List<Integer>> find(int[] arr, int target) {
		List<List<Integer>> result = new ArrayList<>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			int firstNum = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				int secondNum = arr[j];
				if ((firstNum + secondNum) == target) {
					result.add(List.of(firstNum, secondNum));
				}
			}
		}
		return result;
	}

}
