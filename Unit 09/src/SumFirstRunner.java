import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{	
		List<Integer> testList = new ArrayList<Integer>();
		int[] testArr = {-99,1,2,3,4,5,6,7,8,9,10,5};
		for (int x = 0; x < testArr.length; x++)
			testList.add(testArr[x]);
		System.out.println(ListSumFirst.go(testList));
	}
}