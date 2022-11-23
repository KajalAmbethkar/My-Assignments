package week2.day2;

public class PalindromeJava {

	public static void main(String[] args)
	{
		String original="radar";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);//"+e" +"s"=es....
			System.out.println("The reserved is \n" +reverse);
			
		}
		
	if(original.equals(reverse))
	{
	System.out.println("The word is a palindrome");
	}
	else
	{
		System.out.println("The word is not a palindrome");
	}
	}}