package week4.day1;


import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap 
{

	public static void main(String[] args)
	{
		Map<Integer, String> empRecord = new LinkedHashMap<Integer, String>();
		empRecord.put(1, "Monika");
		empRecord.put(2, "Nishant");
		empRecord.put(3, "Neha");
		empRecord.put(4, "Ankita");
		empRecord.put(5, "Pankaj");
		empRecord.put(6, "Monika");
		empRecord.put(5, "Nishu");
		
		System.out.println(empRecord);
		
		String name = empRecord.get(1);
		System.out.println(name);
		
		//entrySet
		for (java.util.Map.Entry<Integer, String> entry : empRecord.entrySet() )
		{
			System.out.println(entry.getValue());
		}

	}

}
