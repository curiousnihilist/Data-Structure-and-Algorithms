package com.linkedlist;

public class Testing {
	
	public static void main(String[] args) {
//		SinglyLinkedList linkedList = new SinglyLinkedList(0);
//		DoublyLinkedList dLinkedList = new DoublyLinkedList(0);
		CircularLinkedList cLinkedList = new CircularLinkedList(0);
		
		
		for(int i=1; i<=10;i++) {
			if(i%2 == 0)
				cLinkedList.insertAtFirst(i);
			else
				cLinkedList.insertAtEnd(i);
		}
		
		System.out.println(cLinkedList.length());
		cLinkedList.print();
		cLinkedList.insert(1111, 5).print();
		cLinkedList.deleteHead().print();
		cLinkedList.deleteEnd().print();
		cLinkedList.deleteAt(4).print();
		cLinkedList.deleteItem(22).print();
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
