package com.queue;

public class Testing {
	
	public static void main(String[] args) {
		//Queue myQueue = new ArrayQueue(10);
		//Queue myQueue = new LinkedQueue();
		Queue myQueue = new CircularQueue(10);
		for(int i=1; i<=10; i++) {
			myQueue.enQueue(i);
		}
		
		System.out.println("=====");
		
		myQueue.print();
		System.out.println(myQueue.size());
		myQueue.deQueue();
		myQueue.deQueue();
		myQueue.deQueue();
		myQueue.deQueue();
		myQueue.deQueue();
		System.out.println("============");
		myQueue.print();
		System.out.println(myQueue.size());

	}

}
