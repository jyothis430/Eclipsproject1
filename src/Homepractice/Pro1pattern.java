package Homepractice;

import java.util.Scanner;

public class Pro1pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter no.of rows");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
				for(int k=0;k<=i;k++)
				{
				
				System.out.print("*");
				System.out.print(" ");
				
				}
			
			System.out.println();
		}
	}
}
