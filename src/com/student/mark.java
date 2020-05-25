package com.student;

public class mark {

	private int mark1;
	private int mark2;
	private int mark3;
	
	public mark() {
		// TODO Auto-generated constructor stub
	}
	public mark(int mark1, int mark2, int mark3) {
		super();
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	
		/*public void dis() {
		System.out.println("mark in dis [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + "]");
	}*/

	@Override
	public String toString() {
		return "mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + "]";
	}

	
}
