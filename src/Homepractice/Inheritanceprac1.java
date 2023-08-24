package Homepractice;

class Animal
{
	public void animaldetails() 
	{
		System.out.println("animaldetails");
	}
	
}
class Dog extends Animal
{
	public void dogdetails()
	{
		System.out.println("dogdetails");
	}
	
}
class Cheetta extends Dog
{
	public void cheettadetails()
	{
		System.out.println("cheettadetails");
	}
	
}

public class Inheritanceprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetta ob=new Cheetta();
		ob.cheettadetails();
		ob.dogdetails();
		ob.animaldetails();
        
	}

}
