
/**
 * Write a description of class CalcRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcRunner
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CalcRunner
     */
    public static void main()
    {
        SimpleCalc bobert = new SimpleCalc();
        System.out.println(bobert.add(100,50));
        System.out.println(bobert.subtract(100,50));
        System.out.println(bobert.multiply(100,50));
        System.out.println(bobert.divide(100,50));
        System.out.println(bobert.moduloDivide(100,50));
    }
}
