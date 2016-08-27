package org.dhaval.java.algo.tree;

import org.dhaval.java.algo.TreeNode;

/**
 * Depth First Traversal of a tree.
 * 
 * @author dhaval
 *
 */
public class DepthFirstTraversal {
	/**
	 * In order traversal. Left->Root->Right
	 * 
	 * @param root
	 */
	public static void inOrderTraversal(TreeNode root){
		if(root.getLeft() != null){
			inOrderTraversal(root.getLeft());
		}
		
		System.out.print(" " + root.getData());
		
		if(root.getRight() != null){
			inOrderTraversal(root.getRight());
		}
	}
	
	/**
	 * Pre order traversal. Root->Left->Right
	 * 
	 * @param root
	 */
	public static void preOrderTraversal(TreeNode root){
		System.out.print(" " + root.getData());
		
		if(root.getLeft() != null){
			preOrderTraversal(root.getLeft());
		}
		
		if(root.getRight() != null){
			preOrderTraversal(root.getRight());
		}
	}
	
	/**
	 * Post order traversal. Left->Right->Root
	 * 
	 * @param root
	 */
	public static void postOrderTraversal(TreeNode root){
		if(root.getLeft() != null){
			postOrderTraversal(root.getLeft());
		}
		
		if(root.getRight() != null){
			postOrderTraversal(root.getRight());
		}
		
		System.out.print(" " + root.getData());
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
		
		System.out.print("Inorder: ");
		inOrderTraversal(root);
		System.out.println();
		
		System.out.print("Preorder: ");
		preOrderTraversal(root);
		System.out.println();
		
		System.out.print("Postorder: ");
		postOrderTraversal(root);
	}
}
