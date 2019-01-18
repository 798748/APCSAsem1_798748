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
    public static void AAAAAAAAAA(){
        Picture cthu = new Picture("Singularity.jpg");
        cthu.bad();
        cthu.explore();
    }

    public static void testZeroBlue()
    {
        Picture beach = new Picture("cthulhu.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    public static void testZeroGreen()
    {
        Picture beach = new Picture("cthulhu.jpg");
        beach.explore();
        beach.zeroGreen();
        beach.explore();
    }

    public static void testZeroRed()
    {
        Picture beach = new Picture("cthulhu.jpg");
        beach.explore();
        beach.zeroRed();
        beach.explore();
    }

    public static void testKeepOnlyRed(){
        Picture beach = new Picture("cthulhu.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.zeroGreen();
        beach.explore();
    }

    public static void testKeepOnlyGreen(){
        Picture beach = new Picture("cthulhu.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.zeroRed();
        beach.explore();
    }

    public static void testNegate(){
        Picture beach = new Picture("cthulhu.jpg");
        beach.explore();
        beach.negate();
        beach.explore();
    }

    public static void testGrayscale(){
        Picture beach = new Picture("cthulhu.jpg");
        beach.explore();
        beach.grayscale();
        beach.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("cthulhu.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    public static void testMirrorHorizontal()
    {
        Picture caterpillar = new Picture("cthulhu.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }

    public static void testMirrorHorizontalBTT()
    {
        Picture caterpillar = new Picture("cthulhu.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontalBTT();
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    public static void testMirrorArms()
    {
        Picture temple = new Picture("snowman.jpg");
        temple.explore();
        temple.mirrorArms();
        temple.explore();
    }

    public static void testMirrorGull()
    {
        Picture temple = new Picture("seagull.jpg");
        temple.explore();
        temple.mirrorGull();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("cthulhu.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("thatThing.jpg");
        swan.edgeDetection(13);
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
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
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