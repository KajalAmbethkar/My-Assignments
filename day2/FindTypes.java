package week2.day2;

public class FindTypes {

	void datatype(int var) {
		System.out.println("Integer type");
	}

	void datatype(String var) {
		System.out.println("String type");
	}

	void datatype(float var) {
		System.out.println("float type");
	}

	void datatypde(double var) {
		System.out.println("double type");
	}

	public static void main(String[] args) {
	String str="abc";
	int i=12;
	float f=12.4f;
	FindTypes ft=new FindTypes();
	ft.datatype(i);
	ft.datatype(f);
	ft.datatype(str);
	}

	}

