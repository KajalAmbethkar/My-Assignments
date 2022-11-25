package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FindSecondLargest {
	public static void main(String[] args){
		
		
		Set<Integer> mySet = new TreeSet<Integer>();
		boolean empty = mySet.isEmpty();
		int[] data = {3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7};
		for (int i = 0; i < data.length; i++) {
			
			boolean add = mySet.add(data[i]);
			
		
		}
		System.out.println(mySet);	
			//System.out.print(" "+data[i]);
			

	List<Integer> newList=new ArrayList<Integer>(mySet);
	int size = newList.size();
	System.out.println(size);
	int secondLargest=newList.get(newList.size()-2);
	
	
	System.out.println("The second largest number in the list is: "+secondLargest);
	
		
	}
	
		
		
	}


	



			
			
			
				
			
	
	


