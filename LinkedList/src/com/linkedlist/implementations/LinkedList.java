package com.linkedlist.implementations;

public interface LinkedList {
	
	public int length();
	public boolean isEmpty();
	public LinkedList print();
	public LinkedList insertAtFirst(int data);
	public LinkedList insertAtEnd(int data);
	public LinkedList insert(int data, int pos);
	public LinkedList deleteHead();
	public LinkedList deleteEnd();
	public LinkedList deleteAt(int pos);
	public LinkedList deleteItem(int data);
}
