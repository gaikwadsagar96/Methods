/* Write a program to create a class Student and do the following:
 *   Create a method to input data (rollNo, Name, contactNo, Total marks) 
 *   Create another method to display the data of Student class. 
 *   Create object of Student class and access these methods main method of a new class – StudentDemo.java. */
package com.hefshine.cw;

import java.util.Scanner;

public class Q1_Student {
	int rollNo,contactNo,Total_marks;
	String name;

	public static void main(String[] args) 
	{
		Q1_Student s=new Q1_Student();
		s.inputedata();
		s.displadata();

	}

	private void displadata() 
	{
		System.out.println("Name:"+name+"\nRoll Number: "+rollNo+"\nContact number:"+contactNo+"\nTotal Marks: "+Total_marks);
	}

	private void inputedata() 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no,contact number, total marks,name");
		rollNo=sc.nextInt();
		contactNo=sc.nextInt();
		Total_marks=sc.nextInt();
		name=sc.next();
	}

}
