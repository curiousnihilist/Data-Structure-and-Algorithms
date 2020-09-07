package com.stack;

public class DynamicArrayStack implements Stack{
	
	private int capacity;
	private Object arr[];
	private int top;
	
	public DynamicArrayStack() {
		capacity=1;
		arr = new Object[capacity];
		top=-1;
	}

	@Override
	public boolean isEmpty() {
		return top<0;
	}
	
	public int getCapacity() {
		return capacity;
	}

	@Override
	public int size() {
		return top+1;
	}
	
	@Override
	public void push(Object element) {
		if(size() == capacity)
			expand();
		arr[++top] = element;
	}

	private void expand() {
		Object[] newArr = new Object[capacity*2];
		System.arraycopy(arr, 0, newArr, 0, capacity);
		arr = newArr;
		capacity*=2;
	}
	
	@Override
	public void pop() throws StackEmptyException {
		if(isEmpty())
			throw new StackEmptyException("Stack is Empty");
		arr[top--] = null;
		if(size() < capacity/2)
			shrink();
	}
	
	private void shrink() {
		Object[] newArr = new Object[capacity/2];
		System.arraycopy(arr, 0, newArr, 0, size());
		arr = newArr;
		capacity/=2;
	}

	@Override
	public Object peek() throws StackEmptyException {
		if(isEmpty())
			throw new StackEmptyException("Stack is Empty");
		return arr[top];
	}

	@Override
	public void print() {
		if(isEmpty())
			System.out.println("Stack is Empty!");
		else {
			for(int i=0; i<=top; i++)
				System.out.print(this.arr[i]+ " ");
		}
		System.out.println();
		
	}

	
	
}
