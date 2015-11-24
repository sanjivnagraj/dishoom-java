package com.spar.sparsandpit;
@CommentHeader (
   author = "Sanjiv Nagraj",
   date = "05/11/2015",
   currentRevision = 2,
   lastModified = "05/11/2004",
   lastModifiedBy = "Sanjiv",
   // Note array notation
   reviewers = {"Sonka", "Dinflow", "Kwash"}
)

public class OmniFun {

    public static void main (String args[]) {
	
	    OmniHolder<String>  omniString = new OmniHolder<String>() ;
		
	    omniString.addOmni("Rohit");
		omniString.addOmni("Sanjiv");
		omniString.addOmni("Ananya");
		omniString.addOmni("Sanjiv");
		omniString.addOmni("Spikey");
		//
		omniString.printOmniList() ;
		
	    OmniHolder<Integer>  omniInt = new OmniHolder<Integer>() ;
		
	    omniInt.addOmni(1);
		omniInt.addOmni(2);
		omniInt.addOmni(3);
		omniInt.addOmni(4);
		omniInt.addOmni(5);
		//
		omniInt.printOmniList() ;
		
		//Exploring Wildcards
		OmniHolder<Character>  omniChar = new OmniHolder<Character>() ;
		omniChar.addOmni(new Character('a'));
		omniChar.addOmni(new Character('b'));
		omniChar.addOmni(new Character('c'));
		omniChar.addOmni(new Character('d'));
		omniChar.printOmniList() ;
	}	
}