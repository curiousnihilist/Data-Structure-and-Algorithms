package com.akash.searching;

public class BinarySearch {
	
	
	public static int searchByRecursion(int[]arr, int key, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid = low + (high-low)/2; // Since (l+h)/2 can overflow from integer range if n is high
		
		if(arr[mid] == key) {
			return mid;
		}else if(arr[mid]>key) {
			return searchByRecursion(arr,key,low,mid-1);
		}else {
			return searchByRecursion(arr,key,mid+1,high);
		}
	}
	
	public static int searchByIteration(int[]arr, int key) {
		int low=0, high = arr.length-1, mid = 0;
		
		while(low <= high) {
			mid = low + (high-low)/2;
			
			if( arr[mid] == key) {
				return mid;
			}else if( key < arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,4,5,6,7,8,9};
		
		System.out.println(searchByRecursion(arr,3,0,arr.length-1));
		System.out.println(searchByIteration(arr,3));
	}

}
