package MyFirstPackage;

public class AssertKeyword 
{

	public static void main(String[] args) 
	{
		int age=8;
        assert age>=18:"Sorry but the condition failed";//assert keyword will be by default disable
        //you will have to enable it
        System.out.println("Eligible for voting");
	}

}
