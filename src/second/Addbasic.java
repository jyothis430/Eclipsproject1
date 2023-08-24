package second;

import java.util.Scanner;

public class Addbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int c;
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();		
		c=a+b;
		System.err.println("sum = "+c);
	}

}
