package org.dhaval.java.algo;

public class Utility {
	
	/**
	 * Print the singly linked list. 
	 * 
	 * @param head
	 */
	public static void printSinglyLinkedList(final LinkedListNode head){
		if(head != null){
			System.out.print(head.getData());
			if(head.getNext() != null){
				System.out.print(" -> ");
				printSinglyLinkedList(head.getNext());
			}
		}
	}

	/**
	 * Generate singly linked list from an integer array.
	 * @param data
	 * @return
	 */
	public static LinkedListNode generateSinglyLinkedList(final int data[]){
		final LinkedListNode rootNode = new LinkedListNode(data[0]);
		LinkedListNode temp = rootNode;
		for(int i=1;i<data.length;i++){
			temp.setNext(new LinkedListNode(data[i]));
			temp = temp.getNext();
		}
		return rootNode;
	}
}
