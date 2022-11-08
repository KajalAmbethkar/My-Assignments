package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator ca=new Calculator();
		int output=ca.add(20, 30, 40);
		int output1=ca.sub(40, 20);
		double output2 =ca.mul(40.45, 20.87);
		float output3 =ca.divide(30.278f, 6f);
		
		System.out.println(output);
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
	
	}

}
