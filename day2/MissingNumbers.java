package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {
	 int[] num= {2,5,8,1,3,6,9,10,7};

	 List<Integer> list = new ArrayList<Integer>();
	 for (Integer integer : num) {
		list.add(integer);
	}
	 Collections.sort(list);
	 for (int i = 0; i <list.size()-1; i++) {
		if (list.get(i)+1!=list.get(i+1)) {
			System.out.println(list.get(i)+1);
		}
	}
	
	 //1+2+3+5+6+7+8+9+10=51
	 //1+2+3+4+5+6+7+8+9+10=55
	 //55-51=4.
	 //this is the logic
	 
//	Set<Integer> uniqueSet=new TreeSet<Integer>();
//	
//	for (int i = 0; i < num.length; i++) {
//		
//		uniqueSet.add(num[i]);
//	
//	System.out.println(uniqueSet);
//		sum=sum + num[i];
//		
//	}
//	System.out.println(sum);
//	
//	int sum1=0;
//	
//	for(int i=0;i<=10;i++) {
//		sum1=sum1+i;
//		
//	}
//	
//	System.out.println(sum1);
//	System.out.println("Missing Number is::::" +(sum1-sum));
//	
//	Set<Integer> sort=new TreeSet<Integer>(uniqueSet);
//	System.out.println("The sorted List" +sort);
	 
	 
	} 
	
	
	
	

	}
	

	 

	

