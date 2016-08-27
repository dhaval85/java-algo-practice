package org.dhaval.java.algo.linkedlist;

import org.dhaval.java.algo.LinkedListNode;
import org.dhaval.java.algo.Utility;

/**
 * Search Middle Element From A Linked List
 * 
 * @author dhaval
 *
 */
public class SearchMiddleElement {
	
	public static void main(String args[]){
		int[] data = {10,20,30,40,50,60,70};
		
		LinkedListNode head = new LinkedListNode(data[0]);
		LinkedListNode temp = head;
		
		for(int i=1;i<data.length;i++){
			temp.setNext(new LinkedListNode(data[i]));
			temp = temp.getNext();
		}
		
		Utility.printSinglyLinkedList(head);
		
		System.out.println();
		
		System.out.println("Middle Element is : " + findMiddleElement(head));
	}
	
	/**
	 * Find the middle element from the given linked list. 
	 * 
	 * @param head
	 * @return
	 */
	public static int findMiddleElement(LinkedListNode head){
		if(head == null){
			return -1;
		}
		
		LinkedListNode singleStep = head;
		LinkedListNode doubleSteps = head.getNext();
		
		while(singleStep != null && doubleSteps != null){
			singleStep = singleStep.getNext();
			if(doubleSteps.getNext() != null){
				doubleSteps = doubleSteps.getNext().getNext();
			}else{
				doubleSteps = doubleSteps.getNext();
			}
		}
		
		return singleStep.getData();
	}
}
