package org.dhaval.java.algo.stack;

import java.util.Stack;

/**
 * Find minimum number from the stack with O(1) complexity.
 * 
 * @author dhaval
 *
 */
public class FindMinimumStack {
	
	/* Stack of minimum numbers. */
	private Stack<Integer> stackOfMinimums = null;
	/* Actual stack */
	private Stack<Integer> actualStack = null;
	
	public FindMinimumStack(){
		stackOfMinimums = new Stack<Integer>();
		actualStack = new Stack<Integer>();
	}
	
	/**
	 * Push value to the stack. Check if the value which is being pushed is 
	 * minimum that the last minimum value. Then push it to the stacks of minimums.
	 * As a result, we'll always have the minimum value at the top of the stack in
	 * the stack of minimums. Hence can be retrieved with O(1) complexity. 
	 * 
	 * @param value
	 */
	public void push(int value){
		if(actualStack.empty() || getMinimumValue() > value){
			stackOfMinimums.push(value);
		}
		actualStack.push(value);
	}
	
	/**
	 * If the value we are popping is equals to the minimum value in minimum stack
	 * then pop the value from the stacks of minimums as well. 
	 * 
	 * @return
	 */
	public int pop(){
		int value = actualStack.pop();
		
		if(getMinimumValue() == value){
			stackOfMinimums.pop();
		}
		return value;
	}
	
	/**
	 * Get the value from the top of the stack which is going to be minimum always. 
	 * Satisfying the O(1) complexity.
	 * 
	 * @return
	 */
	public int getMinimumValue(){
		return stackOfMinimums.peek();
	}
	
	public static void main(String[] args) {
		FindMinimumStack minStack = new FindMinimumStack();
		
		minStack.push(5);
		minStack.push(10);
		minStack.push(15);
		minStack.push(3);
		minStack.push(3);
		minStack.push(4);
		minStack.push(5);
		
		System.out.println("Minimum value : " + minStack.getMinimumValue());
		
		minStack.pop();
		minStack.pop();
		
		System.out.println("Minimum value : " + minStack.getMinimumValue());
		
		minStack.pop();
		minStack.pop();
		minStack.pop();
		
		System.out.println("Minimum value : " + minStack.getMinimumValue());
		
		minStack.push(1);
		
		System.out.println("Minimum value : " + minStack.getMinimumValue());
	}
}
