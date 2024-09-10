package com.ibm.training.basics;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	float salary;
	
	public Employee(int id,String name,float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("In emp Constructor");
	}
	
	public Employee(int id,String name) {
		this(id,name,0);
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee other) {
		//System.out.println("In emp obj itself , comparing "+this+" with "+other);
		if(this.id > other.id) {
			return 1;
		}else if(other.id > this.id) {
			return -1;
		}else {
			return 0;
		}
		
		//return this.id - other.id;
	}
	
	
}

class Manager extends Employee{
	int teamSize;
	
	public Manager(int id,String name,float salary,int teamSize) {
		super(id,name,salary);
		this.teamSize = teamSize;
		
		System.out.println("In Manager constructor...");
	}
	
	public int getTeamSize() {
		return teamSize;
	}
	
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
}


class ConstructorChainingDemo{
	public static void main(String[] args) {
		Manager m = new Manager(1,"name",100000,10);
	}
}