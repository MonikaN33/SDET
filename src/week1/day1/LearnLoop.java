package week1.day1;

public class LearnLoop 
{

	public static void main(String[] args) 
	{
		/*int i=0;
		while (i<10)
		{
			System.out.println(i);
			i++;
		}*/
		
		int i=0;
		
		for(i=1;i<=10;i++) 
		{
			if(i==5) 
			{
//				break;
				continue;
			}
			System.out.println(i);
		}
		
//		System.out.println("Value of i = " + i);
	}

}
