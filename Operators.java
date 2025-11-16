package MyFirstPackage;

public class Operators {
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	void subtract(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		
	}
	void multiply(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
		
	}
	void divide(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
		
	}
	void modulus(int a,int b)
	{
		int c=a%b;
		System.out.println(c);
		
	}
	
		

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Operators op=new Operators();
		op.add(10,9);
		op.subtract(19, 9);
		op.multiply(3,3);
		op.divide(12, 3);
		op.modulus(4, 3);
		

	}

}
