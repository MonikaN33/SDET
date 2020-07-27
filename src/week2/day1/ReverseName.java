package week2.day1;

public class ReverseName 
{

	public static void main(String[] args)
	{
		String name = "Monika";
		
		int len = name.length();
		
		for (int i= len-1;i>=0; i--)
		{
			System.out.print(name.charAt(i));
		}

	}

}
