package week2.day1;

public class Immutable 
{

	public static void main(String[] args) 
	{
		String s1 ="monika";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		String s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = new String("monika");
		System.out.println(s3);
		System.out.println(s1 == s3);
		
		String s4 ="monika";
		System.out.println(s1 == s4);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s2));
		
		
		
		

	}

}
