package com.ibm.training.threads;

public class FixedArrayStack implements Stack{

	Object[] contents;
	int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public synchronized void push(Object anElement) {
		
		contents[++top] = anElement;
	}
	
	@Override
	public synchronized Object pop() {
		
		return contents[top--];
	}
}
