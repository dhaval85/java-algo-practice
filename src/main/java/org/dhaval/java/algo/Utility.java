package org.dhaval.java.algo;

public class Utility {
	public static void printSinglyLinkedList(LinkedListNode head){
		if(head != null){
			System.out.print(head.getData() + " ");
			if(head.getNext() != null){
				printSinglyLinkedList(head.getNext());
			}
		}
	}
}