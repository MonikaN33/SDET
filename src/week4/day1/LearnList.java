package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList 
{

	public static void main(String[] args) 
	{
		
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("apple");
		System.out.println(fruits);
		
		Collections.sort(fruits);
		System.out.println("After sorting:");
		System.out.println(fruits);
		
		/*for (String eachFruit : fruits) 
		{
			System.out.println(eachFruit);
		}*/
		
		boolean remove = fruits.remove("apple");
		System.out.println(remove);
		
		System.out.println(fruits);
		
		//add element
		fruits.add(2, "guava");
		System.out.println(fruits);
		
		//rename
		fruits.set(3, "guava");
		System.out.println(fruits);
		
		//get size
		System.out.println(fruits.size());
		
		System.out.println(fruits.get(fruits.size()-1));
		
		//check if list is empty
		System.out.println(fruits.isEmpty());
		
		boolean contains = fruits.contains("apple");
		System.out.println(contains);
		
		//remove all the elements in list
		fruits.clear();
		System.out.println(fruits.size());
		
		

	}

}
