package org.dhaval.java.algo;

/**
 * Represents a Node in the tree/graph. 
 * 
 * @author dhaval
 *
 */
public class TreeNode {
	private int data;
	private TreeNode left = null;
	private TreeNode right = null;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
}
