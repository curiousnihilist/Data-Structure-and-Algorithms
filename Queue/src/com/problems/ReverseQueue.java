package com.problems;

import com.queue.LinkedQueue;
import com.queue.Queue;

public class ReverseQueue {
	
	static void reverse(Queue q) {
		if(q.size() == 1)
			return;
		int temp = q.deQueue();
		reverse(q);
		q.enQueue(temp);
			
	}
	
	public static void main(String[] args) {
		Queue queue = new LinkedQueue();
		
		for(int i=1; i<=10; i++) {
			queue.enQueue(i);
		}
		
		queue.print();
		System.out.println(queue.size());
		
		reverse(queue);
		queue.print();
	}

}
