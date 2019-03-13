//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int indexOdd = 0;
		int indexEven = 0;
		for (int x = 0; x < ray.size(); x++)
		{
			if (ray.get(x) % 2 == 1)
			{
				indexOdd = x;
				break;
			}
		}
		for ( int y = indexOdd; y < ray.size(); y++)
		{
			if (ray.get(y) % 2 == 0)
			{
				indexEven = y;
				
			}
		}
		
		if (indexEven - indexOdd > 0 )
		{
			return indexEven - indexOdd;
		}
		return -1;
	}
}