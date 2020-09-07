package com.linkedlist;

import com.linkedlist.CircularLinkedList.Node;

public class SinglyLinkedList implements LinkedList{
	
	private Node head;
	private int length ;
	
	public SinglyLinkedList(int d) {
		head = new Node(d);
		length = length();
	}
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public int length() {
		Node currNode = head;
		int length = 0;
		if (currNode == null)
			return 0;
		else {
			while(currNode != null) {
				currNode = currNode.next;
				length++;
			}
		}
		return length;
	}
	
	// ************************ TRAVERSAL *************************
		// printing all elements
		public LinkedList print() {
			if(length() == 0)
				System.out.println("List is Empty!");
			else {
				Node currNode = head;
				while(currNode != null) {
					System.out.printf("%d-> ",currNode.data);
					currNode = currNode.next;
				}
			}
			System.out.println();
			return this;
		}
	
	// ************************* INSERTION *************************
	// case 1
	// Adding element in the beginning 
	public SinglyLinkedList insertAtFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return this;
	}

	//case 2
	// Adding element in the specified position
	public SinglyLinkedList insert(int data, int pos) {
		int currPos=0;
		Node newNode = new Node(data);
		if(length() == 0)
			System.out.println("LinkedList is empty!");
		else if(pos > length() || pos==length()) {
			System.out.println("List is shorter than you thought!");
			System.out.println("Inseritng element at last");
			return insertAtEnd(data);
		}
		else {
			Node currNode = head;
			while(currPos != pos-1) {
				currNode = currNode.next;
				currPos++;
			}
			Node temp = currNode.next;
			currNode.next = newNode;
			newNode.next = temp;
		}
		return this;
	}
	
	// case 3
	// Adding element at the end
	public SinglyLinkedList insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(length() == 0)
			head = newNode;
		else {
			Node currNode = head;
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
		return this;
	}
	
	// *********************** DELETION ****************************
	// Case 1
	// Deletion from beginning
	public SinglyLinkedList deleteHead() {
		if(length() == 0)
			System.out.println("List is empty");
		else {
			Node temp = head;
			head = temp.next;
			temp=null;
		}
		return this;
	}
	
	// case 2
	// Deletion from End
	public SinglyLinkedList deleteEnd() {
		if(length() == 0)
			System.out.println("List is empty!");
		else {
			Node currNode = head;
			while((currNode.next).next !=null) {
				currNode = currNode.next;
			}
			Node temp = currNode.next;
			currNode.next = null;
			temp = null;
		}
		return this;
	}
	
	// case 3
	// Deletion at specified position
	public SinglyLinkedList deleteAt(int pos) {
		int currPos=0;
		if(length() == 0)
			System.out.println("List is empty!");
		else if(pos > length())
			System.out.println("Element at that position is not present");
		else {
			Node currNode = head;
			while(currPos != pos-1) {
				currNode = currNode.next;
				currPos++;
			}
			Node temp = currNode.next;
			currNode.next = temp.next;
			temp = null;
		}
		return this;
	}
	
	// Deletion of first occurence of data
	public SinglyLinkedList deleteItem(int data) {
		Node prev = null;
		Node currNode = head;
		if(length() == 0)
			System.out.println("List is Empty");
		else if( head.data == data)
			return deleteHead();
		else {
			while(currNode.data != data && currNode.next != null) {
				prev = currNode;
				currNode = currNode.next;
			}
			if(currNode.data == data) {
				Node temp = currNode;
				prev.next = temp.next;
				temp = null;
			}
			if( currNode.next == null && currNode.data!=data)
				System.out.println("Item Not present in the list!");
		}
		return this;
	}
	
	public LinkedList reverse() {
		Node currNode = head;
		Node prev = null;
		while(currNode!=null) {
			prev = currNode;
			currNode = currNode.next;
			if(prev!=null && prev!=head) {
				prev.next = head;
			}else {
				prev.next = null;
			}
			head = prev;
		}
		return this;
	}
	
	// Reverse by recursion
	public void reverseByRecursion() {
		Node currNode = head;
		if(head.next!=null) {
			int temp = head.data;
			head = head.next;
			reverseByRecursion();
			insertAtEnd(temp);
		}else {
			return;
		}
	}
	
	public int nthNodeFromEnd(int n) {
		Node pNthNode = null;
		Node pTemp = head;
		for(int i=1; i<n; i++)
			pTemp = pTemp.next;
		while(pTemp!=null) {
			if(pNthNode == null)
				pNthNode = head;
			else
				pNthNode = pNthNode.next;
			pTemp = pTemp.next;
			
		//System.out.println(pNthNode.data + " " + pTemp.data);
		}
		return pNthNode.data;
	}
	
	public int middleElement() {
		Node slowPtr = head;
		Node fastPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null ) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
	return slowPtr.data;
	}
	
}
