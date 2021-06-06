package com.linkedlist.implementations;

public class Testing {
	
	public static void main(String[] args) {
//		SingleyLinkedList linkedList = new SingleyLinkedList(0);
//		DoubleyLinkedList dLinkedList = new DoubleyLinkedList(0);
		CircLinkedList cLinkedList = new CircLinkedList(0);
		
		cLinkedList.print();
		
		for(int i=1; i<=10;i++) {
			if(i%2 == 0) {
				cLinkedList.insertAtFirst(i);
			}
			else {
				cLinkedList.insertAtEnd(i);
			}
		}
		
		System.out.println(cLinkedList.length());
		cLinkedList.print();
		cLinkedList.insert(1111, 1).print();
		cLinkedList.deleteHead().print();
		cLinkedList.deleteEnd().print();
		cLinkedList.deleteAt(4).print();
//		
//		System.out.println(cLinkedList.length());
//		
//		linkedList.deleteHead();
//		linkedList.print();
//		
		
//		linkedList.deleteEnd();
//		linkedList.print();
//		
//		
//		linkedList.deleteAt(1);
//		linkedList.print();
//		
//		linkedList.deleteItem(13);
//		linkedList.print();
	}

}
