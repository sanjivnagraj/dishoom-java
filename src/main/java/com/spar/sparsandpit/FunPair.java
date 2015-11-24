package com.spar.sparsandpit;
public class FunPair{

    public static void main (String args[]) {
	
	    MyOrderedPair<String, Integer> mixinSIPair = new MyOrderedPair<String,Integer>("Sanjiv", 200);
	    MyOrderedPair<Integer, String> mixinISPair = new MyOrderedPair<Integer,String>(300, "Ananya");
	
		System.out.println ( mixinSIPair.getKey() ) ;
		System.out.println ( mixinSIPair.getValue() ) ;
		//
		System.out.println ( mixinISPair.getKey() ) ;
		System.out.println ( mixinISPair.getValue() ) ;
		
	}	
}