package com.queue;

/**
 * Queue Implementation using LinkedList
 *  
 * @author akash
 *
 */
public class LinkedQueue implements Queue{
	
	private Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public LinkedQueue() {
		head = null;
	}

	@Override
	public void enQueue(int data) {
		Node newNode = new Node(data);
		Node currNode = head;
		if(head == null)
			head = newNode;
		else {
			while(currNode.next!=null)
				currNode = currNode.next;
			currNode.next = newNode;
		}
	}

	@Override
	public int deQueue() {
		if(head == null)
			System.out.println("Queue is Empty");
		else {
			Node temp = head;
			head = head.next;
			return temp.data;
		}
		return (Integer) null;
	}

	@Override
	public int getFront() {
		return head.data;
	}

	@Override
	public boolean isEmpty() {
		return head==null;
	}

	@Override
	public int size() {
		Node currNode = head;
		int length = 0;
		while(currNode!=null) {
			currNode = currNode.next;
			length++;
		}
		return length;
	}

	@Override
	public void print() {
		if(head == null)
			System.out.println("Queue is Empty");
		else {
			Node currNode = head;
			while(currNode!=null) {
				System.out.printf("%d--",currNode.data);
				currNode = currNode.next;
			}
		}
		System.out.println();
	}

}
