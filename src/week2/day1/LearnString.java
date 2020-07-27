package week2.day1;

public class LearnString 
{

	public static void main(String[] args)
	{
		
		//literal type
		String name = "Welcome Home...";
		
		System.out.println(name.charAt(5));
		
		int len = name.length();
		System.out.println(name.charAt(len-1));
		
		char arr[] = name.toCharArray();
		System.out.println(arr[name.length()-1]);
		
		
	/*	System.out.println(name.toUpperCase());
		
		System.out.println(name.length());*/
		
		//object type
		String str = new String("Welcome");

	}

}
