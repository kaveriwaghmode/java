package MyFirstPackage;

import java.util.Scanner;

public class CalculateInterest 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the loan amt");
		double loanamt= sc.nextDouble();
		
		System.out.println("Enter the tenure");
		int tenure= sc.nextInt();
		
		System.out.println("Enter the interest");
		int interest= sc.nextInt();
		
		double d1=(loanamt*tenure*interest)/100;
		
		System.out.println("the amount to be paid ");
		System.out.println(loanamt+d1);
		
		

	}

}
