package com.stack;

public class Examples {
	
	
	public static void main(String[] args) {
		DynamicArrayStack myStack = new DynamicArrayStack();
		
		int timeExpanded=0;
		for(int i=1; i<=100; i++) {
			int before = myStack.getCapacity();
			myStack.push(i);
			int after = myStack.getCapacity();
			if(before!=after)
				timeExpanded++;
		}
		
		myStack.print();
		System.out.println(myStack.size());
		System.out.println(myStack.getCapacity());
		
		System.out.println(timeExpanded);
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		
		System.out.println("===========");
		
//		myStack.print();
//		System.out.println(myStack.size());
//		System.out.println(myStack.getCapacity());
		
		
	}

}
