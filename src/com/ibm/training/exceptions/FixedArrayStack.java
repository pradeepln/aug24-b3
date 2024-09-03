package com.ibm.training.exceptions;

public class FixedArrayStack implements Stack{

	Object[] contents;
	int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object anElement) {
		if(top == contents.length - 1) {
			StackFullException e = new StackFullException("The Stack seems full with "+contents.length+" elements!!");
			throw e;
		}
		contents[++top] = anElement;
	}
	
	@Override
	public Object pop() {
		if(top == -1) {
			throw new StackEmptyException("CAn't pop no more.....");
		}
		return contents[top--];
	}
}
