package week1.day2;

public class ConstructorExample 
{

	int i;
	int j;
	
	public ConstructorExample(int a, int b)
	{
		i=a;
		j=b;
	}
	
	public void sum()
	{
		System.out.println(i+j);
	}
	
	public void sub()
	{
		System.out.println(i-j);
	}
	
	public void mul()
	{
		System.out.println(i*j);
	}

	public static void main(String[] args) 
	{
		ConstructorExample ce = new ConstructorExample(10,5);
		ce.sum();
		ce.sub();
		ce.mul();
	}

}
