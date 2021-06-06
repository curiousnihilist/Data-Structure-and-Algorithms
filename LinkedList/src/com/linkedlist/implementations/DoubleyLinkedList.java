package com.linkedlist.implementations;


public class DoubleyLinkedList implements LinkedList{
	private Node head;
	
	public static class Node {
		int data;
		Node next;
		Node prev;
		Node(int data){this.data = data; next = null; prev=null;}
	}
	
	public DoubleyLinkedList(int data) {
		head = new Node(data);
	}

	@Override
	public int length() {
		int len=0;
		Node currNode = head;
		while(currNode!=null) {
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
			System.out.println("LL is Empty");
			return this;
		}
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data+"<->");
			currNode = currNode.next;
		}
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
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		return this;
	}

	@Override
	public LinkedList insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			return this;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
		newNode.prev = currNode;
		return this;
	}

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
		newNode.prev = currNode;
		currNode.next = newNode;
		return this;
	}

	@Override
	public LinkedList deleteHead() {
		if(isEmpty()) {
			System.out.println("LL is Empty");
			return this;
		}
		head = head.next;
		head.prev = null;
		return this;
	}

	@Override
	public LinkedList deleteEnd() {
		if(isEmpty()) {
			System.out.println("LL is Empty");
			return this;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.prev.next = null;
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
		currNode.next.prev = null;
		currNode.next.next.prev = currNode;
		return this;
	}

	@Override
	public LinkedList deleteItem(int data) {
		// TODO Auto-generated method stub
		return null;
	}
}
