package MyFirstPackage;

import java.util.Scanner;

public class NestedIfElseBlock 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	    //int a=10,b=20,c=30;//can be given at run time
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
        if(b>a)
        {
                        if(b==c)
                        {
                                System.out.println("1st Statement");
                        }
                        else
                        {
                                System.out.println("2nd Statement");
                        }
        }
        else
        {
                System.out.println("3rd Statement");
        }
		
		
		

	}

}
