/**
 * Write a description of class Gibberish here.
 *
 * @Cameron Snyder
 * @1015
 */
public class Gibberish
{
    //producing placeholders
    private String sourceString;
    public Gibberish(){
        Template template = new Template();
        sourceString = template.getSourceString();
    }

    public String makeGibberish(WordList5000 wordList5000){
        int currentSourceIndex = 0;
        String resultString = " ";
        //finds the beginning of words to replace
        while(sourceString.contains("<")){
            int beginning = sourceString.indexOf("<");
            //finds transitive verbs
            if(sourceString.indexOf("<t>") == beginning){
                int end = sourceString.indexOf("</>");
                if(wordList5000.getRandomWordString("t") != null){
                    sourceString = sourceString.substring(0, beginning) + wordList5000.getRandomWordString("t") + sourceString.substring(end +3);
                }
                //finds regular verbs
            } else if(sourceString.indexOf("<v>") == beginning){
                int end = sourceString.indexOf("</>");
                if(wordList5000.getRandomWordString("v") != null){
                    sourceString = sourceString.substring(0, beginning) + wordList5000.getRandomWordString("v") + sourceString.substring(end +3);
                }
                //finds nouns
            } else if(sourceString.indexOf("<N>") == beginning){
                int end = sourceString.indexOf("</>");
                if(wordList5000.getRandomWordString("N") != null){
                    sourceString = sourceString.substring(0, beginning) + wordList5000.getRandomWordString("N") + sourceString.substring(end +3);
                }
            }
        }
        //returns the sentence
        return sourceString;
    }
}