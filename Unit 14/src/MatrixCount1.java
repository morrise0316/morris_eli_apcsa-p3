//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
		int cntNum = 0;
		for (int x = 0; x < m.length;x++)
			for(int y = 0; y < m[x].length;y++)
			{
				if (m[x][y] == val)
					cntNum++;
			}
				
		return cntNum;
    }
    public String toString() 
    {
    	String mtx = "";
    	for (int x = 0; x<m.length;x++)
    		mtx += Arrays.toString(m[x]);
    	return "" + mtx;
    }
}
