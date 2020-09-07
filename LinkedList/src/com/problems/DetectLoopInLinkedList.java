package com.problems;

/**
 * Problem Statement
 * 
 * Detect Loop in a LinkedList
 * 
 * We are given a pointer to the first element of a linked list L. There are two
 * possibilities for L, it either ends (snake) or its last element points back to one of the earlier
 * elements in the list (snail). Give an algorithm that tests whether a given list L is a snake or
 * a snail.
 *
 *
 * Solution Approach
 * 
 * 1. Traverse through list and add the address of each node in a hashmap.
 *    Also check for the address of node in hashmap while traversing. If hashmap
 *    contains the address it means we're in a loop.
 *    
 * 2. Slow and Fast Pointer (Flyod algorithm)
 *    We can have two pointers namely slow and fast. The slow pointer moves one node
 *    at a time while the fast pointer moves two nodes. The idea is if ther's loop both
 *    the node will end up at same node at one point. Or else fast pointer will reach
 *    the end of the loop.
 * 
 */



public class DetectLoopInLinkedList {
	
	static boolean isHavingLoop(Node head) {
		Node fastPtr = head;
		Node slowPtr = head;
		while(slowPtr!=null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr == fastPtr)
				return true;
		}
		return false;
		
	}

}
