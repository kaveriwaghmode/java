package MyFirstPackage;

public class SuperKeyWord extends parent
{
	void M1()
	{
		System.out.println("method in child");
		super.M1();
	}
	
	public static void main(String[] args) 
	{
		SuperKeyWord s1= new SuperKeyWord();
		s1.M1();
		
	}
}

class parent
{
	void M1()
	{
		System.out.println("method in parent");
	}
}
