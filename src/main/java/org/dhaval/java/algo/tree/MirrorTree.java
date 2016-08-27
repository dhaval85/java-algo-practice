package org.dhaval.java.algo.tree;

import org.dhaval.java.algo.TreeNode;

/**
 * Mirror the binary tree.
 * 
 * @author dhaval
 *
 */
public class MirrorTree {
	
	/**
	 * Mirror a binary tree.
	 * 
	 * @param root
	 */
	public static void mirrorTree(TreeNode root){
		if(root == null){
			return;
		}
		
		/* if left is not null then recursively mirror the left */
		if(root.getLeft() != null){
			mirrorTree(root.getLeft());
		}
		
		/* if left is not null then recursively mirror the right */
		if(root.getRight() != null){
			mirrorTree(root.getRight());
		}
		
		/* swap the data value of the right and left nodes */
		if(root.getLeft() != null && root.getRight() != null){
			int temp = root.getLeft().getData();
			root.getLeft().setData(root.getRight().getData());
			root.getRight().setData(temp);
		}
	}
	
	public static void main(String[] args) {
		/*
		 *					1
		 *			2				3
		 *		4		5		6		7
		 */
		
		/* Generating an input tree */
		TreeNode root = new TreeNode(1);
		
		root.setLeft(new TreeNode(2));
		root.setRight(new TreeNode(3));
		root.getLeft().setLeft(new TreeNode(4));
		root.getLeft().setRight(new TreeNode(5));
		root.getRight().setLeft(new TreeNode(6));
		root.getRight().setRight(new TreeNode(7));
		
		System.out.print("Order: ");
		LevelOrderTraversal.levelOrderTraversal(root);
		System.out.println();
		
		mirrorTree(root);
		
		System.out.print("Mirrored Order: ");
		LevelOrderTraversal.levelOrderTraversal(root);
		System.out.println();
	}
}
