package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList
{

	public static void main(String[] args)
	{
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println(num);
		
		//insert 0
		num.add(0, 0);
		System.out.println(num);
		
		//Retrieve value 3
		System.out.println(num.get(num.size()-3));
		
		//replace 1 with 6
		num.set(num.size()-5 , 6);
		
		System.out.println(num);
		
		//search 4
		boolean contains = num.contains(4);
		System.out.println(contains);
		

	}

}
