package com.ibm.training.basics;


public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement li = new ChemicalElement(3, "Lithium", "Li");
		
		
		
		printDetails(h);
		printDetails(k);
		printDetails(o);
		printDetails(li);
		
		ChemicalElement mystery = new ChemicalElement(Integer.parseInt(args[0]), args[1], args[2]);
		
		System.out.println("Is Li equal to mystery ? " + (li.equals(mystery)));
	}

	private static void printDetails(ChemicalElement c) {
		
		System.out.println("Name of the Element: "+c.getName());
		System.out.println("Is it a metal? "+c.isMetal());
		System.out.println("Is it a transition metal? "+c.isTransitionMetal());
		System.out.println("Is it an Alkali? "+c.isAlkaliMetal());
		System.out.println("__________________________________");
	}

}
