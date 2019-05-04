/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
	    Picture beach = new Picture(PictureExplorer.homePath + "beach.jpg");
	    Picture bigBeach = beach.scale(3,3);
	    bigBeach.write(PictureExplorer.homePath + "bigbeach.jpg");
	    
	    bigBeach.explore();
	    bigBeach.zeroBlue();
	    bigBeach.explore();
  }
  /**Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
	  Picture seagull = new Picture(PictureExplorer.homePath + "seagull.jpg");
	    Picture bigseagull = seagull.scale(3,3);
	    bigseagull.write(PictureExplorer.homePath + "bigseagull.jpg");
	    
	    bigseagull.explore();
	    bigseagull.keepOnlyBlue();
	    bigseagull.explore();
  }
  /**Method to test negate*/
  public static void testNegate()
  {
	  Picture gorge = new Picture(PictureExplorer.homePath + "gorge.jpg");
	  Picture biggorge = gorge.scale(3,3);
	  biggorge.write(PictureExplorer.homePath + "biggorge.jpg");
	  
	  biggorge.explore();
	  biggorge.negate();
	  biggorge.explore();
  }
  
  /**Method to test grayscale*/
  public static void testGrayscale()
  {
	  Picture temple = new Picture(PictureExplorer.homePath + "temple.jpg");
	  Picture bigtemple = temple.scale(3, 3);
	  bigtemple.write(PictureExplorer.homePath + "bigtemple.jpg");
	  
	  bigtemple.explore();
	  bigtemple.grayscale();
	  bigtemple.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture(PictureExplorer.homePath + "water.jpg");
	  Picture bigwater = water.scale(3, 3);
	  bigwater.write(PictureExplorer.homePath + "bigwater.jpg");
	  
	  bigwater.explore();
	  bigwater.fixUnderwater();
	  bigwater.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture(PictureExplorer.homePath + "caterpillar.jpg");
    
    
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture caterpillar = new Picture(PictureExplorer.homePath + "caterpillar.jpg");
	    
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture redMotorcycle = new Picture(PictureExplorer.homePath + "redMotorcycle.jpg");
	  
	  redMotorcycle.explore();
	  redMotorcycle.mirrorHorizontal();
	  redMotorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture redMotorcycle = new Picture(PictureExplorer.homePath + "redMotorcycle.jpg");
	  
	  redMotorcycle.explore();
	  redMotorcycle.mirrorHorizontalBotToTop();
	  redMotorcycle.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture(PictureExplorer.homePath + "beach.jpg");
	    Picture bigBeach = beach.scale(3,3);
	    bigBeach.write(PictureExplorer.homePath + "bigbeach.jpg");
	    
	    bigBeach.explore();
	    bigBeach.mirrorDiagonal();
	    bigBeach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture(PictureExplorer.homePath + "temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	Picture snowman = new Picture(PictureExplorer.homePath + "snowman.jpg");
	snowman.explore();
	snowman.mirrorArms();
	snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	Picture seagull = new Picture(PictureExplorer.homePath + "seagull.jpg");
	seagull.explore();
	seagull.mirrorGull();
	seagull.explore();
	
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture(PictureExplorer.homePath + "640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
	Picture canvas = new Picture(PictureExplorer.homePath + "640x480.jpg");
	canvas.myCollage();
	canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture(PictureExplorer.homePath + "swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
	  Picture swan = new Picture(PictureExplorer.homePath + "swan.jpg");
	    swan.edgeDetection(10);
	    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}