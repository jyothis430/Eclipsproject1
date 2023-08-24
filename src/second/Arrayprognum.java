package second;

import java.util.Scanner;

public class Arrayprognum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[] a=new int[size];
		int i,countp=0,countn=0,countz=0;
		System.out.println("enter numbers");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();		
			if(a[i]>0) 
			{
			   countp++;
			}
			else if(a[i]<0)
			{
				countn++;
			}
			else {
				countz++;
			}
		}
		
		System.out.println("count of positive numbers : "+countp);
		System.out.println("count of negative numbers : "+countn);
		System.out.println("count of zeros : "+countz);
		}
	}

	


