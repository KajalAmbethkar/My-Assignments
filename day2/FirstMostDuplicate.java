package week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class FirstMostDuplicate {


public static void main(String[] args)
{	
	String s="abbaba";
	int occurance=0,occurance1=0;
	char value=0,value1=1;
	Map<Character,Integer> first=new LinkedHashMap<Character,Integer>();
		char[] charArray=s.toCharArray();
		for (char c : charArray) {
			first.put(c,first.getOrDefault(c, 0)+1);
			
		}
		System.out.println(first);
		Set<Entry<Character,Integer>> unique=first.entrySet();
		for (Entry<Character, Integer> entry : unique)
		{
			if(entry.getValue()>occurance)
			{
		occurance=entry.getValue();
		value=entry.getKey();
			}
			else
			{
				occurance1=entry.getValue();
				value1=entry.getKey();
				
		}	
		}
		System.out.println("The most Duplicated key is :" +value);
		}
	
}