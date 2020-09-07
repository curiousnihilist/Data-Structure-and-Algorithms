package com.practice;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	
	static int[] nextGreatertElementToRight(int[] data) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] solution = new int[data.length];
		
		for(int i=data.length-1; i>=0; i--) {
			if(stack.isEmpty()) {
				stack.push(data[i]);
				solution[i] = -1;
			}else { 
				if(data[i]<stack.peek()) {
					solution[i] = stack.peek();
					stack.push(data[i]);
				}
				else{
					while(!stack.isEmpty() && data[i]>=stack.peek())
						stack.pop();
					if(stack.isEmpty())
						solution[i]=-1;
					else
						solution[i]=stack.peek();
					stack.push(data[i]);
				}
			}
		}
		
		return solution;
	}
	
	public static void main(String[] args) {
		int[] sol = nextGreatertElementToRight(new int[] {5,4,6,7,9,8,10});
		System.out.println(Arrays.toString(sol));
	}

}
