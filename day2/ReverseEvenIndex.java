package week2.day2;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class ReverseEvenIndex {

	public static void main(String[] args) {
		
		String str="My house is beautiful";
		
		String[] split =str.split(" ");
		String rev=" ";
		for (int i = 0; i < split.length; i++) {
			if(i%2==1)
			{
				String s2="";
				for(int j=split[i].length()-1;j>=0;j--)
					
				{
					s2=s2+split[i].charAt(j);
				}
						
						
			System.out.println(s2);
			rev=rev+s2;
			}
			else
			{
				rev=rev+split[i]+" ";
			}
		}
		System.out.println(rev);
	}
		
		
		}

