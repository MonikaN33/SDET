package week3.day1;

public class MyCar extends Vehicle 
{

	public static void main(String[] args) 
	{
		MyCar c = new MyCar();
		c.applyBrake();
		c.applyAcc();
		c.startEngine();
		
		BMW bmw = new BMW();
		bmw.applyBrake();
		
		

	}

}
