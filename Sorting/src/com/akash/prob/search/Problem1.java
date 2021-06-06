package com.akash.prob.search;

import java.util.Arrays;

/**
 * Problem Statement : Find total number of occurrence of number in a sorted array.
 * Example : arr: [2,3,5,5,5,7,9]
 * 			 target: 5;
 * 			 solution = 3
 * 
 * Procedure : First we can find first and last occurrence (index) of the given number
 * 			   using binary search.
 * 			   no. of occurrence = last-first+1
 * 
 * @author akash
 *
 */
public class Problem1 {

	public static int searchFirst(int[] arr, int key){
        int low=0, high = arr.length-1, mid = 0;
        int result = -1;
        if(arr.length==0 || (arr.length==1 && arr[0]!=key)){
            return -1;
        }
		while(low <= high) {
			mid = low + (high-low)/2;
			
			if( arr[mid] == key) {
				result = mid;
                high = mid-1;
			}else if( key < arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		return result;
    
    }
    
    public static int searchLast(int[] arr, int key){
        int low=0, high = arr.length-1, mid = 0;
        int result = -1;
        if(arr.length==0 || (arr.length==1 && arr[0]!=key)){
            return -1;
        }
		while(low <= high) {
			mid = low + (high-low)/2;
			
			if( arr[mid] == key) {
				result = mid;
                low = mid+1;
			}else if( key < arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		return result;
    
    }

    public static void main(String[] args) {
    	int[] nums = new int[] {2,3,5,5,5,7,9};
    	int target = 5;
        int first = searchFirst(nums,target);
        int last = searchLast(nums,target);
        
        int occurrence = last - first + 1;
        
        if(first == -1 && last ==-1) {
        	System.out.println(0);   
        }else {
        	System.out.println(occurrence);   
        }

    }
}
