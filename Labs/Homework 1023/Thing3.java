/**
 * Write a description of class Thing3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thing3
{
    public static void main(){
        for(int i = 3; i > 0; i--){
            for(int j = 3; j >= i; j--){
                System.out.print(", " + i * j);
            }
            System.out.println();
        }
    }
}