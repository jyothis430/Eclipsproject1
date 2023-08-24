package Homepractice;

import java.util.Scanner;

public class Arraypractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of rows and columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		System.out.println("enter values");
		
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("values entered");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	}


