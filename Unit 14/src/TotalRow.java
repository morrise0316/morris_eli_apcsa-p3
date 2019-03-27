//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> rowTotals = new ArrayList<Integer>();
    	for (int[] x : m)
    	{
    		int i = 0;
    		for (int y : x)
    			i += y;
    		rowTotals.add(i);
    	}
		return rowTotals;
    }
}
