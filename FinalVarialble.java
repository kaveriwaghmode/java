package MyFirstPackage;

public class FinalVarialble
	{
	        final static int noofdaysinyear=365;
	         final static double pi=3.14;
	        static void add()
	        {
	             final  int daysOfWeek=7;
	             //daysOfWeek=8; //you cannot change the final value
	             System.out.println(daysOfWeek);
	        
	        }
	         public static void main(String[] args) 
	        {
	               // pi=5; //you cannot change the final value
	                System.out.println(pi);
	                add();
	                System.out.println(noofdaysinyear);
	                
	        }
	}


 