package com.ibm.training.collections;

import java.util.List;
import java.util.Comparator;

import com.ibm.training.basics.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		//System.out.println("Inside esC , comparing "+e1+" with "+e2);
		return (int) (e1.getSalary() - e2.getSalary());
	}
}



//Collections{
//	
//	
//	sort(List l,Comparator c){
//		Object e1 = l.get(0);
//		Object e2 = l.get(1);
//		int num = c.compare(e1, e2);
//		if(num > 0) {
//			l.set(0,e2);
//			l.set(1, e1);
//		}else {
//			
//		}
//	}
//}