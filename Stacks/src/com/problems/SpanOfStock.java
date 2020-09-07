package com.problems;

import java.util.Arrays;
import java.util.Stack;

public class SpanOfStock {
	
	static int[] span(int[] arr) {
		int[] indexArr = new int[arr.length];
		int[] sol = new int[arr.length];
		Stack<NameValue> stack = new Stack<NameValue>();
		
		for(int i=0; i<arr.length; i++) {
			if(!stack.isEmpty() && stack.peek().getElement()>arr[i]) {
				indexArr[i]=stack.peek().getIndex();
				stack.push(new NameValue(arr[i],i));
			}
			else if(!stack.isEmpty() && stack.peek().getElement()<=arr[i]) {
				while(!stack.isEmpty() && stack.peek().getElement()<=arr[i])
					stack.pop();
				if(!stack.isEmpty()) 
					indexArr[i]=stack.peek().getIndex();
				else
					indexArr[i]=-1;
				stack.push(new NameValue(arr[i],i));
			}
			else {
				indexArr[i]=-1;
				stack.push(new NameValue(arr[i],i));
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			sol[i]=i-indexArr[i];
		}
		return sol;
		
	}
	
	
	public static void main(String[] args) {
		int[] span = span(new int[] {100,80,60,70,60,75,85});
		System.out.println(Arrays.toString(span));
	}

}
