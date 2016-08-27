package org.dhaval.java.algo.tree;

import java.util.ArrayDeque;
import java.util.Deque;

import org.dhaval.java.algo.TreeNode;

/**
 * Level order traversal (Breadth First Traversal) of a tree
 * 
 * @author dhaval
 *
 */
public class LevelOrderTraversal {
	
	public static void main(String[] args) {
		/*
		 *					1
		 *			2				3
		 *		4		5		
		 */
		
		/* Generating an input tree */
		TreeNode root = new TreeNode(1);
		
		root.setLeft(new TreeNode(2));
		root.setRight(new TreeNode(3));
		root.getLeft().setLeft(new TreeNode(4));
		root.getLeft().setRight(new TreeNode(5));
		
		levelOrderTraversal(root);
	}
	
	/**
	 * Recursive function to print the tree in BFS fashion.
	 * 
	 * @param queue
	 */
	public static void levelOrderTraversal(TreeNode root){
		Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
		queue.add(root);
		levelOrderTraversal(queue);
	}

	/**
	 * Recursive function to print the tree in BFS fashion.
	 * 
	 * @param queue
	 */
	public static void levelOrderTraversal(Deque<TreeNode> queue){
		/* Return if the queue is empty. There are no more nodes to process */
		if(queue.isEmpty()) {
			return;
		}
		
		/* Get the first node from the queue to process and print it */
		TreeNode node = queue.pop();
		
		System.out.print(" " + node.getData());
		
		/* if there is a left node then add it to the queue */
		if(node.getLeft() != null){
			queue.add(node.getLeft());
		}
		
		/* if there is a right node then add it to the queue */
		if(node.getRight() != null){
			queue.add(node.getRight());
		}
		
		/* call the function recursively */
		levelOrderTraversal(queue);
	}
}
