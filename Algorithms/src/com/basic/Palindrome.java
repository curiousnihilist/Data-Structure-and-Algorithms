package com.basic;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		char arr[] = str.toCharArray();
		int ctr=0;
		for(int i=0, j=arr.length-1; i<arr.length/2; i++,j--) {
			if(arr[i]!=arr[j]) {
				ctr=1;
				break;
			}
				
		}
		if(ctr==0)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("ABCBA"));
	}

}
