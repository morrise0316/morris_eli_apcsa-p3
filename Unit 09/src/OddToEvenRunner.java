import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven s = new ListOddToEven();
		Integer[] arr1 = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		Integer[] arr2 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		Integer[] arr3 = {10,20,30,40,5,41,31,20,11,7};
		Integer[] arr4 = {32767,70,4,5,6,7};
		Integer[] arr5 = {2,7,11,21,5,7} ;
		Integer[] arr6 = {7,255,11,255,100,3,2} ;
		Integer[] arr7 = {9,11,11,11,7,1000,3};
		Integer[] arr8 = {7,7,7,11,2,7,7,11,11,2} ;
		Integer[] arr9 = {2,4,6,8,8} ;
		System.out.println( s.go( Arrays.asList(arr1) ) );
		System.out.println( s.go( Arrays.asList(arr2) ) );
		System.out.println( s.go( Arrays.asList(arr3) ) );
		System.out.println( s.go( Arrays.asList(arr4)) );
		System.out.println( s.go( Arrays.asList(arr5)) );
		System.out.println( s.go( Arrays.asList(arr6)) );
		System.out.println( s.go( Arrays.asList(arr7)) );
		System.out.println( s.go( Arrays.asList(arr8)) );
		System.out.println( s.go( Arrays.asList(arr9)) );
	}
}