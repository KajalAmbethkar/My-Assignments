package week1.day2;

public class MissingElementInAnArray {
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,6};
		//1+2+3+4+6=16 sum
		//1+2+3+4+5+6=21 sum1
		//sum1-sum=21-16=5
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
	System.out.println("Sum of elements in the array:" +sum);
	
	int sum1=0;
	//Last number is 6 so check condition till 6
	for(int i=1;i<=6;i++)
	{
		
		sum1=sum1+i;
	}
		System.out.println("Sum of actual elements:" +sum1);
		System.out.println("Missing Number in the array is:" +(sum1-sum));
	}
	
}

