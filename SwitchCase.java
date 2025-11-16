package MyFirstPackage;

import java.util.Scanner;

public class SwitchCase 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num 1");
		int n1=sc.nextInt();
		System.out.println("Enter num 2");
		int n2=sc.nextInt();
		System.out.println("enter the choice +  -  *");
		String choice=sc.next();
		int result=0;
		switch(choice)
		{
		case "+":
			result=n1+n2;
			System.out.print("result :");
			System.out.println(result);
			break;
		case "-":
			result=n1-n2;
			System.out.print("result :");
			System.out.println(result);
			break;
		case "*":
			result=n1*n2;
			System.out.print("result :");
			System.out.println(result);
			break;
			
		default:
			System.out.println("invalid operator");
				
		}
		
		
				

	}

}
