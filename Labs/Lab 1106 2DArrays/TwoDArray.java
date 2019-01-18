
/**
 * Filling up and doing stuff with a matrix
 *
 * @Cameron Snyder
 * @1107
 */
public class TwoDArray{
    //initializing matrix
    static int[][] iMat = new int[10][10];
    public static void main(){
        loadArray();
        System.out.println(sumAll());
        System.out.println(findGreatest());
        System.out.println(findAvg());
    }
    //loads 10x10 matrix
    public static void loadArray(){
        for(int i = 0; i < iMat.length; i++){
            for(int j = 0; j < iMat[i].length; j++){
                iMat[i][j] = (int)(Math.random() * 100) + 1;
            }
        }
    }
    //finds sum (in double form for average method)
    public static double sumAll(){
        double sum = 0;
        for(int i = 0; i < iMat.length; i++){
            for(int j = 0; j < iMat[i].length; j++){
                sum = sum + iMat[i][j];
            }
        }
        return sum;
    }
    //finds greatest number in the matrix
    public static int findGreatest(){
        int greatest = 0;
        for(int i = 0; i < iMat.length; i++){
            for(int j = 0; j < iMat[i].length; j++){
                if(iMat[i][j] > greatest){
                    greatest = iMat[i][j];
                }
            }
        }
        return greatest;
    }
    //averages out the numbers in the matrix
    public static double findAvg(){
        double avg = 0.0;
        double sum = sumAll();
        avg = sum / 100;
        return avg;
    }
}