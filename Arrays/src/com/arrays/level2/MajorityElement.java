package com.arrays.level2;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem: Write a function which takes an array and prints the majority element (if it exists), 
 *          otherwise prints “No Majority Element”. A majority element in an array A[] of size n is 
 *          an element that appears more than n/2 times (and hence there is at most one such element).
 *          
 * Example: Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}	Output : 4
			Input : {3, 3, 4, 2, 4, 4, 2, 4}	Output : No Majority Element
			
	Boyre-Moore Voting Algorithm : https://gregable.com/2013/10/majority-vote-algorithm-find-majority.html
 * @author akash
 *
 */
public class MajorityElement {
	
	//brute force			Time: O(n2)		Space:O(1)
	private static int majorityElementBruteForce(int[] arr, int n) {
		
		for(int i=0;i<n; i++) {
			int count=0;
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				if(count>n/2) {
					return arr[i];
				}
			}
		}
		
		System.out.println("No Majority Element");
		return Integer.MIN_VALUE;
	}
	
	//sort array			Time: O(nlogn)	Space:O(1)
	private static int majorityElementSorting(int[] arr, int n) {
		Arrays.sort(arr);
		int count=1;
		for(int i=1; i<n; i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}else {
				count=1;
			}
			if(count>n/2) {
				return arr[i];
			}
		}
		System.out.println("No Majority Element");
		return Integer.MIN_VALUE;
	}
	
	//HashMap   Time:O(n) space: O(n)
	private static int majorityElementHashing(int[] arr, int n) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<n; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		for(Integer el: map.keySet()) {
			if(map.get(el)>n/2) {
				return el;
			}
		}
		System.out.println("No Majority Element");
		return Integer.MIN_VALUE;
	}
	
	// Boyre-Moore Voting Algorithm
	private static int getMajorityElement(int[] arr, int n) {
		int candidate=0;
		int count=0;
		
		for(int i=0; i<n; i++) {
			if(count==0) {
				candidate=arr[i];
			}
			if(arr[i] == candidate) {
				count++;
			}else {
				count--;
			}
		}
		
		count=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==candidate) {
				count++;
			}
			if(count>n/2) {
				return arr[i];
			}
		}
		System.out.println("No Majority Element");
		return Integer.MIN_VALUE;
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {4,2,5,4,4,5,3,4,4};
		int[] arr2 = new int[] {4,3,3,2,4,3};
		
		System.out.println(majorityElementBruteForce(arr1, arr1.length));
		System.out.println(majorityElementBruteForce(arr2, arr2.length));
	}

}
