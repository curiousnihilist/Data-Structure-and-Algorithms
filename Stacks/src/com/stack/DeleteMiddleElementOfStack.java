package com.stack;

import java.util.Stack;

public class DeleteMiddleElementOfStack {
	
	
	public static void deleteFromStack(Stack<Integer> stack, int middleIndex) {
		if(stack.size() == middleIndex) {
			stack.pop();
			return;
		}
		int temp = stack.pop();
		deleteFromStack(stack, middleIndex);
		stack.push(temp);
					
	}
	
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(5);
		myStack.push(2);
		myStack.push(6);
		myStack.push(1);
		myStack.push(4);
		myStack.push(0);
		
		System.out.println(myStack.toString());
		System.out.println("============");
		deleteFromStack(myStack, myStack.size()/2 + 1);
		System.out.println(myStack.toString());
	}

}

