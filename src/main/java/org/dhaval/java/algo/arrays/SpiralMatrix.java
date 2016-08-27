package org.dhaval.java.algo.arrays;

/**
 * Print the matrix in spiral form.
 * 
 * @author dhaval
 *
 */
public class SpiralMatrix {
	
	/**
	 * Print the matrix in spiral form.
	 * 
	 * @param matrix
	 */
	public static void printMatrixInSpiral(int[][] matrix){
		/* Initialize directions */
		
		/* Starting from top left so they are zero */
		int top = 0, left = 0; 
		
		/* Bottom is the number of rows */
		int bottom = matrix.length -1;
		
		/* Right is the number of columns in a row */
		int right = matrix[0].length -1;
		
		/* We don't know number of spiral we gonna have */
		while(true) {
			
			/* Print the top row in a spiral */
			for(int i=left;i<=right;i++){
				System.out.print(matrix[top][i] + " ");
			}
			
			top++;
			
			/* Breaking condition if we don't have any more spirals */
			if(top>bottom || left > right) break;
			
			/* Printing the right most column in a spiral */
			for(int i=top;i<=bottom;i++){
				System.out.print(matrix[i][right] + " ");
			}
			right--;
			
			/* Breaking condition if we don't have any more spirals */
			if(top>bottom || left > right) break;
			
			/* Printing the bottom row in a spiral */
			for(int i=right;i>=left;i--){
				System.out.print(matrix[bottom][i] + " ");
			}
			bottom--;
			
			/* Breaking condition if we don't have any more spirals */
			if(top>bottom || left > right) break;
			
			/* Printing the first column in a spiral */
			for(int i=bottom;i>=top;i--){
				System.out.print(matrix[i][left] + " ");
			}
			left++;
			
			/* Breaking condition if we don't have any more spirals */
			if(top>bottom || left > right) break;
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{5,3,6,7,8},
				{6,3,8,9,1},
				{7,3,7,0,3},
				{6,1,2,0,8},
				{2,5,4,6,4}
		};
		
		printMatrixInSpiral(matrix);
	}
}
