package week3.day2;

public class LearnException
{

	void eat() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	void sleep() throws InterruptedException
	{
		eat();
	}
	
	void code()
	{
		try
		{
			sleep();
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void repeat()
	{
		code();
	}

}
