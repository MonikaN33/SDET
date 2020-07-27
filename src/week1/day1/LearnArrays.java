package week1.day1;

public class LearnArrays 
{

	public static void main(String[] args)
	{
		String names[] = {"Monika" , "Neha", "Nishant"};
		int len = names.length;
		System.out.println(names[len-1]);
		
		for(int i=0; i< names.length; i++) //normal for loop
		{
			System.out.println(names[i]);
		}
		
		for (String eachName : names) //for each loop
		{
			System.out.println(eachName);
		}

	}

}
