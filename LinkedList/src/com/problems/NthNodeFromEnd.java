package com.problems;

import com.linkedlist.LinkedList;
import com.linkedlist.SinglyLinkedList;

/**
 * Find the nth node from the end of the linkedlist
 * 
 * Possible solutions
 * 
 * 1. Traverse throught the list and maintain a hash map of node's index.
 * 	  After traversing through whole list return "length-n+1"th key of the map.
 *    Time Complexity - O(length)
 *    Space Complexity - O(length)
 *    
 * 2. Traverse through the list to know the length i.e M (assume). Now scan the
 *    list again and return the M-n+1 node.
 *    Time Complexity - O(n)+O(m-n+1) ~= O(n)
 *    Space Complexity - o(1)
 *    
 * 3. (Efficient) (one scan)
 * 	  Maintain two pointers namely pNthNode and pTemp. Move pNthNode only when pTemp
 *    has moved n nodes. In the beginning they both point to head. At any point of time
 *    both move one node at a time.
 *
 */

public class NthNodeFromEnd {
	
	static int nthNodeFromEnd(Node head, int n) {
		Node pNthNode = null;
		Node pTemp = head;
		for(int i=1; i<=n; i++)
			pTemp = pTemp.next;
		
		while(pTemp!=null) {
			if(pNthNode == null)
				pNthNode = head;
			else
				pNthNode = pNthNode.next;
			pTemp = pTemp.next;
		}
		return pNthNode.data;
	}
	
	public static void main(String[] args) {
		
	}
	
	

}
