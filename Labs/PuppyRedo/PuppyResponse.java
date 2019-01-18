
/**
 * Responds to a given phrase with a set of responses.
 *
 * @Cameron Snyder
 * @1107
 */
public class PuppyResponse{
    //noun "puppies" can be replaced with other words, not reliant on puppies
    public static String input = "I like puppies";
    public static void main(){
        System.out.print(responseGen());
    }
    
    public static String responseGen(){
        int responseNum = ((int)(Math.random() * 4) + 1);
        if(responseNum == 1){
            return "Why do you like " + input.substring(input.indexOf("e ") + 2) + "?";
        }else if(responseNum == 2){
            return "Do you eat " + input.substring(input.indexOf("e ") + 2) + "?";
        }else if(responseNum == 3){
            return "What are " + input.substring(input.indexOf("e ") + 2) + "?";
        }else if(responseNum == 4){
            return "What color are " + input.substring(input.indexOf("e ") + 2) + "?";
        }else{
            return "";
        }
    }
}