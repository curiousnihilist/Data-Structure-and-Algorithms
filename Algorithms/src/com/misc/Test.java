package com.misc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		Set<NameValue> countries = new HashSet<NameValue>();
		
		for(char c='Z'; c>='A'; c--) {
			if(c%2 == 0 )
				countries.add(new NameValue(Character.toString(c)+Character.toString((char) (c-1))));
			else
				countries.add(new NameValue(Character.toString(c)+Character.toString((char) (c+1))));
		}

		for(NameValue country:countries) {
			System.out.println(country.toString());
		}
		
	}
	

}
