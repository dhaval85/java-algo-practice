package org.dhaval.java.algo.tree;

import org.dhaval.java.algo.TreeNode;

/**
 * Generate Binary Search Tree from a sorted array.
 * 
 * @author dhaval
 *
 */
public class BSTFromSortedArray {
	
	/**
	 * Generate BST from given array.
	 * 
	 * @param array
	 * @param start
	 * @param end
	 * @return
	 */
	public static TreeNode generateBST(int[] array, int start, int end){
		/* In case of start is greater than end return null */
		if(start > end){
			return null;
		}
		
		/* Find the middle index of the array */
		int mid = (start + end) / 2;
		
		/* Make the middle array element the root node */
		TreeNode root = new TreeNode(array[mid]);
		
		/* Recursively generate the left side tree from the first half
		 * of the array.
		 */
		root.setLeft(generateBST(array, start, mid -1));
		
		/* Recursively generate the left side tree from the second half
		 * of the array.
		 */
		root.setRight(generateBST(array, mid + 1, end));
		
		return root;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8};
		
		TreeNode root = generateBST(array, 0, array.length-1);
		
		System.out.print("PreOrder:");
		DepthFirstTraversal.preOrderTraversal(root);
	}
}
