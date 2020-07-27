package week1.day1;

public class PrintAlternateValues
{

	public static void main(String[] args)
	{
		String names[] = {"RB", "Kuldeep", "Ravi", "Monika", "Myname", "Koushik"};

		int len = names.length;
		
		
		for(int i=0; i<names.length; i++) 
		{
			if(i%2==0)
			System.out.println(names[i]);
		}
		
		

	}

}
