package week1.day2;

public class Fibanocii {

	public static void main(String[] args) {
		int num=0;
		int num1=1;
		System.out.println(+num);
		System.out.println(+num);	
		for(int i=0;i<=10;i++)
		{
			
			int num3=num+num1;
			num=num1;
			num1=num3;
		
		System.out.println(+num3);
		}
		}

	}
