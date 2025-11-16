package MyFirstPackage;

import java.util.Scanner;

public class just 
{

	public static void main(String[] args)
	{
		
		//int x=5;
		//++x;
		//x++;
		//System.out.println(x++);
		
		   int age;
		   String gender;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter age");
		  age=sc.nextInt();
		 System.out.println("Enter gender as male or female");
		gender=sc.next();
		if(age>=18 && gender.equals("female") )
		{
		 
		 System.out.println("eligible for voting");
		}
		else
			System.out.println("not eligible for voting");
		/*switch(gender)
		{
		 case "male": System.out.println("not eleigible as only female can vote");
		                    break;
		case "female": 
		if(age>=18 )
		{
		 
		 System.out.println("eligible for voting");
		}
		break;
		default: System.out.println(" invalid choice");
		              break;
		}*/
		// TODO Auto-generated method stub
		}
	}


