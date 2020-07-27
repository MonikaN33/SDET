package week2.day1;

public class StringComparison 
{

	public static void main(String[] args) 
	{
		String str1 = "Hey Hello";
		String str2 = "hey Hello";
		
		System.out.println(str1.startsWith("Hey"));
		
		System.out.println(str1.endsWith("lo"));
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str2.contains(str1));
		
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
