package org.dhaval.java.pattern;

import java.io.ObjectStreamException;

/**
 * Represents singleton pattern class. 
 * 
 * @author dhaval
 *
 */

/* Marking it as a final so that it cannot be extended. */
public final class Singleton {
	
	/* A private constructor to prevent instantiation of the class from outside. */
	private Singleton(){}
	
	/* Marking the instance variable volatile. So that only fully initialized
	 * value can be seen by any thread.
	 */
	private static volatile Singleton instance = null;
	
	public static Singleton getInstance(){
		/*
		 * Single check to prevent unnecessary synchronization
		 * when instance is already initialized.
		 */
		if(instance == null){
			/*
			 * Synchronization to prevent two threads to initialize the class
			 * at the same time.
			 */
			synchronized(Singleton.class){
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	/*
	 * Implementing readResolve method to prevent deserialization of object. 
	 * In that case returning the same singleton object present in the memory.
	 */
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
