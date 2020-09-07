package com.stack;

import java.util.Stack;

public class PostfixEvaluation {
	
	public static int evaluate(String postfix) {
		Stack<Integer> stack = new Stack<Integer>();
		int a,b=0;
		
		for(int i=0; i<postfix.length(); i++) {
			char ch = postfix.charAt(i);
			
			if(Character.isLetterOrDigit(ch))
				stack.push(Integer.parseInt(Character.toString(ch)));
			else {
				if(ch == '-') {
					b = stack.pop();
					a = stack.pop();
					stack.push(a-b);	
				}
				if(ch == '/') {
					b = stack.pop();
					a = stack.pop();
					stack.push(a/b);	
				}
				if(ch == '*') {
					b = stack.pop();
					a = stack.pop();
					stack.push(a*b);	
				}
				if(ch == '+') {
					b = stack.pop();
					a = stack.pop();
					stack.push(a+b);	
				}
			}
		}
		return stack.peek();
		
	}
	
	public static void main(String[] args) {
		System.out.println(evaluate("10 5 + 60 6 / * 8 –"));
	}

}
