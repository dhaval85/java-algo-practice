package org.dhaval.java.algo.trie;

/**
 * Represent a node in Trie data structure. 
 * 
 * @author dhaval
 *
 */
public class TrieNode {
	private boolean leaf = true;
	
	/* Each children at specific index is bound with a to z alphabets */
	private TrieNode[] children = new TrieNode[26];
	
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	public TrieNode[] getChildren() {
		return children;
	}
	public void setChildren(TrieNode[] children) {
		this.children = children;
	}
}
