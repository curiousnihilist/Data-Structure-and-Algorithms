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
		rear = 0;
		front = 0;
	}

	@Override
	public void enQueue(int data) {
		if(size == capacity) {
			System.out.println("Queue is full!");
			return;
		}
		size++;
		queue[rear] = data;
		rear = (rear+1)%capacity;
	}

	@Override
	public int deQueue() {
		if(size==0) {
			System.out.println("Queue is Empty!");
		}
		size--;
		int temp = queue[front];
		queue[front]= Integer.MIN_VALUE;
		front = (front+1)%capacity;
		return temp;
	}

	@Override
	public int getFront() {
		return queue[front];
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
