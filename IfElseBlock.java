package MyFirstPackage;
import java.util.*;

public class IfElseBlock {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of seats to be booked from 1 to 10\n");
		int i=sc.nextInt();
		if(i>=1 && i<=10)
		{
			System.out.println("select the seats to be booked\n");
		}
		else
		{
			System.out.println("invalid input");
		}
        sc.close();
	}

}
