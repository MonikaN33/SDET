package week2.day1;

public class Buffer {

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Hey");
		System.out.println(sb);
		
		StringBuilder sbi = new StringBuilder("Hello");
		sbi.append("Hey");
		System.out.println(sbi);
		
		String s1 = "Hello";
		s1.concat("Hey");
		System.out.println(s1);

	}

}
