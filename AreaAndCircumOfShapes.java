package MyFirstPackage;

import java.util.Scanner;

public class AreaAndCircumOfShapes 
{

	public static void main(String[] args) 
	{
		 Scanner s1=new Scanner(System.in);
         System.out.println("The radius of circle is->");
         double radius=s1.nextDouble();
         double area=Math.PI* radius*radius;
         System.out.println("The area of circle is->");
         System.out.println(area);
         
         System.out.println("Circumference of circle is->");
         double circumcircle=2*Math.PI*radius;
         System.out.println(circumcircle);
         s1.close();
	}

}
