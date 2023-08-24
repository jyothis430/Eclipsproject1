package Homepractice;

import java.util.Scanner;

public class Stringarr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");	
		int row =sc.nextInt();
		int col =sc.nextInt();
        String[][] a=new String [row][col];
        System.out.println("enter username and password");
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
            {
        	a[i][j]=sc.next();
            }
        }
        System.out.println("username"+" "+"password");
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
            {
        	 System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
