package second;

import java.util.Scanner;

public class Dowhilepro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.println("enter 2 numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("sum is "+c);
			System.out.println("do you want to continue : y/n");
		    ch=sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		

	}

}
