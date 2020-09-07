package com.queue;

/**
 * Array Implementation of Queue
 * @author akash
 *
 */
public class ArrayQueue implements Queue{
	
	private int[] arr;
	private int rear;
	private int capacity;
	
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		rear = 0;
    }
	
	@Override
	public void enQueue(int data) {
		if(rear == capacity)
			System.out.println("Queue is full");
		else 
			arr[rear++] = data;
	}

	@Override
	public int deQueue() {
		int temp = arr[0];
		if(rear<0)
			System.out.println("Queue is Empty");
		else {
			for(int i=0; i<rear; i++)
				arr[i] = arr[i+1];
			rear--;
		}
		return temp;
	}

	@Override
	public int getFront() {
		return arr[0];
	}

	@Override
	public boolean isEmpty() {
		return rear<0;
	}

	@Override
	public int size() {
		return rear;
	}

	@Override
	public void print() {
		for(int i=0; i<rear; i++) {
			System.out.printf("%d--",arr[i]);
		}
		System.out.println();
	}

}
