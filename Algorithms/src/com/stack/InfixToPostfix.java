package com.stack;

import java.io.ObjectInputStream.GetField;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Pseudo Code
 * 1. Initialize an empty stack.
 * 2. Scan infix expression from left to right
 * 3. if scanned character is operand print it.
 * 4. if scanned character is operator
 * 		i. if precedence of scanned character is greater than last element in stack, push
 * 		ii. if precedence of scanned character is lower or equal to the last element in stack, pop all elements
 * 			in the stack whose precedence is higher than the scanned element ( If you encounter '(' stop there) and
 * 			finally push the scanned operator.
 * 5. if scanned character is '(', push it.
 * 6. if scanned character is ')', pop all the elements from stack until '(' and discard both brackets.
 *
 * @author Akash
 *
 */
public class InfixToPostfix {
	
	public InfixToPostfix() {}

	private static int precedence(char ch) {
		
		switch(ch) {
		case '+' : return 1;
		case '-' : return 1;
		case '*' : return 2;
		case '/' : return 2;
		case '^' : return 3;
		}
		
		return -1;
	}
	
	public String convertToPostfix(String infix) {
		Stack<Character> stack = new Stack<Character>();
		String result = new String("");
		
		for(int i=0; i<infix.length(); i++) {
			char ch = infix.charAt(i);
			if(Character.isLetterOrDigit(ch))
				result+=ch;
			else if( ch == '(')
				stack.push(ch);
			else if ( ch == ')') {
				
				while(!stack.isEmpty() && stack.peek() != '(') {
					result+=stack.pop();
				}
				stack.pop();
				
			}else {
				
				while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
					result+=stack.pop();
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty())
			result+=stack.pop();
		return result;
	}
	
	public static void main(String[] args) {
		InfixToPostfix inf2pof = new InfixToPostfix();
		System.out.println(inf2pof.convertToPostfix("((a+b-c)*d^e^f)/g"));
	}

}
