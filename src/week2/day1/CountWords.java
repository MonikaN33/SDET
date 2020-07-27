package week2.day1;

public class CountWords 
{

	public static void main(String[] args) 
	{
		String str = " Hey hello user ";
		
		String str1 = "Hey@hello@user";
		
		String words[] = str.trim().split(" ");
		
		System.out.println(words.length);
		
		for(String oneWord : words)
		{
			System.out.println(oneWord);
		}
		
		System.out.println(str1.substring(0,4));
		System.out.println(str1.substring(4));
		

	}

}
