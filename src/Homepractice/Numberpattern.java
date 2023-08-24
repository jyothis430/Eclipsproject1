package Homepractice;

import java.util.Scanner;

public class Numberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter no.of rows");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int k=r;
		for (int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k--;
				
			}
			System.out.println();
		}

	}

}
