
/**
 * Runs the gibberish using the Gibberish class
 *
 * @Cameron Snyder
 * @1015
 */
public class GibberishRunner{
    public static void main(){
        WordList5000 wordlist5000 = new WordList5000();
        Gibberish gibberish = new Gibberish();
        String gibberishString = gibberish.makeGibberish(wordlist5000);
        System.out.println(gibberishString);
    }
}