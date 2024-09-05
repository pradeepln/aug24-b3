package com.ibm.training.io;

import java.io.File;
import java.util.Date;

public class MyDOS {

	public static void main(String[] args) {
		String command = args[0];
		
		switch(command) {
		case "dir":
			performDir(args);
			break;
		default:
			System.out.println("Bad Command :(");
		}

	}

	private static void performDir(String[] args) {
		String folderToList = ".";
		if(args.length > 1) {
			folderToList = args[1];
		}
		
		File folder = new File(folderToList);
		if(folder.exists()) {
			File[] contents = folder.listFiles();
			System.out.println(folder.getAbsolutePath());
			System.out.println("This folder has "+contents.length+" items");
			
			for(int i = 0; i < contents.length; i++) {
				Date lastModified = new Date(contents[i].lastModified());
				System.out.print(lastModified+ " \t");
				System.out.print((contents[i].isDirectory() ? "<DIR>" : "")+"\t");
				System.out.print(contents[i].length()+"\t");
				System.out.print(contents[i].getName()+"\n");
			}
			
		}else {
			System.out.println("not found");
		}
	}

}
