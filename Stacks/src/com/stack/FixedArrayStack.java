package com.stack;

/**
 * Stack Implementation using Static Array
 * @author akash
 *
 */
public class FixedArrayStack implements Stack{
	
	public static final int MAX_CAPACITY = 1000;
	
	private int capacity;
	private Object[] arr;
	private int topIndex = -1;
	
	public FixedArrayStack() {
		capacity = MAX_CAPACITY;
		arr = new Object[capacity];
	}

	public FixedArrayStack(int length) {
		capacity = length;
		arr = new Object[capacity];
	}

	@Override
	public boolean isEmpty() {
		return topIndex<0;
	}

	@Override
	public void push(Object element) throws StackFullException{
		if (this.topIndex == this.capacity)
			throw new StackFullException("Stack is full!");
		else
			arr[++topIndex] = element;
	}

	@Override
	public void pop() throws StackEmptyException{
		if(isEmpty())
			throw new StackEmptyException("Stack is Empty!");
		else {
			arr[topIndex--] = null;
		}
	}
	
	@Override
	public void print(){
		if(isEmpty())
			System.out.println("Stack is Empty!");
		else {
			for(int i=0; i<=this.topIndex; i++)
				System.out.print(this.arr[i]+ " ");
		}
		System.out.println();
	}

	@Override
	public Object peek() throws StackEmptyException{
		if(isEmpty()) {
			throw new StackEmptyException("Stack is empty!");
		}
		else
			return arr[topIndex];
	}

	@Override
	public int size() {
		return topIndex + 1;
	}

}
