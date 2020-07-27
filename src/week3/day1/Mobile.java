package week3.day1;

public class Mobile 
{

	int series = 1234;
	int yearLaunch = 2019;
	String year = "TwentyNinteen";
	
	public boolean hasCamera()
	{
		return true;
	}
	
	public void call()
	{
		System.out.println("Calling....");
	}
	
	public void year(int yearLaunch)
	{
		System.out.println(yearLaunch);
		
	}
	
	public boolean year()
	{
		System.out.println("2019");
		return true;
	}

}
