package org.dhaval.java.algo.linkedlist;

import org.dhaval.java.algo.LinkedListNode;
import org.dhaval.java.algo.Utility;

/**
 * Swap the linked list pair wise.
 * 
 * E.g 1->2->3->4->5 should become 2->1->4->3->5
 * 
 * @author dhaval
 *
 */
public class SwapLinkedListPairWise {
	
	public static void main(String args[]){
		/* Defining the data for the input */
		int[] data = {1,2,3,4,5};
		
		/* Creating the LinkedList out of the data array */
		LinkedListNode head = new LinkedListNode(data[0]);
		LinkedListNode temp = head;
		
		for(int i=1;i<data.length;i++){
			temp.setNext(new LinkedListNode(data[i]));
			temp = temp.getNext();
		}
		
		Utility.printSinglyLinkedList(head);
		
		System.out.println();
		
		/* Swapping the pairs */
		swapThePairs(head);
		
		Utility.printSinglyLinkedList(head);
	}
	
	public static void swapThePairs(LinkedListNode head){
		/* Return if no head defined */
		if(head == null){
			return;
		}
		
		LinkedListNode temp = head;
		int tempData = 0;
		
		while(temp != null && temp.getNext() != null){
			/* Swaping the node data */
			tempData = temp.getData();
			temp.setData(temp.getNext().getData());
			temp.getNext().setData(tempData);
			
			/* Jumping two steps */
			temp = temp.getNext().getNext();
		}
	}
}
