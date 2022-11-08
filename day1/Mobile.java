package week1.day1;

public class Mobile {
	String mobileBrandName="Jupiter";
	char mobileLogo='$';
	short noOfMobilePiece=8000;
	int modelNumber=380987;
	long mobilemeiNumber=34567890l;
	float mobilePrice=9000.45f;
	boolean isDamaged=false;

	public static void main(String[] args) {
		Mobile mo=new Mobile();
		System.out.println(mo.mobileBrandName);
		System.out.println(mo.mobileLogo);
		System.out.println(mo.noOfMobilePiece);
		System.out.println(mo.modelNumber);
		System.out.println(mo.mobilemeiNumber);
		System.out.println(mo.mobilePrice);
		System.out.println(mo.isDamaged);
	}

}
