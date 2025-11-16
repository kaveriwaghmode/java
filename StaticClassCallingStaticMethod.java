package MyFirstPackage;

public class StaticClassCallingStaticMethod 
{
	
	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void subtract(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		add(10,9); // calling static method
		StaticClassCallingStaticMethod t1=new StaticClassCallingStaticMethod(); // creating object of non static method
		t1.subtract(10,9); //calling non static method

	}

}
