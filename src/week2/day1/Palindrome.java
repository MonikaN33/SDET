package week2.day1;

public class Palindrome
{

	public static void main(String[] args) 
	{
		String s1 = "madam";
		
		int len = s1.length();
		
		String temp = "";
		
		for (int i= len-1;i>=0; i--)
		{
			temp = temp + s1.charAt(i);
		}
		
		if(s1.equals(temp))
		{
			System.out.println("Same value");
		}
		else
		{
			System.out.println("Different value");
		}
		
		
	}

}
