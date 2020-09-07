package com.queue;

import java.util.ArrayList;

/**
 * Circular Implementation of list
 * 
 * @author akash
 *
 */
public class CircularQueue1 implements Queue{
	
	private ArrayList<Integer> queue;
	private int rear;
	private int front;
	private int size;
	private int capacity;
	
	public CircularQueue1(int capacity) {
		queue = new ArrayList<Integer>();
		this.capacity = capacity;
		front=0;
		rear=0;
		size=0;
	}

	@Override
	public void enQueue(int data) {
		
	}

	@Override
	public int deQueue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFront() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
