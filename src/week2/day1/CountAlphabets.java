package week2.day1;

public class CountAlphabets
{

	public static void main(String[] args) 
	{
		String name = "aabbcc";
		char toFind = 'b';
		
		char myArr[]= name.toCharArray();
		int numOfb = 0;
		
		for(char c : myArr)
		{
			if (c==toFind)
			{
				numOfb++;
			}
		}
		
		System.out.println(numOfb);

	}

}
