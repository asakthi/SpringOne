package com.student;

public class Student {

	
	private String name;
	private int rollno;
	private mark marks;
		
	
	public Student(String name, int rollno, mark marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}


	public void display() {
		
		System.out.println("name "+ name + "rollno " + rollno + marks);
		//marks.dis();
	}
}
