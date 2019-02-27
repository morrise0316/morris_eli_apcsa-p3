//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int [] nullArray = {};
		int lastVal = ray[ray.length-1];
		int sum = 0;
		
		if (ray.equals(nullArray))
			return -1;
		
		for (int x : ray)
			if (x > lastVal)
				sum += x;	
		
		if (sum > 0)
			return sum;
		return -1;
	}
}