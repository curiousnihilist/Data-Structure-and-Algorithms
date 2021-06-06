package com.problems;

import com.linkedlist.*;
import com.linkedlist.implementations.SingleyLinkedList;

/**
 * Problem : Reverse a singly linkedlist
 * 
 * Approach:
 * 1. take three variables prev=null, currNode=head, next = null;
 * 
 * @author akash
 *
 */
public class ReverseLinkedList {
	
	
	public static void main(String[] args) {
		SingleyLinkedList list = new SingleyLinkedList(1);
		
		for(int i=2; i<=10; i++) {
			list.insertAtEnd(i);
		}
		
		list.print();
		
		// recursion using iterative approach
		list.reverse().print();
		
		//recursion using 
		list.reverseRecursive().print();
		
		
	}

}
