package com.queue;

/**
 * Array Implementation of Queue
 * 
 * Queue is FIFO ADT.
 * Every operation takes O(1) time complexity
 * 
 * Enqueue - operation of adding element to the rear of queue
 * Dequeue - operation of deleting element from the front of queue
 * Front - index points from where element is deleted (dequeue operation)
 * Rear - index where last element of queue resides (enqueue operation)
 * 
 * So, a list content is from index=front till index=rear
 * 
 * Disadvantage of array implementation is that after dequeue operation, the index before
 * front remains unused.
 * 
 * @author akash
 *
 */
public class ArrayQueue implements Queue{
	
	private int[] arr;
	private int rear;
	private int front;
	private int capacity;
	
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front=-1;
		rear=-1;
    }
	
	@Override
	public void enQueue(int data) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			if (front==-1) {
				front = 0;
			}
			arr[++rear] = data;
		}	
	}

	@Override
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return (Integer) null;
		}else {
			int el = arr[front];
			front++;
			return el;
		}
	}

	@Override
	public boolean isFull() {
		return rear == capacity-1;
	}

	@Override
	public boolean isEmpty() {
		return front == rear || rear == -1;
	}

	@Override
	public int size() {
		return rear-front+1;
	}

	@Override
	public void print() {
		for(int i=front; i<=rear; i++) {
			System.out.printf("%d--",arr[i]);
		}
		System.out.println();
	}

}
