package org.dhaval.java.algo.heap;

/**
 * Minimum Heap simulation.
 * 
 * @author dhaval
 *
 */
public class MinHeap {
	private int[] data = null;
	private int size = 0;
	
	public MinHeap(int size){
		data = new int[size];
	}
	
	/**
	 * Get parent's index of given child's index.
	 * 
	 * @param index
	 * @return
	 */
	private int getParentIndex(int index){
		return (index -1) / 2;
	}
	
	/**
	 * Get left child's index of given parent's index.
	 * 
	 * @param index
	 * @return
	 */
	private int getLeftChildIndex(int index){
		return (2 * index) + 1;
	}
	
	/**
	 * Get right child's index of given parent's index.
	 * 
	 * @param index
	 * @return
	 */
	private int getRightChildIndex(int index){
		return (2 * index) + 2;
	}
	
	/**
	 * Shuffle the heap again by swapping value of parent and child
	 * if the child value is less than or equals parent's value.
	 * 
	 * @param index
	 */
	private void heapUp(int index){
		int parent = getParentIndex(index);
		int temp = 0;
		if(index != 0){
			/* If the parent value is greater than child's value 
			 * Then swap the values and call heapUp again by passing parent.
			 */
			if(data[parent] > data[index]){
				temp = data[parent];
				data[parent] = data[index];
				data[index] = temp;
				heapUp(parent);
			}
		}
	}
	
	/**
	 * Insert the value in heap. If the size is full then return without inserting.
	 * Else add the value at the end of the list and then call heap up.
	 * 
	 * @param value
	 */
	public void insert(int value){
		if(size > data.length){
			return;
		}
		
		data[size] = value;
		heapUp(size);
		size++;
	}
	
	/**
	 * Get the minimum value which is always top of the tree.
	 * 
	 * @return
	 */
	public int getMinimum(){
		return data[0];
	}
	
	/**
	 * Once the minimum value is removed from the heap. Re-Shuffle all elements again.
	 * 
	 * @param index
	 */
	public void heapDown(int index){
		int leftChild = getLeftChildIndex(index);
		int rightChild = getRightChildIndex(index);
		
		int minimumIndex = 0;
		
		/* If both child's indexes are out of size return without
		 * doing anything
		 */
		if(rightChild >= size && leftChild >= size){
				return;
		}else{
			/* Find out whether right child or left child has minimum value */
			if(data[leftChild] <= data[rightChild]){
				minimumIndex = leftChild;
			}else{
				minimumIndex = rightChild;
			}
		}
		
		/* Swap the current value with the minimum value and call heap up. */
		if(data[index] > data[minimumIndex]){
			int temp = data[index];
			data[index] = data[minimumIndex];
			data[minimumIndex] = temp;
			
			heapDown(minimumIndex);
		}
	}
	
	/**
	 * Remove the minimum value. Which is always the top of the array. 
	 */
	public void removeMinimum(){
		/* Assign the max value to the top and do the Re-Shuffle */
		data[0] = data[size -1];
		size --;
		if(size > 0){
			heapDown(0);
		}
	}
	
	public static void main(String[] args) {
		int[] input = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};
		
		MinHeap minHeap = new MinHeap(input.length);
		
		for(int i : input){
			minHeap.insert(i);
		}
		
		System.out.println("Minimum: " + minHeap.getMinimum());
		
		minHeap.removeMinimum();
		
		System.out.println("Minimum after removal: " + minHeap.getMinimum());
	}
}
