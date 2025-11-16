package MyFirstPackage;

import java.util.Scanner;

public class LogicalOperators 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of voter");
		int i=sc.nextInt();
		//int j=sc.nextInt();
		if(i>0 && i<18)
		{
			System.out.println("not eligible for voting");
			
		}
		else if(i==18 || i>18)
		{
			System.out.println("Eligible for voting");
		}
		
		if(!(i>0 && i<18))
		{
			System.out.println("printed when eligible for votuing ");
		}
		else if(!(i==18 || i>18))
		{
			System.out.println("printed when not eligible for voting");
		}
		
		

	}

}
