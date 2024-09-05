package com.ibm.training.enums;

public class StudentApp {

	public static void main(String[] args) {
		
		OldStyleStudent s = new OldStyleStudent();
		
		s.setId(1);
		s.setName("ppp");
		s.setGrade(IGrade.GRADE_A);
		
		s.setGrade(IGrade.GRADE_C);
		
		s.setGrade('z');
		
		Student aStudent = new Student();
		aStudent.setId(12);
		aStudent.setName("ss");
		
		aStudent.setGrade(Grade.GRADE_B);

	}

}
