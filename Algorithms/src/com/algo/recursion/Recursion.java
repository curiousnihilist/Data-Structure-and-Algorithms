package com.algo.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Recursion {
	
	public static int factorial(int num) {
		if(num<=1)
			return 1;
		else
			return num*factorial(num-1);
		
	}
	
	public static int fibonacci(int num) {
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		else
			return fibonacci(num-1)+fibonacci(num-2);
	}
	
	public static void reverseString(String str) {
		char arr[] = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
	
	public static HashMap<Character, Integer> countCharacterOccurences(String str) {
		char arr[] = str.toCharArray();
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(!count.containsKey(arr[i]))
				count.put(arr[i], 1);
			else 
				count.put(arr[i], count.get(arr[i])+1);
		}
		return count;
	}
	
	public static char getFirstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> wordCount = countCharacterOccurences(str);
		for(int i=0; i<str.length(); i++) {
			if (wordCount.get(str.charAt(i)) == 1)
					return str.charAt(i);
		}
		return (Character) null;
	}
	
	public static Set<Integer> getIntersectionofLists(int[] first, int[] second){
		Set<Integer> result = new HashSet<Integer>();
		for(int i=0; i<first.length; i++) {
			for(int j=0; j<second.length; j++) {
				if(first[i] == second[j])
					result.add(first[i]);
			}
		}
		return result;
		
	}
	
	public static int sumOfNumbers(int num) {
		if (num==1)
			return 1;
		return num + sumOfNumbers(num-1);
	}
	
	public static int powerOfNumber(int a, int b) {
		if(b==1)
			return a;
		return a * powerOfNumber(a, b-1);
	}
	
	public static int fastpow(int a, int b) {
		if(b==1)
			return a;
		if(b%2 == 0)
			return a * fastpow(a*a, b/2);
		else
			return a * fastpow(a, b-1);
	}
	
	
	public static void main(String[] args) {
		//System.out.println(factorial(5));
		//System.out.println(fibonacci(6));
		//reverseString("akash");
		//System.out.println(getFirstNonRepeatedCharacter("madam"));
		//System.out.println(getIntersectionofLists(new int[] {1,4,7,9,7,2} ,new int[] {1,7,3,4,5}));
		//System.out.println(sumOfNumbers(2));
		System.out.println(powerOfNumber(2, 10));
	}

}
