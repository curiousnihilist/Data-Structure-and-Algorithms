package com.linkedlist.implementations;

import com.linkedlist.implementations.SingleyLinkedList.Node;

public class CircLinkedList implements LinkedList{
	private Node head;
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){this.data = data; next=this;}
	}
	
	public CircLinkedList(int data) {
		head = new Node(data);
	}
	
	@Override
	public int length() {
		if(isEmpty()) {
			System.out.println("LL is empty");
			return 0;
		}
		int len=1;
		Node currNode = head;
		while(!currNode.next.equals(head)) {
			currNode = currNode.next;
			len++;
		}
		return len;
	}

	@Override
	public boolean isEmpty() {
		return head==null;
	}

	@Override
	public LinkedList print() {
		if(isEmpty()) {
			System.out.println("LL is empty");
			return this;
		}
		Node currNode = head;
		do {
			System.out.print(currNode.data+"->");
			currNode = currNode.next;
		}while(!currNode.next.equals(head));
		System.out.print(currNode.data);
		System.out.println();
		return this;
	}

	@Override
	public LinkedList insertAtFirst(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			return this;
		}
		Node currNode = head;
		while(!currNode.next.equals(head)) {
			currNode = currNode.next;
		}
		newNode.next = head;
		currNode.next = newNode;
		head = newNode;
		return this;
	}

	@Override
	public LinkedList insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			System.out.println("LL is empty");
			return this;
		}
		Node currNode = head;
		while(!currNode.next.equals(head)) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
		newNode.next = head;
		return this;
	}

	// pos is 
	@Override
	public LinkedList insert(int data, int pos) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			System.out.println("LL is Empty");
			return this;
		}
		Node currNode = head;
		for(int i=0; i<pos-1; i++) {
			currNode = currNode.next;
			if(currNode.next==null) {
				System.out.println("LL is shorter than position mentioned");
				return this;
			}
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		return this;
	}

	@Override
	public LinkedList deleteHead() {
		if(isEmpty()) {
			System.out.println("LL is empty!");
			return this;
		}
		Node currNode = head;
		while(!currNode.next.equals(head)) {
			currNode = currNode.next;
		}
		head = head.next;
		currNode.next = head;
		return this;
	}

	@Override
	public LinkedList deleteEnd() {
		if(isEmpty()) {
			System.out.println("LL is empty");
			return this;
		}
		Node currNode = head;
		while(!currNode.next.next.equals(head)) {
			currNode = currNode.next;
		}
		currNode.next = head;
		return this;
	}

	@Override
	public LinkedList deleteAt(int pos) {
		if(isEmpty()) {
			System.out.println("List is empty");
			return this;
		}
		Node currNode = head;
		for(int i=0; i<pos-1; i++) {
			currNode = currNode.next;
			if(currNode.next==null) {
				System.out.println("LL is shorter than pos mentioned");
				return this;
			}
		}
		currNode.next = currNode.next.next;
		return this;
	}

	@Override
	public LinkedList deleteItem(int data) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
