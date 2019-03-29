import java.util.Arrays;
import java.util.Random;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		Random r = new Random();
		grid = new String[rows][cols];
		for (int x = 0; x < grid.length; x++)
			for (int y = 0; y < grid[x].length; y++)
			{
				grid[x][y] = vals[r.nextInt(vals.length)];
			}
		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String max = vals[0];
		for (int z = 0; z < vals.length; z++)
			if (countVals(vals[z]) > countVals(max))
				max = vals[z];
		return max;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int valCnt = 0;
		for (int x = 0; x < grid.length; x++)
			for (int y = 0; y < grid[x].length; y++)
			{
				if (grid[x][y].equals(val))
					valCnt++;
			}
		return valCnt;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int x = 0; x < grid.length; x++)
		{
			for (int y = 0; y < grid[x].length; y++)
			{
				output += grid[x][y] + " "; 
			}
			output += "\n";
		}
		return output;
	}
}