package com.problems;

import java.util.Arrays;
import java.util.Stack;

/**
 * Problem Statement : 
 * Given an array, print the Next Greater Element (NGE) for every element. 
 * The Next greater Element for an element x is the first greater element on the right side of x in array.
 * Elements for which no greater element exist, consider next greater element as -1.
 * 
 * Example: arr[] : [13,7,6,12]
 * 			sol[] : [-1,12,12,-1]
 * 
 * Algorithm
 * 1. Traverse the input array from backwards (from n->0)
 * 2. Keep a stack and check if the current element is greater than the element in top element in stack.
 * 3. If the stack is empty return -1 and push that current element.
 * 4. If the top element of stack is greater than current element return it and push the current element in stack.
 * 5. If the top element of stack is less than the current element, pop it and pop until the top element of current stack 
 * 	  becomes greater than the current element. Check step 3 also. Push the current element in stack.
 * 6. Note- Insert all the returned values in an array. The solution will be reverse of the array.
 * 
 * From this  you can solve
 * 1. Next Greater Element (left side) : just traverse array forward
 * 2. Next Least Element (right side) : change the comparison condition
 * 3. Next Least Element (left side) : traverse array forward and change the comparison condition
 * @author akash
 *
 */
public class NextLargestElement {
	
	static int[] nextGreatestElement(int[] arr) {
		int[] sol = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=arr.length-1; i>=0; i--) {
			if(!stack.isEmpty() && stack.peek()>arr[i]) {
				sol[i]=stack.peek();
				stack.push(arr[i]);
			}
			else if(!stack.isEmpty() && stack.peek()<=arr[i]) {
				while(!stack.isEmpty() && stack.peek()<=arr[i])
					stack.pop();
				if(!stack.isEmpty()) 
					sol[i]=stack.peek();
				else
					sol[i]=-1;
				stack.push(arr[i]);
			}
			else {
				sol[i]=-1;
				stack.push(arr[i]);
			}
		}
		
		return sol;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(nextGreatestElement(new int[] {11, 13, 21, 3})));
	}

}
