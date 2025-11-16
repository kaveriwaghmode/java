package MySecondPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two string to be compared");
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()!=s2.length())
		{
			System.out.println("not an Anagram");
		}
		else
		{
			char [] c1=s1.toCharArray();
			char [] c2=s2.toCharArray();
			char temp;
			
			for (int i=0;i<c1.length;i++)
			{
				for(int j=i+1;j<c1.length;j++)
				{
					if(c1[i]>c1[j])
					{
					temp=c1[i];
					c1[i]=c1[j];
					c1[j]=temp;
					}
					
				}
				
			}
			System.out.println("arrays  after sorting");
			System.out.println(Arrays.toString(c1)); 
			
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2)); 
			
			if(Arrays.equals(c1, c2))
				System.out.println("Anagram");
			else
				System.out.println("not anagram");
		}
			
		
	}

}
