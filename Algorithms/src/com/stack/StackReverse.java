package com.stack;

import java.util.Stack;

public class StackReverse {
	
	public static void reverse(Stack<Integer> stack) {
		if(stack.isEmpty())
			return;
		else {
			int temp = stack.pop();
			reverse(stack);
			pushAtBottom(stack,temp);
		}
			
	}
	
	
	
	private static void pushAtBottom(Stack<Integer> stack, int temp) {
		if(stack.isEmpty()) {
			stack.push(temp);
			return;
		}
		int temp1 = stack.pop();
		pushAtBottom(stack, temp);
		stack.push(temp1);
		
	}



	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int n=1;
		while(n<=10) {
			stack.push(n);
			n++;
		}
		System.out.println(stack.toString());
		System.out.println("============");
		reverse(stack);
		System.out.println(stack.toString());
		
	}

}
