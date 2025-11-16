package MyFirstPackage;

import java.util.Scanner;

public class AnnualSalary 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter monthly salary of employee");
		double monthSal=sc.nextDouble();
		System.out.println("yearly salary of employee is :");
		System.out.println(monthSal*12);

	}

}

