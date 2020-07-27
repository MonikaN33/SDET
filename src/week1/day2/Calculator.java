package week1.day2;

public class Calculator 
{

	/*public void add()
	{
		int a = 1;
		int b = 2;
		System.out.println(a+b);
	}
	
	private void sub()
	{
		int a = 4;
		int b = 2;
		System.out.println(a-b);
	}

	
	 void mul()
	{
		int a = 4;
		int b = 2;
		System.out.println(a*b);
	}*/
	
	static int add()
	{
		int a = 1;
		int b = 2;
		return (a+b);
	}
	
	static int sub()
	{
		int a = 4;
		int b = 2;
		return (a-b);
	}
	
	 static int mul()
	{
		int a = 4;
		int b = 2;
		return a*b;
	}
	 
	 public static void main(String [] args)
	 {
		 System.out.println(add());
		 System.out.println(sub());
		 System.out.println(mul());
		 
		 
	 }
}
