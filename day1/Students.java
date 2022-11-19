package week3.day1;

public class Students {
	
	public void getStudentInfo(int Id)
	{
	System.out.println("the student Id is " +Id);	
	}
    public void getStudentInfo(int Id, String name) 
    {
    System.out.println("The student id is"  +Id );
    System.out.println("The student name is" +name);
    }
    public void getStudentInfo(String email,int PhoneNumber)
    {
    	System.out.println("The e-mail address is" +email);
    	System.out.println("The Phone number is" +PhoneNumber); 
    }
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(2345);
		stu.getStudentInfo(2345," Kajal");
		stu.getStudentInfo("kajalambethkar1990@gmail.com",877564);
	}

}
