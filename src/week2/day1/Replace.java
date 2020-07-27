package week2.day1;

public class Replace 
{

	public static void main(String[] args) 
	{
		String str = "Hey everyone";
		String str1 = "Hey I have 11 friends";
		
		System.out.println(str.replace("e", ""));
		System.out.println(str.replaceAll("e", ""));
		
		System.out.println(str1.replaceAll("\\d", " "));
		System.out.println(str1.replaceAll("\\D", " "));

	}

}
