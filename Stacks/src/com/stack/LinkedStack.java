package com.stack;

import java.util.LinkedList;

public class LinkedStack implements Stack{
	
	private Node top;
	
	static class Node{
		Object data;
		Node next;
		
		Node(Object data){
			this.data = data;
			this.next = null;
		}
	}
	

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void push(Object element) {
		Node currNode = top;
		Node newNode = new Node(element);
		if(isEmpty())
			this.top = newNode;
		else {
			while(currNode.next != null)
				currNode = currNode.next;
			currNode.next = newNode;
		}
	}

	@Override
	public void pop() throws StackEmptyException {
		Node prev = null;
		Node currNode = top;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			while(currNode.next != null) {
				prev = currNode;
				currNode = currNode.next;
			}
			Node temp = currNode;
			prev.next = null;
			temp = null;
		}
	}

	@Override
	public Object peek() throws StackEmptyException {
		Node currNode = top;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			while(currNode.next != null)
				currNode = currNode.next;
			return currNode.data;
		}
		return null;
	}

	@Override
	public void print() {
		Node currNode = top;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			while(currNode.next != null) {
				System.out.printf("%d ",currNode.data.toString());
				currNode = currNode.next;
			}
		}
		System.out.println();
	}

	@Override
	public int size() {
		Node currNode = top;
		int length =0;
		while(currNode!=null) {
			length++;
		}
		return length;
	}

}
