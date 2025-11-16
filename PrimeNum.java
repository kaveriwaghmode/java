package MyFirstPackage;

import java.util.Scanner;

public class PrimeNum 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number u want the prime nums to be printed");
		int n=sc.nextInt();
		System.out.println("prime numbers till given number "+n);
		for(int i=1;i<=n;i++)
		{
			int res=0;
		
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					res=res+1;
				}
				
								
			}
			if(res==2)
				System.out.print(i+" ");
			
			
		}
	}

}
