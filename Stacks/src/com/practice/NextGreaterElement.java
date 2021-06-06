package com.practice;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	
	static int[] nextGreatertElementToRight(int[] data) {
		Stack<Integer> stck = new Stack<Integer>();
		int[] arr = new int[data.length];
		
		for(int i=arr.length-1; i>=0; i--) {
			if(stck.isEmpty()) {
				stck.push(data[i]);
				arr[i] = -1;
			}else {
				while(!stck.isEmpty() && data[i]>stck.lastElement()) {
					stck.pop();
				}
				if(stck.isEmpty()) {
					stck.push(data[i]);
					arr[i] = -1;
				}else {
					arr[i] = stck.lastElement();
					stck.push(data[i]);
				}
				
			}
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		int[] sol = nextGreatertElementToRight(new int[] {11, 13, 21, 3});
		System.out.println(Arrays.toString(sol));
	}

}
