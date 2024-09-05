package com.ibm.training.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		String srcFileName = "D:/temp/Aug24/b3/sample.txt";
		String destFileName = "D:/temp/Aug24/b3/created.txt";
		
		File inputFile = new File(srcFileName);
		File outputFile = new File(destFileName);
		
		try {
			FileInputStream in = new FileInputStream(inputFile);
			FileOutputStream out = new FileOutputStream(outputFile,false);
			
			BufferedInputStream bufIn = new BufferedInputStream(in);
			BufferedOutputStream bufOut = new BufferedOutputStream(out);
			
			int aByte = -1;
			
			while((aByte = bufIn.read()) != -1) {
				bufOut.write(aByte);
			}
			
			bufIn.close();
			bufOut.close();
			
			long stopTime = System.currentTimeMillis();
			
			System.out.println("Finished copying in "+(stopTime - startTime)+" ms.");
		}catch (FileNotFoundException e) {
			System.out.println("wut? the input file don't exist?");
		}catch (IOException e) {
			System.out.println("Some IO error occured...");
		}

	}

}
