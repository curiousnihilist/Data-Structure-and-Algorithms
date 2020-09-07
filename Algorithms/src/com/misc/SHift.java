package com.misc;

public class SHift {
	
	
	public static void main(String[] args) {
		int[] arr = new int[50];
		
		for(int i=0; i<10; i++) {
			arr[i]=i+1;
		}
		
		int num=50;
		
		for(int i=5; i<10; i++) {
			int temp = arr[i];
			arr[i] = num;
			num = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
