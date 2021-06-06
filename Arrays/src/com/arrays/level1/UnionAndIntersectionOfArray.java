package com.arrays.level1;

/**
 * Problem : Given two sorted arrays, find their union and intersection.
 * 
 * Example :
 * Input : arr1[] = {1, 3, 4, 5, 7}			arr2[] = {2, 3, 5, 6}     
   Output : Union : {1, 2, 3, 4, 5, 6, 7} Intersection : {3, 5}
 * 
 * @author akash
 *
 */
public class UnionAndIntersectionOfArray {
	
	private static void union(int[] left, int[] right) {
		int i=0,j=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				System.out.print(left[i++]+", ");
			} else if (left[i]>right[j]) {
				System.out.print(right[j++]+", ");
			}else {
				System.out.print(right[j++]+", ");
				i++;
			}
		}
		while(i<left.length) {
			System.out.print(left[i++]+", ");
		}
		while(j<right.length) {
			System.out.print(right[j++]+", ");
		}
		System.out.println();
	}
	
	private static void intersection(int[] left, int[] right) {
		int i=0,j=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				i++;
			} else if (left[i]>right[j]) {
				j++;
			}else {
				System.out.print(right[j++]+", ");
				i++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] left = new int[] {1, 3, 4, 5, 7};
		int[] right = new int[] {2, 3, 5, 6};
		
		union(left, right);
		intersection(left, right);
	}

}
