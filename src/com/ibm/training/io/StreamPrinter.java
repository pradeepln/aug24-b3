package com.ibm.training.io;

import java.io.*;

public class StreamPrinter {
	public static void main(String[] args) {
		try {
			while (true) {
				int data = System.in.read();
				if (data == 13)
					break;
				System.out.write(data);
				System.out.flush();
			}
		} catch (IOException ex) {
			System.out.println("Couldn't read from System.in!");
		}
	}
}
