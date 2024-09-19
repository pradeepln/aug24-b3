package com.ibm.training.basics;

public class Product {
	int id;
	String name;
	
	static int count;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
		++count;
	}

	public static int getCount() {
		//System.out.println(id);
		return count;
	}
	
	public String getName() {
		return name;
	}
}


class SpecialProduct extends Product{
	
	public SpecialProduct(int id,String name) {
		super(id,name);
		//super(23,"");
	}
	
	public static int getCount() {
		return 33;
	}
}