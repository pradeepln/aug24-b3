package com.ibm.training.basics;

public class BreakDemo {

	public static void main(String[] args) {
		
		int i = 1;
		loop1:while(true) {
			
			System.out.println(i);
			
			if(i * 3 == 12) {
				break;
			}
			System.out.println("Oh, so i was < 4");
			i++;
			
			for(int j = 1; j < 23 ; j++) {
				
				if(j == 13) {
					System.out.println("Oops, hit an unlucky number... exiting... :(");
					break loop1;
				}
				System.out.println("Inside inner loop....");
			}
			System.out.println("After inner loop");
		}
		
		System.out.println("After infinite loop");

	}

}
