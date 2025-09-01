package day15.generics;

public class LowerBoundedWildCard {
	
	public static void displayNumbers(List<? super Integer> list) // any super class of Integer class
	{
		for (Object n : list) 
		{
			System.out.println(n);
		}
	}

}