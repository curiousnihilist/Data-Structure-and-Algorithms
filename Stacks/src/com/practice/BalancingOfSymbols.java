package com.practice;

import java.util.Stack;

public class BalancingOfSymbols {
	
	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch== '(' || ch== '[' || ch== '{') {
				stack.push(ch);
				continue;
			}
			if(!stack.isEmpty()) {
				if(ch == '}' && stack.peek() == '{') {
					stack.pop();
					continue;
				}
				else if(ch == ']' && stack.peek() == '[') {
					stack.pop();
					continue;
				}
				else if(ch == ')' && stack.peek() == '(') {
					stack.pop();
					continue;
				}
				else
					return false;
			}
			else
				return false;
		}
		
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		String str = "{{[[(())]]}}";
		System.out.println(isValid(str));
	}

}
