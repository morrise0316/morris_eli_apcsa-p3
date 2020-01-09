import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void encode(Picture pic) //pic is the Picture/message hidden in this Picture
  {
	  int matrixSize = 5; //note that the code is based on matrixSize=5, or else the code needs to be modified to work as intended
	  Pixel[][] pixs = pic.getPixels2D();
	  int[][][] black = new int[pixs.length][pixs.length/matrixSize][matrixSize];
	  int[][][] setBlack = new int[pixs.length][pixs.length/matrixSize][matrixSize];
	  	for (int x = 0; x < pixs.length; x++)
	  		for (int y = 0; y < pixs.length/matrixSize; y++)
	  			for (int z = 0; z < matrixSize; z++)
	  			{
	  				int col = matrixSize*y + z;
	  				if (pixs[x][col].getRed() <=20 && pixs[x][col].getGreen() <=20 && pixs[x][col].getBlue() <=20)
	  					black[x][y][z] = 2;
	  				else
	  					black[x][y][z] = 1;
	  			}
	  	RandomMatrix m = new RandomMatrix(matrixSize,542423665);
	  	int[][] multM = m.getMatrix();
	  	for (int a = 0; a < black.length; a++)
	  		for (int b = 0; b < black[0].length; b++)
	  			for (int c = 0; c < black[0][0].length; c++)
	  			{
	  				int setBlk = 0;
	  				for (int d = 0; d < matrixSize; d++)
	  				{
	  					setBlk += multM[c][d] * black[a][b][d];
	  				}
	  				setBlack[a][b][c] = setBlk;
	  			}
	  	for (int a = 0; a < black.length; a++)
	  		for (int b = 0; b < black[0].length; b++)
	  			for (int c = 0; c < black[0][0].length; c++)
	  			{
	  				black[a][b][c] = setBlack[a][b][c];
	  			}
	  	Pixel[][] pixels = this.getPixels2D();
	  	for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(pixelObj.getRed()-(pixelObj.getRed()%matrixSize));
	      }
	    } 
	  	for (int x = 0; x < black.length; x++)
	  		for (int y = 0; y < black[0].length; y++)
	  			for (int z = 0; z < black[0][0].length; z++)
	  			{
	  				int col = matrixSize*y + z;
	  				pixels[x][col].setRed(pixels[x][col].getRed() + black[x][y][z]);
	  				
	  			}
  }
  public void decode()
  {
	  int matrixSize = 5;//note that the code is based on a fixed matrixSize of 5, otherwise code must be modified
	  Pixel[][] pixels = this.getPixels2D();
	  int[][][] black = new int[pixels.length][pixels.length/matrixSize][matrixSize];
	  int[][][] setBlack = new int[pixels.length][pixels.length/matrixSize][matrixSize];
	  RandomMatrix n = new RandomMatrix(matrixSize,542423665); //seed must be the same as encode
	  int[][] adj = new int[matrixSize][matrixSize];
	  n.getAdj(n.getMatrix(), adj);
	  for (int x = 0; x < black.length; x++)
	  		for (int y = 0; y < black[0].length; y++)
	  			for (int z = 0; z < black[0][0].length; z++)
	  			{
	  				int col = matrixSize*y + z;
	  				black[x][y][z] = pixels[x][col].getRed() % 5;
	  			}
	  for (int a = 0; a < black.length; a++)
	  		for (int b = 0; b < black[0].length; b++)
	  			for (int c = 0; c < black[0][0].length; c++)
	  			{
	  				int setBlk = 0;
	  				for (int d = 0; d < matrixSize; d++)
	  				{
	  					setBlk += adj[c][d] * black[a][b][d];
	  				}
	  				setBlack[a][b][c] = setBlk;
	  			}
	  	for (int a = 0; a < black.length; a++)
	  		for (int b = 0; b < black[0].length; b++)
	  			for (int c = 0; c < black[0][0].length; c++)
	  			{
	  				black[a][b][c] = setBlack[a][b][c];
	  			}
	  	for (int a = 0; a < black.length; a++)
	  		for (int b = 0; b < black[0].length; b++)
	  			for (int c = 0; c < black[0][0].length; c++)
	  			{
	  				int col = matrixSize*b + c;
	  				if(black[a][b][c] == 2)
	  					pixels[a][col].setColor(Color.BLACK);
	  				else if(black[a][b][c]==1)
	  					pixels[a][col].setColor(Color.WHITE);
	  			}
	  	for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        if(pixelObj.getRed() != 0)
	        	pixelObj.setColor(Color.WHITE);
	      }
	    } 
  }
  public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setGreen(0);
	      }
	    } 
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(255-pixelObj.getRed());
	        pixelObj.setGreen(255-pixelObj.getGreen());
	        pixelObj.setBlue(255-pixelObj.getBlue());
	      }
	    } 
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	int avg = (pixelObj.getRed()+pixelObj.getBlue()+pixelObj.getGreen())/3;
	        pixelObj.setRed(avg);
	        pixelObj.setGreen(avg);
	        pixelObj.setBlue(avg);
	      }
	    } 
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	pixelObj.setRed(pixelObj.getRed()*6);
	      }
	    }   
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    } 
  }
  
  public void mirrorHorizontal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    int height = pixels.length;
	    for (int row = 0; row < height/2; row++)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        topPixel = pixels[row][col];
	        bottomPixel = pixels[height - 1 - row][col];
	        bottomPixel.setColor(topPixel.getColor());
	      }
	    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    int height = pixels.length;
	    for (int row = 0; row < height/2; row++)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        topPixel = pixels[row][col];
	        bottomPixel = pixels[height - 1 - row][col];
	        topPixel.setColor(bottomPixel.getColor());
	      }
	    } 
  }
  
  public void mirrorDiagonal()
  {
	  Pixel[][] pixels = this.getPixels2D();
      Pixel topRightPixel = null;
      Pixel bottomLeftPixel = null;
      
   
      int max = pixels.length;
      if (pixels[0].length < max)
        max = pixels[0].length;
      
      
      for (int row = 1; row < max; row++)
      {
        for (int col = 0; col < row; col++)
        {
          topRightPixel = pixels[row][col];
          bottomLeftPixel = pixels[col][row];
          bottomLeftPixel.setColor(topRightPixel.getColor());
        }
      }
  }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count);
  }
  
  public void mirrorArms()
  {
	  int mirrorPoint = 195;
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    
	    Pixel[][] pixels = this.getPixels2D();
	   
	    for (int row = 160; row <= mirrorPoint; row++)
	    {
	      for (int col = 106; col < 294; col++)
	      {
	        
	        topPixel = pixels[row][col];      
	        bottomPixel = pixels[mirrorPoint - row + mirrorPoint]                       
	                         [col];
	        bottomPixel.setColor(topPixel.getColor());
	      }
	    }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 344;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	   
	    Pixel[][] pixels = this.getPixels2D();
	    
	    
	    for (int row = 235; row < 323; row++)
	    {
	      
	      for (int col = 238; col < mirrorPoint; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row]                       
	                         [mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	        
	      }
	    }
	  }
  
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy(Picture fromPic,int fromStartRow, int fromStartCol, int fromEndRow, int fromEndCol, int toStartRow, int toStartCol )
  {
	  Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = fromPic.getPixels2D();
      for ( int fromRow = fromStartRow, toRow = toStartRow; fromRow <= fromEndRow
          && toRow < toPixels.length; fromRow++, toRow++ )
      {
          for ( int fromCol = fromStartCol, toCol = toStartCol; fromCol <= fromEndCol
              && toCol < toPixels[0].length; fromCol++, toCol++ )
          {
              fromPixel = fromPixels[fromRow][fromCol];
              toPixel = toPixels[toRow][toCol];
              toPixel.setColor( fromPixel.getColor() );
          }
      }
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture(PictureExplorer.homePath + "flower1.jpg");
    Picture flower2 = new Picture(PictureExplorer.homePath + "flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write(PictureExplorer.homePath + "collage.jpg");
  }
  
  public void myCollage()
  {
	Picture beach1 = new Picture(PictureExplorer.homePath + "beach.jpg");
	Picture beach2 = new Picture(beach1);
	beach2.grayscale();
	Picture beach3 = new Picture(beach1);
	beach3.zeroBlue();
	Picture beach4 = new Picture(beach1);
	beach4.negate();
	
	this.copy(beach2, 0, 0);
	this.copy(beach3, 100, 0);
	this.copy(beach4, 200, 0);
	this.mirrorDiagonal();
	this.write(PictureExplorer.homePath + "myCollage.jpg");
	  
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetection2( int edgeDist )
  {
      Picture copy = new Picture( this );
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      Color rightColor = null;

      // Compare a pixel with the one below it. Set the pixel color of
      // the one below to black when the color distance is greater than
      // the specified edge distance.
      for ( int row = 0; row < pixels.length; row++ )
      {
          for ( int col = 0; col < pixels[0].length - 1; col++ )
          {
              leftPixel = pixels[row][col];
              rightPixel = pixels[row][col + 1];
              rightColor = rightPixel.getColor();
              if ( leftPixel.colorDistance( rightColor ) > edgeDist )
              {
                  leftPixel.setColor( Color.BLACK );
              }
              else
              {
                  leftPixel.setColor( Color.WHITE );
              }
          }
      }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture(PictureExplorer.homePath + "beach.jpg");
    Picture bigBeach = beach.scale(3,3);
    bigBeach.write(PictureExplorer.homePath + "bigbeach.jpg");
    
    bigBeach.explore();
    bigBeach.zeroBlue();
    bigBeach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
