//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Recursion234Runner
{
	public static void main(String args[])
	{
		System.out.println(RecursionFunOne.countEvenDigits(4532));

		int[] runs = {11145322,224532714,2468,13579};
		for (int x : runs)
		{
			System.out.println(RecursionFunOne.countEvenDigits(x));
		}
	}
}