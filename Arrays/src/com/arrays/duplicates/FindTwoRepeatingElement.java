package com.arrays.duplicates;

/**
 * Problem: You are given an array of n+2 elements. All elements of the array are in range 1 to n. 
 *          And all elements occur once except two numbers which occur twice. Find the two repeating 
 *          numbers. 
 *          
 * Example:	Input: arr = [4, 2, 4, 5, 2, 3, 1] 		n = 5
 *			Output:4 2
 * @author akash
 *
 */
public class FindTwoRepeatingElement {
	
	private static void getSolution(int[] arr, int n) {
		int sum=0;
		int product =1;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			product*=arr[i];
		}
		
		for(int i=1; i<=n; i++) {
			sum-=i;
			product/=i;
		}
		
		
		System.out.println(sum);
		System.out.println(product);
		
		// x+y = sum		x*y = product;
		
		double diff = Math.sqrt((sum*sum - (4*product)));
		
		System.out.println("First Number:"+ (sum+diff)/2);
		System.out.println("First Number:"+ (sum-diff)/2);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {4, 2, 4, 5, 2, 3, 1};
		
		getSolution(arr, 5);
	}

}
