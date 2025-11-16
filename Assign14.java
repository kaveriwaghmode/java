package MyFirstPackage;

import java.util.Scanner;

public class Assign14 
{
	static Scanner sc=new Scanner(System.in);
	
	static void add()
	{
		System.out.println("enter number");
		int num1=sc.nextInt();
		System.out.println(num1+" this number is enetred in static method ");
	}
	void add1()
	{
		System.out.println("enter number");
		int num2=sc.nextInt();
		System.out.println(num2+" this number is enetred in non static method ");
	}
	public static void main(String[] args) 
	{
		
		add();
		new Assign14().add1();
		
		

	}

}
