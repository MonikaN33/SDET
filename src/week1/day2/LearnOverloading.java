package week1.day2;

public class LearnOverloading 
{

	static boolean sendSms()
	{
		System.out.println("Sending message");
		return true;
	}
	

	static boolean sendSms(String contact)
	{
		System.out.println("Sending message to " + contact);
		return true;
	}
	
	static String getName()
	{
		String mob = "op";
		return mob;
	}
	
	public static void main(String[] args)
	{
		String mobName = getName();
		System.out.println(mobName);
		sendSms("Monika");
	}
}
