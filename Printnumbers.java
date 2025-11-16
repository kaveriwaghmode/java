package MyFirstPackage;

import java.util.Scanner;

public class Printnumbers 
{

	public static void main(String[] args) 
	{
	   System.out.println("enter the range of nums to be printed");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   for(int i=1;i<=n;i++)
	   {
		System.out.println(i);
	   }
    sc.close();
	}

}
