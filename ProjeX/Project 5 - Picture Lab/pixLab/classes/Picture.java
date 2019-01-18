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
    public void zeroBlue(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    public void zeroGreen(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setGreen(0);
            }
        }
    }

    public void zeroRed(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
            }
        }
    }
    
    public void spoosh(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                if((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3 < 75.5){
                    pixelObj.setRed((int)(pixelObj.getRed()/1.5));
                    pixelObj.setGreen((int)(pixelObj.getGreen()/1.5));
                    pixelObj.setBlue((int)(pixelObj.getBlue()/1.5));
                }else if((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3 < 122.5){
                    pixelObj.setRed((int)(pixelObj.getRed()/1.25));
                    pixelObj.setGreen((int)(pixelObj.getGreen()/1.25));
                    pixelObj.setBlue((int)(pixelObj.getBlue()/1.25));
                }else{
                    pixelObj.setRed((int)(pixelObj.getRed()*1.25));
                    pixelObj.setGreen((int)(pixelObj.getGreen()*1.25));
                    pixelObj.setBlue((int)(pixelObj.getBlue()*1.25));
                }
            }
        }
    }
    
    public void bad(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                if((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3 > 200){
                    pixelObj.setRed(0);
                    pixelObj.setGreen(0);
                    pixelObj.setBlue(0);
                }
            }
        }
    }

    public void edge(){
        Pixel[][] pixels = this.getPixels2D();
        int r = 0;
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                r = pixelObj.getRed();
                if(r <= 191){
                    pixelObj.setRed(pixelObj.getRed()/4);
                    pixelObj.setGreen(pixelObj.getGreen()/4);
                    pixelObj.setBlue(pixelObj.getBlue()/4);
                }
            }
        }
    }

    public void negate(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(255 - pixelObj.getRed());
                pixelObj.setGreen(255 - pixelObj.getGreen());
                pixelObj.setBlue(255 - pixelObj.getBlue());
            }
        }
    }

    public void grayscale(){
        Pixel[][] pixels = this.getPixels2D();
        int grayVal = 0;
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                grayVal = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
                pixelObj.setRed(grayVal);
                pixelObj.setGreen(grayVal);
                pixelObj.setBlue(grayVal);
            }
        }
    }

    public void colorChange(int input){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                if(input == 1){
                    pixelObj.setGreen(pixelObj.getGreen()/2);
                    pixelObj.setBlue(pixelObj.getBlue()/2);
                }else if(input == 2){
                    pixelObj.setRed(pixelObj.getRed()/2);
                    pixelObj.setBlue(pixelObj.getBlue()/2);
                }else if(input == 3){
                    pixelObj.setRed(pixelObj.getRed()/2);
                    pixelObj.setGreen(pixelObj.getGreen()/2);
                }else if(input == 4){
                    pixelObj.setRed(pixelObj.getRed()/2);
                }else if(input == 5){
                    pixelObj.setGreen(pixelObj.getGreen()/2);
                }else if(input == 6){
                    pixelObj.setBlue(pixelObj.getBlue()/2);
                }else{
                    pixelObj.setRed(pixelObj.getRed()/2);
                    pixelObj.setGreen(pixelObj.getGreen()/2);
                    pixelObj.setBlue(pixelObj.getBlue()/2);
                }
            }
        }
    }

    public void sunFire(){
        this.grayscale();
        this.zeroRed();
        this.negate();
        this.zeroBlue();
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++){
            for (int col = 0; col < width / 2; col++){
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    public void mirrorHorizontal(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length / 2; row++){
            for (int col = 0; col < width; col++){
                leftPixel = pixels[row][col];
                rightPixel = pixels[pixels.length - 1 - row][col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    public void mirrorHorizontalBTT(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = pixels.length / 2; row > 0; row--){
            for (int col = 0; col < width; col++){
                leftPixel = pixels[row][col];
                rightPixel = pixels[pixels.length - 1 - row][col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple(){
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++){
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++){

                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    public void mirrorArms(){
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();

        for (int row = 159; row < 191; row++){
            for (int col = 105; col < 170; col++){
                leftPixel = pixels[row][col];
                rightPixel = pixels[row + 77][col - 7];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
        for (int row = 171; row < 196; row++){
            for (int col = 239; col < 294; col++){
                leftPixel = pixels[row][col];
                rightPixel = pixels[row + 77][col + 6];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    public void mirrorGull(){
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        for (int row = 230; row < 325; row++){
            for (int col = 235; col < 335; col++){
                leftPixel = pixels[row][col];
                rightPixel = pixels[row + 12][col + 125];
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
    public void copy(Picture fromPic, int startRow, int startCol){
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length &&
        toRow < toPixels.length; fromRow++, toRow++){
            for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length; fromCol++, toCol++){
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[fromRow][fromCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }
    //cthulhu's dimensions 1063x752
    /** Method to create a collage of several pictures */
    public void createCollage(){
        for(int i = 0; i < 15; i++){
            Picture cthulhu = new Picture("cthulhu.jpg");
            cthulhu.colorChange((int)((Math.random() * 7) + 1));
            this.copy(cthulhu, 66 * i, 0);
        }
        this.write("collage.jpg");
        this.mirrorVertical();
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel upPixel = null;
        Pixel downPixel = null;
        Color downColor = null;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Color rightColor = null;
        int r = 0;
        int g = 0;
        int b = 0;
        for (int row = 0; row < pixels.length - 1; row++){
            for (int col = 0; col < pixels[0].length - 1; col++){
                r = (int)(Math.random() * 255) + 1;
                g = (int)(Math.random() * 255) + 1;
                b = (int)(Math.random() * 255) + 1;
                upPixel = pixels[row][col];
                downPixel = pixels[row + 1][col];
                downColor = downPixel.getColor();
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col + 1];
                rightColor = rightPixel.getColor();
                if (upPixel.colorDistance(downColor) > edgeDist){
                    upPixel.setRed(r);
                    upPixel.setGreen(g);
                    upPixel.setBlue(b);
                }
                else if(leftPixel.colorDistance(rightColor) > edgeDist){
                    leftPixel.setRed(r);
                    leftPixel.setGreen(g);
                    leftPixel.setBlue(b);
                }
                else{
                    upPixel.setRed(0);
                    upPixel.setGreen(0);
                    upPixel.setBlue(0);
                    leftPixel.setRed(0);
                    leftPixel.setGreen(0);
                    leftPixel.setBlue(0);
                }
            }
        }
    }

    public void kindaLine(int edgeDist)
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel upPixel = null;
        Pixel downPixel = null;
        Color downColor = null;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Color rightColor = null;
        for (int row = 0; row < pixels.length - 1; row++){
            for (int col = 0; col < pixels[0].length - 1; col++){
                upPixel = pixels[row][col];
                downPixel = pixels[row + 1][col];
                downColor = downPixel.getColor();
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col + 1];
                rightColor = rightPixel.getColor();
                if (upPixel.colorDistance(downColor) > edgeDist){
                    upPixel.setRed(0);
                    upPixel.setGreen(0);
                    upPixel.setBlue(0);
                }
                else if(leftPixel.colorDistance(rightColor) > edgeDist){
                    leftPixel.setRed(0);
                    leftPixel.setGreen(0);
                    leftPixel.setBlue(0);
                }
                else{

                }
            }
        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
