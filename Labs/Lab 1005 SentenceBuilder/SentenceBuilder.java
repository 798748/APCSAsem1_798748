
/**
 * @Cameron Snyder
 * @Lab 1005
 */
public class SentenceBuilder
{
    public static String[] determiners = {"My ", "The ", "My ", "Her ", "His ", "Our "};
    public static String[] nouns = {"Jalopy ", "Doorknob ", "Donkey ", "Squid ", "Dwarf ", "Bear "};
    public static String[] verbs = {"Slid ", "Squelched ", "Wiggled ", "Slapped ", "Juiced ", "Jumped "};
    public static String[] adjectives = {"Slimy ", "Slippery ", "Moist ", "Wet ", "Old ", "Fuzzy "};
    public static String[] adverbs = {"Quickly ", "Happily ", "Smoothly ", "Often ", "Sadly ", "Never "};
    public static String[] prepositions = {"Over ", "Near ", "Behind ", "Under ", "Next To ", "On Top Of "};
    public static String nounPhrase = "";
    public static String verbPhrase = "";
    public static String prepositionalPhrase = "";
    
    public static void loadSentences(){
        System.out.print(getNounPhrase() + getVerbPhrase() + getPrepositionalPhrase());
    }

    public static String getNounPhrase(){
        nounPhrase = getRandomDeterminer() + getRandomAdjective() + getRandomNoun();
        return nounPhrase;
    }
    
    public static String getVerbPhrase(){
        verbPhrase = getRandomAdverb() + getRandomVerb();
        return verbPhrase;
    }
    
    public static String getPrepositionalPhrase(){
        prepositionalPhrase = getRandomPreposition() + getRandomDeterminer() + getRandomAdjective() + getRandomNoun();
        return prepositionalPhrase;
    }
    
    public static String getRandomDeterminer(){
        int determinerChoice = (int)((Math.random() * determiners.length));
        return determiners[determinerChoice];
    }
    
    public static String getRandomNoun(){
        int nounChoice = (int)((Math.random() * nouns.length));
        return nouns[nounChoice];
    }
    
    public static String getRandomVerb(){
        int verbChoice = (int)((Math.random() * verbs.length));
        return verbs[verbChoice];
    }
    
    public static String getRandomAdjective(){
        int adjectiveChoice = (int)((Math.random() * adjectives.length));
        return adjectives[adjectiveChoice];
    }
    
    public static String getRandomPreposition(){
        int prepositionChoice = (int)((Math.random() * prepositions.length));
        return prepositions[prepositionChoice];
    }
    
    public static String getRandomAdverb(){
        int adverbChoice = (int)((Math.random() * adverbs.length));
        return adverbs[adverbChoice];
    }
}