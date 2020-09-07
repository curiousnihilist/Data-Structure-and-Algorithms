package com.stack;

public class BalancedSymbol {
	
	public static boolean isBalanced(String str) {
		Stack myStack = new FixedArrayStack(30);
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
				myStack.push(str.charAt(i));
			
			if(str.charAt(i) == ')') {
				if(!myStack.isEmpty() && (char)myStack.peek() == '(')
					myStack.pop();
				else
					return false;
			}
			
			if(str.charAt(i) == '}') {
				if(!myStack.isEmpty() && (char)myStack.peek() == '{') 
					myStack.pop();
				else
					return false;
			}
			
			if(str.charAt(i) == ']') {
				if(!myStack.isEmpty() && (char)myStack.peek() == '[')
					myStack.pop();
				else
					return false;
			}
		}
		if(myStack.isEmpty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		String stringOfSymbols = "({}[({()[]}{})])";
		System.out.println(isBalanced(stringOfSymbols));
		
	}

}
