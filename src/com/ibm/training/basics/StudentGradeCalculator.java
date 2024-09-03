package com.ibm.training.basics;

public class StudentGradeCalculator {

	//switch
	public static void main(String[] args) {
		// print "Congrats, well done" if A
		//  print "well done" if B
		// print "well!" if C
		int p = Integer.parseInt(args[0]);
		int c = Integer.parseInt(args[1]);
		int m = Integer.parseInt(args[2]);
		
		
		String grade = getGrade(p, c, m);
		
		
		switch(grade) {
		case "A":
			System.out.println("Congrats, well done!");
			break;
		case "B":
			System.out.println("Well done!");
			break;
		case "C":
			System.out.println("Well!");
			break;
		default :
			System.out.println("Unknown grade!!");
		}
	}

	//use if
	public static String getGrade(int phy,int math,int chem) {
		float percent =  100f * (phy + math + chem) / 300f;
		
		if(percent >= 80) {
			return "A";
		}else if(percent >= 70 && percent < 80) {
			return "B";
		}else {
			return "C";
		}
		
	}
}
