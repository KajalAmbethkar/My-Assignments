package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("The student name is kajal");
		
	}
	public void studentDept()
	{
		System.out.println("The student dept is computer");
	}
	public void studentId()
	{
		System.out.println("The student Id is 435678");
	}

	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentId();
		stu.studentName();
	}
		

	}


