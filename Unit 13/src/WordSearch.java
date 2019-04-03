//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	char[] chrArr = str.toCharArray();
    	String[] strArr = new String[chrArr.length]; 
    	for (int z = 0; z < chrArr.length; z++)
    		strArr[z] = Character.toString(chrArr[z]);

    	m = new String[size][size];
    	int i = 0;
    	for (int x = 0; x < size; x++)
    		for(int y = 0; y < size; y++)
    		{
    			m[x][y] = strArr[i];
    			i++;
    		}
    }

    public boolean isFound( String word )
    {
    	for (int a = 0; a < m.length; a++)
    		for ( int b = 0; b < m.length; b++)
    			if(checkRight(word,a,b) || checkLeft(word,a,b) || checkUp(word,a,b) || checkDown(word,a,b)
    					|| checkDiagUpRight(word,a,b) || checkDiagUpLeft(word,a,b) || checkDiagDownLeft(word,a,b)
    					|| checkDiagDownRight(word,a,b)) 
    				return true;
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		int checker = 0;
		int i = 0;
		if (w.length() + c <= m.length)
		for (int x = 0; x < w.length(); x++)
		{
			if (w.substring(x,x+1).equals(m[r][c+i]))
			{
				checker++;
				i++;
			}
		}
		
		return checker == w.length();
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int checker = 0;
		int i = 0;
		if (c - w.length() >= -1)
		for (int x = 0; x < w.length(); x++)
		{
			if (w.substring(x,x+1).equals(m[r][c-i]))
			{
				checker++;
				i++;
			}
		}
		
		return checker == w.length();
	}

	public boolean checkDown(String w, int r, int c)
	{
		int checker = 0;
		int i = 0;
		if (w.length() + r <= m.length)
		for (int x = 0; x < w.length(); x++)
		{
			if (w.substring(x,x+1).equals(m[r+i][c]))
			{
				checker++;
				i++;
			}
		}
		
		return checker == w.length();
	}

	public boolean checkUp(String w, int r, int c)
   {
		int checker = 0;
		int i = 0;
		if (r - w.length() >= -1)
		for (int x = 0; x < w.length(); x++)
		{
			if (w.substring(x,x+1).equals(m[r-i][c]))
			{
				checker++;
				i++;
			}
		}
	    return checker == w.length();
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int checker = 0;
		int i = 0;
		if (w.length() + c <= m.length && w.length() + r <= m.length)
		for (int x = 0; x < w.length(); x++)
		{
			if (w.substring(x,x+1).equals(m[r+i][c+i]))
			{
				checker++;
				i++;
			}
		}
		
		return checker == w.length();
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
	{
		int checker = 0;
		int i = 0;
		if (c - w.length() >= -1 && w.length() + r <= m.length)
		for (int x = 0; x < w.length(); x++)
		{
			if (w.substring(x,x+1).equals(m[r+i][c-i]))
			{
				checker++;
				i++;
			}
		}
		
		return checker == w.length();
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
   {
		int checker = 0;
		int i = 0;
		if (c - w.length() >= -1 && r - w.length() >= -1)
		for (int x = 0; x < w.length(); x++)
		{
			if (w.substring(x,x+1).equals(m[r-i][c-i]))
			{
				checker++;
				i++;
			}
		}
		
		return checker == w.length();
   }

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int checker = 0;
		int i = 0;
		if (w.length() + c <= m.length && r - w.length() >= -1)
		for (int x = 0; x < w.length(); x++)
		{
			if (w.substring(x,x+1).equals(m[r-i][c+i]))
			{
				checker++;
				i++;
			}
		}
		
		return checker == w.length();
	}

    public String toString()
    {
    	String output = "";
    	for (int z = 0; z < m.length; z++)
    			output += Arrays.toString(m[z]) + "\n";
 		return output;
    }
}
