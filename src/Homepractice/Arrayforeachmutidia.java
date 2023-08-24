package Homepractice;

import java.util.Scanner;

public class Arrayforeachmutidia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		System.out.println("enter numbers");	
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
            {
        	a[i][j]=sc.nextInt();
            }
        }
        System.out.println("entered values");
        for(int[] ref:a)
        {
        	for(int v:ref)
        	{
        		System.out.print(v+" ");
        	}
        	System.out.println();
        }

	}

}
