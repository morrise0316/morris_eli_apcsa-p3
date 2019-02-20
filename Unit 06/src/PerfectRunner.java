//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect(496);
		System.out.println(test);
		int[] testNums = {45,6,14,8128,1245,33,28,27,33550336};
		for (int num : testNums) {
			
			test.setNumber(num);
			System.out.println(test);
			
		}
	}
}