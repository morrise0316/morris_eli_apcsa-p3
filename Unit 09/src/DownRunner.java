import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		int[] arr1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		int[] arr2 = {10,9,8,7,6,5,4,3,2,1,-99};
		int[] arr3 ={32767};
		ArrayList<Integer> testList = new ArrayList<Integer>();
		for (int x : arr1)
			testList.add(x);
			
		System.out.println(ListDown.go(testList));
		ArrayList<Integer> testList2 = new ArrayList<Integer>();
		for (int x : arr2)
			testList2.add(x);
		
		
		System.out.println(ListDown.go(testList2));
		ArrayList<Integer> testList3 = new ArrayList<Integer>();
		for (int x : arr3)
			testList3.add(x);
		
		System.out.println(ListDown.go(testList3));
	}
}