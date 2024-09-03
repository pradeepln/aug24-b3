package com.ibm.training.basics;

public class LoopsDemo {

	public static void main(String[] args) {
		int i =1;
		
		while(i<=10)
		{
			System.out.print(i+"\t");
			i++;
		}
		
		System.out.println("_________________________________");
		
		
		do
		{
		System.out.println(i);
		i++;
		} while(i<=10);

		System.out.println("i = "+i);
		
		System.out.println("__________________________________");
		
		for(int j = 1 ; j <= 10 ; j++) {
			System.out.print(j+"\t");
		}
	}

}
