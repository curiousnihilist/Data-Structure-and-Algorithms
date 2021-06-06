package com.arrays.misc;

public class Problem3 {
	
	private static int getSolution(int[] arr) {
		int l=0,h=arr.length-1;
		
		while(l<=h) {
			int m = h-(h-l)/2;
			
			if((m-1<0 && arr[m]<arr[m+1]) || (m+1==arr.length && arr[m-1]>arr[m])) {
				return arr[m];
			}
			if(arr[m-1]>arr[m] && arr[m]<arr[m+1]) {
				return arr[m];
			}
			
			if(arr[l]<arr[h]) {
				h=m-1;
			}else {
				if(arr[l]<arr[m]) {
					l=m+1;
				}else if(arr[l]>arr[m]) {
					h=m-1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{ 2, 3, 4,1};
		
		System.out.println(getSolution(arr));
	}

}
