package week2.day2;

import java.util.Iterator;

public class CharOccurance {

	public static void main(String[] args) {
		String str="Learning Selenium";
		int count=0;
		char[] charArray=str.toCharArray();
		System.out.println("charArray");
		int l=charArray.length;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='l')
			{
				count=count+1;}
			
			
		}
		System.out.println(+count);
		}
		

	}


