
/**
 * Creates and prints decks and hands of cards
 *
 * @Cameron Snyder
 * @1108
 */
public class CardRunner{
    static int[][] deck = new int[4][13];
    public static void game(){
        deck();
        printer();
    }

    public static int[][] card(){
        int suit = (int)((Math.random() * 4));
        int num = (int)((Math.random() * 13));
        deck[suit][num] = num + 1;
        return deck;
    }

    public static int[][] hand(){
        for(int suit = 0; suit < 4; suit++){
            for(int num = 0; num < 13; num++){
                deck[suit][num] = 0;
            }
        }
        for(int cardNum = 0; cardNum < 5; cardNum++){
            card();
        }
        return deck;
    }

    public static void deck(){
        for(int suit = 0; suit < 4; suit++){
            for(int num = 0; num < 13; num++){
                deck[suit][num] = num + 1;
            }
        }
    }

    public static void printer(){
        String suitName = "";
        String numName = "";
        for(int suit = 0; suit < 4; suit++){
            for(int num = 0; num < 13; num++){
                if(suit == 0){
                    suitName = "Spades";
                }else if(suit == 1){
                    suitName = "Clubs";
                }else if(suit == 2){
                    suitName = "Hearts";
                }else{
                    suitName = "Diamonds";
                }
                if(num == 0){
                    numName = "Ace";
                }else if(num < 10){
                    numName = "" + deck[suit][num];
                }else if(num == 10){
                    numName = "Jack";
                }else if(num == 11){
                    numName = "Queen";
                }else{
                    numName = "King";
                }
                if(deck[suit][num] != 0){
                    System.out.println(numName + " of " + suitName);
                }
            }
        }
    }
}
