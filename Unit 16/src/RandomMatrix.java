import java.util.Arrays;
import java.util.Random;

public class RandomMatrix {
	private int[][] rMatrix; private final int matrixSize;
	private  Random rand; //Note that for the decode function to work, you need the same seed and size as the encode's matrix
		public  RandomMatrix(int n, long randomSeed) {
			rMatrix = new int[n][n];
			rand = new Random(randomSeed);
			matrixSize = n;
			for(int x = 0; x < rMatrix.length; x++)
				for(int y = 0; y < rMatrix[0].length; y++)
				{
					if(x == y)
						rMatrix[x][y] = 1;
					else
						rMatrix[x][y] = 0;
				}
			for (int z = 1; z < rMatrix.length; z++)
			{
				if (rand.nextInt(2) == 0)
				{
					int zeroLength = 0;
					while(rMatrix[z][zeroLength] != 1)
						zeroLength++;
					int setOne = rand.nextInt(zeroLength);
					rMatrix[z][setOne] = 1;
				} 
			}
		
	}
	public int[][] getMatrix()
	{
		return rMatrix;
	}
	
	public int getDet(int mtrx[][] , int n)
	{
		int det = 0;
		if(n==2) return (mtrx[0][0]*mtrx[1][1])-(mtrx[0][1]*mtrx[1][0]);
		int multiplier = 1;
		int[][] tempMatrix = new int[matrixSize][matrixSize];
		for (int z = 0; z < n; z++)
		{
			getSM(mtrx,tempMatrix,0,z,n);
			det += multiplier * mtrx[0][z] * getDet(tempMatrix,n-1);
			
			multiplier *= -1;
		}
		return det;
	}
	public void getSM(int[][] matrix, int[][] cofMatrix, int a, int b, int n)//SS is short for simple minor
	{
		int x = 0;
		int y= 0;
		for(int row = 0; row < n; row++)
			for(int col = 0; col < n; col++)
			{
				if(row != a && col != b)
				{
					cofMatrix[x][y] = matrix[row][col];
					y++;
					
					if(y == n-1)
					{
						y=0;
						x++;
					}
				}
				
			}
	}
	
	public void getAdj(int[][] matrix, int[][] adj)
	{
	    int multiplier = 1;
	    int[][] tempMatrix = new int[matrixSize][matrixSize]; 
	  
	    for (int c=0; c<matrixSize; c++) 
	        for (int d=0; d<matrixSize; d++) 
	        { 
	            getSM(matrix, tempMatrix, c, d, matrixSize);  
	            multiplier = (int)Math.pow(-1, c+d);
	            adj[d][c] = multiplier*(getDet(tempMatrix, matrixSize-1)); 
	        } 
	    
		
	}


	public static void main(String[] args) {
		

	} 

}
