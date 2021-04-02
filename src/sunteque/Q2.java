package sunteque;

import java.util.Arrays;

public class Q2
{
	public static int[] comparatorValue(int [] a, int [] b , int d)
	{
		int res [] =new int [a.length*b.length];
		int ind =0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++)
			{
				 res[ind]=(a[i]-b[j]);
				ind++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
	//	int [] a = {3,1,5};int [] b ={5,6,7};
		int [] a = {7,5,9};int [] b ={13,1,4};
		int d=2;
		
	int t[]=	Q2.comparatorValue(a, b, d);
	int temp [] = new int [t.length];
	int ind1=0;
	for (int i = 0; i < t.length; i++) 
	{
		if(t[i]<0)
			 temp[ind1++]=-(t[i]);
		else
			temp[ind1++]=t[i];
	}
	System.out.println(Arrays.toString(temp));
		
		}
}
