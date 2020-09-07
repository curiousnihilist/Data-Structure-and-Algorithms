package com.problems;

import com.linkedlist.*;

/**
 * Problem Statement
 * 
 * Reverse a singly linkedlist without recusrsion
 * 
 * Approach
 * 
 * @author akash
 *
 */
public class ReverseLinkedList {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList(0);
		
		for(int i=1; i<=9; i++) {
			list.insertAtEnd(i);
		}
		
		list.print();
		
		list.reverse();
		
		list.print();
		
		System.out.println("==========");
		list.reverseByRecursion();
		
		list.print();
		
		System.out.println(list.nthNodeFromEnd(2));
		
		System.out.println(list.middleElement());
//		
//		SinglyLinkedList.Node head = list.returnHead();
//		SinglyLinkedList.Node currNode = head;
//		
//		while(currNode!=null) {
			
		
		
		
	}

}
