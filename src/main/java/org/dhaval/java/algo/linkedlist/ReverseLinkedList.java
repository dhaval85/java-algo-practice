package org.dhaval.java.algo.linkedlist;

import org.dhaval.java.algo.LinkedListNode;
import org.dhaval.java.algo.Utility;

/**
 * Reverse a given linked list.
 * 1->2->3->4->5 should change it to 5->4->3->2->1
 */
public class ReverseLinkedList {

  public static void main(String[] args) {
    final int[] data = {1, 2, 3, 4, 5, 6, 7};

    final LinkedListNode rootNode = Utility.generateSinglyLinkedList(data);

    Utility.printSinglyLinkedList(rootNode);
    final LinkedListNode reversedHead = reverse(rootNode);
    System.out.println();
    Utility.printSinglyLinkedList(reversedHead);
  }

  public static LinkedListNode reverse(final LinkedListNode node) {
    LinkedListNode current = node;
    LinkedListNode previous = null;
    LinkedListNode next = null;
    while (current != null) {
      next = current.getNext();
      current.setNext(previous);
      previous = current;
      current = next;
    }
    return previous;
  }
}
