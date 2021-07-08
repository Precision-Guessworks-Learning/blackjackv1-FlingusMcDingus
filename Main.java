import java.util.*;
public class Main{
    String[] args;
    public static void main(String[] args) {
        ArrayList<Card> deckOfCards = new ArrayList<Card>();
        Deck newDeck = new Deck(deckOfCards);
        Card newCard;
        newDeck.shuffle();
        Hand newHand = new Hand();
        Boolean gameOn = true;
        
        System.out.println("Game Start.");
        System.out.println("You draw two cards to start");

        newCard = newDeck.drawCard();
        System.out.println(newCard.getName(newCard.getVal(), newCard.getSuit()));
        int firstVal = checkForBigNum(newCard);

        newCard = newDeck.drawCard();
        System.out.println(newCard.getName(newCard.getVal(), newCard.getSuit()));
        int newVal = checkForBigNum(newCard);

        System.out.println("Your total is " + (firstVal + newVal));
        firstVal = firstVal + newVal;

        while (gameOn == true) {

        }
        
    }

    public static int checkForBigNum(Card checkCard) {
        int cardVal = checkCard.getVal();
        if (cardVal > 10) {
            return 10;
        } else {
            return cardVal;
        }
    }
}