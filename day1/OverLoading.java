package week3.day1;

public class OverLoading {

	public void sum(int a, int b) {
		System.out.println(a+b);

	}

	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);

	}

	public void sub(double d, double e) {
		System.out.println(d-e);

	}

	public void sub(int s, int t) {
		System.out.println(s-t);

	}

	public void div(int a, double b) {
		System.out.println(a/b);

	}

	public void div(double e, double f) {
		System.out.println(e/f);

	}

	public static void main(String[] args) {
		OverLoading load=new OverLoading();
		load.sum(2,3);
		load.sum(2,4,5);
		load.sub(34.567,20.099);
		load.sub(56, 20);
		load.div(50, 5.0);
		load.div(56.22, 2.000);
		

	}

}
