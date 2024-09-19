package com.ibm.training.basics;

public class StaticVsNonStatic {

	public static void main(String[] args) {
//		System.out.println(Product.count);
//		
//		Product obj1 = new Product(1, "Razor");
//		
//		System.out.println(obj1.id);
//		
//		Product obj2 = new Product(2, "shampoo");
//		
//		System.out.println(obj2.id);
//		
//		System.out.println(Product.count);
		
//		System.out.println("get count "+Product.getCount());
		
//		Product.getName();

//		System.out.println(" name : "+obj1.getName());
		
		
		Product aP = new SpecialProduct(12, "SP");
		
//		System.out.println(aP.getCount());
		
		System.out.println(Product.getCount());
		System.out.println(SpecialProduct.getCount());
	}

}
