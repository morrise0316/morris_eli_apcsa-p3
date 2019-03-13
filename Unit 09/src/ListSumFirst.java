//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		if (ray.size() > 0)
		{
			int first = ray.get(0);
			int total = 0;
			for (int x : ray)
			{
				if (x > first)
					total += x;
			}
			if (total > 0)
				return total;
			else 
				return -1;
		}
		return -1;
	}
}