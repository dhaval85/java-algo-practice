package org.dhaval.java.algo.trie;

/**
 * Store the vocabulary in Trie data structure. Prevent duplicate insertion.
 * 
 * @author dhaval
 *
 */
public class TrieVocabulary {
	private TrieNode root = null;
	
	/**
	 * Insert into Trie structure.
	 * 
	 * @param value
	 */
	public void insert(String value) {
		
		/* If root is null then create a new one */
		if(root == null){
			root = new TrieNode();
			root.setLeaf(false);
		}
		
		insert(root,value.toLowerCase());
	}
	
	/**
	 * Recursive function which create tree structure to store words. 
	 * 
	 * @param root
	 * @param value
	 */
	private void insert(TrieNode root, String value) {
		/* Get the first character from the String */
		char ch = value.charAt(0);
		
		/* Generate index by subtracting ASCII value of a (97) from character
		 * This will be used to find the bucket from the list of children using index.
		 */
		int index = ch - 97;
		
		/* Check if the children is already exist at a bucket location
		 * if not then create a new one.
		 */
		if(root.getChildren()[index] == null){
			root.getChildren()[index] = new TrieNode();
		}
		
		/* If there are still characters left in the string insert them in 
		 * recursive fashion.
		 */
		if(value.length() > 1){
			/* Since there are more childrens setting the current node as it is not leaf */
			root.getChildren()[index].setLeaf(false);
			
			/* Recursive call with children node as a root and 
			 * value after removing the first character which already processed.
			 */
			insert(root.getChildren()[index], value.substring(1));
		}
	}
	
	/**
	 * Print all vocabulary available in Trie structure.
	 */
	public void printAllVocabularies(){
		printAllVocabularies(root, "");
	}
	
	/**
	 * Print all vocabulary available in Trie structure.
	 * Value is a string which will get appended with respective
	 * character as we search deeper through the tree.
	 * 
	 * @param root
	 * @param value
	 */
	private void printAllVocabularies(TrieNode root, String value){
		/* If the root is leaf that means this is a complete word.
		 * so print it and return.
		 */
		if(root.isLeaf()){
			System.out.println(value);
		}else{
			/* If not leaf then check for available children */
			for(int i=0;i<root.getChildren().length;i++){
				/* If children is not null that means there are further
				 * characters stored in the tree 
				 */
				if(root.getChildren()[i] != null){
					/* Call recursively with appending the character to the string 
					 * by finding it using current index of children
					 */
					printAllVocabularies(root.getChildren()[i], value + (char)(i + 97));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TrieVocabulary vocabs = new TrieVocabulary();
		
		vocabs.insert("David");
		vocabs.insert("Doorman");
		vocabs.insert("Doomsday");
		vocabs.insert("Voodoo");
		vocabs.insert("Virusl");
		vocabs.insert("David");
		vocabs.insert("Voodoo");
		vocabs.insert("Dhaval");
		
		vocabs.printAllVocabularies();
	}
}
