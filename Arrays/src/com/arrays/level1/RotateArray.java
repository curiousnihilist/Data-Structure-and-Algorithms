package com.arrays.level1;

import java.util.Arrays;

/**
 * Problem : Left rotate an array (Anti clockwise rotation)
 * 
 * Example arr: [1,2,3,4,5,6] d=2
 *         rotatedArray : [3,4,5,6,1,2]
 *         
 * Solution Approach:
 * 
 * First Approach: Take a temp array and copy all elements from (d) index to (n-1) index of 
 * 				   original array to temp array. Now copy elements from index 0 to d-1 after those
 *                 copied elements. The temp array is now rotated representation of original array.
 *                 Time complexity: O(n)
 *                 Space complexity: O(n)
 *                 
 * Second Approach: 1. Store first element in a variable
 * 					2. Shift 1st to last element towards left by one place.
 *                  3. Place stored first element in last index.
 *                  Time complexity: O(n*d)
 *                  Space complexity: O(1)
 *                  
 * Best Approach: 
 * 1. Juggling Algorithm 	Time complexity = O(n) Space complexity O(1)
 * 2. Reversal Algorithm    Time complexity = O(n) Space complexity O(1)
 * 
 * 
 * 
 *
 */
public class RotateArray {
	
	public static int gcd(int a, int b) {
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if(a==1 || b==1) {
			return 1;
		}
		if(a>b) {
			return gcd(a-b,a);
		}else {
			return gcd(a,b-a);
		}
	}
	
	private static int[] rotate(int[] arr, int k) {
		int n = arr.length;
		int gcd = gcd(n,k);
		
		for(int i=0; i<gcd; i++) {
			int temp= arr[i];
			int j=i,d=0;
			
			while(true) {
				d = (j+k)%n;
				if(d == i) {
					break;
				}
				arr[j]=arr[d];
				j=d;
			}
			arr[j] = temp;
		}
		return arr;
		
	}
	
	private static int[] rotateByReversal(int[] arr, int k) {
		reverse(arr,0,k-1);
		System.out.println(Arrays.toString(arr));
		reverse(arr,k,arr.length-1);
		System.out.println(Arrays.toString(arr));
		return reverse(arr,0,arr.length-1);
		
	}
	
	public static int[] reverse(int[] arr, int low, int end) {
		
		for(int i=low,j=end; i<=(low+end)/2; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(rotateByReversal(arr,3)));
		
	}

}
