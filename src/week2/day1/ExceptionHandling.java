package week2.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling
{

	public static void main(String[] args)
	{
		System.out.println("Enter value");
		Scanner sc = new Scanner(System.in);
		/*int nextInt = sc.nextInt();
		System.out.println(nextInt);*/
		
		int num = sc.nextInt();
		System.out.println(num/2);
		
				
		try
		{
			num = sc.nextInt();
			System.out.println(num/0);	
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divisible by 0 is not possible");
		}
		
		
		
		System.out.println("I am done");
		

	}

}
