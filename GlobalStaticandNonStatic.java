package MyFirstPackage;

public class GlobalStaticandNonStatic 
{
	int i=1;
	static int j=2;

	public static void main(String[] args) 
	{
        System.out.println(new GlobalStaticandNonStatic().i);
        System.out.println(j);
		int i1=new GlobalStaticandNonStatic().i=10;
        j=20;
        System.out.println(i1);
        System.out.println(j);
		
	}

}
