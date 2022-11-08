package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int num=35;
		if(num<0)
		{
			num=num*-1;
			System.out.println("The positive number of negative number is" +num);
		}
		else
		{
			System.out.println("The given number is positive" +num);
		}
	}
}
