package second;

import java.util.Scanner;

public class Promethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Promethod ob=new Promethod();	
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		ob.add();
		ob.sub(a, b);

	}
	public void add()
	{
		int a=0,b=0;
		int c=a+b;
		System.out.println("sum is "+c);
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return(c);
	}
}
