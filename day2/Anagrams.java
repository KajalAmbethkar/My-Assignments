package week2.day2;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1="Race";
	    String s2="Care";
	    s1=s1.toLowerCase();
	    s2=s2.toLowerCase();
	    
	    //check if the length is same
	    if(s1.length()==s2.length())
	    {
	    	//Convert string to array
	    	char[] charArray1=s1.toCharArray();
	    	char[] charArray2=s2.toCharArray();
	    	
	    	//To sort the array
	    	Arrays.sort(charArray1);
	    	Arrays.sort(charArray2);
	    	
	    	//if the string are same then they are anagram
	    	boolean anagram = Arrays.equals(charArray1, charArray2);
	    	if(anagram) {
	    		
	    	
	    	System.out.println("s1 and s2 are anagram:"  +anagram);}
	    	
	    	else {
	    	System.out.println("s1 and s2 are  not anagram:" +anagram  );
	    	}
	    }
	    

	}

}
