package com.queue;

import java.util.ArrayList;

/**
 * Circular Array implementation of queue
 * 
 * @author akash
 *
 */

public class CircularQueue implements Queue{
	
	private int[] queue;
	private int rear;
	private int front;
	private int size;
	private int capacity;
	
	public CircularQueue(int capacity){
		queue = new int[capacity];
		this.capacity = capacity;
		size = 0;
		rear = -1;
		front = -1;
	}

	@Override
	public void enQueue(int data) {
		if(size == capacity) {
			System.out.println("Queue is full!");
			return;
		}else {
			if(front==-1) {
				front++;
			}
			size++;
			rear = (rear+1)%capacity;
			queue[rear] = data;
		}
		
	}

	@Override
	public int deQueue() {
		if(size==0) {
			System.out.println("Queue is Empty!");
		}
		size--;
		int temp = queue[front];
		front = (front+1)%capacity;
		return temp;
	}

	@Override
	public boolean isFull() {
		return size == capacity;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		if(size==0) {
			System.out.println("Queue is EMpty!");
			return ;
		}
		for(int i=0; i<size; i++)
			System.out.printf("%d--",queue[front+i]);
		System.out.println();
	}
	
	

}
