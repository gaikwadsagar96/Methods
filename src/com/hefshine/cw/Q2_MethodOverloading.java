/* Write a program to show method overloading by performing following steps: 
 * Create a class to print the area of a square, a rectangle and a triangle.
 *  The class has3 methods with the same name but different number of parameters. 
 *  The method for printing area of rectangle has two parameters which are length and breadth respectively, 
 *  for printing the area of triangle method has 3 parameters and while the other method for printing area of square has one parameter which is side
 *   of square*/

package com.hefshine.cw;

public class Q2_MethodOverloading 
{

	public static void main(String[] args) 
	{
		Q2_MethodOverloading mo=new Q2_MethodOverloading();
		mo.area(12,19);
		mo.area(12,13,14);
		mo.area(12);

	}

	private void area(int i) 
	{
		System.out.println("area ofCircle:"+(3.14*i*i));
	}

	private void area(int i, int j, int k)
	{
		System.out.println("area of Triangle:"+(i*j*k));	
	}

	private void area(int i, int j) 
	{
		System.out.println("Area of rectangle:"+((i*j)/2));
	}

}
