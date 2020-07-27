package week1.day2;

public class FindGreaterNumber 
{

	public static void main(String[] args) 
	{
		int a = 100;
		int b = 200;
		int c = 300;
		
		if(a>b&&a>c)
		{
			System.out.println("a is the greatest number");
		}
		else if(b>c&&b>a)
		{
			System.out.println("b is the greatest number");
		}
		
		else if(c>a&&c>b)
		{
			System.out.println("c is the greatest number");
		}
	}

}
