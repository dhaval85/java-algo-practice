package org.dhaval.java.algo.linkedlist;

import org.dhaval.java.algo.LinkedListNode;

/**
 * Merge two sorted linked lists.
 * 
 * @author dhaval
 *
 */
public class MergeTwoSortedLinkedLists {
	
	/**
	 * Recursive function to merge two sorted linked lists.
	 * 
	 * @param nodeA
	 * @param nodeB
	 * @return
	 */
	public static LinkedListNode mergeLists(LinkedListNode nodeA, LinkedListNode nodeB){
		
		/* if nodeA has no further value return nodeB else return nodeA */
		if(nodeA == null){
			return nodeB;
		}else if(nodeB == null){
			return nodeA;
		}
		
		LinkedListNode result = null;
		
		if(nodeA.getData() <= nodeB.getData()){
			result = nodeA;
			
			/* Since A already added to result list call the
			 * mergeList with next node of nodeA and nodeB as it is
			 */
			result.setNext(mergeLists(nodeA.getNext(), nodeB));
		}else{
			result = nodeB;
			
			/* Since B already added to result list call the
			 * mergeList with next node of nodeB and nodeA as it is
			 */
			result.setNext(mergeLists(nodeA, nodeB.getNext()));
		}
		return result;
	}
	
	public static void main(String[] args) {
		/* Two input sorted arrays */
		int[] inputA = {1,3,5,7,9};
		int[] inputB = {2,4,6,8,10};
		
		/* Adding first input to LinkedList A */
		LinkedListNode listA = new LinkedListNode(inputA[0]);
		LinkedListNode node = listA;
		
		for(int i=1;i<inputA.length;i++){
			node.setNext(new LinkedListNode(inputA[i]));
			node = node.getNext();
		}
		
		/* Adding second input to LinkedList B */
		LinkedListNode listB = new LinkedListNode(inputB[0]);
		node = listB;
		
		for(int i=1;i<inputB.length;i++){
			node.setNext(new LinkedListNode(inputB[i]));
			node = node.getNext();
		}
		
		LinkedListNode result = mergeLists(listA,listB);
		
		/* Printing the result list */
		while(result.getNext() != null){
			System.out.print(result.getData() + " ");
			result = result.getNext();
		}
	}
}
