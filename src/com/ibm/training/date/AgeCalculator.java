package com.ibm.training.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
//		int day = 1;
//		int month = 9;
//		int year = 1999;
//		
//		LocalDate birthDay = LocalDate.of(year, month, day);
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your birthday(dd/MM/yyyy): ");
		String dateString = kb.nextLine();
		LocalDate birthDay = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("You were born on a "+birthDay.getDayOfWeek()+" which was "+birthDay.getDayOfYear()+"th day of the year!!");

		LocalDate today = LocalDate.now();
		
		System.out.println("Today is a "+today.getDayOfWeek()+" and is "+today.getDayOfYear()+"th day of the year "+today.getYear());
	}

}
