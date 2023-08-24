package Homepractice;

import java.util.Scanner;

public class Special3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter no.of rows");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for (int i=0;i<=r;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=(r-i);k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for (int i=0;i<=r;i++)
		{
			
			for(int j=0;j<=(r-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
