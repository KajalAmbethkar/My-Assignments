package week3.day2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		String s="google";
		char[] charArray=s.toCharArray();
		Set<Character> unique = new HashSet<Character>();
		for(int i=0;i<charArray.length;i++)
		{
			unique.add(charArray[i]);
			
		}
		
System.out.println(unique);}

	

}
