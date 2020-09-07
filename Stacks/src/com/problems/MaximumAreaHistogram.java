package com.problems;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaHistogram {
	
	static int maxRectangularArea(int[] arr) {
		Stack<NameValue> leftStack = new Stack<NameValue>();
		int[] leftIndex = new int[arr.length];
		int[] rightIndex = new int[arr.length];
		Stack<NameValue> rightStack = new Stack<NameValue>();
		int maxArea = 0;
		
		// Find the index for next smaller number to the left
		for(int i=0; i<arr.length; i++) {
			if(!leftStack.isEmpty() && leftStack.peek().getElement()<arr[i]) {
				leftIndex[i] = leftStack.peek().getIndex();
				leftStack.push(new NameValue(arr[i],i));
			}else if(!leftStack.isEmpty() && leftStack.peek().getElement()>=arr[i]) {
				while(!leftStack.isEmpty() && leftStack.peek().getElement()>=arr[i])
					leftStack.pop();
				if(!leftStack.isEmpty())
					leftIndex[i] = leftStack.peek().getIndex();
				else
					leftIndex[i] = -1;
				leftStack.push(new NameValue(arr[i],i));
			}else {
				leftIndex[i]=-1;
				leftStack.push(new NameValue(arr[i],i));
			}
		}
		
		// Find the index for next smaller number to the right
		for(int i=arr.length-1; i>=0; i--) {
			if(!rightStack.isEmpty() && rightStack.peek().getElement()<arr[i]) {
				rightIndex[i] = rightStack.peek().getIndex();
				rightStack.push(new NameValue(arr[i],i));
			}else if(!rightStack.isEmpty() && rightStack.peek().getElement()>=arr[i]) {
				while(!rightStack.isEmpty() && rightStack.peek().getElement()>=arr[i])
					rightStack.pop();
				if(!rightStack.isEmpty())
					rightIndex[i] = rightStack.peek().getIndex();
				else
					rightIndex[i] = arr.length;
				rightStack.push(new NameValue(arr[i],i));
			}else {
				rightIndex[i]=arr.length;
				rightStack.push(new NameValue(arr[i],i));
			}
		}
		
		//System.out.println(Arrays.toString(leftIndex));
		//System.out.println(Arrays.toString(rightIndex));
		
		for(int i=0;i<arr.length;i++) {
			// ares = (right index - left index - 1) * input;
			int area = (rightIndex[i]-leftIndex[i]-1)*arr[i];
			if(area >= maxArea) 
				maxArea = area;
		}
		
		return maxArea;
	}
	
	
	public static void main(String[] args) {
		int[] input = new int[1000];
		
		for(int i=999; i>=0; i--) {
			input[i] = i;
		}
		
		
		long startTime = System.nanoTime();
		System.out.println(maxRectangularArea(input));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime/1000000);
		
	}

}
