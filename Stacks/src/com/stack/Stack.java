package com.stack;

public interface Stack {
	
	public boolean isEmpty();
	public void push(Object element) throws StackFullException;
	public void pop() throws StackEmptyException;
	public Object peek() throws StackEmptyException;
	public void print();
	public int size();

}
