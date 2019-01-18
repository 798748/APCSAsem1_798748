
/**
 * Write a description of class Thing2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thing2{
    static String str = "199 Churchill Ave. Woodside CA, 94062";
    public static String strings(){
        //return str.substring(str.indexOf("4"));
        //return str.substring(str.indexOf("CA"));
        //return str.substring(str.indexOf("W"), str.indexOf("W") + 9);
        return "done";
    }
    
    public static int integers(){
        //return str.indexOf("Bananas");
        //return str.indexOf(str.substring(2, 4) + 1);
        return 1;
    }
    
    public static void doesntWork(){
        //return str.substring("Church");
        //return str.substring(" ");
        //String str2 = str.substring(indexOf("Woodside"));
        //return str.substring(indexOf(" "));
    }
}
