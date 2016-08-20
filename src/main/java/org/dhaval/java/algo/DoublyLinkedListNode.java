package org.dhaval.java.algo;

/**
 * Represents Singly Linked List Node.
 * 
 * @author dhaval
 *
 */
public class DoublyLinkedListNode{
	private int data;
	private DoublyLinkedListNode next = null;
	private DoublyLinkedListNode previous = null;
	
	public DoublyLinkedListNode(int data){
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLinkedListNode getNext() {
		return next;
	}

	public void setNext(DoublyLinkedListNode next) {
		this.next = next;
	}

	public DoublyLinkedListNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyLinkedListNode previous) {
		this.previous = previous;
	}
}
