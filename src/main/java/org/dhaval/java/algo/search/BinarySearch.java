package org.dhaval.java.algo.search;

/**
 * Simulate binary search.
 * Assumption that the input array is sorted.
 * 
 * @author dhaval
 *
 */
public class BinarySearch {
	
	/**
	 * Do the binary search by dividing array into half and searching
	 * left part if the element is less than the mid element otherwise 
	 * search right side. Return -1 if no element found.
	 *  
	 * @param array
	 * @param left
	 * @param right
	 * @param element
	 * @return
	 */
	public static int binarySearch(int[] array, int left, int right, int element){
		/* if out of boundaries then return -1 */
		if(right > left){
			
			/* Find the middle index of the array */
			int midIndex = left + ((right - left) / 2);
			
			/* if that's the element then return index */
			if(array[midIndex] == element){
				return midIndex;
			}
			
			if(element > array[midIndex]){
				/* if element is greater than mid element then search in second 
				 * half of the array.
				 */
				return binarySearch(array, midIndex + 1, right, element);
			}else{
				/* if element is greater than mid element then search in first 
				 * half of the array.
				 */
				return binarySearch(array, left, midIndex -1, element);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Index of 8 is : " + binarySearch(input, 0, input.length -1 , 8));
	}
}
