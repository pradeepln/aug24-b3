package com.ibm.training.misc;

import java.util.Scanner;

public class SystemClass {

	public static void main(String[] args) {
		try {
			System.out.println("This goes into standard output");
			System.err.println("This on the other hand goes into standard error");
			System.out.println("Now you can try writing into standard input (and hit enter)");
//			int aByte = System.in.read();
//			System.out.println(aByte);
			Scanner kb = new Scanner(System.in);
			
			String fromKb = kb.nextLine();
			System.out.println(fromKb);
			
			System.out.println(System.currentTimeMillis());
			
			String os = System.getProperty("os.name");
			System.out.println(os);
			System.out.println(System.getProperty("user.home"));
			System.out.println(System.getProperty("user.dir"));
			
			System.out.println(System.getProperties());
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
