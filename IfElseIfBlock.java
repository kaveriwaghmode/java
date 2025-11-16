package MyFirstPackage;

import java.util.Scanner;

public class IfElseIfBlock {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age of voter");
		int i=sc.nextInt();
		if(i<18 && i>0)
		{
			System.out.println("not eligible");
		}
		else if(i>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("invalid input");
		}
		
        sc.close();

	}

}
