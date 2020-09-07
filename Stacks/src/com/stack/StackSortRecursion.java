package com.stack;

import java.util.Stack;

/**
 * Algo
 * Hypothesis-Base-Induction (Recursion)
 * 
 * Hypothesis - sort(stack) will give a sorted stack
 * 				sort(stack.pop) will give a sorted stack.pop
 * 
 * Base - When stack.size() == 1, stack is sorted already so return
 * 
 * Induction - Sort stack while placing the popped element in right place
 * 
 * 
 * HBI for insert method
 * 
 * Hypothesis - insert(stack,element) will give stack with correctly placed element inside stack
 * 				insert(stack.pop,element) will give stack with correctly placed element inside stack.pop
 * 
 * Base - when stack.size == 0 or top element of stack is less than temp, push the element and return
 * 
 * Induction - else pop when stack.peek < temp
 * @author akash
 *
 */
public class StackSortRecursion {

	public static void sort(Stack<Integer> stack) {
		if(stack.size() == 1)
			return;
		int temp = stack.pop();
		sort(stack);
		insert(stack,temp);
	}

	private static void insert(Stack<Integer> stack, int temp) {
		if(stack.isEmpty() || stack.peek() >= temp) {
			stack.push(temp);
			return;
		}
		int num = stack.pop();
		insert(stack,temp);
		stack.push(num);
	}
	
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(5);
		myStack.push(2);
		myStack.push(6);
		myStack.push(1);
		myStack.push(4);
		
		//insert(myStack,0);
		sort(myStack);
		
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}
