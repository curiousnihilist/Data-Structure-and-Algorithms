package com.basic;

public class RemoveCharacterFromString {
	
	public static void remove(String str, char toRemove) {
		while(str.indexOf(toRemove) != -1) {
			int index = str.indexOf(toRemove);
			str = str.substring(0, index) + str.substring(index+1, str.length());
		}
		System.out.println(str);
	}
	
	
	
	public static void main(String[] args) {
		remove("anlaknslkndlksandlksandasl",'a');
	}

}
