package com.linkedlist.implementations;

public class SingleyLinkedList implements LinkedList{
	private Node head;
	
	public static class Node {
		int data;
		Node next;
		Node(int data){this.data = data; next = null;}
	}
	
	public SingleyLinkedList(int data) {
		Node newNode = new Node(data);
		head = newNode;
	}

	@Override
	public int length() {
		int len=0;
		Node currNode = head;
		while(currNode!=null) {
			currNode= currNode.next;
			len++;
		}
		return len;
	}

	@Override
	public LinkedList print() {
		if(isEmpty()) {
			System.out.println("LL is Empty");
			return this;
		}
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
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
		newNode.next = head;
		head = newNode;
		return this;
	}

	@Override
	public LinkedList insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			System.out.println("LL is Empty");
			head = newNode;
			return this;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
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
		currNode.next = newNode;
		return this;
	}

	@Override
	public LinkedList deleteHead() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return this;
		}
		head = head.next;
		return this;
	}

	@Override
	public LinkedList deleteEnd() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return this;
		}
		Node currNode = head;
		while(currNode.next.next!=null) {
			currNode = currNode.next;
		}
		currNode.next = null;
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

	@Override
	public boolean isEmpty() {
		return head==null;
	}
	
	public LinkedList reverse() {
		Node prev = null;
		Node currNode = head;
		Node next = null;
		
		while(currNode!=null) {
			next = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = next;
		}
		head = prev;
		return this;
	}
	
	public LinkedList reverseRecursive() {
		reverseRecursively(head, null);
		return this;
	}
	
	private void reverseRecursively(Node currNode, Node prev) {
		if(currNode == null) {
			head = prev;
			return;
		}
		reverseRecursively(currNode.next, currNode);
		currNode.next = prev;
	}
	
	public Node getHead() {
		return head;
	}

}
