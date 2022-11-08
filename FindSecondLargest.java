package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {3,2,4,11,6};
		Arrays.sort(data);
		//To sort and display the numbers
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		//for second largest number number 
		System.out.println("The second largest nember is"  +data[data.length-2]);
		

	}

}
