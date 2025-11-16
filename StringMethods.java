package MyFirstPackage;

import java.util.Arrays;

public class StringMethods 
{

	public static void main(String[] args) 
	{

		String s1="auto mation 123";
		String s2="manual";
		String [] s3,s4;
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.repeat(3));
		System.out.println(s1.replace('a','b'));
		System.out.println(s1.replace("automation","manual"));
		System.out.println(s1.replaceAll("[a-z]","123"));		
		System.out.println(s1.replaceAll("[0-9]",""));
		System.out.println(s1.substring(4));
		//s3=s1.split(" ");
		s3=s1.splitWithDelimiters("[a-z]",s1.length());
		s4=s1.split("[0-9]",5);
		System.out.println(Arrays.toString(s4));
		System.out.println(Arrays.toString(s3));
		
		

	}

}
