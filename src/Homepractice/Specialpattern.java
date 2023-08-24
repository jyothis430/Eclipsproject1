package Homepractice;

import java.util.Scanner;

public class Specialpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter no.of rows");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for (int i=0;i<=r;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for (int k=0;k<=r;k++)
		{
			for(int h=0;h<=(r-k-1);h++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
