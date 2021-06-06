package com.akash.prob.search;

/**
 * Problem Statement: Given a bitonic sequence of n distinct elements, write a program to find a 
 * 					  given element x in the bitonic sequence in O(log n) time. 
 * 					  A Bitonic Sequence is a sequence of numbers that is first strictly increasing 
 * 					  then after a point strictly decreasing.
 *                     
 * Example : arr = [6,9,15,25,35,50,41,20,14,8] toFind = 15
 * 		   	 Sol = 2
 * 
 * Approach : The idea is to find the bitonic point k which is the index of the maximum
 *            element of a given sequence. If the element to be searched is greater than
 *            the maximum element return -1, else search the element in both halves.
 * 				
 * @author akash
 *
 */
public class Problem3 {
	
	public static int findBitonicPoint(int[] arr, int key) {
		int low=0,mid=0,high=arr.length-1;
		
		while(low<=high) {
			
			mid = low + (high-low)/2;
			
			if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
				if(arr[mid] == key) {
					return mid;
				}else if(key > arr[mid]) {
					return -1;
				}else {
					int searchInIncreasingPart = binarySearchAscending(arr,key,0,mid-1);
					if( searchInIncreasingPart == -1) {
						int searchInDecreasingPart = binarySearchDescending(arr,key,mid+1,arr.length-1);
						return searchInDecreasingPart;
					}
					return searchInIncreasingPart;
				}
			}
			
			if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		
		return -1;
		
	}

	private static int binarySearchDescending(int[] arr, int key, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid = low + (high-low)/2;
		
		if(arr[mid]==key) {
			return mid;
		}else if (key > arr[mid]) {
			return binarySearchDescending(arr,key,low,mid-1);
		}else {
			return binarySearchDescending(arr,key,mid+1,high);
		}
	}

	private static int binarySearchAscending(int[] arr, int key, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid = low + (high-low)/2;
		
		if(arr[mid]==key) {
			return mid;
		}else if (key < arr[mid]) {
			return binarySearchAscending(arr,key,low,mid-1);
		}else {
			return binarySearchAscending(arr,key,mid+1,high);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5, 10,9};
		
		System.out.println(findBitonicPoint(arr,9));
	}

}
