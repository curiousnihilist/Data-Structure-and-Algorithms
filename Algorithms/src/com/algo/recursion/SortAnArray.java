package com.algo.recursion;

public class SortAnArray {

	static int[] result = new int[] {5,4,3,2,1};
		
	static void reverse(int[] arr) {
		if(arr.length == 1)
			return;
		else {
			int num = arr[arr.length-1];
			int[] newArr = new int[arr.length-1];
			System.arraycopy(arr, 0, newArr, 0, arr.length-1);
			arr = newArr;
			reverse(arr);
			swap(arr,num);
		}
	}
	
	private static void swap(int[] arr, int num) {
		if(arr.length==0 || arr[arr.length-1]<=num) {
			int[] newArr = new int[arr.length+1];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			arr = newArr;
			arr[arr.length-1]=num;
			return;
		}else {
			int temp = arr[arr.length-1];
			int[] newArr = new int[arr.length-1];
			System.arraycopy(arr, 0, newArr, 0, arr.length-1);
			arr = newArr;
			swap(arr,temp);
			
		}
		
	}

	public static void main(String[] args) {
		reverse(result);
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
