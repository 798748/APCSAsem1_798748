
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    private int[] nums = new int[100];

    // Constructor
    public StatTester(){

    }

    //  Methods
    public void loadArray(){
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10 + 1);
        }
    }
    public void printArray(){
        for(int i = 0; i < nums.length; i++){
            System.out.print(", " + nums[i]);
            if((i+1)%10 == 0) {
                System.out.println();
            }
        }      
    }
}
