package week1.day2;

public class ArmStrong {
	public static void main(String[] args)
	{
		int num=371;
		int digit=num;
		int reminder;
		int sum=0;
		
		
		while(digit>0)
		{
			reminder=digit%10;
			sum=sum+(reminder*reminder*reminder);
			digit=digit/10;
		}
		
	if(sum==num)
	
		System.out.println("The Number is an Armstrong number");
	
	else 
		System.out.println("The Number is not an Armstrong number");
	
	}
}
