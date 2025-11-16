package MyFirstPackage;

import java.util.Scanner;

public class PrintnameMultipleTimes 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number of times u want the name to be printed");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Kaveri");
		}
        sc.close();
	}

}
