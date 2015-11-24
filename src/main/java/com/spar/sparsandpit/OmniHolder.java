/**
 * Generic version of the Omni Holder class.
 * @param <T> the type of the value being boxed
 */
package com.spar.sparsandpit;
import java.util.*;
public class OmniHolder<T> {
    // T stands for "Type"
   
    private T t ;
	//Include an ArrayList over here to store multiple entries
	private ArrayList<T> myOmniList = new ArrayList<T>() ;

	
	public void addOmni ( T t) {
	    myOmniList.add(t) ;
	}
	
	
	public T getOmni ( int i) {
	    return myOmniList.get(i) ;
	}
	
	
	
	public void printOmniList () {
	for(T c : myOmniList)
        System.out.println(c.toString());
	}
    
		
}