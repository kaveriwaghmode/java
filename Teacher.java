package MyFirstPackage;

public class Teacher 
{
	int a=10;
	double b=20.0;
	protected Teacher(int a)
	{
		
		System.out.println("protected and parameterised teacher constructor");
	}
	public Teacher()
	{
        //this(10);
		System.out.println("public  teacher cnstructor");
	}
	public static void M1()
	{
		System.out.println("m1");
	}
	protected static void M2()
	{
		System.out.println("m2");
	}
	static void M3()
	{
		System.out.println("m3");
	}
	private static void M4()
	{
		System.out.println("m4");
	}

}
