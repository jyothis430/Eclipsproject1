package Homepractice;

import java.util.Scanner;

public class Loppprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		int r;
        while(n>0) 
        {
        	r=n%10;
        	rev=rev*10+r;
        	n=n/10;
        }
        System.out.println(rev);
        if(temp==rev)
        {
        	System.out.println("paliandrom");
        }
        else {
        	System.out.println("not paliandrom");
        }
	}

}
