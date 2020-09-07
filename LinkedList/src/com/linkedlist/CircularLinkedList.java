package com.linkedlist;

public class CircularLinkedList implements LinkedList{
	private Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = this;
		}
	}
	
	public CircularLinkedList(int data) {
		Node newNode = new Node(data);
		head = newNode;
		newNode.next = head;
	}

	@Override
	public int length() {
		Node currNode = head;
		int length = 1;
		if(head == null)
			return 0;
		while(!currNode.next.equals(head)) {
			currNode = currNode.next;
			length++;
		}
		return length;
	}

	@Override
	public LinkedList print() {
		Node currNode = head;
		if(length() == 0)
			System.out.println("List is Empty");
		else {
			while(!currNode.next.equals(head)) {
				System.out.printf("%d->",currNode.data);
				currNode = currNode.next;
			}
		}
		System.out.print(currNode.data);
		System.out.println();
		return this;
	}

	@Override
	public LinkedList insertAtFirst(int data) {
		Node currNode = head;
		Node newNode = new Node(data);
		if(length() == 0)
			newNode = head;
		else{
			while(!currNode.next.equals(head))
				currNode = currNode.next;
			currNode.next = newNode;
			newNode.next = head;
			head = newNode;
		}
		return this;
	}

	@Override
	public LinkedList insertAtEnd(int data) {
		Node currNode = head;
		Node newNode = new Node(data);
		if(length() == 0)
			newNode = head;
		else {
			while(!currNode.next.equals(head))
				currNode = currNode.next;
			currNode.next = newNode;
			newNode.next = head;
		}
		return this;
	}

	@Override
	public LinkedList insert(int data, int pos) {
		Node currNode = head;
		int currPos = 0;
		Node newNode = new Node(data);
		if(length() == 0)
			newNode = head;
		else if( pos >= length())
			insertAtEnd(data);
		else {
			while(currPos < pos-1) {
				currNode = currNode.next;
				currPos++;
			}
			newNode.next = currNode.next ;
			currNode.next = newNode; 
		}
		return this;
	}

	@Override
	public LinkedList deleteHead() {
		Node currNode = head;
		if(length() == 0)
			System.out.println("List is Empty");
		else if(length() == 1)
			head = null;
		else {
			while(!currNode.next.equals(head))
				currNode = currNode.next;
			Node temp = head;
			currNode.next = temp.next;
			head = temp.next;
			temp = null;
		}
		return this;
	}

	@Override
	public LinkedList deleteEnd() {
		Node currNode = head;
		Node prev = new Node(0);
		if(length() == 0)
			System.out.println("List is Empty");
		else if(length() == 1)
			head = null;
		else {
			while(!currNode.next.equals(head)) {
				prev = currNode;
				currNode = currNode.next;
			}
			Node temp = currNode;
			prev.next = currNode.next;
			temp = null;
		}
		return this;
	}

	@Override
	public LinkedList deleteAt(int pos) {
		Node currNode = head;
		int currPos = 0;
		if(length() == 0)
			System.out.println("List is Empty");
		else if(pos > length() )
			System.out.println("List is short!");
		else if (pos == 0)
			deleteHead();
		else if( pos == length())
			deleteEnd();
		else {
			while(currPos < pos-1) {
				currNode = currNode.next;
				currPos++;
			}
			Node temp = currNode.next;
			currNode.next = temp.next;
			temp = null;
		}
		return this;
	}

	@Override
	public LinkedList deleteItem(int data) {
		Node currNode = head;
		Node prev = new Node(0);
		if (head.data == data)
			deleteHead();
		if(length() == 0)
			System.out.println("List is Empty");
		else {
			while(currNode.data != data && !currNode.next.equals(head)) {
				prev = currNode;
				currNode = currNode.next;
			}
			if(currNode.data == data && currNode.next.equals(head)) {
				Node temp = currNode;
				prev.next = currNode.next;
				temp = null;
				return this;
			}
			else if(currNode.data == data) {
				Node temp = currNode.next;
				currNode.next = temp.next;
				temp = null;
				return this;
			}else {
				System.out.println("Element is not present in the list!");
			}
		}
		return this;
	}

	public Node returnHead() {
		return head;
	}
}
