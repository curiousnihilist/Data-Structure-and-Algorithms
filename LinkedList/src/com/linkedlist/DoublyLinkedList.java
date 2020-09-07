package com.linkedlist;

import com.linkedlist.CircularLinkedList.Node;

public class DoublyLinkedList implements LinkedList {
	
	private Node head;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	public DoublyLinkedList(int data) {
		this.head = new Node(data);
	}

	public int length() {
		int length=0;
		Node currNode = head;
		if(head == null)
			return 0;
		else {
			while(currNode!=null) {
				currNode = currNode.next;
				length++;
			}
		}
		return length;
	}

	@Override
	public LinkedList print() {
		Node currNode = head;
		while(currNode!=null) {
			System.out.printf("%d<=>",currNode.data);
			currNode = currNode.next;
		}
		System.out.println();
		return this;
	}

	@Override
	public LinkedList insertAtFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		return this;
	}

	@Override
	public LinkedList insertAtEnd(int data) {
		Node currNode = head;
		Node newNode = new Node(data);
		if(length() == 0)
			head = newNode;
		else {
			while(currNode.next!=null)
				currNode = currNode.next;
			currNode.next = newNode;
			newNode.prev = currNode;
		}
		return this;
	}

	@Override
	public LinkedList insert(int data, int pos) {
		Node currNode = head;
		Node newNode = new Node(data);
		int currPos = 0;
		if(length() == 0) {
			System.out.println("List is empty! Inserting Node at head");
			insertAtFirst(data);
		}
		else if(pos>=length()) {
			System.out.println("List is short! Inserting Node at last");
			insertAtEnd(data);
		}else {
			while(currPos < pos) {
				currNode = currNode.next;
				currPos++;
			}
			newNode.next = currNode;
			newNode.prev = currNode.prev;
			currNode.prev = newNode;
			newNode.prev.next = newNode;
		}
		return this;
	}

	@Override
	public LinkedList deleteHead() {
		Node temp = head;
		temp.next.prev =null;
		head = temp.next;
		temp =null;
		return this;
	}

	@Override
	public LinkedList deleteEnd() {
		Node currNode = head;
		if(length() == 0)
			System.out.println("List is Empty!");
		else if(length() == 1) {
			head = null;
		}else {
			while(currNode.next!=null)
				currNode  = currNode.next;
			Node temp = currNode;
			temp.prev.next = null;
			temp = null;
		}
		return this;
	}

	@Override
	public LinkedList deleteAt(int pos) {
		Node currNode = head;
		int currPos = 0;
		if(length() == 0)
			System.out.println("List is Empty!");
		if(pos > length())
			System.out.println("List is short! No such position exists");
		else {
			while(currPos < pos) {
				currNode = currNode.next;
				currPos++;
			}
			Node temp = currNode;
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			temp = null;
		}
		return this;
	}

	@Override
	public LinkedList deleteItem(int data) {
		Node currNode = head;
		if(length() == 0)
			System.out.println("List is Empty!");
		else {
			while(currNode.data !=data && currNode.next !=null)
				currNode = currNode.next;
			if(currNode.data == data) {
				Node temp = currNode;
				temp.prev.next = temp.next;
				if(temp.next != null)
					temp.next.prev = temp.prev;
				temp = null;
			}
			if( currNode.next == null && currNode.data!=data)
				System.out.println("Item Not present in the list!");
		}
		return this;
	}

	public Node returnHead() {
		return head;
	}
}
