package com.basic;

public class LongestPalindromeInString {
	
	public static void findLongestPalindromeSubstring(String str) {
		char[] arr = str.toCharArray();
		int max = 1;
		String result = "";
		for(int i=1; i<arr.length; i++) {
			String palindrome = Character.toString(arr[i]);
			for(int j=1; i-j>=0 && i+j<arr.length; j++) {
				if(arr[i-j]==arr[i+j])
					palindrome = Character.toString(arr[i-j]) + palindrome + Character.toString(arr[i+j]);
				else
					break;
			}
			if(palindrome.length() > max) {
				max = palindrome.length();
				result = palindrome;
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		findLongestPalindromeSubstring("bbb");
		
	}

}
