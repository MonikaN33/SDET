package week2.day1;

public class CountDuplicate 
{

	public static void main(String[] args)
	{
		String name = "madam";
		
		int k = 0;
		
		int len = name.length();
		
		for(int i=0; i<len; i++)
		{
			for(int j = i+1; j< len; j++)
			{
				if (name.charAt(i) == name.charAt(j))
					k++;
			}
		}
		System.out.println(k);

		
	}

}
