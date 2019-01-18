
/**
 * Write a description of class StudentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRunner
{
    // instance variables - replace the example below with your own
    static String[] names;
    static int[] stuNum;
    /**
     * Constructor for objects of class StudentRunner
     */
    public static void main()
    {
        // initialise instance variables
        names = new String[]{"Donkey ", "Horse ", "Mule ", "Zebra ", "Giraffe "};
        stuNum = new int[names.length];
        int digit = 0;
        int total = 0;
        for(int i = 0; i < names.length; i++){
            for(int randNum = 0; randNum < 6; randNum++){
                digit = (int)(Math.random()*Math.pow(10, 5));
                total = total + digit;
                digit = 0;
            }
            stuNum[i] = total;
            total = 0;
            System.out.print(names[i]);
            System.out.println(stuNum[i]);
        }
    }
}
