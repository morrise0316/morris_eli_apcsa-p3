//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int indexOdd = 0;
		int indexEven = 0;
		for (int x = 0; x < ray.length; x++)
		{
			if (ray[x] % 2 == 1)
			{
				indexOdd = x;
				break;
			}
		}
		for ( int y = indexOdd; y < ray.length; y++)
		{
			if (ray[y] % 2 == 0)
			{
				indexEven = y;
				break;
				
			}
		}
		
		if (indexEven - indexOdd > 0 )
		{
			return indexEven - indexOdd;
		}
		return -1;
	}
}