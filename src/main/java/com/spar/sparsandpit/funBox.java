package com.spar.sparsandpit;
public class funBox {

    public static void main (String args[]) {
	
	    Box<Integer> integerBox = new Box<Integer>();
	    Box<String>  stringBox  = new Box<String>();
		
		Integer i = new Integer(100);
		String  s = "xyz" ;
		integerBox.set (i);
		stringBox.set (s) ;
		
		System.out.println ( integerBox.get().intValue() ) ;
		System.out.println ( stringBox.get() ) ;
	}	
}