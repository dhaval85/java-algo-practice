package org.dhaval.java.algo.arrays;

/**
 * In a given matrix each cell contains number of candies. 
 * You can only travel Right or Down. Find a best path where
 * you can get maximum candies if you travel to right bottom.
 * 
 * @author dhaval
 *
 */
public class MaximumCandies {
	
	/**
	 * Print the path where the maximum candies are possible to collect.
	 * 
	 * @param matrix
	 */
	public static void printPathToGetMaxCandies(int[][] matrix){
		/* Setting up initial directions to zero */
		int right=0,down=0;
		
		while(true){
			/* If the right side has the higher value move right else move down*/
			if(matrix[down][right+1] > matrix[down+1][right]){
				right++;
			}else{
				down++;
			}
			
			System.out.print(matrix[down][right] + " ");
			
			/* Break if we hit the right edge or bottom egdge of the matrix */
			if(right>= matrix[0].length -1 || down >= matrix.length -1) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{5,3,6,7,8},
				{6,9,8,9,1},
				{7,3,7,0,3},
				{6,1,2,0,8},
				{2,5,4,6,4}
		};
		
		printPathToGetMaxCandies(matrix);
	}
}
