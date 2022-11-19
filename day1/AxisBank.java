package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
	System.out.println("The deposit is 20000000000000");	
	}
	

	public static void main(String[] args) {
		
		AxisBank axis=new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();

	}

}
