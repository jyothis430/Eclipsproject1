package Homepractice;

import java.util.Scanner;

public class Firstarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter choice *,/,+,-,%");
		char c=sc.next().charAt(0);
		switch(c)
		{
		case '+':System.out.println(a+b);
		       break;
		case '-':System.out.println(a-b);
	       break;
		case '*':System.out.println(a*b);
	       break;
		case '/':System.out.println(a/b);
	       break;
		case '%':System.out.println(a%b);
	       break;
	       default:System.out.println("invalid choice");
	       break;
		       
		}
		
	}

}
